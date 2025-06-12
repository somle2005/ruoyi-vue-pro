package com.somle.kingdee.service;

import cn.hutool.core.util.ObjUtil;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.concurrent.AsyncTask;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.somle.kingdee.constant.KingdeeRedisKeyConstants;
import com.somle.kingdee.enums.KingDeeErrorCodeConstants;
import com.somle.kingdee.model.*;
import com.somle.kingdee.model.supplier.KingdeeSupplierSaveVO;
import com.somle.kingdee.model.vo.KingdeeSupplierQueryReqVO;
import com.somle.kingdee.util.CacheSpinWaitUtils;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.BeanUtils;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static com.somle.kingdee.enums.KingDeeErrorCodeConstants.SUPPLIER_LIST_LOADING;
import static com.somle.kingdee.enums.KingDeeErrorCodeConstants.SUPPLIER_NOT_EXIST;
import static com.somle.kingdee.util.SignatureUtils.*;

/**
 * @author Administrator
 */
@Slf4j
@Data
@SuppressWarnings("UnusedReturnValue")
public class KingdeeClient {

    private KingdeeToken token;
    private final StringRedisTemplate redisTemplate;
    private final RedissonClient redissonClient;


    public KingdeeClient(KingdeeToken token, StringRedisTemplate redisTemplate, RedissonClient redissonClient) {
        this.token = token;
        this.redisTemplate = redisTemplate;
        this.redissonClient = redissonClient;
    }

    /**
     * 根据OuterInstanceId覆盖内存的KingdeeToken
     *
     * @return KingdeeToken
     */
    protected KingdeeToken refreshAuth() {
        return fillAuth(pushAuth(token.getOuterInstanceId()));
    }

    private KingdeeToken fillAuth(KingdeeToken newToken) {
        String signature = getAppSignature(newToken);
        token.setAppSignature(signature);
        newToken.setAppSignature(signature);//响应返回值没有签名->需要计算

        token.setAppToken(getAppToken(newToken));
        log.info("tokens filled successfully");
        return token;
    }

    private String getAppToken(KingdeeToken token) {
        log.info("preparing app token");
        String appKey = token.getAppKey();
        String appSignature = token.getAppSignature();
        String reqMtd = "GET";
        String ctime = String.valueOf(System.currentTimeMillis());
        String endUrl = "/jdyconnector/app_management/kingdee_auth_token";
        String fullUrl = BASE_HOST + endUrl;
        TreeMap<String, String> params = new TreeMap<>();
        params.put("app_key", appKey);
        params.put("app_signature", appSignature);
        String apiSignature = getApiSignature(reqMtd, endUrl, params, ctime);
        var request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(fullUrl)
            .queryParams(params)
            .headers(getAuthHeaders(ctime, apiSignature))
            .build();
        KingdeeResponse response = WebUtils.sendRequest(request, KingdeeResponse.class);
        return response.getData(JSONObject.class).getString("app-token");
    }

    private KingdeeToken pushAuth(String outerInstanceId) {
        String reqMtd = "POST";
        String ctime = String.valueOf(System.currentTimeMillis());
        String endUrl = "/jdyconnector/app_management/push_app_authorize";
        String fullUrl = BASE_HOST + endUrl;
        TreeMap<String, String> params = new TreeMap<>();
        params.put("outerInstanceId", outerInstanceId);
        String apiSignature = getApiSignature(reqMtd, endUrl, params, ctime);
        var request = RequestX.builder()
            .requestMethod(RequestX.Method.POST)
            .url(fullUrl)
            .queryParams(params)
            .headers(getAuthHeaders(ctime, apiSignature))
            .build();
        KingdeeResponse response = WebUtils.sendRequest(request, KingdeeResponse.class);
        return response.getDataList(KingdeeToken.class).get(0);

    }


    public KingdeeResponse getSupplier() {
        String endUrl = "/jdy/v2/bd/supplier";
        TreeMap<String, String> params = new TreeMap<>();
        KingdeeResponse response = getResponse(endUrl, params);
        return response;
    }

    public KingdeeResponse getVoucher(LocalDate date) {
        String endUrl = "/jdy/v2/fi/voucher";
        TreeMap<String, String> params = new TreeMap<>();
        LocalDateTime starDateTime = date.atStartOfDay();
        LocalDateTime endDateTime = date.plusDays(1).atStartOfDay();
        params.put("create_end_time", String.valueOf(endDateTime.toInstant(ZoneOffset.UTC).toEpochMilli()));
        params.put("create_start_time", String.valueOf(starDateTime.toInstant(ZoneOffset.UTC).toEpochMilli()));
        KingdeeResponse response = getResponse(endUrl, params);
        return response;
    }

    public KingdeeResponse getVoucherDetail(String id) {
        String endUrl = "/jdy/v2/fi/voucher_detail";
        TreeMap<String, String> params = new TreeMap<>();
        params.put("id", id);
        KingdeeResponse response = getResponse(endUrl, params);
        return response;
    }

    /**
     * 安全设置单位id，如果它存在。
     *
     * @param unitName 单位名称
     * @param setter   回调函数
     */
    private void setUnitId(String unitName, Consumer<KingdeeUnit> setter) {
        getMeasureUnitByNumber(unitName, (kingdeeUnit, e) -> {
            if (e == null) {
                setter.accept(kingdeeUnit);
            }
        });
    }

    public void getMeasureUnitByNumber(String number, BiConsumer<KingdeeUnit, Exception> callback) {
        try {
            String endUrl = "/jdy/v2/bd/measure_unit_detail";
            TreeMap<String, String> params = new TreeMap<>();
            params.put("number", number);
            KingdeeUnit kingdeeUnit = getResponse(endUrl, params).getData(KingdeeUnit.class);
            callback.accept(kingdeeUnit, null);
        } catch (Exception e) {
            log.debug("getMeasureUnitByNumber error,当前产品的单位: {},不存在。", number, e);
            callback.accept(null, e);
        }
    }

    /**
     * 获取产品详情
     *
     * @param number 产品编号
     * @return 产品详情
     */
    public KingdeeResponse getMaterial(String number) {
        String endUrl = "/jdy/v2/bd/material_detail";
        TreeMap<String, String> params = new TreeMap<>();
        params.put("number", number);
        return getResponse(endUrl, params);
    }

    public KingdeeResponse addProduct(KingdeeProductSaveReqVO product) {
        KingdeeProductSaveReqVO reqVO = new KingdeeProductSaveReqVO();
        BeanUtils.copyProperties(product, reqVO);
        try {
            //根据产品编码查找是否存在
            String id = this.getMaterial(reqVO.getNumber()).getData(JSONObject.class).getString("id");
            reqVO.setId(id);
        } catch (Exception e) {
            log.debug("id not found for ({}) adding new", reqVO.getNumber());
        }
        setUnitId("立方厘米", kingdeeUnit -> reqVO.setVolumeUnitId(kingdeeUnit.getId()));
        setUnitId("kg", kingdeeUnit -> reqVO.setWeightUnitId(kingdeeUnit.getId()));
        //金蝶产品单位目前固定是`套`
        setUnitId("套", kingdeeUnit -> reqVO.setBaseUnitId(kingdeeUnit.getId()));
        try {
            Optional.ofNullable(getAuxInfoByNumber(reqVO.getSaleDepartmentId().toString()))
                .ifPresent(kingdeeUnit ->
                    setCustomFieldSafely(reqVO, "部门", kingdeeUnit.getId())
                );
        } catch (Exception e) {
            log.debug("getAuxInfoByNumber error for sale department ID: {}", reqVO.getSaleDepartmentId(), e);
        }
        setCustomFieldSafely(reqVO, "部门", reqVO.getDeclaredTypeZh());
        setCustomFieldSafely(reqVO, "报关品名", reqVO.getDeclaredTypeZh());
        setCustomFieldSafely(reqVO, "报关品名(英文)", reqVO.getDeclaredTypeEn());
        reqVO.setIgnoreWarn(true);//保存覆盖已存在产品
        log.debug("adding product");
        String endUrl = "/jdy/v2/bd/material";
        TreeMap<String, String> params = new TreeMap<>();
        return postResponse(endUrl, params, reqVO);
    }


    /**
     * 根据字段名称获取id，如果有该字段、则设置value，没有就日志记录
     *
     * @param reqVO       对象
     * @param displayName 属性名称
     * @param fieldValue  属性值
     */
    private void setCustomFieldSafely(KingdeeProductSaveReqVO reqVO, String displayName, String fieldValue) {
        try {
            KingdeeCustomField customField = getCustomFieldByDisplayName("bd_material", displayName);
            if (customField != null) {
                reqVO.setCustomField(customField, fieldValue);
            }
        } catch (Exception e) {
            log.debug("custom field {} skipped for {}", displayName, token.getAccountName(), e);
        }
    }


    /**
     * 添加供应商
     *
     * @param kingdeeSupplierSaveVO 供应商
     * @return 供应商
     */
    public KingdeeResponse addSupplier(KingdeeSupplierSaveVO kingdeeSupplierSaveVO) {
        String endUrl = "/jdy/v2/bd/supplier";
        KingdeeSupplierSaveVO supplierCopy = new KingdeeSupplierSaveVO();
        BeanUtils.copyProperties(kingdeeSupplierSaveVO, supplierCopy);
        try {
            // 查询所有供应商MAP，根据ID来更新对应供应商
            Map<String, KingdeeSupplierSaveVO> map = this.getAllSupplierList(null);
            Optional.ofNullable(map.get(supplierCopy.getName())).ifPresent(requestVO -> supplierCopy.setId(requestVO.getId()));
        } catch (Exception e) {
            log.debug("id not found for {}adding new", supplierCopy.getNumber());
            throw exception(KingDeeErrorCodeConstants.SUPPLIER_LIST_SYNC_FAIL, this.token.getAccountName(), kingdeeSupplierSaveVO.getId() + kingdeeSupplierSaveVO.getName());
        }
//        supplierCopy.setIgnoreWarn(true);//忽略告警信息(如：单价为0)保存
        //删除缓存
        this.deleteSupplierCache();
        return postResponse(endUrl, new TreeMap<>(), supplierCopy);
    }

    public KingdeeResponse getSupplier(String number) {
        String endUrl = "/jdy/v2/bd/supplier_detail";
        TreeMap<String, String> params = new TreeMap<>();
        params.put("number", number);
        return getResponse(endUrl, params);
    }

    public void addDepartment(KingdeeAuxInfoDetail department) {
        //拷贝数据，避免并发下产生的线程安全问题
        KingdeeAuxInfoDetail departmentCopy = new KingdeeAuxInfoDetail();
        BeanUtils.copyProperties(department, departmentCopy);
        //id不为空则为修改，反之新增
        String groupId = getAuxInfoTypeByNumber("BM").getId();
        //根据number查找金蝶辅助资料中是否存在，number对应erp中的deptId
        KingdeeAuxInfo auxInfoByNumber = getAuxInfoByNumber(departmentCopy.getNumber());
        if (ObjUtil.isNotEmpty(auxInfoByNumber)) {
            departmentCopy.setId(auxInfoByNumber.getId());
        } else {
            //不存在则根据名称去查找是否存在
            KingdeeAuxInfo auxInfoByName = getAuxInfoByName(departmentCopy.getName());
            if (ObjUtil.isNotEmpty(auxInfoByName)) {
                departmentCopy.setId(auxInfoByName.getId());
            }
        }
        departmentCopy.setGroupId(groupId);

        KingdeeResponse response = postResponse("/jdy/v2/bd/aux_info", new TreeMap<>(), departmentCopy);
    }

    public Stream<KingdeeResponse> list(String endpoint) {
        log.debug("kingdee listing");
        return Stream.iterate(1, n -> n + 1)
            .map(n -> {
                String endUrl = endpoint;
                TreeMap<String, String> params = new TreeMap<>();
                params.put("page_size", "100"); //max 100
                params.put("page", String.valueOf(n));
                return getResponse(endUrl, params);
            })
            .takeWhile(n -> n.getData(KingdeePage.class).getPage() <= n.getData(KingdeePage.class).getTotalPage());
    }

    public KingdeeResponse post(String endpoint, JSONObject payload) {
        log.debug("kingdee posting");
        String endUrl = endpoint;
        TreeMap<String, String> params = new TreeMap<>();
        KingdeeResponse response = postResponse(endUrl, params, payload);
        return response;
    }

    public KingdeeAuxInfo getAuxInfoByNumber(String number) {
        log.debug("fetching aux info");
        String endUrl = "/jdy/v2/bd/aux_info";
        TreeMap<String, String> params = new TreeMap<>();
        params.put("number", number);
        KingdeeResponse response = getResponse(endUrl, params);
        Optional<KingdeeAuxInfo> first = response.getData(KingdeePage.class).getRowsList(KingdeeAuxInfo.class).stream()
            .filter(n -> n.getNumber().equals(number))
            .findFirst();
        return first.orElse(null);
    }

    public KingdeeAuxInfo getAuxInfoByName(String name) {
        log.debug("fetching aux info");
        String endUrl = "/jdy/v2/bd/aux_info";
        TreeMap<String, String> params = new TreeMap<>();
        params.put("name", name);
        KingdeeResponse response = getResponse(endUrl, params);
        Optional<KingdeeAuxInfo> first = response.getData(KingdeePage.class).getRowsList(KingdeeAuxInfo.class).stream()
            .filter(n -> n.getName().equals(name))
            .findFirst();
        return first.orElse(null);
    }

    public KingdeeAuxInfoType getAuxInfoTypeByNumber(String number) {
        log.debug("fetching aux info");
        String endUrl = "/jdy/v2/bd/aux_info_type";
        TreeMap<String, String> params = new TreeMap<>();
        params.put("number", number);
        KingdeeResponse response = getResponse(endUrl, params);
        return response.getData(KingdeePage.class).getRowsList(KingdeeAuxInfoType.class).stream()
            .filter(n -> n.getNumber().equals(number))
            .findFirst().get();
    }

    public Stream<KingdeeCustomField> getCustomField(String entity_number) {
        log.debug("fetching custom field");
        String endUrl = "/jdy/v2/sys/custom_field";
        TreeMap<String, String> params = new TreeMap<>();
        params.put("entity_number", entity_number);
        KingdeeResponse response = getResponse(endUrl, params);
        var data = response.getData(KingdeeCustomFieldRespVO.class);
        return data.getHead().stream();
    }

    public KingdeeCustomField getCustomFieldByDisplayName(String entity_number, String displayName) {
        return getCustomField(entity_number)
            .filter(n -> n.getDisplayName().equals(displayName))
            .findFirst().get();
    }

    public Stream<KingdeePage> getAllPurRequest(KingdeePurRequestReqVO vo) {
        log.debug("fetching purchase request");
        String endUrl = "/jdy/v2/scm/pur_request";
        return StreamX.iterate(
            getPage(JsonUtilsX.toJSONObject(vo), endUrl),
            KingdeePage::hasNext,
            page -> {
                vo.setPage(String.valueOf(page.getPage() + 1));
                return getPage(JsonUtilsX.toJSONObject(vo), endUrl);
            }
        );
    }

    /**
     * 获取所有采购订单（不分页），使用多线程并行获取
     *
     * @param vo 查询参数
     * @return 采购订单数据流
     */
    public Stream<KingdeePage> getAllPurOrder(KingdeePurOrderReqVO vo) {
        log.debug("开始多线程获取采购订单数据");
        String endUrl = "/jdy/v2/scm/pur_order";

        // 1. 获取第一页数据，同时获取总页数
        KingdeePage firstPage = getPage(JsonUtilsX.toJSONObject(vo), endUrl);
        int totalPages = firstPage.getTotalPage();
        log.debug("采购订单总页数：{}", totalPages);

        // 2. 从Spring容器获取通用线程池
        ThreadPoolExecutor executorService = AsyncTask.DEFAULT.getExecutor().getThreadPoolExecutor();
        log.debug("使用通用线程池，核心线程数：{}，最大线程数：{}", executorService.getCorePoolSize(), executorService.getMaximumPoolSize());

        try {
            // 3. 所有页
            List<CompletableFuture<KingdeePage>> futures = new ArrayList<>();
            futures.add(CompletableFuture.completedFuture(firstPage));
            // 创建剩余页
            for (int page = 2; page <= totalPages; page++) {
                final int currentPage = page;
                CompletableFuture<KingdeePage> future = CompletableFuture.supplyAsync(() -> {
                    KingdeePurOrderReqVO pageVO = new KingdeePurOrderReqVO();
                    BeanUtils.copyProperties(vo, pageVO);
                    pageVO.setPage(String.valueOf(currentPage));
                    log.info("线程[{}]获取第{}页数据", Thread.currentThread().getName(), currentPage);
                    return getPage(JsonUtilsX.toJSONObject(pageVO), endUrl);
                }, executorService);
                futures.add(future);
            }
            // 4. 等待
            CompletableFuture<Void> allFutures = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));

            // 5. 获取所有结果
            return allFutures.thenApply(v ->
                futures.stream()
                    .map(CompletableFuture::join)
                    .collect(Collectors.toList())
            ).join().stream();

        } catch (Exception e) {
            log.error("获取采购订单数据异常", e);
            throw new RuntimeException("获取采购订单数据失败", e);
        }
    }

    /**
     * 获取采购入库单列表
     *
     * @param vo 查询参数
     * @return 分页数据流
     */
    public Stream<KingdeePage> streamPurInbound(KingdeePurInboundReqVO vo) {
        log.debug("获取采购入库单列表");
        String endpoint = "/jdy/v2/scm/pur_inbound";
        return StreamX.iterate(
            getPage(JsonUtilsX.toJSONObject(vo), endpoint),
            KingdeePage::hasNext,
            page -> {
                vo.setPage(String.valueOf(page.getPage() + 1));
                return getPage(JsonUtilsX.toJSONObject(vo), endpoint);
            }
        );
    }

    /**
     * 获取单页采购入库单列表
     *
     * @param vo 查询参数
     * @return 单页数据
     */
    public KingdeePage getPurInboundPage(KingdeePurInboundReqVO vo) {
        log.debug("获取单页采购入库单列表");
        String endpoint = "/jdy/v2/scm/pur_inbound";
        return getPage(JsonUtilsX.toJSONObject(vo), endpoint);
    }

    public KingdeePurOrderDetail getPurOrderDetail(String purOrderNumber) {
        String endUrl = "/jdy/v2/scm/pur_order_detail";
        TreeMap<String, String> params = new TreeMap<>();
        params.put("number", purOrderNumber);
        KingdeeResponse response = getResponse(endUrl, params);
        return response.getData(KingdeePurOrderDetail.class);
    }

    public KingdeePurRequestDetail getPurRequestDetail(String purOrderNumber) {
        String endUrl = "/jdy/v2/scm/pur_request_detail";
        TreeMap<String, String> params = new TreeMap<>();
        params.put("number", purOrderNumber);
        KingdeeResponse response = getResponse(endUrl, params);
        return response.getData(KingdeePurRequestDetail.class);
    }

    /**
     * 保存采购订单
     *
     * @param order 采购订单数据_入参
     * @return KingdeeResponse
     */
    public KingdeeResponse savePurOrder(KingdeePurOrderSaveReqVO order) {
        String endUrl = "/jdy/v2/scm/pur_order";
        //供应商
        String id = order.getSupplierNumber();//erp供应商ID
        KingdeeSupplierSaveVO supplierSaveVO = this.getAllSupplierList(null).get(order.getSupplierNumber());
        //不存在 -> e
        if (supplierSaveVO == null) {
            throw exception(SUPPLIER_NOT_EXIST, order.getSupplierNumber());
        }
        order.setSupplierId(supplierSaveVO.getId());

        //产品
        order.getMaterialEntity().forEach(material -> {
            material.setMaterialId(this.getMaterial(material.getMaterialNumber()).getData(JSONObject.class).getString("id"));
            //单位ID
            setUnitId("套", kingdeeUnit -> {
                material.setUnitId(kingdeeUnit.getId());
                material.setUnitNumber(kingdeeUnit.getNumber());
            });

        });

        TreeMap<String, String> params = new TreeMap<>();
        order.setIgnoreWarn(false);//忽略告警信息(如：名称已存在)保存客户
        return postResponse(endUrl, params, order);
    }

    /**
     * 保存采购入库单
     *
     * @param inbound 采购入库单数据
     * @return KingdeeResponse
     */
    public KingdeeResponse savePurInbound(KingdeePurInboundSaveReqVO inbound) {
        String endUrl = "/jdy/v2/scm/pur_inbound";
        TreeMap<String, String> params = new TreeMap<>();
        return postResponse(endUrl, params, inbound);
    }

    /**
     * 保存采购退货单
     *
     * @param returnOrder 采购退货单数据
     * @return KingdeeResponse
     */
    public KingdeeResponse savePurReturn(KingdeePurReturnSaveReqVO returnOrder) {
        String endUrl = "/jdy/v2/scm/pur_ret";
        TreeMap<String, String> params = new TreeMap<>();
        return postResponse(endUrl, params, returnOrder);
    }

    /**
     * 获取采购退货单列表
     *
     * @param vo 查询参数
     * @return 分页数据流
     */
    public Stream<KingdeePage> streamPurReturn(KingdeePurReturnReqVO vo) {
        String endpoint = "/jdy/v2/scm/pur_ret";
        return StreamX.iterate(
            getPage(JsonUtilsX.toJSONObject(vo), endpoint),
            KingdeePage::hasNext,
            page -> {
                vo.setPage(String.valueOf(page.getPage() + 1));
                return getPage(JsonUtilsX.toJSONObject(vo), endpoint);
            }
        );
    }

    /**
     * 获取单页采购退货单列表
     *
     * @param vo 查询参数
     * @return 单页数据
     */
    public KingdeePage getPurReturnPage(KingdeePurReturnReqVO vo) {
        String endpoint = "/jdy/v2/scm/pur_ret";
        return getPage(JsonUtilsX.toJSONObject(vo), endpoint);
    }

    private KingdeeResponse fetchResponse(String requestMethod, String endUrl, TreeMap<String, String> params, Object body) {
        String cts = String.valueOf(System.currentTimeMillis());
        String signature = getApiSignature(requestMethod, endUrl, params, cts);
        Map<String, String> headers = getApiHeaders(cts, signature, token.getAppToken());
        KingdeeResponse response;
        if ("POST".equals(requestMethod)) {
            var request = RequestX.builder()
                .requestMethod(RequestX.Method.POST)
                .url(BASE_HOST + endUrl)
                .queryParams(params)
                .headers(headers)
                .payload(body)
                .build();
            response = WebUtils.sendRequest(request, KingdeeResponse.class);
        } else {
            var request = RequestX.builder()
                .requestMethod(RequestX.Method.GET)
                .url(BASE_HOST + endUrl)
                .queryParams(params)
                .headers(headers)
                .build();
            response = WebUtils.sendRequest(request, KingdeeResponse.class);
        }

        validateResponse(response);

        return response;
    }

    private void validateResponse(KingdeeResponse response) {
        if (!response.getErrcode().equals("0")) {
            throw new RuntimeException("Kingdee error response: " + response);
        }
    }

    public KingdeeResponse getResponse(String endUrl, TreeMap<String, String> params) {
        return fetchResponse("GET", endUrl, params, null);

    }

    public KingdeeResponse postResponse(String endUrl, TreeMap<String, String> params, Object payload) {
        return fetchResponse("POST", endUrl, params, payload);
    }

    public KingdeeResponse getResponse(String endUrl, Object params) {
        return fetchResponse("GET", endUrl, new TreeMap<>(JsonUtilsX.toStringMap(params)), null);
    }

    public KingdeeResponse postResponse(String endUrl, Object params, Object payload) {
        return fetchResponse("POST", endUrl, new TreeMap<>(JsonUtilsX.toStringMap(params)), payload);
    }

    private KingdeePage getPage(JSONObject payload, String endpoint) {
        KingdeeResponse response = getResponse(endpoint, payload);
        return response.getData(KingdeePage.class);
    }

    /**
     * 获取供应商列表
     *
     * @param queryReqVO 查询参数
     * @return 供应商列表分页数据
     */
    public KingdeePage getSupplierList(KingdeeSupplierQueryReqVO queryReqVO) {
        String endUrl = "/jdy/v2/bd/supplier";
        KingdeeResponse response = getResponse(endUrl, JsonUtilsX.toJSONObject(queryReqVO));
        return response.getData(KingdeePage.class);
    }

    /**
     * 获取所有供应商Map; <供应商名称:供应商>
     * <p>
     * 结果会被缓存120分钟
     */
    public Map<String, KingdeeSupplierSaveVO> getAllSupplierList(KingdeeSupplierQueryReqVO queryReqVO) {
        if (queryReqVO == null) {
            queryReqVO = new KingdeeSupplierQueryReqVO();
        }
        String SUPPLIER_CACHE_KEY = KingdeeRedisKeyConstants.KINGDEE_SUPPLIER_LIST + ":" + this.token.getAccountName() + ":" + Objects.hash(token.getAppKey(), JsonUtilsX.toJsonString(queryReqVO));
        String LOCK_KEY = SUPPLIER_CACHE_KEY + ":lock";

        // 1. 尝试从缓存获取
        String cachedData = redisTemplate.opsForValue().get(SUPPLIER_CACHE_KEY);
        if (cachedData != null) {
            log.debug("从缓存获取供应商列表数据");
            return JsonUtilsX.parseObject(cachedData, new TypeReference<>() {
            });
        }

        RLock lock = redissonClient.getLock(LOCK_KEY);
        boolean locked = false;
        try {
            locked = lock.tryLock(0, 10, TimeUnit.SECONDS);
            if (!locked) {
                Map<String, KingdeeSupplierSaveVO> result = CacheSpinWaitUtils.spinWaitForCache(
                    () -> redisTemplate.opsForValue().get(SUPPLIER_CACHE_KEY),
                    json -> JsonUtilsX.parseObject(json, new TypeReference<>() {
                    }),
                    1000 * 10, 200
                );
                if (result != null) {
                    log.debug("等待期间获取到缓存数据，直接返回");
                    return result;
                }
                throw exception(SUPPLIER_LIST_LOADING, "数据正在加载中，请稍后重试。");
            }

            // 双重检查
            cachedData = redisTemplate.opsForValue().get(SUPPLIER_CACHE_KEY);
            if (cachedData != null) {
                log.debug("从缓存获取供应商列表数据（双重检查）");
                return JsonUtilsX.parseObject(cachedData, new TypeReference<>() {
                });
            }

            // 2. 从API获取数据
            Map<String, KingdeeSupplierSaveVO> result = fetchSupplierDataFromApi(queryReqVO);

            // 3. 缓存数据
            if (!result.isEmpty()) {
                redisTemplate.opsForValue().set(SUPPLIER_CACHE_KEY, JsonUtilsX.toJsonString(result), 120, TimeUnit.MINUTES);
                log.debug("供应商列表数据已缓存，过期时间120分钟");
            }
            return result;

        } catch (Exception e) {
            log.error("获取供应商列表数据异常", e);
            throw exception(KingDeeErrorCodeConstants.SUPPLIER_LIST_FAIL, e.getMessage());
        } finally {
            // 4. 释放锁
            if (locked && lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }

    /**
     * 直接从金蝶API获取供应商数据
     *
     * @param queryReqVO 查询参数
     * @return 供应商数据Map
     */
    private Map<String, KingdeeSupplierSaveVO> fetchSupplierDataFromApi(KingdeeSupplierQueryReqVO queryReqVO) {
        String endpoint = "/jdy/v2/bd/supplier";
        // 1. 获取第一页数据
        KingdeePage firstPage = getPage(JsonUtilsX.toJSONObject(queryReqVO), endpoint);
        int totalPages = firstPage.getTotalPage();
        if (totalPages > 500) {
            throw new RuntimeException("供应商页数过大(" + totalPages + ")，请缩小范围");
        }

        // 2. 拉取所有页数据
        List<CompletableFuture<KingdeePage>> futures = new ArrayList<>();
        futures.add(CompletableFuture.completedFuture(firstPage));

        for (int page = 2; page <= totalPages; page++) {
            final int currentPage = page;
            futures.add(CompletableFuture.supplyAsync(() -> {
                KingdeeSupplierQueryReqVO supplierQueryReqVO = cn.iocoder.yudao.framework.common.util.object.BeanUtils.toBean(queryReqVO, KingdeeSupplierQueryReqVO.class,
                    fqr -> fqr.setPage(currentPage));
                log.debug("线程[{}]开始获取第{}页数据", Thread.currentThread().getName(), currentPage);
                return getPage(JsonUtilsX.toJSONObject(supplierQueryReqVO), endpoint);
            }, AsyncTask.DEFAULT.getExecutor().getThreadPoolExecutor()));
        }

        // 3. 汇总数据
        return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
            .thenApply(v -> futures.stream().map(CompletableFuture::join)
                .flatMap(page -> page.getRowsList(KingdeeSupplierSaveVO.class).stream())
                .collect(Collectors.toMap(KingdeeSupplierSaveVO::getName, supplier -> supplier, (oldVal, newVal) -> {
                    log.warn("发现重复的供应商名称：{}", oldVal.getName());
                    return oldVal;
                }))).join();
    }

    /**
     * 平滑刷新供应商缓存
     * 直接调用金蝶API获取新数据，再覆盖旧缓存
     */
    public void refreshSupplierCache() {
        log.info("开始平滑刷新供应商缓存");
        try {
            // 1. 准备参数
            KingdeeSupplierQueryReqVO queryReqVO = new KingdeeSupplierQueryReqVO();
            String SUPPLIER_CACHE_KEY = KingdeeRedisKeyConstants.KINGDEE_SUPPLIER_LIST + ":" + this.token.getAccountName() + ":" + Objects.hash(token.getAppKey(), JsonUtilsX.toJsonString(queryReqVO));

            // 2. 获取旧数据用于对比
            String oldData = redisTemplate.opsForValue().get(SUPPLIER_CACHE_KEY);

            // 3. 获取新数据
            Map<String, KingdeeSupplierSaveVO> newData = fetchSupplierDataFromApi(queryReqVO);
            if (newData.isEmpty()) {
                log.warn("获取新供应商数据为空，取消刷新");
                return;
            }

            // 4. 更新缓存
            redisTemplate.opsForValue().set(SUPPLIER_CACHE_KEY, JsonUtilsX.toJsonString(newData), 120, TimeUnit.MINUTES);

            // 5. 记录变更
            if (oldData != null) {
                Map<String, KingdeeSupplierSaveVO> oldMap = JsonUtilsX.parseObject(oldData, new TypeReference<>() {
                });
                int added = 0, removed = 0, updated = 0;
                for (String key : newData.keySet()) {
                    if (!oldMap.containsKey(key)) {
                        added++;
                    } else if (!oldMap.get(key).equals(newData.get(key))) {
                        updated++;
                    }
                }
                for (String key : oldMap.keySet()) {
                    if (!newData.containsKey(key)) {
                        removed++;
                    }
                }
                log.info("供应商缓存平滑刷新完成，新增{}个，更新{}个，删除{}个", added, updated, removed);
            } else {
                log.info("供应商缓存平滑刷新完成，新增{}个供应商", newData.size());
            }
        } catch (Exception e) {
            log.error("供应商缓存平滑刷新失败", e);
        }
    }

    /**
     * 删除所有租户供应列表缓存
     *
     * @return 删除的缓存数量
     */
    public Integer deleteSupplierCache() {
        String pattern = KingdeeRedisKeyConstants.KINGDEE_SUPPLIER_LIST + "*";
        Set<String> keys = redisTemplate.keys(pattern);
        if (!keys.isEmpty()) {
            redisTemplate.delete(keys);
            log.info("已删除所有供应商列表缓存，共{}个", keys.size());
            return keys.size();
        } else {
            log.debug("没有找到需要删除的供应商列表缓存");
            return 0;
        }
    }

    /**
     * 取消采购订单
     *
     * @param orderNumbers 需要取消的采购订单编号列表
     * @return KingdeeResponse
     */
    public KingdeeResponse cancelPurOrder(List<String> orderNumbers) {
        String endUrl = "/jdy/v2/scm/pur_order_cancel";
        TreeMap<String, String> params = new TreeMap<>();

        // 构建请求体
        JSONObject payload = new JSONObject();
//        payload.put("entity_number", "2"); // 采购订单的实体编号
        payload.put("out_side_pks", orderNumbers);

        return postResponse(endUrl, params, payload);
    }

}
