package com.somle.esb.job;

import cn.iocoder.yudao.framework.common.util.string.StrUtils;
import cn.iocoder.yudao.framework.quartz.core.handler.JobHandler;
import cn.iocoder.yudao.module.oms.dal.OmsShopMapper;
import cn.iocoder.yudao.module.oms.dal.OmsSkuMapper;
import cn.iocoder.yudao.module.oms.model.entity.OmsShop;
import cn.iocoder.yudao.module.oms.model.entity.OmsSku;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.walmart.model.WalmartAllItemsResVO;
import com.somle.walmart.model.WalmartGetAllItemsDTO;
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
    private OmsShopMapper omsShopMapper;

    @Resource
    private OmsSkuMapper omsSkuMapper;

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
            LambdaQueryWrapper<OmsShop> inWrapper = new LambdaQueryWrapper<OmsShop>().eq(OmsShop::getPlatName, "Walmart").eq(OmsShop::getDeleted, 0).in(OmsShop::getName, storeNames);
            List<OmsShop> OmsShops = omsShopMapper.selectList(inWrapper);
            Map<String, OmsShop> nameMap = OmsShops.stream().collect(Collectors.toMap(OmsShop::getName, e -> e));
            for (String storeName : storeNames) {
                try {
                    OmsShop OmsShop = nameMap.get(storeName);
                    if (OmsShop == null) {
                        throw new RuntimeException("当前店铺名称不存在");
                    }
                    String nextCursor = "*";
                    while (true) {
                        WalmartGetAllItemsDTO walmartGetAllItemsDto = new WalmartGetAllItemsDTO();
                        walmartGetAllItemsDto.setNextCursor(nextCursor);
                        walmartGetAllItemsDto.setLimit(500L);
                        walmartGetAllItemsDto.setShopName(storeName);
                        walmartGetAllItemsDto.setSuccessCode(200);
                        WalmartAllItemsResVO walmartAllItemsResVO = walmartClient.getAllItems(walmartGetAllItemsDto);
                        if (CollectionUtils.isEmpty(walmartAllItemsResVO.getItemResponse())) {
                            break;
                        }
                        //操作db，新增或者更新
                        saveOrUpdateSku(walmartAllItemsResVO.getItemResponse(), OmsShop);
                        nextCursor = walmartAllItemsResVO.getNextCursor();
                        //防止限流
                        TimeUnit.MILLISECONDS.sleep(200L);
                    }
                } catch (Exception e) {
                    log.error("店铺名称{},出现异常", storeName, e);
                    errorMsg = errorMsg + storeName + StrUtils.toString(e);
                }
            }
        }
        if (StringUtils.hasText(errorMsg)) {
            throw new RuntimeException(errorMsg);
        }
        return "success";
    }


    private void saveOrUpdateSku(List<WalmartAllItemsResVO.ItemResponseDTO> itemDTOs, OmsShop OmsShop) {
        List<WalmartAllItemsResVO.ItemResponseDTO> items = new ArrayList<>();
        Map<String, List<WalmartAllItemsResVO.ItemResponseDTO>> skuMap = itemDTOs.stream().filter(e -> StringUtils.hasText(e.getSku())).collect(Collectors.groupingBy(WalmartAllItemsResVO.ItemResponseDTO::getSku));
        Set<String> allSkus = skuMap.keySet();
        for (String sku : allSkus) {
            WalmartAllItemsResVO.ItemResponseDTO OmsSku = skuMap.get(sku).get(0);
            items.add(OmsSku);
        }
        if (CollectionUtils.isEmpty(items)) {
            return;
        }
        LambdaQueryWrapper<OmsSku> existEq = new LambdaQueryWrapper<OmsSku>().in(OmsSku::getSku, allSkus).eq(OmsSku::getStoreName, OmsShop.getName()).eq(OmsSku::getDeleted, 0);
        List<OmsSku> existSkus = omsSkuMapper.selectList(existEq);
        Map<String, OmsSku> existSkuIdMaps = existSkus.stream().collect(Collectors.toMap(OmsSku::getSku, e -> e));

        List<OmsSku> saveOmsSkus = new ArrayList<>();
        List<OmsSku> updateOmsSkus = new ArrayList<>();
        for (WalmartAllItemsResVO.ItemResponseDTO eachItem : items) {
            OmsSku existOmsSku = existSkuIdMaps.get(eachItem.getSku());
            Long existId = null;
            String existOriginalJson = null;
            if (existOmsSku != null) {
                existId = existOmsSku.getId();
                existOriginalJson = existOmsSku.getOriginalJson();
            }
            OmsSku OmsSku = new OmsSku();
            OmsSku.setPlatSkuCode(eachItem.getWpid());
            OmsSku.setSku(eachItem.getSku());
            OmsSku.setStoreId(OmsShop.getId());
            OmsSku.setStoreName(OmsShop.getName());
            OmsSku.setPlatId(OmsShop.getPlatId());
            OmsSku.setPlatName(OmsShop.getPlatName());
            OmsSku.setPlatShopCode(OmsShop.getPlatShopCode());
            OmsSku.setConditionType(eachItem.getCondition());
            if ("In_stock".equals(eachItem.getAvailability())) {
                OmsSku.setBuyableStatus(1);
                OmsSku.setDiscoverableStatus(1);
                OmsSku.setPreorderStatus(0);
            } else if ("Out_of_stock".equals(eachItem.getAvailability())) {
                OmsSku.setBuyableStatus(0);
                OmsSku.setDiscoverableStatus(0);
                OmsSku.setPreorderStatus(0);
            } else {
                OmsSku.setBuyableStatus(0);
                OmsSku.setDiscoverableStatus(1);
                OmsSku.setPreorderStatus(1);
            }
            OmsSku.setUpc(eachItem.getUpc());
            OmsSku.setGtin(eachItem.getGtin());
            OmsSku.setTitle(eachItem.getProductName());
            OmsSku.setProductType(eachItem.getProductType());
            OmsSku.setCreator("admin");
            OmsSku.setCreateTime(LocalDateTime.now());
            OmsSku.setDeleted(0);
            String originalJson = JSON.toJSONString(eachItem);

            if (existId == null) {
                saveOmsSkus.add(OmsSku);
            } else if (!originalJson.equals(existOriginalJson)) {
                updateOmsSkus.add(OmsSku);
            }
        }
        if (!CollectionUtils.isEmpty(saveOmsSkus)) {
            omsSkuMapper.insert(saveOmsSkus);
        }
        if (!CollectionUtils.isEmpty(updateOmsSkus)) {
            omsSkuMapper.updateById(updateOmsSkus);
        }
    }
}
