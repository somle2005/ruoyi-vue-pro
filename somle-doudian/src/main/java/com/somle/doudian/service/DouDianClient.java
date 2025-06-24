package com.somle.doudian.service;


import cn.hutool.core.collection.CollUtil;
import com.doudian.open.api.order_batchDecrypt.OrderBatchDecryptRequest;
import com.doudian.open.api.order_batchDecrypt.OrderBatchDecryptResponse;
import com.doudian.open.api.order_batchDecrypt.param.CipherInfosItem;
import com.doudian.open.api.order_batchDecrypt.param.OrderBatchDecryptParam;
import com.doudian.open.api.order_searchList.OrderSearchListRequest;
import com.doudian.open.api.order_searchList.OrderSearchListResponse;
import com.doudian.open.api.order_searchList.data.OrderSearchListData;
import com.doudian.open.api.order_searchList.data.ShopOrderListItem;
import com.doudian.open.api.order_searchList.param.OrderSearchListParam;
import com.doudian.open.api.product_listV2.ProductListV2Request;
import com.doudian.open.api.product_listV2.ProductListV2Response;
import com.doudian.open.api.product_listV2.data.DataItem;
import com.doudian.open.api.product_listV2.data.ProductListV2Data;
import com.doudian.open.api.product_listV2.param.ProductListV2Param;
import com.doudian.open.api.token.AccessTokenData;
import com.doudian.open.api.token_create.TokenCreateRequest;
import com.doudian.open.api.token_create.TokenCreateResponse;
import com.doudian.open.api.token_create.data.TokenCreateData;
import com.doudian.open.api.token_create.param.TokenCreateParam;
import com.doudian.open.core.AccessToken;
import com.doudian.open.core.AccessTokenBuilder;
import com.doudian.open.core.GlobalConfig;
import com.doudian.open.utils.JsonUtil;
import com.somle.doudian.model.DouDianAccount;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Slf4j
public class DouDianClient {

    private DouDianAccount douDianAccount;

    public DouDianClient(DouDianAccount douDianAccount) {
        this.douDianAccount = douDianAccount;
        GlobalConfig.initAppKey(douDianAccount.getAppKey());
        GlobalConfig.initAppSecret(douDianAccount.getAppSecret());
    }

    public AccessToken createToken() {
        AccessToken accessToken = AccessTokenBuilder.build(douDianAccount.getShopId());
        return accessToken;
    }

//    public void getShopInfo() {
//        ShopGetStoreDetailRequest request = new ShopGetStoreDetailRequest();
//        ShopGetStoreDetailParam param = request.getParam();
//        param.setStoreId(123L);
//        param.setIsNeedPoiAuditInfo(true);
//        param.setIsNeedRelShopUser(true);
//        param.setIsNeedChargeInfo(true);
//        ShopGetStoreDetailResponse response = request.execute(accessToken);
//    }

    @SneakyThrows
    public ProductListV2Data getProducts(Long page) {
        ProductListV2Request request = new ProductListV2Request();
        ProductListV2Param param = request.getParam();
        param.setPage(page);
        param.setSize(100L);
        param.setUseCursor(false);
        AccessToken accessToken = JsonUtil.fromJson(douDianAccount.getAccessTokenJson(), AccessToken.class);
        ProductListV2Response response = request.execute(accessToken);
        ProductListV2Data data = response.getData();
        return data;
    }

    @SneakyThrows
    public List<DataItem> getAllProducts() {
        List<DataItem> allProducts = new ArrayList<>();
        Long page = 1L;
        while (true) {
            ProductListV2Data products = getProducts(page);
            if (CollUtil.isEmpty(products.getData())) {
                break;
            }
            allProducts.addAll(products.getData());
            page++;
        }
        return allProducts;
    }

//    @SneakyThrows
//    public OrderSearchListData getOrder(Long createTimeStart, Long createTimeEnd, Long page) {
//        OrderSearchListRequest request = new OrderSearchListRequest();
//        OrderSearchListParam param = request.getParam();
//        param.setSize(100L);
//        param.setPage(page);
//        param.setCreateTimeStart(createTimeStart);
//        param.setCreateTimeEnd(createTimeEnd);
//        AccessToken accessToken = JsonUtil.fromJson(douDianAccount.getAccessTokenJson(), AccessToken.class);
//        OrderSearchListResponse response = request.execute(accessToken);
//        OrderSearchListData data = response.getData();
//        return data;
//    }
//
//    @SneakyThrows
//    public List<ShopOrderListItem> getAllOrders(Long createTimeStart, Long createTimeEnd) {
//        List<ShopOrderListItem> allOrders = new ArrayList<>();
//        Long page = 0L;
//        while (true) {
//            OrderSearchListData orders = getOrder(createTimeStart, createTimeEnd, page);
//            if (CollUtil.isEmpty(orders.getShopOrderList())) {
//                break;
//            }
//            allOrders.addAll(orders.getShopOrderList());
//            page++;
//        }
//        return allOrders;
//    }

}
