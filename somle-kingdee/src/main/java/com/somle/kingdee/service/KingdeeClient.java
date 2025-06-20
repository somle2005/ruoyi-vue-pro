package com.somle.kingdee.service;

import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.concurrent.AsyncTask;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.spring.SpringUtils;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseInApi;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseOrderApi;
import cn.iocoder.yudao.module.srm.api.purchase.SrmPurchaseReturnApi;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseInItemDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseOrderDTO;
import cn.iocoder.yudao.module.srm.api.purchase.dto.SrmPurchaseReturnDTO;
import cn.iocoder.yudao.module.srm.api.supplier.SrmSupplierApi;
import cn.iocoder.yudao.module.wms.api.warehouse.WmsWarehouseApi;
import cn.iocoder.yudao.module.wms.api.warehouse.dto.WmsWarehouseDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.somle.kingdee.constant.KingdeeRedisKeyConstants;
import com.somle.kingdee.enums.KingDeeErrorCodeConstants;
import com.somle.kingdee.enums.KingdeeEntityType;
import com.somle.kingdee.enums.KingdeeOperateType;
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
        var request = RequestX.builder().requestMethod(RequestX.Method.GET).url(fullUrl).queryParams(params).headers(getAuthHeaders(ctime, apiSignature)).build();
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
        var request = RequestX.builder().requestMethod(RequestX.Method.POST).url(fullUrl).queryParams(params).headers(getAuthHeaders(ctime, apiSignature)).build();
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
        String accountName = this.getToken().getAccountName(); // 获取公司名称
        String cacheKey = KingdeeRedisKeyConstants.KINGDEE_MEASURE_UNIT + ":" + accountName + ":" + number;
        String lockKey = cacheKey + ":lock";

        try {
            KingdeeUnit result = CacheSpinWaitUtils.getOrLoad(
                redisTemplate,
                redissonClient,
                cacheKey,
                lockKey,
                60, TimeUnit.MINUTES,
                new TypeReference<>() {
                },
                () -> {
                    String endUrl = "/jdy/v2/bd/measure_unit_detail";
                    TreeMap<String, String> params = new TreeMap<>();
                    params.put("number", number);
                    return this.getResponse(endUrl, params).getData(KingdeeUnit.class);
                }
            );
            callback.accept(result, null);
        } catch (Exception e) {
            log.debug("getMeasureUnitByNumber error, 账套: {}, 单位编号: {} 查询失败", accountName, number, e);
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

    /**
     * 根据字段名称获取id，如果有该字段、则设置value，没有就日志记录。辅助资料
     *
     * @param entityType   实体类型枚举，如KingdeeEntityType.PUR_BILL_ORDER
     * @param displayName  属性名称
     * @param fieldValue   属性值
     * @param setter       回调，接收KingdeeCustomField和fieldValue
     */
    public void setCustomFieldSafely(KingdeeEntityType entityType, String displayName, String fieldValue,
                                     BiConsumer<KingdeeCustomField, String> setter) {
        try {
            KingdeeCustomField customField = getCustomFieldByDisplayName(entityType.getCode(), displayName);
            if (customField != null) {
                setter.accept(customField, fieldValue);
            }
        } catch (Exception e) {
            log.debug("custom field {} skipped for {}", displayName, token.getAccountName(), e);
        }
    }

    /**
     * 保存商品信息
     */
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
            Optional.ofNullable(getAuxInfoByNumber(reqVO.getSaleDepartmentId().toString())).ifPresent(kingdeeUnit ->
                setCustomFieldSafely(KingdeeEntityType.MATERIAL, "部门", kingdeeUnit.getId(), reqVO::setCustomField)
            );
        } catch (Exception e) {
            log.debug("getAuxInfoByNumber error for sale department ID: {}", reqVO.getSaleDepartmentId(), e);
        }
        setCustomFieldSafely(KingdeeEntityType.MATERIAL, "部门", reqVO.getDeclaredTypeZh(), reqVO::setCustomField);
        setCustomFieldSafely(KingdeeEntityType.MATERIAL, "报关品名", reqVO.getDeclaredTypeZh(), reqVO::setCustomField);
        setCustomFieldSafely(KingdeeEntityType.MATERIAL, "报关品名(英文)", reqVO.getDeclaredTypeEn(), reqVO::setCustomField);
        reqVO.setIgnoreWarn(true);//保存覆盖已存在产品
        log.debug("adding product");
        String endUrl = "/jdy/v2/bd/material";
        TreeMap<String, String> params = new TreeMap<>();
        return postResponse(endUrl, params, reqVO);
    }


    /**
     * 添加供应商(+更新cache)
     *
     * @param kingdeeSupplierSaveVO 供应商
     * @return 供应商
     */
    public KingdeeResponse saveSupplier(KingdeeSupplierSaveVO kingdeeSupplierSaveVO) {
        String endUrl = "/jdy/v2/bd/supplier";
        KingdeeSupplierSaveVO supplierCopy = new KingdeeSupplierSaveVO();
        BeanUtils.copyProperties(kingdeeSupplierSaveVO, supplierCopy);
        // 查询所有供应商MAP，根据ID来更新对应供应商
        Map<String, KingdeeSupplierSaveVO> map = this.getAllSupplierList(null);
        Optional.ofNullable(map.get(supplierCopy.getName())).ifPresent(requestVO -> supplierCopy.setId(requestVO.getId()));
        supplierCopy.setIgnoreWarn(true);//忽略告警信息(如：单价为0)保存
        KingdeeResponse kingdeeResponse = postResponse(endUrl, new TreeMap<>(), supplierCopy);
        this.refreshSupplierCache();
        return kingdeeResponse;
    }

    public KingdeeResponse getSupplier(String number) {
        String endUrl = "/jdy/v2/bd/supplier_detail";
        TreeMap<String, String> params = new TreeMap<>();
        params.put("number", number);
        return getResponse(endUrl, params);
    }

    /**
     * 添加部门
     *
     * @param department 部门信息
     * @return KingdeeResponse
     */
    public KingdeeResponse addDepartment(KingdeeAuxInfoDetail department) {
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

        return postResponse("/jdy/v2/bd/aux_info", new TreeMap<>(), departmentCopy);
    }

    public Stream<KingdeeResponse> list(String endpoint) {
        log.debug("kingdee listing");
        return Stream.iterate(1, n -> n + 1).map(n -> {
            String endUrl = endpoint;
            TreeMap<String, String> params = new TreeMap<>();
            params.put("page_size", "100"); //max 100
            params.put("page", String.valueOf(n));
            return getResponse(endUrl, params);
        }).takeWhile(n -> n.getData(KingdeePage.class).getPage() <= n.getData(KingdeePage.class).getTotalPage());
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
        Optional<KingdeeAuxInfo> first = response.getData(KingdeePage.class).getRowsList(KingdeeAuxInfo.class).stream().filter(n -> n.getNumber().equals(number)).findFirst();
        return first.orElse(null);
    }

    public KingdeeAuxInfo getAuxInfoByName(String name) {
        log.debug("fetching aux info");
        String endUrl = "/jdy/v2/bd/aux_info";
        TreeMap<String, String> params = new TreeMap<>();
        params.put("name", name);
        KingdeeResponse response = getResponse(endUrl, params);
        Optional<KingdeeAuxInfo> first = response.getData(KingdeePage.class).getRowsList(KingdeeAuxInfo.class).stream().filter(n -> n.getName().equals(name)).findFirst();
        return first.orElse(null);
    }

    public KingdeeAuxInfoType getAuxInfoTypeByNumber(String number) {
        log.debug("fetching aux info");
        String endUrl = "/jdy/v2/bd/aux_info_type";
        TreeMap<String, String> params = new TreeMap<>();
        params.put("number", number);
        KingdeeResponse response = getResponse(endUrl, params);
        return response.getData(KingdeePage.class).getRowsList(KingdeeAuxInfoType.class).stream().filter(n -> n.getNumber().equals(number)).findFirst().get();
    }

    public Stream<KingdeeCustomField> getCustomField(String entityNumber) {
        String accountName = token.getAccountName();
        String cacheKey = KingdeeRedisKeyConstants.KINGDEE_CUSTOM_FIELD + ":" + accountName + ":" + entityNumber;
        String lockKey = cacheKey + ":lock";

        try {
            List<KingdeeCustomField> list = CacheSpinWaitUtils.getOrLoad(
                redisTemplate,
                redissonClient,
                cacheKey,
                lockKey,
                60, TimeUnit.MINUTES,
                new TypeReference<>() {
                },
                () -> {
                    String endUrl = "/jdy/v2/sys/custom_field";
                    TreeMap<String, String> params = new TreeMap<>();
                    params.put("entity_number", entityNumber);
                    KingdeeResponse response = getResponse(endUrl, params);
                    var data = response.getData(KingdeeCustomFieldRespVO.class);
                    return data.getHead();
                }
            );
            return list != null ? list.stream() : Stream.empty();
        } catch (Exception e) {
            log.error("getCustomField 获取失败 entityNumber={}", entityNumber, e);
            return Stream.empty(); // fail-safe fallback
        }
    }


    public KingdeeCustomField getCustomFieldByDisplayName(String entityNumber, String displayName) {
        return getCustomField(entityNumber)
            .filter(n -> displayName.equals(n.getDisplayName()))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(StrUtil.format(
                "未找到显示名称为 '{}' 的金蝶自定义字段 (entity={})", displayName, entityNumber
            )));
    }

    public Stream<KingdeePage> getAllPurRequest(KingdeePurRequestReqVO vo) {
        log.debug("fetching purchase request");
        String endUrl = "/jdy/v2/scm/pur_request";
        return StreamX.iterate(getPage(JsonUtilsX.toJSONObject(vo), endUrl), KingdeePage::hasNext, page -> {
            vo.setPage(String.valueOf(page.getPage() + 1));
            return getPage(JsonUtilsX.toJSONObject(vo), endUrl);
        });
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
            return allFutures.thenApply(v -> futures.stream().map(CompletableFuture::join).collect(Collectors.toList())).join().stream();

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
        return StreamX.iterate(getPage(JsonUtilsX.toJSONObject(vo), endpoint), KingdeePage::hasNext, page -> {
            vo.setPage(String.valueOf(page.getPage() + 1));
            return getPage(JsonUtilsX.toJSONObject(vo), endpoint);
        });
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

    /**
     * 获得采购订单详情
     */
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
     * @param saveReqVO 采购订单数据_入参
     * @return KingdeeResponse
     */
    public KingdeeResponse savePurOrder(KingdeePurOrderSaveReqVO saveReqVO) {
        String endUrl = "/jdy/v2/scm/pur_order";
        //供应商
        String supplierName = saveReqVO.getSupplierNumber();//erp供应商ID(在convert的时候放在number了)
        KingdeeSupplierSaveVO supplierSaveVO = this.getAllSupplierList(null).get(supplierName);
        //不存在 -> e
        if (supplierSaveVO == null) {
            throw exception(SUPPLIER_NOT_EXIST, supplierName);
        }
        saveReqVO.setSupplierId(supplierSaveVO.getId());

        //产品
        saveReqVO.getMaterialEntity().forEach(material -> {
            material.setMaterialId(this.getMaterial(material.getMaterialNumber()).getData(JSONObject.class).getString("id"));
            //单位ID
            setUnitId("套", kingdeeUnit -> {
                material.setUnitId(kingdeeUnit.getId());
                material.setUnitNumber(kingdeeUnit.getNumber());
            });
            //自定义字段-付款条款
            SrmPurchaseOrderApi srmPurchaseOrderApi = SpringUtils.getBean(SrmPurchaseOrderApi.class);
            SrmPurchaseOrderDTO purchaseOrderDTO = srmPurchaseOrderApi.getPurchaseOrderByCode(saveReqVO.getBillNo());
            setCustomFieldSafely(KingdeeEntityType.PUR_BILL_ORDER, "付款条款", purchaseOrderDTO.getPaymentTerms(), saveReqVO::setCustomField);
        });

        TreeMap<String, String> params = new TreeMap<>();
        saveReqVO.setIgnoreWarn(false);//忽略告警信息(如：名称已存在)保存客户
        return postResponse(endUrl, params, saveReqVO);
    }

    /**
     * 审核采购订单
     */
    public KingdeeResponse auditPurOrder(List<String> orderIds) {
        log.debug("审核采购订单，订单ID：{}", orderIds);
        return commonOperate(KingdeeEntityType.PUR_BILL_ORDER, KingdeeOperateType.AUDIT, orderIds);
    }

    /**
     * 反审核采购订单+删除采购订单
     *
     * @param purCode 采购订单编号
     * @return KingdeeResponse 最后一次操作的响应结果
     */
    public KingdeeResponse unAuditPurOrder(String purCode) {
        log.debug("反审核并删除采购订单，订单code：{}", purCode);
        // 1. 获取采购订单详情
        KingdeePurOrderDetail purOrderDetail = this.getPurOrderDetail(purCode);
        if (purOrderDetail == null) {
            throw exception(KingDeeErrorCodeConstants.PURCHASE_ORDER_NOT_EXIST, purCode);
        }

        //1.1  TODO 查询金蝶是否存在采购订单
        // 2. 执行反审核操作
        List<String> orderIds = Collections.singletonList(purOrderDetail.getId());
        KingdeeResponse unAuditResponse = commonOperate(KingdeeEntityType.PUR_BILL_ORDER, KingdeeOperateType.UNAUDIT, orderIds);
        if (!unAuditResponse.getErrcode().equals("0")) {
            log.error("反审核采购订单失败：{}", unAuditResponse.getDescription());
            return unAuditResponse;
        }

        // 3. 执行删除操作
        log.debug("开始删除采购订单，订单ID：{}", purOrderDetail.getId());
        KingdeeResponse deleteResponse = commonOperate(KingdeeEntityType.PUR_BILL_ORDER, KingdeeOperateType.DELETE, orderIds);
        if (!deleteResponse.getErrcode().equals("0")) {
            log.error("删除采购订单失败：{}", deleteResponse.getDescription());
        } else {
            log.info("采购订单反审核并删除成功，订单编号：{}", purCode);
        }

        return deleteResponse;
    }

    /**
     * 保存、更新+审核采购订单
     */
    public KingdeeResponse saveAndAuditPurOrder(KingdeePurOrderSaveReqVO order) {
        log.debug("保存并审核采购订单，订单编号：{}", order.getBillNo());

        // 1. 先保存采购订单
        KingdeeResponse saveResponse = this.savePurOrder(order);
        if (!saveResponse.getErrcode().equals("0")) {
            log.error("保存采购订单失败：{}", saveResponse.getDescription());
            return saveResponse;
        }

        // 2. 从保存响应中获取订单ID
        JSONObject data = saveResponse.getData(JSONObject.class);
        List<String> orderIds = data.getStringList("ids");
        if (orderIds == null || orderIds.isEmpty()) {
            log.error("保存采购订单成功但未返回订单ID");
            throw exception(KingDeeErrorCodeConstants.PURCHASE_ORDER_SAVE_SUCCESS_BUT_NO_ID, order.getBillNo());
        }
        String orderId = orderIds.get(0); // 取第一个订单ID

        // 3. 审核采购订单
        log.debug("开始审核采购订单，订单ID：{}", orderId);
        KingdeeResponse auditResponse = auditPurOrder(List.of(orderId));

        if (!auditResponse.getErrcode().equals("0")) {
            log.error("审核采购订单失败：{}", auditResponse.getDescription());
            // 审核失败时，可以考虑是否要删除已保存的订单
            // 这里暂时返回审核失败的响应
        } else {
            log.info("采购订单保存并审核成功，订单ID：{}", orderId);
        }

        return auditResponse;
    }

    /**
     * 保存+审核 采购入库单
     *
     * @param inbound 采购入库单数据
     * @return KingdeeResponse
     */
    public List<KingdeeResponse> saveAuditPurInbound(KingdeePurInboundSaveReqVO inbound) {
        List<KingdeeResponse> responseList = new ArrayList<>();

        // 校验金蝶采购入库单是否存在
        KingdeePurInboundDetail purInboundDetail = null;
        try {
            purInboundDetail = this.getPurInboundDetail(inbound.getBillNo());
        } catch (RuntimeException e) {
            log.info("采购入库单不存在，采购入库单编号：{},响应: {}", inbound.getBillNo(), e.getMessage());
        }

        //判断存在
        if (purInboundDetail == null) {
            //1,0 根据到货行查找采购订单
            //供应商ID
            String erpSupplierId = inbound.getSupplierNumber();
            SrmSupplierApi srmSupplierApi = SpringUtils.getBean(SrmSupplierApi.class);
            KingdeeSupplierSaveVO supplierSaveVO = this.getAllSupplierList(null).get(srmSupplierApi.getSupplier(Long.valueOf(erpSupplierId)).getName());
            //不存在 -> e
            if (supplierSaveVO == null) {
                throw exception(SUPPLIER_NOT_EXIST, erpSupplierId);
            }
            inbound.setSupplierId(supplierSaveVO.getId());
            inbound.getMaterialEntity().forEach(material -> {
                //产品ID
                material.setMaterialId(this.getMaterial(material.getMaterialNumber()).getData(JSONObject.class).getString("id"));
                //单位ID
                setUnitId("套", kingdeeUnit -> material.setUnitId(kingdeeUnit.getId()));
                //stock_number
                String stockId = material.getStockId();
                WmsWarehouseApi warehouseApi = SpringUtils.getBean(WmsWarehouseApi.class);
                Map<Long, WmsWarehouseDTO> warehouseMap = warehouseApi.getWarehouseMap(List.of(Long.valueOf(stockId)));
                material.setStockId(String.valueOf(warehouseMap.get(Long.valueOf(stockId)).getId()));
                material.setStockNumber(warehouseMap.get(Long.valueOf(stockId)).getCode());
                material.setStockId(null);
                //当前明细行订单详情
                String srcOrderBillNo = material.getSrcOrderBillNo();
                if (srcOrderBillNo == null) {
                    throw exception(KingDeeErrorCodeConstants.PUR_INBOUND_NOT_EXIST, inbound.getBillNo());
                }
                //2.0 根据辅助顺序拿到采购单行
                SrmPurchaseInApi srmPurchaseInApi = SpringUtils.getBean(SrmPurchaseInApi.class);
                SrmPurchaseInItemDTO srmPurchaseInItemDTO = srmPurchaseInApi.getPurchaseInItemById(Long.valueOf(material.getAuxPropId()));
                Long orderItemId = srmPurchaseInItemDTO.getOrderItemId();

                //3.0 渲染订单ID+行ID
                material.setSrcBillTypeId(KingdeeEntityType.PUR_BILL_ORDER.getCode());
                KingdeePurOrderDetail kingdeePurOrderDetail = this.getPurOrderDetail(srcOrderBillNo);
                //通过注册证号(itemID)匹配采购单行
                kingdeePurOrderDetail.getMaterialEntity().stream().filter(materialTemp -> materialTemp.getProRegNo().equals(orderItemId.toString()))
                    .findFirst()
                    .ifPresent(materialTemp -> material.setSrcEntryId(materialTemp.getId()));
                material.setSrcInterId(kingdeePurOrderDetail.getId());
                material.setSrcOrderBillNo(kingdeePurOrderDetail.getBillNo());
            });
            //4.0 保存采购入库单
            responseList.add(this.savePurInbound(inbound));
            //判断审核
            KingdeePurInboundDetail purInboundDetail2 = this.getPurInboundDetail(inbound.getBillNo());
            if (Objects.equals(purInboundDetail2.getBillStatus(), "Z")) {
                responseList.add(this.commonOperate(KingdeeEntityType.PUR_BILL_INBOUND, KingdeeOperateType.AUDIT, List.of(purInboundDetail2.getId()), null, true));
            }
        }
        return responseList;
    }

    /**
     * 保存+审核 采购退货单
     */
    public List<KingdeeResponse> saveAndAuditPurchaseReturn(KingdeePurReturnSaveReqVO returnOrder) {
        // 1. 校验金蝶采购退货单是否已存在
        List<KingdeeResponse> responseList = new ArrayList<>();
        KingdeePurReturnDetail kingdeePurReturnDetail = null;
        try {
            kingdeePurReturnDetail = this.getPurReturnDetail(returnOrder.getBillNo());
        } catch (RuntimeException e) {
            log.info("采购退货单不存在，采购退货单编号：{}, 响应: {}", returnOrder.getBillNo(), e.getMessage());
        }

        if (kingdeePurReturnDetail == null) {
            //保存
            responseList.add(this.savePurReturn(returnOrder));
            kingdeePurReturnDetail = this.getPurReturnDetail(returnOrder.getBillNo());
        }
        //审核


        // 2. 处理供应商信息
        String erpSupplierId = returnOrder.getSupplierNumber();
        SrmSupplierApi srmSupplierApi = SpringUtils.getBean(SrmSupplierApi.class);
        KingdeeSupplierSaveVO supplierSaveVO = this.getAllSupplierList(null)
            .get(srmSupplierApi.getSupplier(Long.valueOf(erpSupplierId)).getName());
        if (supplierSaveVO == null) {
            throw exception(SUPPLIER_NOT_EXIST, erpSupplierId);
        }
        returnOrder.setSupplierId(supplierSaveVO.getId());

        // 3. 处理明细行信息
        returnOrder.getMaterialEntity().forEach(material -> {
            // 设置产品ID
            material.setMaterialId(this.getMaterial(material.getMaterialNumber())
                .getData(JSONObject.class).getString("id"));

            // 设置单位ID
            setUnitId("套", kingdeeUnit -> material.setUnitId(kingdeeUnit.getId()));

            // 设置仓库信息
            String stockId = material.getStockId();
            WmsWarehouseApi warehouseApi = SpringUtils.getBean(WmsWarehouseApi.class);
            Map<Long, WmsWarehouseDTO> warehouseMap = warehouseApi.getWarehouseMap(List.of(Long.valueOf(stockId)));
            material.setStockNumber(warehouseMap.get(Long.valueOf(stockId)).getCode());
            material.setStockId(null);

            // 处理来源单据信息
            String srcBillNo = material.getSrcBillNo();
            if (srcBillNo == null) {
                throw exception(KingDeeErrorCodeConstants.PUR_INBOUND_NOT_EXIST, returnOrder.getBillNo());
            }

            // 获取来源采购入库单信息
            KingdeePurInboundDetail inboundDetail = this.getPurInboundDetail(srcBillNo);
            if (inboundDetail != null) {
                material.setSrcBillTypeId(KingdeeEntityType.PUR_BILL_INBOUND.getCode());
                material.setSrcInterId(inboundDetail.getId());

                // 匹配入库单行
                inboundDetail.getMaterialEntity().stream()
                    .filter(inboundLine -> inboundLine.getMaterialNumber().equals(material.getMaterialNumber()))
                    .findFirst()
                    .ifPresent(inboundLine -> material.setSrcEntryId(inboundLine.getId()));
            }
        });

        // 4. 保存采购退货单
        KingdeeResponse saveResponse = this.savePurReturn(returnOrder);
        if (!saveResponse.getErrcode().equals("0")) {
            log.error("保存采购退货单失败：{}", saveResponse.getDescription());
            return saveResponse;
        }

        // 5. 获取保存后的单据ID并审核
        JSONObject data = saveResponse.getData(JSONObject.class);
        List<String> orderIds = data.getStringList("ids");
        if (orderIds == null || orderIds.isEmpty()) {
            log.error("保存采购退货单成功但未返回单据ID");
            throw exception(KingDeeErrorCodeConstants.PURCHASE_ORDER_SAVE_SUCCESS_BUT_NO_ID, returnOrder.getBillNo());
        }

        // 6. 执行审核操作
        log.debug("开始审核采购退货单，单据ID：{}", orderIds.get(0));
        KingdeeResponse auditResponse = commonOperate(
            KingdeeEntityType.PUR_BILL_RETURN,
            KingdeeOperateType.AUDIT,
            orderIds
        );

        if (!auditResponse.getErrcode().equals("0")) {
            log.error("审核采购退货单失败：{}", auditResponse.getDescription());
        } else {
            log.info("采购退货单保存并审核成功，单据ID：{}", orderIds.get(0));
        }

        return responseList;
    }

    /**
     * 保存金蝶采购入库单
     */
    public KingdeeResponse savePurInbound(KingdeePurInboundSaveReqVO inbound) {
        String endUrl = "/jdy/v2/scm/pur_inbound";
        return postResponse(endUrl, new TreeMap<>(), inbound);
    }

    /**
     * 根据number金蝶采购入库单详情
     */
    public KingdeePurInboundDetail getPurInboundDetail(String number) {
        return getPurInboundDetailByParam("number", number);
    }

    /**
     * 根据ID获取金蝶采购入库单详情
     */
    public KingdeePurInboundDetail getPurInboundDetailById(String id) {
        return getPurInboundDetailByParam("id", id);
    }

    /**
     * 根据参数获取金蝶采购入库单详情（私有方法）
     */
    private KingdeePurInboundDetail getPurInboundDetailByParam(String paramName, String paramValue) {
        String endUrl = "/jdy/v2/scm/pur_inbound_detail";
        TreeMap<String, String> params = new TreeMap<>();
        params.put(paramName, paramValue);
        KingdeeResponse response = getResponse(endUrl, params);
        return response.getData(KingdeePurInboundDetail.class);
    }

    /**
     * 保存采购退货单
     *
     * @param returnOrder 采购退货单数据
     * @return KingdeeResponse
     */
    public KingdeeResponse savePurReturn(KingdeePurReturnSaveReqVO returnOrder) {
        //供应商ID
        String erpSupplierId = returnOrder.getSupplierId();
        SrmSupplierApi srmSupplierApi = SpringUtils.getBean(SrmSupplierApi.class);
        KingdeeSupplierSaveVO supplierSaveVO = this.getAllSupplierList(null).get(srmSupplierApi.getSupplier(Long.valueOf(erpSupplierId)).getName());
        //不存在 -> e
        if (supplierSaveVO == null) {
            throw exception(SUPPLIER_NOT_EXIST, erpSupplierId);
        }
        returnOrder.setSupplierId(supplierSaveVO.getId());
        //产品
        returnOrder.getMaterialEntity().forEach(material -> {
            //产品
            material.setMaterialId(this.getMaterial(material.getMaterialNumber()).getData(JSONObject.class).getString("id"));
            //数量
            material.setQty(material.getQty());
            //单位
            setUnitId("套", kingdeeUnit -> material.setUnitId(kingdeeUnit.getId()));
            //仓库
            String stockId = material.getStockId();
            WmsWarehouseApi warehouseApi = SpringUtils.getBean(WmsWarehouseApi.class);
            Map<Long, WmsWarehouseDTO> warehouseMap = warehouseApi.getWarehouseMap(List.of(Long.valueOf(stockId)));
            material.setStockId(String.valueOf(warehouseMap.get(Long.valueOf(stockId)).getId()));
            material.setStockNumber(warehouseMap.get(Long.valueOf(stockId)).getCode());
            material.setStockId(null);
            //备注
            material.setComment(material.getComment());
            material.setSrcBillTypeId(KingdeeEntityType.PUR_BILL_OUTBOUND.getCode());
            //明细ID
            Long srmInItemID = Long.valueOf(material.getProRegNo());
            //源单ID
            SrmPurchaseReturnApi srmPurchaseReturnApi = SpringUtils.getBean(SrmPurchaseReturnApi.class);
            SrmPurchaseReturnDTO srmPurchaseReturnDTO = srmPurchaseReturnApi.getPurchaseReturnByCode(returnOrder.getBillNo());
            srmPurchaseReturnDTO.getItems().stream().filter(srmPurchaseReturnItemDTO -> material.getProRegNo().equals(srmPurchaseReturnItemDTO.getId().toString())).findFirst().ifPresent(item -> {
                //
            });
        });
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
        return StreamX.iterate(getPage(JsonUtilsX.toJSONObject(vo), endpoint), KingdeePage::hasNext, page -> {
            vo.setPage(String.valueOf(page.getPage() + 1));
            return getPage(JsonUtilsX.toJSONObject(vo), endpoint);
        });
    }

    /**
     * 采购退货单详情
     **/
    public KingdeePurReturnDetail getPurReturnDetail(String number) {
        return getPurReturnDetailByParam("number", number);
    }

    /**
     * 根据ID获取金蝶采购退货单详情
     */
    public KingdeePurReturnDetail getPurReturnDetailById(String id) {
        return getPurReturnDetailByParam("id", id);
    }

    /**
     * 获取金蝶采购退货单详情
     */
    private KingdeePurReturnDetail getPurReturnDetailByParam(String paramName, String paramValue) {
        String endUrl = "/jdy/v2/scm/pur_ret_detail";
        TreeMap<String, String> params = new TreeMap<>();
        params.put(paramName, paramValue);
        KingdeeResponse response = getResponse(endUrl, params);
        return response.getData(KingdeePurReturnDetail.class);
    }

    private KingdeeResponse fetchResponse(String requestMethod, String endUrl, TreeMap<String, String> params, Object body) {
        String cts = String.valueOf(System.currentTimeMillis());
        String signature = getApiSignature(requestMethod, endUrl, params, cts);
        Map<String, String> headers = getApiHeaders(cts, signature, token.getAppToken());
        KingdeeResponse response;
        if ("POST".equals(requestMethod)) {
            var request = RequestX.builder().requestMethod(RequestX.Method.POST).url(BASE_HOST + endUrl).queryParams(params).headers(headers).payload(body).build();
            response = WebUtils.sendRequest(request, KingdeeResponse.class);
        } else {
            var request = RequestX.builder().requestMethod(RequestX.Method.GET).url(BASE_HOST + endUrl).queryParams(params).headers(headers).build();
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
        String queryJson = JsonUtilsX.toJsonString(queryReqVO);
        String SUPPLIER_CACHE_KEY = KingdeeRedisKeyConstants.KINGDEE_SUPPLIER_LIST + ":" + this.token.getAccountName() + ":" + SecureUtil.md5(token.getAppKey() + ":" + queryJson);

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
            locked = lock.tryLock(10, 20, TimeUnit.SECONDS);
            if (!locked) {
                Map<String, KingdeeSupplierSaveVO> result = CacheSpinWaitUtils.spinWaitForCache(() -> redisTemplate.opsForValue().get(SUPPLIER_CACHE_KEY), json -> JsonUtilsX.parseObject(json, new TypeReference<>() {
                }), 1000 * 10, 200);
                if (result != null) {
                    log.debug("等待期间获取到缓存数据，直接返回");
                    return result;
                }
                throw exception(SUPPLIER_LIST_LOADING);
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
            if (locked && lock.isHeldByCurrentThread()) {
                try {
                    lock.unlock();
                } catch (Exception ex) {
                    log.error("释放供应商缓存锁失败", ex);
                }
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
        queryReqVO.setPageSize(1000);
        KingdeePage firstPage = getPage(JsonUtilsX.toJSONObject(queryReqVO), endpoint);
        int totalPages = firstPage.getTotalPage();
        if (totalPages > 100) {
            throw new RuntimeException("供应商页数过大(" + totalPages + ")，请缩小范围");
        }

        // 2. 拉取所有页数据
        List<CompletableFuture<KingdeePage>> futures = new ArrayList<>();
        futures.add(CompletableFuture.completedFuture(firstPage));

        for (int page = 2; page <= totalPages; page++) {
            final int currentPage = page;
            futures.add(CompletableFuture.supplyAsync(() -> {
                KingdeeSupplierQueryReqVO supplierQueryReqVO = cn.iocoder.yudao.framework.common.util.object.BeanUtils.toBean(queryReqVO, KingdeeSupplierQueryReqVO.class, fqr -> fqr.setPage(currentPage));
                log.debug("线程[{}]开始获取第{}页数据", Thread.currentThread().getName(), currentPage);
                return getPage(JsonUtilsX.toJSONObject(supplierQueryReqVO), endpoint);
            }, AsyncTask.DEFAULT.getExecutor().getThreadPoolExecutor()));
        }

        // 3. 汇总数据
        return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).thenApply(v ->
            futures.stream().map(CompletableFuture::join).flatMap(page -> page.getRowsList(KingdeeSupplierSaveVO.class).stream()).collect(Collectors.toMap(KingdeeSupplierSaveVO::getName, supplier -> supplier, (oldVal, newVal) -> {
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
            String queryJson = JsonUtilsX.toJsonString(queryReqVO);
            String SUPPLIER_CACHE_KEY = KingdeeRedisKeyConstants.KINGDEE_SUPPLIER_LIST + ":" + this.token.getAccountName() + ":" + SecureUtil.md5(token.getAppKey() + ":" + queryJson);
            String LOCK_KEY = SUPPLIER_CACHE_KEY + ":lock";

            // 2. 获取锁
            RLock lock = redissonClient.getLock(LOCK_KEY);
            boolean locked = false;
            try {
                locked = lock.tryLock(5, 30, TimeUnit.SECONDS);
                if (!locked) {
                    log.warn("获取刷新锁失败，其他线程正在刷新供应商缓存");
                    return;
                }

                // 3. 获取旧数据用于对比
                String oldData = redisTemplate.opsForValue().get(SUPPLIER_CACHE_KEY);

                // 4. 获取新数据
                Map<String, KingdeeSupplierSaveVO> newData = fetchSupplierDataFromApi(queryReqVO);
                if (newData.isEmpty()) {
                    log.warn("获取新供应商数据为空，取消刷新");
                    redisTemplate.delete(SUPPLIER_CACHE_KEY);
                    return;
                }

                // 5. 更新缓存
                redisTemplate.opsForValue().set(SUPPLIER_CACHE_KEY, JsonUtilsX.toJsonString(newData), 120, TimeUnit.MINUTES);

                // 6. 记录变更
                if (oldData != null) {
                    Map<String, KingdeeSupplierSaveVO> oldMap = JsonUtilsX.parseObject(oldData, new TypeReference<>() {
                    });
                    List<String> addedNames = new ArrayList<>();
                    List<String> removedNames = new ArrayList<>();
                    List<String> updatedNames = new ArrayList<>();

                    for (String key : newData.keySet()) {
                        if (!oldMap.containsKey(key)) {
                            addedNames.add(key);
                        } else if (!oldMap.get(key).equals(newData.get(key))) {
                            updatedNames.add(key);
                        }
                    }
                    for (String key : oldMap.keySet()) {
                        if (!newData.containsKey(key)) {
                            removedNames.add(key);
                        }
                    }
                    log.info("供应商缓存平滑刷新完成，新增{}个[{}]，更新{}个[{}]，删除{}个[{}]", addedNames.size(), String.join(",", addedNames), updatedNames.size(), String.join(",", updatedNames), removedNames.size(), String.join(",", removedNames));
                } else {
                    log.info("供应商缓存平滑刷新完成，新增{}个供应商[{}]", newData.size(), String.join(",", newData.keySet()));
                }
            } finally {
                // 7. 释放锁
                if (locked && lock.isHeldByCurrentThread()) {
                    lock.unlock();
                }
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

    /**
     * 通用批量操作（审核、反审核、删除等）
     *
     * @param entityType  单据或基础资料类型枚举
     * @param operateType 操作类型枚举
     * @param ids         单据id列表
     * @param numbers     编码列表（可选）
     * @param ignoreWarn  是否忽略告警信息，默认false
     * @return KingdeeResponse
     */
    public KingdeeResponse commonOperate(KingdeeEntityType entityType, KingdeeOperateType operateType, List<String> ids, List<String> numbers, Boolean ignoreWarn) {
        String endUrl = "/jdy/v2/sys/common_operate";
        TreeMap<String, String> params = new TreeMap<>();

        // 构建请求体
        JSONObject payload = new JSONObject();
        payload.put("entity_number", entityType.getCode());
        payload.put("operate_type", operateType.getCode());
        payload.put("ids", ids);

        if (numbers != null && !numbers.isEmpty()) {
            payload.put("numbers", numbers);
        }

        if (ignoreWarn != null) {
            payload.put("ignore_warn", ignoreWarn);
        }

        log.debug("执行通用操作，实体类型：{}，操作类型：{}，单据数量：{}", entityType.getName(), operateType.getName(), ids.size());
        return postResponse(endUrl, params, payload);
    }

    /**
     * 通用批量操作（审核、反审核、删除等）- 简化版本
     *
     * @param entityType  单据或基础资料类型枚举
     * @param operateType 操作类型枚举
     * @param ids         单据id列表
     * @return KingdeeResponse
     */
    public KingdeeResponse commonOperate(KingdeeEntityType entityType, KingdeeOperateType operateType, List<String> ids) {
        return commonOperate(entityType, operateType, ids, null, false);
    }


}
