package com.somle.esb.job;

import cn.iocoder.yudao.framework.common.util.string.StrUtils;
import cn.iocoder.yudao.framework.quartz.core.handler.JobHandler;
import cn.iocoder.yudao.framework.tenant.core.context.TenantContextHolder;
import cn.iocoder.yudao.module.oms.repository.OmsShopRepository;
import cn.iocoder.yudao.module.oms.model.OmsShopDO;
import cn.iocoder.yudao.module.oms.model.OmsSkuDO;
import cn.iocoder.yudao.module.oms.service.OmsSkuService;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.esb.enums.TenantId;
import com.somle.shopify.controller.vo.ShopifyRetrieveAListOfProductsReqVO;
import com.somle.shopify.controller.vo.ShopifyRetrieveAListOfProductsRespVO;
import com.somle.shopify.service.ShopifyService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

//Shopify sku拉取

@Slf4j
@Component
public class ShopifyListingJob implements JobHandler {


    @Autowired(required = false)
    private ShopifyService shopifyService;

    @Resource
    private OmsShopRepository omsShopRepository;

    @Resource
    private OmsSkuService omsSkuService;

    @Override
    public synchronized String execute(String param) {
        TenantContextHolder.setTenantId(TenantId.DEFAULT.getId());
        if (!StringUtils.hasText(param)) {
            throw new RuntimeException("请输入店铺数组");
        }
        List<String> storeNames = Arrays.asList(param.split(","));
        String errorMsg = "";
        if (!CollectionUtils.isEmpty(storeNames)) {
            LambdaQueryWrapper<OmsShopDO> inWrapper = new LambdaQueryWrapper<OmsShopDO>().eq(OmsShopDO::getPlatName, "Shopify").eq(OmsShopDO::getDeleted, 0).in(OmsShopDO::getName, storeNames);
            List<OmsShopDO> omsShopDOS = omsShopRepository.selectList(inWrapper);
            Map<String, OmsShopDO> nameMap = omsShopDOS.stream().collect(Collectors.toMap(OmsShopDO::getName, e -> e));
            for (String storeName : storeNames) {
                try {
                    OmsShopDO omsShopDO = nameMap.get(storeName);
                    if (omsShopDO == null) {
                        throw new RuntimeException("当前店铺名称不存在");
                    }
                    Long lastId = 1L;
                    while (true) {
                        ShopifyRetrieveAListOfProductsReqVO dto = new ShopifyRetrieveAListOfProductsReqVO();
                        dto.setSuccessCode(200);
                        dto.setLimit(250L);
                        dto.setSince_id(lastId);
                        dto.setSleepTime(200L);
                        ShopifyRetrieveAListOfProductsRespVO shopifyRetrieveAListOfProductsRespVo = shopifyService.getClient(omsShopDO.getAuthId()).retrieveAListOfProducts(dto);
                        List<ShopifyRetrieveAListOfProductsRespVO.ProductsDTO> items = shopifyRetrieveAListOfProductsRespVo.getProducts();
                        if (CollectionUtils.isEmpty(items)) {
                            break;
                        }
                        //操作db，新增或者更新
                        saveOrUpdateSku(items, omsShopDO);
                        lastId = items.get(items.size() - 1).getId();
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

    private void saveOrUpdateSku(List<ShopifyRetrieveAListOfProductsRespVO.ProductsDTO> items, OmsShopDO omsShopDO) {
        List<OmsSkuDO> doDBOmsSkus = new ArrayList<>();
        for (ShopifyRetrieveAListOfProductsRespVO.ProductsDTO parentItem : items) {
            //组装数据
            assemblyData(omsShopDO, doDBOmsSkus, parentItem);
        }
        //批量插入或更新OmsSku
        omsSkuService.insertOrUpdateOmsSku(omsShopDO, doDBOmsSkus);
    }

    private void assemblyData(OmsShopDO omsShopDO, List<OmsSkuDO> doDBOmsSkus, ShopifyRetrieveAListOfProductsRespVO.ProductsDTO parentItem) {
        //获取父产品信息
        String productType = parentItem.getProductType();
        String status = parentItem.getStatus();
        Integer buyableStatus = 0;
        if ("active".equals(status)) {
            buyableStatus = 1;
        }
        String publishedAt = parentItem.getPublishedAt();
        Integer discoverableStatus = 0;
        if (StringUtils.hasText(publishedAt)) {
            discoverableStatus = 1;
        }
        String tags = parentItem.getTags();
        String bodyHtml = parentItem.getBodyHtml();
        String vendor = parentItem.getVendor();
        String originalJson = JSON.toJSONString(parentItem);
        List<ShopifyRetrieveAListOfProductsRespVO.ProductsDTO.VariantsDTO> variants = parentItem.getVariants();
        List<ShopifyRetrieveAListOfProductsRespVO.ProductsDTO.ImagesDTO> images = parentItem.getImages();
        Map<Long, ShopifyRetrieveAListOfProductsRespVO.ProductsDTO.ImagesDTO> imagesIdMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(images)) {
            imagesIdMap = images.stream().collect(Collectors.toMap(ShopifyRetrieveAListOfProductsRespVO.ProductsDTO.ImagesDTO::getId, e -> e));
        }
        //处理子产品
        if (!CollectionUtils.isEmpty(variants)) {
            for (ShopifyRetrieveAListOfProductsRespVO.ProductsDTO.VariantsDTO childItem : variants) {
                OmsSkuDO childOmsSku = new OmsSkuDO();
                String childSku = childItem.getSku();
                childOmsSku.setSku(childSku);
                childOmsSku.setPlatSkuId(childItem.getId().toString());
                childOmsSku.setStoreId(omsShopDO.getId());
                childOmsSku.setStoreName(omsShopDO.getName());
                childOmsSku.setPlatId(omsShopDO.getPlatId());
                childOmsSku.setPlatName(omsShopDO.getPlatName());
                childOmsSku.setPlatShopCode(omsShopDO.getPlatShopCode());
                childOmsSku.setPatternType("child");
                childOmsSku.setProductType(productType);
                childOmsSku.setBuyableStatus(buyableStatus);
                childOmsSku.setDiscoverableStatus(discoverableStatus);
                childOmsSku.setTitle(childItem.getTitle());
                childOmsSku.setPrice(new BigDecimal(childItem.getPrice()));
                childOmsSku.setWeight(childItem.getWeight());
                childOmsSku.setWeightUnit(childItem.getWeightUnit());
                childOmsSku.setBarcode(childItem.getBarcode());
                childOmsSku.setLabel(tags);
                childOmsSku.setDescribe(bodyHtml);
                Long imageId = childItem.getImageId();
                if (imageId != null) {
                    ShopifyRetrieveAListOfProductsRespVO.ProductsDTO.ImagesDTO imagesDTO = imagesIdMap.get(imageId);
                    if (imagesDTO != null) {
                        childOmsSku.setMainImageUrl(imagesDTO.getSrc());
                    }
                }
                childOmsSku.setCreatedAt(childItem.getCreatedAt());
                childOmsSku.setUpdatedAt(childItem.getUpdatedAt());
                childOmsSku.setListingTime(publishedAt);
                childOmsSku.setListingUpdateTime(childItem.getUpdatedAt());
                Boolean taxable = childItem.getTaxable();
                if (taxable != null && taxable) {
                    childOmsSku.setTaxable(1);
                } else {
                    childOmsSku.setTaxable(0);
                }
                childOmsSku.setVendor(vendor);
                childOmsSku.setVariantPosition(childItem.getPosition());
                childOmsSku.setOriginalJson(originalJson);
                doDBOmsSkus.add(childOmsSku);
            }
        }
    }


}
