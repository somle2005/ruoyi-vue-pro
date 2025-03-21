package com.somle.esb.job;

import cn.iocoder.yudao.framework.common.util.string.StrUtils;
import cn.iocoder.yudao.framework.quartz.core.handler.JobHandler;
import cn.iocoder.yudao.module.oms.dal.OmsShopMapper;
import cn.iocoder.yudao.module.oms.model.entity.OmsShop;
import cn.iocoder.yudao.module.oms.model.entity.OmsSku;
import cn.iocoder.yudao.module.oms.service.OmsSkuService;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.shopify.model.ShopifyRetrieveAListOfProductsDTO;
import com.somle.shopify.model.ShopifyRetrieveAListOfProductsVO;
import com.somle.shopify.service.ShopifyClient;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

//Shopify sku拉取

@Slf4j
@Component
public class ShopifyListingJob implements JobHandler {


    @Resource
    private ShopifyClient shopifyClient;

    @Resource
    private OmsShopMapper omsShopMapper;

    @Resource
    private OmsSkuService omsSkuService;

    @Override
    public synchronized String execute(String param) {

        if (!StringUtils.hasText(param)) {
            throw new RuntimeException("请输入店铺数组");
        }
        List<String> storeNames = Arrays.asList(param.split(","));
        String errorMsg = "";
        if (!CollectionUtils.isEmpty(storeNames)) {
            LambdaQueryWrapper<OmsShop> inWrapper = new LambdaQueryWrapper<OmsShop>().eq(OmsShop::getPlatName, "Shopify").eq(OmsShop::getDeleted, 0).in(OmsShop::getName, storeNames);
            List<OmsShop> OmsShops = omsShopMapper.selectList(inWrapper);
            Map<String, OmsShop> nameMap = OmsShops.stream().collect(Collectors.toMap(OmsShop::getName, e -> e));
            for (String storeName : storeNames) {
                try {
                    OmsShop OmsShop = nameMap.get(storeName);
                    if (OmsShop == null) {
                        throw new RuntimeException("当前店铺名称不存在");
                    }
                    Long lastId = 1L;
                    while (true) {
                        ShopifyRetrieveAListOfProductsDTO dto = new ShopifyRetrieveAListOfProductsDTO();
                        dto.setSuccessCode(200);
                        dto.setLimit(250L);
                        dto.setSince_id(lastId);
                        dto.setShopName(storeName);
                        ShopifyRetrieveAListOfProductsVO shopifyRetrieveAListOfProductsVo = shopifyClient.retrieveAListOfProducts(dto);
                        List<ShopifyRetrieveAListOfProductsVO.ProductsDTO> items = shopifyRetrieveAListOfProductsVo.getProducts();
                        if (CollectionUtils.isEmpty(items)) {
                            break;
                        }
                        //操作db，新增或者更新
                        saveOrUpdateSku(items, OmsShop);
                        lastId = items.get(items.size() - 1).getId();
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

    private void saveOrUpdateSku(List<ShopifyRetrieveAListOfProductsVO.ProductsDTO> items, OmsShop OmsShop) {
        List<OmsSku> doDBOmsSkus = new ArrayList<>();
        for (ShopifyRetrieveAListOfProductsVO.ProductsDTO parentItem : items) {
            //组装数据
            assemblyData(OmsShop, doDBOmsSkus, parentItem);
        }
        //批量插入或更新OmsSku
        omsSkuService.insertOrUpdateOmsSku(OmsShop, doDBOmsSkus);
    }

    private void assemblyData(OmsShop OmsShop, List<OmsSku> doDBOmsSkus, ShopifyRetrieveAListOfProductsVO.ProductsDTO parentItem) {
        //处理父产品
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
        List<ShopifyRetrieveAListOfProductsVO.ProductsDTO.VariantsDTO> variants = parentItem.getVariants();
        List<ShopifyRetrieveAListOfProductsVO.ProductsDTO.ImagesDTO> images = parentItem.getImages();
        Map<Long, ShopifyRetrieveAListOfProductsVO.ProductsDTO.ImagesDTO> imagesIdMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(images)) {
            imagesIdMap = images.stream().collect(Collectors.toMap(ShopifyRetrieveAListOfProductsVO.ProductsDTO.ImagesDTO::getId, e -> e));
        }
        //处理子产品
        if (!CollectionUtils.isEmpty(variants)) {
            for (ShopifyRetrieveAListOfProductsVO.ProductsDTO.VariantsDTO childItem : variants) {
                OmsSku childOmsSku = new OmsSku();
                String childSku = childItem.getSku();
                childOmsSku.setSku(childSku);
                childOmsSku.setPlatSkuId(childItem.getId());
                childOmsSku.setStoreId(OmsShop.getId());
                childOmsSku.setStoreName(OmsShop.getName());
                childOmsSku.setPlatId(OmsShop.getPlatId());
                childOmsSku.setPlatName(OmsShop.getPlatName());
                childOmsSku.setPlatShopCode(OmsShop.getPlatShopCode());
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
                    ShopifyRetrieveAListOfProductsVO.ProductsDTO.ImagesDTO imagesDTO = imagesIdMap.get(imageId);
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
                childOmsSku.setCreator("admin");
                childOmsSku.setCreateTime(LocalDateTime.now());
                childOmsSku.setDeleted(0);
                doDBOmsSkus.add(childOmsSku);
            }
        }
    }


}
