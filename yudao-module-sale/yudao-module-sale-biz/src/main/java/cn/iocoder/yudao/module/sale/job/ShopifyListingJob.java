package cn.iocoder.yudao.module.sale.job;

import cn.iocoder.yudao.framework.quartz.core.handler.JobHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

//亚马逊sku拉取

@Slf4j
@Component
public class ShopifyListingJob implements JobHandler {
    @Override
    public String execute(String param) throws Exception {
        return null;
    }

/*

    @Resource
    private ShopifyClient shopifyClient;

    @Resource
    ErpShopMapper erpShopMapper;

    @Override
    public String execute(String param) {
        if (!StringUtils.hasText(param)) {
            throw new RuntimeException("请输入店铺数组");
        }
        List<String> storeNames = Arrays.asList(param.split(","));
        String errorMsg = "";
        if (!CollectionUtils.isEmpty(storeNames)) {
            List<StoreTokenDto> erpShops = erpShopMapper.selectTokenInfoByStoreName(storeNames);
            Map<String, StoreTokenDto> nameMap = erpShops.stream().collect(Collectors.toMap(StoreTokenDto::getName, e -> e));
            for (String storeName : storeNames) {
                try {
                    StoreTokenDto erpShopInfo = nameMap.get(storeName);
                    if (erpShopInfo != null) {
                        String pageToken = null;
                        while (true) {
                            AmazonSpListingReqVO amazonSpListingReqVO = new AmazonSpListingReqVO();
                            amazonSpListingReqVO.setSellerId(erpShopInfo.getSellerId());
                            amazonSpListingReqVO.setMarketplaceIds(Arrays.asList(erpShopInfo.getPlatShopCode()));
                            amazonSpListingReqVO.setPageSize(20);
                            amazonSpListingReqVO.setIncludedData(Arrays.asList(AmazonSpListingReqVO.IncludedData.SUMMARIES));
                            amazonSpListingReqVO.setNextToken(pageToken);
                            amazonSpListingReqVO.setAccessToken(erpShopInfo.getAccessToken());
                            amazonSpListingReqVO.setSpUrl(erpShopInfo.getSpUrl());
                            amazonSpListingReqVO.setSuccessCode(200);
                            AmazonSpListingRespVO amazonSpListingRespVO = amazonSpClient.searchListingsItems(amazonSpListingReqVO);
                            List<AmazonSpListingRespVO.ItemsDTO> items = amazonSpListingRespVO.getItems();
                            if (!CollectionUtils.isEmpty(items)) {
                                //操作db，新增或者更新
                                saveOrUpdateSku(items,erpShopInfo);
                            }
                            AmazonSpListingRespVO.PaginationDTO pagination = amazonSpListingRespVO.getPagination();
                            if (pagination == null || StringUtils.isEmpty(pagination.getNextToken())) {
                                break;
                            }
                            pageToken = pagination.getNextToken();
                            //防止限流
                            TimeUnit.MILLISECONDS.sleep(300L);
                        }
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

    private void saveOrUpdateSku(List<AmazonSpListingRespVO.ItemsDTO> items,StoreTokenDto erpShopInfo) {
        List<String> allSkus = items.stream().map(AmazonSpListingRespVO.ItemsDTO::getSku).collect(Collectors.toList());

        LambdaQueryWrapper<ErpSku> existEq = new LambdaQueryWrapper<ErpSku>().in(ErpSku::getSku, allSkus).eq(ErpSku::getDeleted, 0);
        List<ErpSku> existSkus = erpSkuMapper.selectList(existEq);
        Map<String, ErpSku> existSkuIdMaps = existSkus.stream().collect(Collectors.toMap(ErpSku::getSku, e -> e));

        List<ErpSku> saveErpSkus = new ArrayList<>();
        List<ErpSku> updateErpSkus = new ArrayList<>();

        for (AmazonSpListingRespVO.ItemsDTO eachItem : items) {
            String sku = eachItem.getSku();
            AmazonSpListingRespVO.ItemsDTO.SummariesDTO summaries = eachItem.getSummaries().get(0);
            ErpSku existErpSku = existSkuIdMaps.get(sku);
            Long existId = null;
            String existOriginalJson = null;
            if (existErpSku != null) {
                existId = existErpSku.getId();
                existOriginalJson = existErpSku.getOriginalJson();
            }
            ErpSku erpSku = new ErpSku();
            if (existId != null) {
                erpSku.setId(existId);
            }
            erpSku.setSku(sku);

            erpSku.setPlatId(erpShopInfo.getPlatId());
            erpSku.setPlatName(erpShopInfo.getPlatName());
            erpSku.setStoreId(erpShopInfo.getStoreId());
            erpSku.setStoreName(erpShopInfo.getStoreName());

            erpSku.setPlatShopCode(summaries.getMarketplaceId());
            erpSku.setPlatSkuCode(summaries.getAsin());
            erpSku.setProductType(summaries.getProductType());
            erpSku.setConditionType(summaries.getConditionType());
            List<String> status = summaries.getStatus();
            if (!CollectionUtils.isEmpty(status) && status.contains("BUYABLE")) {
                erpSku.setBuyableStatus(0);
            } else {
                erpSku.setBuyableStatus(1);
            }
            if (!CollectionUtils.isEmpty(status) && status.contains("DISCOVERABLE")) {
                erpSku.setDiscoverableStatus(0);
            } else {
                erpSku.setDiscoverableStatus(0);
            }
            erpSku.setTitle(summaries.getItemName());
            erpSku.setListingTime(summaries.getCreatedDate());
            erpSku.setListingUpdateTime(summaries.getLastUpdatedDate());
            erpSku.setTimeZone("UTC");
            AmazonSpListingRespVO.ItemsDTO.SummariesDTO.MainImageDTO mainImage = summaries.getMainImage();
            if (mainImage != null && StringUtils.hasText(mainImage.getLink())) {
                erpSku.setMainImageUrl(mainImage.getLink());
            }
            String jsonString = JSON.toJSONString(eachItem);
            erpSku.setOriginalJson(jsonString);
            erpSku.setCreator("admin");
            erpSku.setDeleted(0);
            if (existId == null) {
                saveErpSkus.add(erpSku);
            } else if (!jsonString.equals(existOriginalJson)) {
                updateErpSkus.add(erpSku);
            }
        }

        if (!CollectionUtils.isEmpty(saveErpSkus)){
            erpSkuMapper.insert(saveErpSkus);
        }
        if (!CollectionUtils.isEmpty(updateErpSkus)){
            erpSkuMapper.updateById(updateErpSkus);
        }


    }
*/

}
