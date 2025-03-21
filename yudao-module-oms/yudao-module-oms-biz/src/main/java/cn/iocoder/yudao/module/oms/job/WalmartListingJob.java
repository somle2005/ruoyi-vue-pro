package cn.iocoder.yudao.module.oms.job;

import cn.iocoder.yudao.framework.common.util.custom.MyExceptionUtil;
import cn.iocoder.yudao.framework.quartz.core.handler.JobHandler;
import cn.iocoder.yudao.module.oms.model.entity.ErpShop;
import cn.iocoder.yudao.module.oms.model.entity.ErpSku;
import cn.iocoder.yudao.module.oms.dal.ErpShopMapper;
import cn.iocoder.yudao.module.oms.dal.ErpSkuMapper;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.walmart.domain.GetAllItemsDto;
import com.somle.walmart.domain.WalmartAllItemsResVO;
import com.somle.walmart.service.WalmartClient;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;



/*1.循环请求v3/items，拿到"gtin": "00782926650858".
    2.批量根据"gtin": "00782926650858"调用v3/items/walmart/search，根据标题配对，组装进sku
    3.请求完全以后，把全部变体父sku取出来，分组。若子sku等于父sku即为父sku的信息，否则取主要的，否则则null
    4.父子入库
    5.处理不含有变体的sku当做单体入库*/

//Walmart sku拉取
@Slf4j
@Component
public class WalmartListingJob implements JobHandler {

    @Resource
    private ErpShopMapper erpShopMapper;

    @Resource
    private ErpSkuMapper erpSkuMapper;

    @Resource
    private WalmartClient walmartClient;

    @Override
    public synchronized String execute(String param) throws Exception {
        if (!StringUtils.hasText(param)) {
            throw new RuntimeException("请输入店铺数组");
        }
        List<String> storeNames = Arrays.asList(param.split(","));
        String errorMsg = "";
        if (!CollectionUtils.isEmpty(storeNames)) {
            LambdaQueryWrapper<ErpShop> inWrapper = new LambdaQueryWrapper<ErpShop>().eq(ErpShop::getPlatName, "Walmart").eq(ErpShop::getDeleted, 0).in(ErpShop::getName, storeNames);
            List<ErpShop> erpShops = erpShopMapper.selectList(inWrapper);
            Map<String, ErpShop> nameMap = erpShops.stream().collect(Collectors.toMap(ErpShop::getName, e -> e));
            for (String storeName : storeNames) {
                try {
                    ErpShop erpShop = nameMap.get(storeName);
                    if (erpShop == null) {
                        throw new RuntimeException("当前店铺名称不存在");
                    }
                    String nextCursor = "*";
                    while (true) {
                        GetAllItemsDto getAllItemsDto = new GetAllItemsDto();
                        getAllItemsDto.setNextCursor(nextCursor);
                        getAllItemsDto.setLimit(500L);
                        getAllItemsDto.setShopName(storeName);
                        getAllItemsDto.setSuccessCode(200);
                        WalmartAllItemsResVO walmartAllItemsResVO = walmartClient.getAllItems(getAllItemsDto);
                        if (CollectionUtils.isEmpty(walmartAllItemsResVO.getItemResponse())) {
                            break;
                        }
                        //操作db，新增或者更新
                        saveOrUpdateSku(walmartAllItemsResVO.getItemResponse(), erpShop);
                        nextCursor= walmartAllItemsResVO.getNextCursor();
                        //防止限流
                        TimeUnit.MILLISECONDS.sleep(200L);
                    }
                } catch (Exception e) {
                    log.error("店铺名称{},出现异常", storeName, e);
                    errorMsg = errorMsg + storeName + MyExceptionUtil.getExceptionDetail(e);
                }
            }
        }
        if (StringUtils.hasText(errorMsg)) {
            throw new RuntimeException(errorMsg);
        }
        return "success";
    }


    private void saveOrUpdateSku(List<WalmartAllItemsResVO.ItemResponseDTO> itemDTOs, ErpShop erpShop) {
        ArrayList<WalmartAllItemsResVO.ItemResponseDTO> items = new ArrayList<>();
        Map<String, List<WalmartAllItemsResVO.ItemResponseDTO>> skuMap = itemDTOs.stream().filter(e -> StringUtils.hasText(e.getSku())).collect(Collectors.groupingBy(WalmartAllItemsResVO.ItemResponseDTO::getSku));
        Set<String> allSkus = skuMap.keySet();
        for (String sku : allSkus) {
            WalmartAllItemsResVO.ItemResponseDTO erpSku = skuMap.get(sku).get(0);
            items.add(erpSku);
        }
        if (CollectionUtils.isEmpty(items)) {
            return;
        }
        LambdaQueryWrapper<ErpSku> existEq = new LambdaQueryWrapper<ErpSku>().in(ErpSku::getSku, allSkus).eq(ErpSku::getStoreName, erpShop.getName()).eq(ErpSku::getDeleted, 0);
        List<ErpSku> existSkus = erpSkuMapper.selectList(existEq);
        Map<String, ErpSku> existSkuIdMaps = existSkus.stream().collect(Collectors.toMap(ErpSku::getSku, e -> e));

        List<ErpSku> saveErpSkus = new ArrayList<>();
        List<ErpSku> updateErpSkus = new ArrayList<>();
        for (WalmartAllItemsResVO.ItemResponseDTO eachItem : items) {
            ErpSku existErpSku = existSkuIdMaps.get(eachItem.getSku());
            Long existId = null;
            String existOriginalJson = null;
            if (existErpSku != null) {
                existId = existErpSku.getId();
                existOriginalJson = existErpSku.getOriginalJson();
            }
            ErpSku erpSku = new ErpSku();
            erpSku.setPlatSkuCode(eachItem.getWpid());
            erpSku.setSku(eachItem.getSku());
            erpSku.setStoreId(erpShop.getId());
            erpSku.setStoreName(erpShop.getName());
            erpSku.setPlatId(erpShop.getPlatId());
            erpSku.setPlatName(erpShop.getPlatName());
            erpSku.setPlatShopCode(erpShop.getPlatShopCode());
            erpSku.setConditionType(eachItem.getCondition());
            if ("In_stock".equals(eachItem.getAvailability())) {
                erpSku.setBuyableStatus(1);
                erpSku.setDiscoverableStatus(1);
                erpSku.setPreorderStatus(0);
            } else if ("Out_of_stock".equals(eachItem.getAvailability())) {
                erpSku.setBuyableStatus(0);
                erpSku.setDiscoverableStatus(0);
                erpSku.setPreorderStatus(0);
            } else {
                erpSku.setBuyableStatus(0);
                erpSku.setDiscoverableStatus(1);
                erpSku.setPreorderStatus(1);
            }
            erpSku.setUpc(eachItem.getUpc());
            erpSku.setGtin(eachItem.getGtin());
            erpSku.setTitle(eachItem.getProductName());
            erpSku.setProductType(eachItem.getProductType());
            erpSku.setCreator("admin");
            erpSku.setCreateTime(LocalDateTime.now());
            erpSku.setDeleted(0);
            String originalJson = JSON.toJSONString(eachItem);

            if (existId == null) {
                saveErpSkus.add(erpSku);
            } else if (!originalJson.equals(existOriginalJson)) {
                updateErpSkus.add(erpSku);
            }
        }
        if (!CollectionUtils.isEmpty(saveErpSkus)) {
            erpSkuMapper.insert(saveErpSkus);
        }
        if (!CollectionUtils.isEmpty(updateErpSkus)) {
            erpSkuMapper.updateById(updateErpSkus);
        }
    }
}
