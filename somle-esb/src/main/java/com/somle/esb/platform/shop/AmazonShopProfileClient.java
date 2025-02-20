package com.somle.esb.platform.shop;

import cn.hutool.core.io.FileUtil;
import cn.iocoder.yudao.framework.common.util.log.FileLogger;
import cn.iocoder.yudao.framework.common.util.spring.SpringUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.somle.amazon.controller.vo.*;
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

/**
 * @author LeeFJ
 * 亚马逊数据同步客户端
 **/
@Slf4j
@Component
public class AmazonShopProfileClient extends ShopProfileClient {

    @Resource
    private AmazonSpService amazonSpService;

    public AmazonShopProfileClient() {
        super(SalesPlatform.AMAZON);
    }

    /**
     * marketId 和 Region的对照关系
     **/
    private final Map<String,String> marketIdRegionMapping = new HashMap<>();

    /**
     * 拉取店铺信息
     **/
    @Override
    public List<AmazonSpMarketplaceParticipationVO> getShops() {
        List<AmazonSpMarketplaceParticipationVO> allMarketplaces = new ArrayList<>();
        amazonSpService.getClients().forEach(client -> {
            List<AmazonSpMarketplaceParticipationVO> marketplaces = client.getMarketplaceParticipations();
            for (AmazonSpMarketplaceParticipationVO marketplace : marketplaces) {
                marketIdRegionMapping.put(marketplace.getMarketplace().getId(),client.getAuth().getRegionCode());
            }
            allMarketplaces.addAll(marketplaces);
        });
        return allMarketplaces;
    }

    /**
     * 拉取产品信息
     **/
    @Override
    public List<JSONObject> getProducts(String marketplaceId,String countryCode,String domainName) {

        // 开发环境启用 Mock 模拟
        // List<JSONObject> mockProducts = readMockFile(marketplaceId,countryCode);
        // if(SpringUtils.isBootInIDE()) {
        //     if (mockProducts != null) {
        //        return mockProducts;
        //     }
        // }

        List<JSONObject> allProducts = new ArrayList<>();
        String regionCode = marketIdRegionMapping.get(marketplaceId);
        AmazonRegion region=AmazonRegion.valueOf(regionCode);
        AmazonSpClient client=amazonSpService.getClient(region);

        // 采集 Marketplace 对应的 Product
        List<JSONObject> marketProducts = new MarketProductCollector(marketplaceId,domainName, client,amazonSpService).collect();
        allProducts.addAll(marketProducts);

        // 开发环境启用 Mock 模拟
        // if(SpringUtils.isBootInIDE()) {
        //     writeMockFileIf(marketplaceId,countryCode, allProducts);
        // }
        return allProducts;
    }

    /**
     * 获得 Mock 文件
     **/
    private final File getMockFile(String marketplaceId,String countryCode) {
        return new File("./log/mock/amazon-product-"+marketplaceId+"-"+countryCode+".json");
    }

    /**
     * 写入 Mock 文件
     **/
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

    /**
     * 读取 Mock 文件
     **/
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


/**
 * 产品信息收集
 **/
@Slf4j
class MarketProductCollector {


    public static final String API_NAME_CATALOG = "Catalog";
    public static final String ERROR_CODE_QUOTA_EXCEEDED = "QuotaExceeded";
    public static final String ERROR_CODE_UNAUTHORIZED = "Unauthorized";
    public static final String API_NAME_LISTING = "Listing";
    //
    private int limit = -1;

    private final AmazonSpService amazonSpService;

    private final String domainName;
    private final String marketplaceId;
    private AmazonSpClient client;

    private final FileLogger fileLogger = new FileLogger("./log/amazon-asin-sku.log");

    private Map<String, JSONObject> allListingItemMap = new HashMap<>();
    private Map<String, JSONObject> allCatalogItemMap = new HashMap<>();


    public MarketProductCollector(String marketplaceId,String domainName, AmazonSpClient client,AmazonSpService amazonSpService) {
        this.amazonSpService=amazonSpService;
        this.marketplaceId = marketplaceId;
        this.client = client;
        this.domainName = domainName;
        // 本机开发时只取前5条测试，线上全部
        // this.limit=SpringUtils.isBootInIDE() ? 5 : -1;
    }

    /**
     * 开始采集产品数据
     **/
    public List<JSONObject> collect() {

        if(SpringUtils.isBootInIDE()) {
            fileLogger.separator("开始采集 - mktId=" + this.marketplaceId + "@" + client.getAuth().getClientId());
        }
        // 采集 Listing 数据
        collectAllListingItems();
        // 采集 Catalog 数据
//        if (!allListingItemMap.isEmpty()) {
//            collectAllCatalogItems();
//        }

        // 取数完毕后,装配数据并返回
        List<JSONObject> allProducts = new ArrayList<>();
        for (Map.Entry<String, JSONObject> entry : allListingItemMap.entrySet()) {
            // JSONObject catalog = allCatalogItemMap.get(entry.getKey());
            JSONObject listingItem = entry.getValue();
            // listingItem.put(AmazonToErpProfileConverter.FIELD_CATALOG, catalog);
            listingItem.put(AmazonToErpProfileConverter.FIELD_MARKETPLACE_ID, this.marketplaceId);
            listingItem.put(AmazonToErpProfileConverter.FIELD_DOMAIN_NAME, this.domainName);
            listingItem.put(AmazonToErpProfileConverter.FIELD_CLIENT_ID, this.client.getAuth().getClientId());
            listingItem.put(AmazonToErpProfileConverter.FIELD_SELLER_ID, this.client.getAuth().getSellerId());
            allProducts.add(entry.getValue());
        }

        return allProducts;

    }

    /**
     * 采集全部 Catalog 数据
     **/
    private void collectAllCatalogItems() {
        allCatalogItemMap.clear();
        for (String sku : allListingItemMap.keySet()) {
            collectCatalogItems(sku, null,0);
        }
    }

    /**
     * 分页采集 Catalog 数据
     **/
    private void collectCatalogItems(String sku, String pageToken,Integer retryTimes) {

        // 重试超限
        if (retryTimes > 5) {
            log.error("collectCatalogItems - mktId=" + this.marketplaceId + "@" + client.getAuth().getClientId() + " - sku=" + sku + " - pageToken=" + pageToken + " - retryTimes=" + retryTimes + " - 超过最大重试次数，不再继续执行");
            return;
        }

        var reqCatalogVO = AmazonSpCatalogReqVO.builder()
            .identifiers(List.of(sku))
            .pageToken(pageToken)
            .pageSize(20)
            .identifiersType(AmazonSpCatalogReqVO.IdentifiersType.SKU)
            .sellerId(client.getAuth().getSellerId())
            .marketplaceIds(List.of(marketplaceId))
            .includedData(List.of(AmazonSpCatalogReqVO.IncludedData.IMAGES, AmazonSpCatalogReqVO.IncludedData.ATTRIBUTES))
            .build();
        var catalogBody = client.searchCatalogItems(reqCatalogVO);
        JSONObject result = JsonUtils.parseObject(catalogBody, JSONObject.class);

        // 处理接口返回错误的情况
        boolean doNext = handleErrors(API_NAME_CATALOG,result,()->{
            // 失败后的重试
            collectCatalogItems(sku,pageToken,retryTimes+1);
            return null;
        });
        // 如果有异常则不再继续执行
        if(!doNext) {
            return;
        }

        // 处理采集到的数据
        var catalogItems = result.getJSONArray(AmazonToErpProfileConverter.FIELD_ITEMS);
        if (catalogItems != null && !catalogItems.isEmpty()) {
            for (JsonNode catalogNode : catalogItems) {
                JSONObject catalogJson = new JSONObject(catalogNode);
                String asin = catalogJson.getString(AmazonToErpProfileConverter.FIELD_ASIN);
                if(SpringUtils.isBootInIDE()) {
                    fileLogger.info(sku + " -> " + asin);
                }
                allCatalogItemMap.put(sku, catalogJson);
            }
        } else {
            log.warn("fetch amazon catalog by sku " + sku + " error " + catalogBody);
        }


        log.info("fetch amazon catalog by skus " + (catalogItems == null ? 0 : catalogItems.size()) + " , " + allCatalogItemMap.size());

        // 调试模式下 limit 非全量取数控制
        if (limit > 0 && allCatalogItemMap.size() >= limit) {
            return;
        }

        // 如果有下一页则继续采集
        JSONObject pagination = result.getJSONObject(AmazonToErpProfileConverter.FIELD_PAGINATION);
        if (pagination != null) {
            String nextPageToken = pagination.getString(AmazonToErpProfileConverter.FIELD_NEXT_TOKEN);
            if (!StrUtils.isEmpty(nextPageToken)) {
                collectCatalogItems(sku, nextPageToken,0);
            }
        }

    }

    /**
     * 检查并处理错误
     * @@param retry 重试操作
     * @return 返回是否可以继续执行后续步骤
     **/
    private boolean handleErrors(String name, JSONObject result, Supplier<?> retry) {

        var errors=result.getJSONArray(AmazonToErpProfileConverter.FIELD_ERRORS);
        // 遍历并识别错误
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

            // 如果没有错误，则返回 true，指示主调方继续执行后续步骤
            return true;
        }

        // 处理接口调用超限错误
        if(hasQuotaExceededError) {
            log.info("Amazon "+name+" 接口调用超限, sleep 3s;t="+Thread.currentThread().getId());
            CoreUtils.sleep(3000);
            // 重试
            retry.get();
        }

        // 处理接口调用未授权错误
        if(hasUnauthorizedError) {
            log.error("Amazon "+name+" 接口调用未授权,marketplaceId="+marketplaceId+";clientId="+client.getAuth().getClientId()+", 尝试刷新 Token 后重试");
            boolean refreshed=amazonSpService.refreshAuth(client);
            if(refreshed) {
                CoreUtils.sleep(1000);
            }
            // 重试
            retry.get();
        }

        // 如果有错误，则返回 false，指示主调方不必执行后续步骤
        return false;

    }


    /**
     * 开始采集 Listing 数据
     **/
    private void collectAllListingItems() {
        allListingItemMap.clear();
        collectListingItems(null,0);
    }

    /**
     * 分页采集 Listing 数据
     **/
    private void collectListingItems(String pageToken,Integer retryTimes) {

        // 控制重试次数
        if (retryTimes > 5) {
            log.error("collectListingItems - mktId=" + this.marketplaceId + "@" + client.getAuth().getClientId() + " - pageToken=" + pageToken + " - retryTimes=" + retryTimes + " - 超过最大重试次数，不再继续执行");
            return;
        }

        var reqVO = AmazonSpListingReqVO.builder()
            .sellerId(client.getAuth().getSellerId())
            .pageSize(20)
            .pageToken(pageToken)
            .marketplaceIds(List.of(marketplaceId))
            .includedData(List.of(AmazonSpListingReqVO.IncludedData.OFFERS, AmazonSpListingReqVO.IncludedData.ATTRIBUTES,AmazonSpListingReqVO.IncludedData.SUMMARIES))
            .build();
        var bodyString = client.searchListingsItems(reqVO);
        JSONObject result = JsonUtils.parseObject(bodyString, JSONObject.class);

        // 处理接口访问超限
        boolean doNext = handleErrors(API_NAME_LISTING,result,()->{
            collectListingItems(pageToken,retryTimes+1);
            return null;
        });
        // 如果有未处理的异常则不再继续执行
        if(!doNext) {
            return;
        }

        var listingItems = result.getJSONArray(AmazonToErpProfileConverter.FIELD_ITEMS);
        if (listingItems != null && !listingItems.isEmpty()) {
            for (JsonNode listingNode : listingItems) {
                JSONObject productJson = new JSONObject(listingNode);
                String sku = productJson.getString(AmazonToErpProfileConverter.FIELD_SKU);
                allListingItemMap.put(sku, productJson);
            }
        } else {
            log.warn("fetch amazon catalog by market " + marketplaceId + " error " + bodyString);
        }

        Integer numberOfResults = result.getInteger(AmazonToErpProfileConverter.FIELD_NUMBER_OF_RESULTS);

        log.info("fetch amazon listing " + (listingItems == null ? 0 : listingItems.size()) + " , " + allListingItemMap.size() + "/" + numberOfResults);

        // 调试模式下 limit 非全量取数控制
        if (limit > 0 && allListingItemMap.size() >= limit) {
            return;
        }

        // 如果有下一页则继续采集下一页
        JSONObject pagination = result.getJSONObject(AmazonToErpProfileConverter.FIELD_PAGINATION);
        if (pagination != null) {
            String nextPageToken = pagination.getString(AmazonToErpProfileConverter.FIELD_NEXT_TOKEN);
            if (!StrUtils.isEmpty(nextPageToken)) {
                collectListingItems(nextPageToken,0);
            }
        }

    }


}

