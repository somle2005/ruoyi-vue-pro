package cn.iocoder.yudao.module.sale.job;

import cn.iocoder.yudao.framework.common.util.custom.MyExceptionUtil;
import cn.iocoder.yudao.framework.quartz.core.handler.JobHandler;
import cn.iocoder.yudao.module.sale.domain.entity.ErpShop;
import cn.iocoder.yudao.module.sale.domain.entity.ErpSku;
import cn.iocoder.yudao.module.sale.mapper.ErpShopMapper;
import cn.iocoder.yudao.module.sale.mapper.ErpSkuMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.shopify.domain.RetrieveAListOfProductsDto;
import com.somle.shopify.domain.RetrieveAListOfProductsVo;
import com.somle.shopify.service.ShopifyClient;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

//Shopify sku拉取

@Slf4j
@Component
public class ShopifyListingJob implements JobHandler {


    @Resource
    private ShopifyClient shopifyClient;

    @Resource
    private ErpShopMapper erpShopMapper;

    @Override
    public String execute(String param) {
        if (!StringUtils.hasText(param)) {
            throw new RuntimeException("请输入店铺数组");
        }
        List<String> storeNames = Arrays.asList(param.split(","));
        String errorMsg = "";
        if (!CollectionUtils.isEmpty(storeNames)) {
            LambdaQueryWrapper<ErpShop> inWrapper = new LambdaQueryWrapper<ErpShop>().eq(ErpShop::getDeleted, 0).in(ErpShop::getName, storeNames);
            List<ErpShop> erpShops = erpShopMapper.selectList(inWrapper);
            Map<String, ErpShop> nameMap = erpShops.stream().collect(Collectors.toMap(ErpShop::getName, e -> e));
            for (String storeName : storeNames) {
                try {
                    ErpShop erpShop = nameMap.get(storeName);
                    if (erpShop == null) {
                        throw new RuntimeException("当前店铺名称不存在");
                    }
                    Long lastId = 1L;
                    while (true) {
                        RetrieveAListOfProductsDto dto = new RetrieveAListOfProductsDto();
                        dto.setSuccessCode(200);
                        dto.setLimit(250L);
                        dto.setSince_id(lastId);
                        dto.setShopName(storeName);
                        RetrieveAListOfProductsVo retrieveAListOfProductsVo = shopifyClient.retrieveAListOfProducts(dto);
                        List<RetrieveAListOfProductsVo.ProductsDTO> items = retrieveAListOfProductsVo.getProducts();
                        if (CollectionUtils.isEmpty(items)) {
                            break;
                        }
                        //操作db，新增或者更新
                        saveOrUpdateSku(items, erpShop);
                        lastId = items.get(items.size() - 1).getId();
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

    @Resource
    private ErpSkuMapper erpSkuMapper;

    private void saveOrUpdateSku(List<RetrieveAListOfProductsVo.ProductsDTO> items, ErpShop erpShop) {
        //过滤掉没有子体 items
        items = items.stream().filter(e -> !CollectionUtils.isEmpty(e.getVariants())).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(items)) {
            return;
        }
        List<String> allSkus = new ArrayList<>();
        for (RetrieveAListOfProductsVo.ProductsDTO item : items) {
            List<RetrieveAListOfProductsVo.ProductsDTO.VariantsDTO> variants = item.getVariants();
            for (RetrieveAListOfProductsVo.ProductsDTO.VariantsDTO variant : variants) {
                String sku = variant.getSku();
                allSkus.add(sku);
            }
        }
        LambdaQueryWrapper<ErpSku> existEq = new LambdaQueryWrapper<ErpSku>().in(ErpSku::getSku, allSkus).eq(ErpSku::getDeleted, 0);
        List<ErpSku> existSkus = erpSkuMapper.selectList(existEq);
        Map<String, ErpSku> existSkuIdMaps = existSkus.stream().collect(Collectors.toMap(ErpSku::getSku, e -> e));

        List<ErpSku> saveErpSkus = new ArrayList<>();
        List<ErpSku> updateErpSkus = new ArrayList<>();

        for (RetrieveAListOfProductsVo.ProductsDTO eachItem : items) {
            List<RetrieveAListOfProductsVo.ProductsDTO.VariantsDTO> variants = eachItem.getVariants();
            for (RetrieveAListOfProductsVo.ProductsDTO.VariantsDTO eachVariant : variants) {
                String sku = eachVariant.getSku();
                ErpSku existErpSku = existSkuIdMaps.get(sku);
                Long existId = null;
                String existOriginalJson = null;
                if (existErpSku != null) {
                    existId = existErpSku.getId();
                    existOriginalJson = existErpSku.getOriginalJson();
                }
                ErpSku erpSku = new ErpSku();
                erpSku.setId(existId);
                erpSku.setSku(eachVariant.getSku());
                erpSku.setSkuId(eachVariant.getId());
                erpSku.setStoreId(erpShop.getId());
                erpSku.setStoreName(erpShop.getName());
                erpSku.setPlatId(erpShop.getPlatId());
                erpSku.setPlatName(erpShop.getPlatName());
                erpSku.setPlatShopCode(erpShop.getPlatShopCode());
                erpSku.setProductType(eachItem.getProductType());
                String status = eachItem.getStatus();
                if ("active".equals(status)) {
                    erpSku.setBuyableStatus(1);
                }
                LocalDateTime publishedAt = eachItem.getPublishedAt();
                if (publishedAt != null) {
                    erpSku.setDiscoverableStatus(1);
                } else {
                    erpSku.setDiscoverableStatus(0);
                }
                erpSku.setTitle(eachVariant.getTitle());
                erpSku.setWeight(eachVariant.getWeight());
                erpSku.setWeightUnit(eachVariant.getWeightUnit());
                erpSku.setBarcode(eachVariant.getBarcode());
                erpSku.setLabel(eachItem.getTags());
                erpSku.setDescribe(eachItem.getBodyHtml());
                erpSku.setMainImageUrl("");
                erpSku.setCreatedAt(LocalDateTime.now());
                erpSku.setUpdatedAt(LocalDateTime.now());
              //  LocalDateTime publishedAt = eachItem.getPublishedAt();
                erpSku.setListingTime(publishedAt);
                erpSku.setListingUpdateTime(LocalDateTime.now());
                erpSku.setTimeZone("");
                erpSku.setTaxable(0);
                erpSku.setVendor("");
                erpSku.setVariantPosition(0);
                erpSku.setSpuId(0L);
                erpSku.setSpuTitle("");
                erpSku.setSpuCreatedAt(LocalDateTime.now());
                erpSku.setSpuUpdatedAt(LocalDateTime.now());
                erpSku.setOriginalJson("");
                erpSku.setCreator("");
                erpSku.setCreateTime(LocalDateTime.now());
                erpSku.setUpdater("");
                erpSku.setUpdateTime(LocalDateTime.now());
                erpSku.setDeleted(0);

                if (existId != null) {
                    erpSku.setId(existId);
                }



/*
                if (existId == null) {
                    saveErpSkus.add(erpSku);
                } else if (!jsonString.equals(existOriginalJson)) {
                    updateErpSkus.add(erpSku);
                }*/
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
