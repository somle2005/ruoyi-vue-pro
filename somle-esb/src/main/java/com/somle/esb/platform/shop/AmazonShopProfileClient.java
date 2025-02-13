package com.somle.esb.platform.shop;

import cn.hutool.core.io.FileUtil;
import cn.iocoder.yudao.framework.common.util.log.FileLogger;
import cn.iocoder.yudao.framework.common.util.spring.SpringUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.somle.amazon.controller.vo.*;
import com.somle.amazon.model.enums.AmazonCountry;
import com.somle.amazon.model.enums.AmazonRegion;
import com.somle.amazon.service.AmazonSpClient;
import com.somle.amazon.service.AmazonSpService;
import com.somle.esb.converter.shop.AmazonToErpProfileConverter;
import com.somle.esb.enums.SalesPlatform;
import com.somle.framework.common.util.collection.CollectionUtils;
import com.somle.framework.common.util.general.CoreUtils;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.framework.common.util.json.JsonUtils;
import com.somle.framework.common.util.string.StrUtils;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.*;
import java.util.function.Supplier;


@Slf4j
@Component
public class AmazonShopProfileClient extends ShopProfileClient {

    @Resource
    private AmazonSpService amazonSpService;

    public AmazonShopProfileClient() {
        super(SalesPlatform.AMAZON);
    }

    private Map<String,String> marketIdReagionMapping = new HashMap<>();

    @Override
    public List<AmazonSpMarketplaceParticipationVO> getShops() {
        List<AmazonSpMarketplaceParticipationVO> allMarketplaces = new ArrayList<>();
        amazonSpService.getClients().forEach(client -> {
            List<AmazonSpMarketplaceParticipationVO> marketplaces = client.getMarketplaceParticipations();
            for (AmazonSpMarketplaceParticipationVO marketplace : marketplaces) {
                //log.info("country:"+marketplace.getMarketplace().getCountryCode()+" -> region:"+client.getAuth().getRegionCode());
                marketIdReagionMapping.put(marketplace.getMarketplace().getId(),client.getAuth().getRegionCode());

            }
            allMarketplaces.addAll(marketplaces);
        });
        return allMarketplaces;
    }

    @Override
    public List<JSONObject> getProducts(String marketplaceId,String countryCode,String domainName) {

        // 开发环境启用 Mock 模拟
        List<JSONObject> mockProducts = readMockFile(marketplaceId,countryCode);
        if(SpringUtils.isBootInIDE()) {
            if (mockProducts != null) {
                return mockProducts;
            }
        }

        List<JSONObject> allProducts = new ArrayList<>();
        String regionCode = marketIdReagionMapping.get(marketplaceId);
        AmazonRegion region=AmazonRegion.valueOf(regionCode);
        AmazonSpClient client=amazonSpService.getClient(region);
        List<JSONObject> marketProducts = new MarketProductCollector(marketplaceId,domainName, client,amazonSpService).collect();
        allProducts.addAll(marketProducts);
        // 开发环境启用 Mock 模拟
        if(SpringUtils.isBootInIDE()) {
            writeMockFileIf(marketplaceId,countryCode, allProducts);
        }
        return allProducts;
    }

    private final File getMockFile(String marketplaceId,String countryCode) {
        return new File("./log/mock/amazon-product-"+marketplaceId+"-"+countryCode+".json");
    }

    private void writeMockFileIf(String marketplaceId,String countryCode,List<JSONObject> allProducts) {
        if(allProducts==null || allProducts.isEmpty()) {
            return;
        }
        File mockFile=getMockFile(marketplaceId,countryCode);
        if (!getMockFile(marketplaceId,countryCode).exists()) {
            String productJSONStr = JsonUtils.toJsonString(allProducts);
            FileUtil.writeString(productJSONStr, mockFile, "UTF-8");
        }
    }

    private List<JSONObject> readMockFile(String marketplaceId,String countryCode) {
        File mockFile=getMockFile(marketplaceId,countryCode);
        if (mockFile.exists()) {
            String productJSONStr = FileUtil.readString(mockFile, "UTF-8");
            List<JSONObject> jsonArray = JsonUtils.parseArray(productJSONStr, JSONObject.class);
            List<JSONObject> list = new ArrayList<>();
            for (ObjectNode node : jsonArray) {
                list.add(new JSONObject(node));
            }
            return list;
        }
        return null;
    }


}


@Slf4j
class MarketProductCollector {


    public static final String API_NAME_CATALOG = "Catalog";
    public static final String ERROR_CODE_QUOTA_EXCEEDED = "QuotaExceeded";
    public static final String ERROR_CODE_UNAUTHORIZED = "Unauthorized";
    public static final String API_NAME_LISTING = "Listing";
    //
    private final int limit;

    private AmazonSpService amazonSpService;

    private String domainName;
    private String marketplaceId;
    private AmazonSpClient client;

    private FileLogger fileLogger = new FileLogger("./log/amazon-asin-sku.log");

    private Map<String, JSONObject> allListingItemMap = new HashMap<>();
    private Map<String, JSONObject> allCatalogItemMap = new HashMap<>();

    private Map<String, Integer> retryTimesMap = new HashMap<>();


    public MarketProductCollector(String marketplaceId,String domainName, AmazonSpClient client,AmazonSpService amazonSpService) {
        this.amazonSpService=amazonSpService;
        this.marketplaceId = marketplaceId;
        this.client = client;
        this.domainName = domainName;
        // 本机开发时只取5条测试，线上全部
        this.limit=SpringUtils.isBootInIDE()? 5 : -1;
    }


    public List<JSONObject> collect() {

        if(SpringUtils.isBootInIDE()) {
            fileLogger.separator("开始采集 - mktId=" + this.marketplaceId + "@" + client.getAuth().getClientId());
        }
        collectAllListingItems();
        if (!allListingItemMap.isEmpty()) {
            collectAllCatalogItems();
        }

        List<JSONObject> allProducts = new ArrayList<>();
        // 取数完毕后,装配数据
        for (Map.Entry<String, JSONObject> entry : allListingItemMap.entrySet()) {
            JSONObject catalog = allCatalogItemMap.get(entry.getKey());
            JSONObject listingItem = entry.getValue();
            listingItem.put(AmazonToErpProfileConverter.FIELD_CATALOG, catalog);
            listingItem.put(AmazonToErpProfileConverter.FIELD_MARKETPLACE_ID, this.marketplaceId);
            listingItem.put(AmazonToErpProfileConverter.FIELD_DOMAIN_NAME, this.domainName);
            listingItem.put(AmazonToErpProfileConverter.FIELD_CLIENT_ID, this.client.getAuth().getClientId());
            listingItem.put(AmazonToErpProfileConverter.FIELD_SELLER_ID, this.client.getAuth().getSellerId());
            allProducts.add(entry.getValue());
        }

        return allProducts;

    }

    private void collectAllCatalogItems() {
        allCatalogItemMap.clear();
        for (String sku : allListingItemMap.keySet()) {
            collectCatalogItems(List.of(sku), null);
        }
    }

    private void collectCatalogItems(List<String> skus, String pageToken) {

        if(skus.contains("amzn.gr.FT-S1607MB-EU--6O-RrejYxQF6qp-AC")) {
            System.out.println();
        }

        Integer retryTimes = retryTimesMap.getOrDefault(pageToken, 0);
        if (retryTimes > 5) {
            log.error("collectCatalogItems - mktId=" + this.marketplaceId + "@" + client.getAuth().getClientId() + " - sku=" + skus + " - pageToken=" + pageToken + " - retryTimes=" + retryTimes + " - 超过最大重试次数，不再继续执行");
            return;
        }
        retryTimesMap.put(pageToken,retryTimes+1);


        var reqCatalogVO = AmazonSpCatalogReqVO.builder()
            .identifiers(skus)
            .pageToken(pageToken)
            .pageSize(20)
            .identifiersType(AmazonSpCatalogReqVO.IdentifiersType.SKU)
            .sellerId(client.getAuth().getSellerId())
            .marketplaceIds(List.of(marketplaceId))
            .includedData(List.of(AmazonSpCatalogReqVO.IncludedData.IMAGES, AmazonSpCatalogReqVO.IncludedData.ATTRIBUTES))
            .build();
        var catalogBody = client.searchCatalogItems(reqCatalogVO);
        JSONObject result = JsonUtils.parseObject(catalogBody, JSONObject.class);

        // 处理接口访问超限
        boolean doNext = handleErrors(API_NAME_CATALOG,result,()->{
            collectCatalogItems(skus,pageToken);
            return null;
        });
        // 如果有异常则不再继续执行
        if(!doNext) {
            return;
        }


        var catalogItems = result.getJSONArray(AmazonToErpProfileConverter.FIELD_ITEMS);
        if (catalogItems != null) {
            for (JsonNode catalogNode : catalogItems) {
                JSONObject catalogJson = new JSONObject(catalogNode);
                String asin = catalogJson.getString(AmazonToErpProfileConverter.FIELD_ASIN);
                String sku = skus.get(0);

                if(SpringUtils.isBootInIDE()) {
                    fileLogger.info(sku + " -> " + asin);
                }

                allCatalogItemMap.put(sku, catalogJson);
            }
        } else {

            log.warn("fetch amazon catalog by skus " + skus + " error " + catalogBody);
        }


        Integer numberOfResults = result.getInteger(AmazonToErpProfileConverter.FIELD_NUMBER_OF_RESULTS);

        log.info("fetch amazon catalog by skus " + (catalogItems == null ? 0 : catalogItems.size()) + " , " + allCatalogItemMap.size());

        // 调试模式下 limit 非全量取数控制
        if (limit > 0 && allCatalogItemMap.size() >= limit) {
            return;
        }

        JSONObject pagination = result.getJSONObject(AmazonToErpProfileConverter.FIELD_PAGINATION);
        if (pagination != null) {
            String nextPageToken = pagination.getString(AmazonToErpProfileConverter.FIELD_NEXT_TOKEN);
            if (!StrUtils.isEmpty(nextPageToken)) {
                collectCatalogItems(skus, nextPageToken);
            }
        }

    }

    /**
     * 检查并处理错误
     * @return 返回是否可以继续执行后续步骤
     **/
    private boolean handleErrors(String name, JSONObject result, Supplier actionAfterHandled) {

        var errors=result.getJSONArray(AmazonToErpProfileConverter.FIELD_ERRORS);
        boolean hasQuotaExceededError=false;
        boolean hasUnauthorizedError=false;
        if(!CollectionUtils.isEmpty(errors)) {
            for (JsonNode errorNode : errors) {
                JSONObject errorJson = new JSONObject(errorNode);
                String code = errorJson.getString(AmazonToErpProfileConverter.FIELD_CODE);
                if(ERROR_CODE_QUOTA_EXCEEDED.equals(code)) {
                    hasQuotaExceededError=true;
                } else if(ERROR_CODE_UNAUTHORIZED.equals(code)) {
                    hasUnauthorizedError=true;
                }
                else {
                    // 如果有其他错误，抛出异常
                    throw new RuntimeException(code+":"+errorJson.toString());
                }
            }
        } else {
            return true;
        }

        // 以下处理错误

        if(hasQuotaExceededError) {
            log.info("Amazon "+name+" 接口调用超限, sleep 3s;t="+Thread.currentThread().getId());
            CoreUtils.sleep(3000);
            // 重试
            actionAfterHandled.get();
        }

        if(hasUnauthorizedError) {
            log.error("Amazon "+name+" 接口调用未授权,marketplaceId="+marketplaceId+";clientId="+client.getAuth().getClientId()+", 尝试刷新 Token 后重试");
            boolean refreshed=amazonSpService.refreshAuth();
            if(refreshed) {
                CoreUtils.sleep(1000);
            }
            // 重试
            actionAfterHandled.get();
        }



        return false;

    }


    private void collectAllListingItems() {
        allListingItemMap.clear();
        collectListingItems(null);
    }


    private void collectListingItems(String pageToken) {

        // 控制重试次数
        Integer retryTimes = retryTimesMap.getOrDefault(pageToken, 0);
        if (retryTimes > 5) {
            log.error("collectListingItems - mktId=" + this.marketplaceId + "@" + client.getAuth().getClientId() + " - pageToken=" + pageToken + " - retryTimes=" + retryTimes + " - 超过最大重试次数，不再继续执行");
            return;
        }
        retryTimesMap.put(pageToken,retryTimes+1);


        var reqVO = AmazonSpListingReqVO.builder()
            .sellerId(client.getAuth().getSellerId())
            .pageSize(20)
            .pageToken(pageToken)
            .marketplaceIds(List.of(marketplaceId))
            .includedData(List.of(AmazonSpListingReqVO.IncludedData.OFFERS, AmazonSpListingReqVO.IncludedData.ATTRIBUTES))
            .build();
        var bodyString = client.searchListingsItems(reqVO);
        JSONObject result = JsonUtils.parseObject(bodyString, JSONObject.class);

        // 处理接口访问超限
        boolean doNext = handleErrors(API_NAME_LISTING,result,()->{
            collectListingItems(pageToken);
            return null;
        });
        // 如果有未处理的异常则不再继续执行
        if(!doNext) {
            return;
        }

        var listingItems = result.getJSONArray(AmazonToErpProfileConverter.FIELD_ITEMS);
        if (listingItems != null) {
            for (JsonNode listingNode : listingItems) {
                JSONObject productJson = new JSONObject(listingNode);
                String sku = productJson.getString(AmazonToErpProfileConverter.FIELD_SKU);
                //productJson.put("clientId",client.getAuth().getClientId());
                //
                allListingItemMap.put(sku, productJson);
            }
        }

        Integer numberOfResults = result.getInteger(AmazonToErpProfileConverter.FIELD_NUMBER_OF_RESULTS);

        log.info("fetch amazon listing " + (listingItems == null ? 0 : listingItems.size()) + " , " + allListingItemMap.size() + "/" + numberOfResults);

        // 调试模式下 limit 非全量取数控制
        if (limit > 0 && allListingItemMap.size() >= limit) {
            return;
        }

        JSONObject pagination = result.getJSONObject(AmazonToErpProfileConverter.FIELD_PAGINATION);
        if (pagination != null) {
            String nextPageToken = pagination.getString(AmazonToErpProfileConverter.FIELD_NEXT_TOKEN);
            if (!StrUtils.isEmpty(nextPageToken)) {
                collectListingItems(nextPageToken);
            }
        }

    }


}

