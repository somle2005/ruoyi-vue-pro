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
import com.somle.walmart.model.WalmartSearchDTO;
import com.somle.walmart.model.WalmartSearchResVO;
import com.somle.walmart.service.WalmartClient;
import com.somle.walmart.service.WalmartService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.*;
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

    @Autowired(required = false)
    private WalmartService walmartService;

    @Override
    public synchronized String execute(String param) throws Exception {
        if (!StringUtils.hasText(param)) {
            throw new RuntimeException("请输入店铺数组");
        }
        List<String> storeNames = Arrays.asList(param.split(","));
        String errorMsg = "";
        if (!CollectionUtils.isEmpty(storeNames)) {
            LambdaQueryWrapper<OmsShop> inWrapper = new LambdaQueryWrapper<OmsShop>().eq(OmsShop::getPlatName, "Walmart").eq(OmsShop::getDeleted, 0).in(OmsShop::getName, storeNames);
            List<OmsShop> omsShops = omsShopMapper.selectList(inWrapper);
            Map<String, OmsShop> nameMap = omsShops.stream().collect(Collectors.toMap(OmsShop::getName, e -> e));
            for (String storeName : storeNames) {
                try {
                    OmsShop omsShop = nameMap.get(storeName);
                    if (omsShop == null) {
                        throw new RuntimeException("当前店铺名称不存在");
                    }
                    String nextCursor = "*";
                    while (true) {
                        WalmartClient client = walmartService.getClient(omsShop.getAuthId());
                        WalmartGetAllItemsDTO walmartGetAllItemsDto = new WalmartGetAllItemsDTO();
                        walmartGetAllItemsDto.setNextCursor(nextCursor);
                        walmartGetAllItemsDto.setLimit(500L);
                        walmartGetAllItemsDto.setSuccessCode(200);
                        WalmartAllItemsResVO walmartAllItemsResVO = client.getAllItems(walmartGetAllItemsDto);
                        List<WalmartAllItemsResVO.ItemResponseDTO> itemResponse = walmartAllItemsResVO.getItemResponse();
                        if (CollectionUtils.isEmpty(itemResponse)) {
                            break;
                        }
                        //查询详情接口
                        WalmartSearchDTO walmartSearchDTO = new WalmartSearchDTO();
                        String gtin = itemResponse.stream().map(e -> e.getGtin()).collect(Collectors.joining(","));
                        walmartSearchDTO.setGtin(gtin);
                        walmartSearchDTO.setSuccessCode(200);
                        walmartSearchDTO.setSleepTime(100L);
                        WalmartSearchResVO walmartSearchResVO = client.searchItem(walmartSearchDTO);
                        List<WalmartSearchResVO.ItemsDTO> items = walmartSearchResVO.getItems();
                        if (!CollectionUtils.isEmpty(items)){
                            Map<String, List<WalmartSearchResVO.ItemsDTO>> titleGroup = items.stream().collect(Collectors.groupingBy(WalmartSearchResVO.ItemsDTO::getTitle));
                            for (WalmartAllItemsResVO.ItemResponseDTO itemResponseDTO : itemResponse) {
                                List<WalmartSearchResVO.ItemsDTO> itemsDTOS = titleGroup.get(itemResponseDTO.getProductName());
                                if (!CollectionUtils.isEmpty(itemsDTOS)){
                                    WalmartSearchResVO.ItemsDTO itemsDTO = itemsDTOS.get(0);
                                    itemResponseDTO.setItemsDTO(itemsDTO);
                                }
                            }
                        }
                        //操作db，新增或者更新
                        saveOrUpdateSku(itemResponse, omsShop);
                        nextCursor = walmartAllItemsResVO.getNextCursor();
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
            OmsSku omsSku = new OmsSku();
            omsSku.setPlatSkuCode(eachItem.getWpid());
            omsSku.setSku(eachItem.getSku());
            omsSku.setStoreId(OmsShop.getId());
            omsSku.setStoreName(OmsShop.getName());
            omsSku.setPlatId(OmsShop.getPlatId());
            omsSku.setPlatName(OmsShop.getPlatName());
            omsSku.setPlatShopCode(OmsShop.getPlatShopCode());
            omsSku.setConditionType(eachItem.getCondition());
            String availability = eachItem.getAvailability();
            if ("In_stock".equals(availability)){
                omsSku.setStockStatus(1);
            } else if ("Out_of_stock".equals(availability)) {
                omsSku.setStockStatus(0);
            } else if ("Preorder".equals(availability)) {
                omsSku.setPreorderStatus(1);
            }
            String publishedStatus = eachItem.getPublishedStatus();
            if ("PUBLISHED".equals(publishedStatus)) {
                omsSku.setDiscoverableStatus(1);
            } else if ("UNPUBLISHED".equals(publishedStatus)) {
                omsSku.setDiscoverableStatus(0);
            }
            WalmartAllItemsResVO.ItemResponseDTO.PriceDTO priceDTO = eachItem.getPrice();
            if (priceDTO != null){
                omsSku.setPrice(priceDTO.getAmount());
                omsSku.setPriceUnit(priceDTO.getCurrency());
            }
            omsSku.setUpc(eachItem.getUpc());
            omsSku.setGtin(eachItem.getGtin());
            omsSku.setTitle(eachItem.getProductName());
            omsSku.setProductType(eachItem.getProductType());
            omsSku.setCreator("admin");
            omsSku.setCreateTime(LocalDateTime.now());
            omsSku.setDeleted(0);
            WalmartSearchResVO.ItemsDTO itemsDTO = eachItem.getItemsDTO();
            if (itemsDTO != null){
                omsSku.setPlatSkuId(itemsDTO.getItemId());
                List<WalmartSearchResVO.ItemsDTO.ImagesDTO> images = itemsDTO.getImages();
                if (!CollectionUtils.isEmpty(images)){
                    omsSku.setMainImageUrl(images.get(0).getUrl());
                }
                omsSku.setCustomerRating(itemsDTO.getCustomerRating());
                omsSku.setDescribe(itemsDTO.getDescription());
                omsSku.setBrand(itemsDTO.getBrand());
            }
            String originalJson = JSON.toJSONString(eachItem);
            omsSku.setId(existId);
            if (existId == null) {
                saveOmsSkus.add(omsSku);
            } else if (!originalJson.equals(existOriginalJson)) {
                updateOmsSkus.add(omsSku);
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
