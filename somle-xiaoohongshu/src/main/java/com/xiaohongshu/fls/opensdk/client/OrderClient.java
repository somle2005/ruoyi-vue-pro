package com.xiaohongshu.fls.opensdk.client;

import com.alibaba.fastjson.JSON;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.BatchApproveSubscribeOrdersRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.BatchBindOrderSkuIdentifyCodeInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.BondedPaymentRecordRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.CreateTransferBatchRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.GetCustomInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.GetKosDataRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.GetOrderDeclareRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.GetOrderDetailRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.GetOrderListRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.GetOrderReceiverInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.GetOrderTrackRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.ModifyCustomsStatusRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.ModifyOrderExpressRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.ModifySellerMarkRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.OrderDeliverRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Requset.SyncCustomsInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.order.Response.BatchBindOrderSkuIdentifyCodeInfoResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.CreateTransferBatchResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.GetCustomsInfoResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.GetKosDataResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.GetOrderDeclareInfoResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.GetOrderDetailResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.GetOrderListResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.GetOrderReceiverInfoResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.GetOrderTrackingResponse;
import com.xiaohongshu.fls.opensdk.entity.order.Response.GetSupportedPortListResponse;
import com.xiaohongshu.fls.opensdk.entity.packages.request.GetSupportedPortListRequest;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class OrderClient extends BaseClient {
   public OrderClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse<GetOrderListResponse> execute(GetOrderListRequest request, String accessToken) throws IOException {
      BaseResponse<GetOrderListResponse> response = new BaseResponse<GetOrderListResponse>();
      request.setMethod("order.getOrderList");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetOrderListResponse getOrderListResponse = (GetOrderListResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetOrderListResponse.class);
         response.setSuccessResponse(getOrderListResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetOrderDetailResponse> execute(GetOrderDetailRequest request, String accessToken) throws IOException {
      BaseResponse<GetOrderDetailResponse> response = new BaseResponse<GetOrderDetailResponse>();
      request.setMethod("order.getOrderDetail");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetOrderDetailResponse getOrderDetailResponse = (GetOrderDetailResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetOrderDetailResponse.class);
         response.setSuccessResponse(getOrderDetailResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<BatchBindOrderSkuIdentifyCodeInfoResponse> execute(BatchBindOrderSkuIdentifyCodeInfoRequest request, String accessToken) throws IOException {
      BaseResponse<BatchBindOrderSkuIdentifyCodeInfoResponse> response = new BaseResponse<BatchBindOrderSkuIdentifyCodeInfoResponse>();
      request.setMethod("order.batchBindSkuIdentifyInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         BatchBindOrderSkuIdentifyCodeInfoResponse getOrderDetailResponse = (BatchBindOrderSkuIdentifyCodeInfoResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), BatchBindOrderSkuIdentifyCodeInfoResponse.class);
         response.setSuccessResponse(getOrderDetailResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(BondedPaymentRecordRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("order.resendBondedPaymentRecord");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("申报成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(SyncCustomsInfoRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("order.syncItemCustomsInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("同步成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetCustomsInfoResponse> execute(GetCustomInfoRequest request, String accessToken) throws IOException {
      BaseResponse<GetCustomsInfoResponse> response = new BaseResponse<GetCustomsInfoResponse>();
      request.setMethod("order.getCustomsInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetCustomsInfoResponse getCustomsInfoResponse = (GetCustomsInfoResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetCustomsInfoResponse.class);
         response.setSuccessResponse(getCustomsInfoResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetOrderReceiverInfoResponse> execute(GetOrderReceiverInfoRequest request, String accessToken) throws IOException {
      BaseResponse<GetOrderReceiverInfoResponse> response = new BaseResponse<GetOrderReceiverInfoResponse>();
      request.setMethod("order.getOrderReceiverInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetOrderReceiverInfoResponse getOrderReceiverInfoResponse = (GetOrderReceiverInfoResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetOrderReceiverInfoResponse.class);
         response.setSuccessResponse(getOrderReceiverInfoResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(ModifyOrderExpressRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("order.modifyOrderExpressInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("修改成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(OrderDeliverRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("order.orderDeliver");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("发货成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(ModifySellerMarkRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("order.modifySellerMarkInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("修改成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetOrderTrackingResponse> execute(GetOrderTrackRequest request, String accessToken) throws IOException {
      BaseResponse<GetOrderTrackingResponse> response = new BaseResponse<GetOrderTrackingResponse>();
      request.setMethod("order.getOrderTracking");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetOrderTrackingResponse getOrderTrackingResponse = (GetOrderTrackingResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetOrderTrackingResponse.class);
         response.setSuccessResponse(getOrderTrackingResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetOrderDeclareInfoResponse> execute(GetOrderDeclareRequest request, String accessToken) throws IOException {
      BaseResponse<GetOrderDeclareInfoResponse> response = new BaseResponse<GetOrderDeclareInfoResponse>();
      request.setMethod("order.getOrderDeclareInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetOrderDeclareInfoResponse getOrderDeclareInfoResponse = (GetOrderDeclareInfoResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetOrderDeclareInfoResponse.class);
         response.setSuccessResponse(getOrderDeclareInfoResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetSupportedPortListResponse> execute(GetSupportedPortListRequest request, String accessToken) throws IOException {
      BaseResponse<GetSupportedPortListResponse> response = new BaseResponse<GetSupportedPortListResponse>();
      request.setMethod("order.getSupportedPortList");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetSupportedPortListResponse getSupportedPortListResponse = (GetSupportedPortListResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetSupportedPortListResponse.class);
         response.setSuccessResponse(getSupportedPortListResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<CreateTransferBatchResponse> execute(CreateTransferBatchRequest request, String accessToken) throws IOException {
      BaseResponse<CreateTransferBatchResponse> response = new BaseResponse<CreateTransferBatchResponse>();
      request.setMethod("order.createTransferBatch");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         CreateTransferBatchResponse createTransferBatchResponse = (CreateTransferBatchResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), CreateTransferBatchResponse.class);
         response.setSuccessResponse(createTransferBatchResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetKosDataResponse> execute(GetKosDataRequest request, String accessToken) throws IOException {
      BaseResponse<GetKosDataResponse> response = new BaseResponse<GetKosDataResponse>();
      request.setMethod("businessdata.getKosData");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetKosDataResponse getKosDataResponse = (GetKosDataResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetKosDataResponse.class);
         response.setSuccessResponse(getKosDataResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(ModifyCustomsStatusRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("order.modifycustomstatus");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("success");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(BatchApproveSubscribeOrdersRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("logisticservice.batchApproveSubscribeOrders");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("success");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }
}
