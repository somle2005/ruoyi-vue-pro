package com.somle.esb.job;

import cn.iocoder.yudao.framework.common.util.string.StrUtils;
import cn.iocoder.yudao.framework.quartz.core.handler.JobHandler;
import cn.iocoder.yudao.framework.tenant.core.context.TenantContextHolder;
import cn.iocoder.yudao.module.oms.dal.OmsShopMapper;
import cn.iocoder.yudao.module.oms.model.entity.OmsShopDO;
import cn.iocoder.yudao.module.oms.model.entity.OmsSkuDO;
import cn.iocoder.yudao.module.oms.service.OmsSkuService;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.esb.enums.TenantId;
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

    @Autowired(required = false)
    private WalmartService walmartService;

    @Resource
    OmsSkuService omsSkuService;

    @Override
    public synchronized String execute(String param) throws Exception {
        TenantContextHolder.setTenantId(TenantId.DEFAULT.getId());
        if (!StringUtils.hasText(param)) {
            throw new RuntimeException("请输入店铺数组");
        }
        List<String> storeNames = Arrays.asList(param.split(","));
        String errorMsg = "";
        if (!CollectionUtils.isEmpty(storeNames)) {
            LambdaQueryWrapper<OmsShopDO> inWrapper = new LambdaQueryWrapper<OmsShopDO>().eq(OmsShopDO::getPlatName, "Walmart").eq(OmsShopDO::getDeleted, 0).in(OmsShopDO::getName, storeNames);
            List<OmsShopDO> omsShopDOS = omsShopMapper.selectList(inWrapper);
            Map<String, OmsShopDO> nameMap = omsShopDOS.stream().collect(Collectors.toMap(OmsShopDO::getName, e -> e));
            for (String storeName : storeNames) {
                try {
                    OmsShopDO omsShopDO = nameMap.get(storeName);
                    if (omsShopDO == null) {
                        throw new RuntimeException("当前店铺名称不存在");
                    }
                    String nextCursor = "*";
                    while (true) {
                        WalmartClient client = walmartService.getClient(omsShopDO.getAuthId());
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
                        //组装详细信息
                        assemblyDetails(itemResponse, items);
                        //操作db，新增或者更新
                        saveOrUpdateSku(itemResponse, omsShopDO);
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

    private void assemblyDetails(List<WalmartAllItemsResVO.ItemResponseDTO> itemResponse, List<WalmartSearchResVO.ItemsDTO> items) {
        if (!CollectionUtils.isEmpty(items)) {
            Map<String, List<WalmartSearchResVO.ItemsDTO>> titleGroup = items.stream().collect(Collectors.groupingBy(WalmartSearchResVO.ItemsDTO::getTitle));
            for (WalmartAllItemsResVO.ItemResponseDTO itemResponseDTO : itemResponse) {
                List<WalmartSearchResVO.ItemsDTO> itemsDTOS = titleGroup.get(itemResponseDTO.getProductName());
                if (!CollectionUtils.isEmpty(itemsDTOS)) {
                    WalmartSearchResVO.ItemsDTO itemsDTO = itemsDTOS.get(0);
                    itemResponseDTO.setItemsDTO(itemsDTO);
                }
            }
        }
    }


    private void saveOrUpdateSku(List<WalmartAllItemsResVO.ItemResponseDTO> itemDTOs, OmsShopDO omsShopDO) {
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
        List<OmsSkuDO> doDBOmsSkus = new ArrayList<>();
        //组装数据
        assemblyData(omsShopDO, items, doDBOmsSkus);
        //批量插入或更新OmsSku
        omsSkuService.insertOrUpdateOmsSku(omsShopDO, doDBOmsSkus);
    }

    private void assemblyData(OmsShopDO omsShopDO, List<WalmartAllItemsResVO.ItemResponseDTO> items, List<OmsSkuDO> doDBOmsSkus) {
        for (WalmartAllItemsResVO.ItemResponseDTO eachItem : items) {
            OmsSkuDO omsSku = new OmsSkuDO();
            omsSku.setPlatSkuCode(eachItem.getWpid());
            omsSku.setSku(eachItem.getSku());
            omsSku.setStoreId(omsShopDO.getId());
            omsSku.setStoreName(omsShopDO.getName());
            omsSku.setPlatId(omsShopDO.getPlatId());
            omsSku.setPlatName(omsShopDO.getPlatName());
            omsSku.setPlatShopCode(omsShopDO.getPlatShopCode());
            omsSku.setConditionType(eachItem.getCondition());
            String availability = eachItem.getAvailability();
            if ("In_stock".equals(availability)) {
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
            if (priceDTO != null) {
                omsSku.setPrice(priceDTO.getAmount());
                omsSku.setPriceUnit(priceDTO.getCurrency());
            }
            omsSku.setUpc(eachItem.getUpc());
            omsSku.setGtin(eachItem.getGtin());
            omsSku.setTitle(eachItem.getProductName());
            omsSku.setProductType(eachItem.getProductType());
            WalmartSearchResVO.ItemsDTO itemsDTO = eachItem.getItemsDTO();
            if (itemsDTO != null) {
                omsSku.setPlatSkuId(itemsDTO.getItemId());
                List<WalmartSearchResVO.ItemsDTO.ImagesDTO> images = itemsDTO.getImages();
                if (!CollectionUtils.isEmpty(images)) {
                    omsSku.setMainImageUrl(images.get(0).getUrl());
                }
                omsSku.setCustomerRating(itemsDTO.getCustomerRating());
                omsSku.setDescribe(itemsDTO.getDescription());
                omsSku.setBrand(itemsDTO.getBrand());
            }
            String originalJson = JSON.toJSONString(eachItem);
            omsSku.setOriginalJson(originalJson);
            doDBOmsSkus.add(omsSku);
        }
    }
}
