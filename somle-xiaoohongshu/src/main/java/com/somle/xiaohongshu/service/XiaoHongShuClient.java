package com.somle.xiaohongshu.service;


import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import com.somle.xiaohongshu.model.XiaoHongShuAccount;
import com.xiaohongshu.fls.opensdk.client.OauthClient;
import com.xiaohongshu.fls.opensdk.client.OrderClient;
import com.xiaohongshu.fls.opensdk.client.ProductClient;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.afterSale.request.ReceiveAndShipRequest;
import com.xiaohongshu.fls.opensdk.entity.oauth.request.GetAccessTokenRequest;
import com.xiaohongshu.fls.opensdk.entity.oauth.response.GetAccessTokenResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.GetOrderDetailRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.GetOrderListRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.GetOrderReceiverInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Response.GetOrderDetailResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.GetOrderListResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.GetOrderReceiverInfoResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.OrderSimpleDetail;
import com.xiaohongshu.fls.opensdk.entity.product.request.GetDetailItemRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.GetDetailSkuRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.SearchItemListRequest;
import com.xiaohongshu.fls.opensdk.entity.product.response.GetDetailItemResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.GetDetailSkuListResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.SearchItemListResponse;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@Slf4j
public class XiaoHongShuClient {

    private XiaoHongShuAccount xiaoHongShuAccount;

    private static final String URL = "https://ark.xiaohongshu.com/ark/open_api/v3/common_controller";

    public XiaoHongShuClient(XiaoHongShuAccount xiaoHongShuAccount) {
        this.xiaoHongShuAccount = xiaoHongShuAccount;
    }

    //获取access_token和refresh_token
    @SneakyThrows
    public void getAuthCode() {
        OauthClient client = new OauthClient(URL, "8067d48cdf0e4d2180cb",
            "2.0", "c9b08b7b514f6f89ed43915ac2a01f88");
        GetAccessTokenRequest request = new GetAccessTokenRequest("code-ac3d583bb76b44cbbe161a392efa9ea5-e857425727f849fda7403d8bb9482d04");
        BaseResponse<GetAccessTokenResponse> response = client.execute(request);
        log.info("response: " + response);
    }

    @SneakyThrows
    public List<GetDetailSkuListResponse.Product> getProducts(Integer pageNo, Integer pageSize) {
        ProductClient client = new ProductClient(URL, xiaoHongShuAccount.getAppKey(),
            "2.0", xiaoHongShuAccount.getAppSecret());
        GetDetailSkuRequest request = new GetDetailSkuRequest();
        request.setPageNo(pageNo);
        request.setPageSize(pageSize);
        BaseResponse<GetDetailSkuListResponse> response = client.execute(request,xiaoHongShuAccount.getAccessToken());
        List<GetDetailSkuListResponse.Product> products = response.getData().getData();
        return products;
    }

    @SneakyThrows
    public List<GetDetailSkuListResponse.Product> getAllProducts() {
        List<GetDetailSkuListResponse.Product> allProducts = new ArrayList<>();
        Integer pageNo = 1;
        Integer pageSize = 100;
        while (true) {
            List<GetDetailSkuListResponse.Product> products = getProducts(pageNo, pageSize);
            if (CollUtil.isEmpty( products)) {
                break;
            }
            allProducts.addAll(products);
            pageNo++;
        }
        return allProducts;
    }

    @SneakyThrows
    public List<OrderSimpleDetail> getOrderList(GetOrderListRequest request) {
        OrderClient client = new OrderClient(URL, xiaoHongShuAccount.getAppKey(),
            "2.0", xiaoHongShuAccount.getAppSecret());
        BaseResponse<GetOrderListResponse> response = client.execute(request, xiaoHongShuAccount.getAccessToken());
        List<OrderSimpleDetail> orderList = response.getData().getOrderList();
        return orderList;
    }

    @SneakyThrows
    public List<OrderSimpleDetail> getAllOrderList(GetOrderListRequest request) {
        List<OrderSimpleDetail> allOrderList = new ArrayList<>();
        while (true) {
            List<OrderSimpleDetail> orderList = getOrderList(request);
            if (CollUtil.isEmpty(orderList)) {
                break;
            }
            allOrderList.addAll(orderList);
            request.setPageNo(request.getPageNo() + 1);
        }
        return allOrderList;
    }

    @SneakyThrows
    public GetOrderDetailResponse getOrderDetail(String orderId) {
        OrderClient client = new OrderClient(URL, xiaoHongShuAccount.getAppKey(),
            "2.0", xiaoHongShuAccount.getAppSecret());
        GetOrderDetailRequest request = new GetOrderDetailRequest();
        request.setOrderId(orderId);
        BaseResponse<GetOrderDetailResponse> response = client.execute(request, xiaoHongShuAccount.getAccessToken());
        GetOrderDetailResponse data = response.getData();
        return data;
    }

    @SneakyThrows
    public List<GetOrderDetailResponse> getAllOrderDetail(GetOrderListRequest request) {
        List<OrderSimpleDetail> allOrderList = getAllOrderList(request);
        if(CollUtil.isEmpty(allOrderList)){
            return new ArrayList<>();
        }
        List<GetOrderDetailResponse> allOrderDetail = allOrderList.stream().map(order -> {
            GetOrderDetailResponse orderDetail = getOrderDetail(order.getOrderId());

            GetOrderReceiverInfoRequest req = new GetOrderReceiverInfoRequest();
            List<GetOrderReceiverInfoRequest.OrderReceiverQuery> receiverQueries = new ArrayList<>();
            GetOrderReceiverInfoRequest.OrderReceiverQuery query = new GetOrderReceiverInfoRequest.OrderReceiverQuery();
            query.setOrderId(order.getOrderId());
            query.setOpenAddressId(orderDetail.getOpenAddressId());
            receiverQueries.add(query);
            req.setReceiverQueries(receiverQueries);
            req.setIsReturn(false);

            GetOrderReceiverInfoResponse orderReceiverInfo = getOrderReceiverInfo(req);
            if (CollUtil.isNotEmpty(orderReceiverInfo.getReceiverInfos())) {
                orderDetail.setOrderReceiverInfo(orderReceiverInfo.getReceiverInfos().get(0));
            }

            return orderDetail;
        }).collect(Collectors.toList());
        return allOrderDetail;
    }

    @SneakyThrows
    public GetOrderReceiverInfoResponse getOrderReceiverInfo(GetOrderReceiverInfoRequest request) {
        OrderClient client = new OrderClient(URL, xiaoHongShuAccount.getAppKey(),
            "2.0", xiaoHongShuAccount.getAppSecret());
        BaseResponse<GetOrderReceiverInfoResponse> response = client.execute(request, xiaoHongShuAccount.getAccessToken());
        GetOrderReceiverInfoResponse data = response.getData();
        return data;
    }

}
