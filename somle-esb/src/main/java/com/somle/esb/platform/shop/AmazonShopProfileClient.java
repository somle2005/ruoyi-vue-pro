package com.somle.esb.platform.shop;

import cn.hutool.core.io.FileUtil;
import cn.iocoder.yudao.framework.common.util.log.FileLogger;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.collect.Lists;
import com.somle.amazon.controller.vo.*;
import com.somle.amazon.model.AmazonSpAuthDO;
import com.somle.amazon.model.enums.AmazonCountry;
import com.somle.amazon.model.enums.AmazonException;
import com.somle.amazon.model.enums.AmazonRegion;
import com.somle.amazon.service.AmazonSpClient;
import com.somle.amazon.service.AmazonSpService;
import com.somle.esb.enums.SalesPlatform;
import com.somle.framework.common.util.collection.CollectionUtils;
import com.somle.framework.common.util.collection.PageUtils;
import com.somle.framework.common.util.collection.StreamX;
import com.somle.framework.common.util.general.CoreUtils;
import com.somle.framework.common.util.json.JSONArray;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.framework.common.util.json.JsonUtils;
import com.somle.framework.common.util.string.StrUtils;
import com.somle.framework.common.util.web.RequestX;
import com.somle.framework.common.util.web.WebUtils;
import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

import java.io.File;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;


@Slf4j
@Component
public class AmazonShopProfileClient extends ShopProfileClient {

    @Resource
    private AmazonSpService amazonSpService;

    public AmazonShopProfileClient() {
        super(SalesPlatform.AMAZON);
    }

    @Override
    public List<AmazonSpMarketplaceParticipationVO> getShops() {
        List<AmazonSpMarketplaceParticipationVO> allMarketplaces = new ArrayList<>();
        amazonSpService.clients.forEach(client -> {
            List<AmazonSpMarketplaceParticipationVO> marketplaces = client.getMarketplaceParticipations();
            allMarketplaces.addAll(marketplaces);
        });
        return allMarketplaces;
    }

    @Override
    public List<JSONObject> getProducts(String marketplaceId,String domainName) {

        List<JSONObject> mockProducts = readMockFile(marketplaceId);
        if (mockProducts != null) {
            return mockProducts;
        }

        List<JSONObject> allProducts = new ArrayList<>();
        amazonSpService.clients.forEach(client -> {
            List<JSONObject> marketProducts = new MarketProductCollector(marketplaceId,domainName, client).collect();
            allProducts.addAll(marketProducts);
        });

        writeMockFileIf(marketplaceId,allProducts);

        return allProducts;
    }

    private final File getMockFile(String marketplaceId) {
        return new File("./log/mock/amazon-product-"+marketplaceId+".json");
    }

    private void writeMockFileIf(String marketplaceId,List<JSONObject> allProducts) {
        File mockFile=getMockFile(marketplaceId);
        if (!getMockFile(marketplaceId).exists()) {
            String productJSONStr = JsonUtils.toJsonString(allProducts);
            FileUtil.writeString(productJSONStr, mockFile, "UTF-8");
        }
    }

    private List<JSONObject> readMockFile(String marketplaceId) {
        File mockFile=getMockFile(marketplaceId);
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

    private final int limit = 5;

    private String domainName;
    private String marketplaceId;
    private AmazonSpClient client;

    private FileLogger fileLogger = new FileLogger("./log/amazon-asin-sku.log");

    private Map<String, JSONObject> allListingItemMap = new HashMap<>();
    private Map<String, JSONObject> allCatalogItemMap = new HashMap<>();


    public MarketProductCollector(String marketplaceId,String domainName, AmazonSpClient client) {
        this.marketplaceId = marketplaceId;
        this.client = client;
        this.domainName = domainName;
    }


    public List<JSONObject> collect() {


        fileLogger.separator("开始采集 - mktId=" + this.marketplaceId + "@" + client.getAuth().getClientId());
        collectAllListingItems();
        if (!allListingItemMap.isEmpty()) {
            collectAllCatalogItems();
        }

        List<JSONObject> allProducts = new ArrayList<>();
        // 取数完毕后,装配数据
        for (Map.Entry<String, JSONObject> entry : allListingItemMap.entrySet()) {
            JSONObject catalog = allCatalogItemMap.get(entry.getKey());
            JSONObject listingItem = entry.getValue();
            listingItem.put("catalog", catalog);
            listingItem.put("marketplaceId", this.marketplaceId);
            listingItem.put("domainName", this.domainName);
            listingItem.put("clientId", this.client.getAuth().getClientId());
            listingItem.put("sellerId", this.client.getAuth().getSellerId());
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
        boolean hasQuotaExceededError = checkQuotaExceededError(result,()->{
            collectCatalogItems(skus,pageToken);
            return null;
        },3);
        // 如果有异常则不再继续执行
        if(hasQuotaExceededError) {
            return;
        }


        var catalogItems = result.getJSONArray("items");
        if (catalogItems != null) {
            for (JsonNode catalogNode : catalogItems) {
                JSONObject catalogJson = new JSONObject(catalogNode);
                String asin = catalogJson.getString("asin");
                String sku = skus.get(0);
                //allCatalogItems.put("clientId",client.getAuth().getClientId());
                //skus.add(sku);
                //

                fileLogger.info(sku + " -> " + asin);

                allCatalogItemMap.put(sku, catalogJson);
            }
        } else {

            log.warn("fetch amazon catalog by skus " + skus + " error " + catalogBody);
        }


        Integer numberOfResults = result.getInteger("numberOfResults");

        log.info("fetch amazon catalog by skus " + (catalogItems == null ? 0 : catalogItems.size()) + " , " + allCatalogItemMap.size());

        // 调试模式下 limit 非全量取数控制
        if (limit > 0 && allCatalogItemMap.size() >= limit) {
            return;
        }

        JSONObject pagination = result.getJSONObject("pagination");
        if (pagination != null) {
            String nextPageToken = pagination.getString("nextToken");
            if (!StrUtils.isEmpty(nextPageToken)) {
                collectCatalogItems(skus, nextPageToken);
            }
        }

    }

    private boolean checkQuotaExceededError(JSONObject result, Supplier action,Integer delay) {

        var errors=result.getJSONArray("errors");
        boolean hasQuotaExceededError=false;
        if(!CollectionUtils.isEmpty(errors)) {
            for (JsonNode errorNode : errors) {
                JSONObject errorJson = new JSONObject(errorNode);
                String code = errorJson.getString("code");
                if("QuotaExceeded".equals(code)) {
                    hasQuotaExceededError=true;
                } else {
                    // 如果有其他错误，抛出异常
                    throw new RuntimeException(code+":"+errorJson.toString());
                }
            }
        }

        if(hasQuotaExceededError) {
            log.info("Amazon 接口调用超限, sleep 3s");
            CoreUtils.sleep(3000);
            action.get();
        }

        return hasQuotaExceededError;

    }


    private void collectAllListingItems() {
        allListingItemMap.clear();
        collectListingItems(null);
    }


    private void collectListingItems(String pageToken) {

        var reqVO = AmazonSpListingReqVO.builder()
            .sellerId(client.getAuth().getSellerId())
            .pageSize(20)
            .pageToken(pageToken)
            .marketplaceIds(List.of(marketplaceId))
            .includedData(List.of(AmazonSpListingReqVO.IncludedData.OFFERS, AmazonSpListingReqVO.IncludedData.ATTRIBUTES))
            .build();
        var bodyString = client.searchListingsItems(reqVO);
        JSONObject result = JsonUtils.parseObject(bodyString, JSONObject.class);
        var listingItems = result.getJSONArray("items");
        if (listingItems != null) {
            for (JsonNode listingNode : listingItems) {
                JSONObject productJson = new JSONObject(listingNode);
                String sku = productJson.getString("sku");
                //productJson.put("clientId",client.getAuth().getClientId());
                //
                allListingItemMap.put(sku, productJson);
            }
        }

        Integer numberOfResults = result.getInteger("numberOfResults");

        log.info("fetch amazon listing " + (listingItems == null ? 0 : listingItems.size()) + " , " + allListingItemMap.size() + "/" + numberOfResults);

        // 调试模式下 limit 非全量取数控制
        if (limit > 0 && allListingItemMap.size() >= limit) {
            return;
        }

        JSONObject pagination = result.getJSONObject("pagination");
        if (pagination != null) {
            String nextPageToken = pagination.getString("nextToken");
            if (!StrUtils.isEmpty(nextPageToken)) {
                collectListingItems(nextPageToken);
            }
        }

    }


}

