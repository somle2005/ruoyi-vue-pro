package cn.iocoder.yudao.module.oms.job;

import cn.iocoder.yudao.framework.common.util.custom.MyExceptionUtil;
import cn.iocoder.yudao.framework.quartz.core.handler.JobHandler;
import cn.iocoder.yudao.module.oms.domain.dto.ErpSkuVariantBridgeDto;
import cn.iocoder.yudao.module.oms.domain.dto.ErpSkuVariantBridgeDto.ErpSkuVariantBridgeChildDto;
import cn.iocoder.yudao.module.oms.domain.entity.ErpShop;
import cn.iocoder.yudao.module.oms.domain.entity.ErpSku;
import cn.iocoder.yudao.module.oms.mapper.ErpShopMapper;
import cn.iocoder.yudao.module.oms.service.ErpSkuService;
import cn.iocoder.yudao.module.oms.service.ErpSkuVariantBridgeService;
import com.alibaba.fastjson.JSON;
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
    public synchronized String execute(String param) {
        if (!StringUtils.hasText(param)) {
            throw new RuntimeException("请输入店铺数组");
        }
        List<String> storeNames = Arrays.asList(param.split(","));
        String errorMsg = "";
        if (!CollectionUtils.isEmpty(storeNames)) {
            LambdaQueryWrapper<ErpShop> inWrapper = new LambdaQueryWrapper<ErpShop>().eq(ErpShop::getPlatName, "Shopify").eq(ErpShop::getDeleted, 0).in(ErpShop::getName, storeNames);
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
    private ErpSkuVariantBridgeService erpSkuVariantBridgeService;

    @Resource
    private ErpSkuService erpSkuService;

    private void saveOrUpdateSku(List<RetrieveAListOfProductsVo.ProductsDTO> items, ErpShop erpShop) {
        List<ErpSku> doDBErpSkus = new ArrayList<>();
        for (RetrieveAListOfProductsVo.ProductsDTO parentItem : items) {
            //组装数据
            assemblyData(erpShop, doDBErpSkus, parentItem);
        }
        //批量插入或更新ErpSku
        List<ErpSku> allErpSkus = erpSkuService.insertOrUpdateErpSku(erpShop, doDBErpSkus);
        //处理父子关系 组装入参数据
        List<ErpSkuVariantBridgeDto> erpSkuVariantBridgeDtos = getErpSkuVariantBridgeDtos(erpShop, allErpSkus);
        //新增或者更新DB的产品父子关系
        erpSkuVariantBridgeService.insertOrUpdateErpSkuVariantBridge(erpShop.getName(), erpSkuVariantBridgeDtos);
    }

    private List<ErpSkuVariantBridgeDto> getErpSkuVariantBridgeDtos(ErpShop erpShop, List<ErpSku> allErpSkus) {
        Map<String, ErpSku> allSkuMap = allErpSkus.stream().collect(Collectors.toMap(ErpSku::getSku, e -> e));
        List<ErpSkuVariantBridgeDto> erpSkuVariantBridgeDtos = new ArrayList<>();
        for (ErpSku parentErpSku : allErpSkus) {
            String patternType = parentErpSku.getPatternType();
            if ("parent".equals(patternType)) {
                ErpSkuVariantBridgeDto erpSkuVariantBridgeDto = new ErpSkuVariantBridgeDto();
                erpSkuVariantBridgeDto.setStoreId(erpShop.getId());
                erpSkuVariantBridgeDto.setStoreName(erpShop.getName());
                erpSkuVariantBridgeDto.setPlatId(erpShop.getPlatId());
                erpSkuVariantBridgeDto.setPlatName(erpShop.getPlatName());
                erpSkuVariantBridgeDto.setParentId(parentErpSku.getId());
                erpSkuVariantBridgeDto.setParentSku(parentErpSku.getSku());
                List<String> childSkus = parentErpSku.getChildSkus();
                List<ErpSkuVariantBridgeChildDto> childrenS = new ArrayList<>();
                if (!CollectionUtils.isEmpty(childSkus)) {
                    for (String childSku : childSkus) {
                        ErpSkuVariantBridgeChildDto erpSkuVariantBridgeChildDto = new ErpSkuVariantBridgeChildDto();
                        ErpSku childErpSku = allSkuMap.get(childSku);
                        if (childErpSku != null) {
                            erpSkuVariantBridgeChildDto.setChildId(childErpSku.getId());
                        }
                        erpSkuVariantBridgeChildDto.setChildSku(childSku);
                        childrenS.add(erpSkuVariantBridgeChildDto);
                    }
                }
                erpSkuVariantBridgeDto.setChildrenS(childrenS);
                erpSkuVariantBridgeDtos.add(erpSkuVariantBridgeDto);
            }
        }
        return erpSkuVariantBridgeDtos;
    }

    private void assemblyData(ErpShop erpShop, List<ErpSku> doDBErpSkus, RetrieveAListOfProductsVo.ProductsDTO parentItem) {
        //处理父产品
        ErpSku parentErpSku = new ErpSku();
        parentErpSku.setSku(parentItem.getSku());
        parentErpSku.setSkuId(parentItem.getId());
        parentErpSku.setStoreId(erpShop.getId());
        parentErpSku.setStoreName(erpShop.getName());
        parentErpSku.setPlatId(erpShop.getPlatId());
        parentErpSku.setPlatName(erpShop.getPlatName());
        parentErpSku.setPlatShopCode(erpShop.getPlatShopCode());
        parentErpSku.setPatternType("parent");
        String productType = parentItem.getProductType();
        parentErpSku.setProductType(productType);
        List<String> childSkus = new ArrayList<>();
        List<RetrieveAListOfProductsVo.ProductsDTO.VariantsDTO> variants = parentItem.getVariants();
        if (!CollectionUtils.isEmpty(variants)) {
            childSkus = variants.stream().map(RetrieveAListOfProductsVo.ProductsDTO.VariantsDTO::getSku).collect(Collectors.toList());
        }
        parentErpSku.setChildSkus(childSkus);
        String status = parentItem.getStatus();
        Integer buyableStatus = 0;
        if ("active".equals(status)) {
            buyableStatus = 1;
        }
        parentErpSku.setBuyableStatus(buyableStatus);
        String publishedAt = parentItem.getPublishedAt();
        Integer discoverableStatus = 0;
        if (StringUtils.hasText(publishedAt)) {
            discoverableStatus = 1;
        }
        parentErpSku.setDiscoverableStatus(discoverableStatus);
        parentErpSku.setTitle(parentItem.getTitle());
        String tags = parentItem.getTags();
        parentErpSku.setLabel(tags);
        String bodyHtml = parentItem.getBodyHtml();
        parentErpSku.setDescribe(bodyHtml);
        RetrieveAListOfProductsVo.ProductsDTO.ImageDTO image = parentItem.getImage();
        String mainImageUrl = null;
        if (image != null) {
            mainImageUrl = image.getSrc();
        }
        parentErpSku.setMainImageUrl(mainImageUrl);
        parentErpSku.setCreatedAt(parentItem.getCreatedAt());
        parentErpSku.setUpdatedAt(parentItem.getUpdatedAt());
        parentErpSku.setListingTime(publishedAt);
        parentErpSku.setListingUpdateTime(parentItem.getUpdatedAt());
        String vendor = parentItem.getVendor();
        parentErpSku.setVendor(vendor);
        String originalJson = JSON.toJSONString(parentItem);
        parentErpSku.setOriginalJson(originalJson);
        parentErpSku.setCreator("admin");
        parentErpSku.setCreateTime(LocalDateTime.now());
        parentErpSku.setDeleted(0);
        doDBErpSkus.add(parentErpSku);
        //处理子产品
        if (!CollectionUtils.isEmpty(variants)) {
            for (RetrieveAListOfProductsVo.ProductsDTO.VariantsDTO childItem : variants) {
                ErpSku childErpSku = new ErpSku();
                childErpSku.setSku(childItem.getSku());
                childErpSku.setSkuId(childItem.getId());
                childErpSku.setStoreId(erpShop.getId());
                childErpSku.setStoreName(erpShop.getName());
                childErpSku.setPlatId(erpShop.getPlatId());
                childErpSku.setPlatName(erpShop.getPlatName());
                childErpSku.setPlatShopCode(erpShop.getPlatShopCode());
                childErpSku.setPatternType("child");
                childErpSku.setProductType(productType);
                childErpSku.setBuyableStatus(buyableStatus);
                childErpSku.setDiscoverableStatus(discoverableStatus);
                childErpSku.setTitle(childItem.getTitle());
                childErpSku.setWeight(childItem.getWeight());
                childErpSku.setWeightUnit(childItem.getWeightUnit());
                childErpSku.setBarcode(childItem.getBarcode());
                childErpSku.setLabel(tags);
                childErpSku.setDescribe(bodyHtml);
                childErpSku.setMainImageUrl(mainImageUrl);
                childErpSku.setCreatedAt(childItem.getCreatedAt());
                childErpSku.setUpdatedAt(childItem.getUpdatedAt());
                childErpSku.setListingTime(publishedAt);
                childErpSku.setListingUpdateTime(childItem.getUpdatedAt());
                Boolean taxable = childItem.getTaxable();
                if (taxable != null && taxable) {
                    childErpSku.setTaxable(1);
                } else {
                    childErpSku.setTaxable(0);
                }
                childErpSku.setVendor(vendor);
                childErpSku.setVariantPosition(childItem.getPosition());
                childErpSku.setOriginalJson(originalJson);
                childErpSku.setCreator("admin");
                childErpSku.setCreateTime(LocalDateTime.now());
                childErpSku.setDeleted(0);
                doDBErpSkus.add(childErpSku);
            }
        }
    }


}
