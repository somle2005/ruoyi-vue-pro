package com.xiaohongshu.fls.opensdk.client;

import com.alibaba.fastjson.JSON;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.afterSale.request.AuditReturnsRequest;
import com.xiaohongshu.fls.opensdk.entity.afterSale.request.ConfirmReceiveRequest;
import com.xiaohongshu.fls.opensdk.entity.afterSale.request.GetAfterSaleDetailRequest;
import com.xiaohongshu.fls.opensdk.entity.afterSale.request.GetAfterSaleInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.afterSale.request.GetAfterSaleListRequest;
import com.xiaohongshu.fls.opensdk.entity.afterSale.request.ListAfterSaleInfosRequest;
import com.xiaohongshu.fls.opensdk.entity.afterSale.request.ListReturnRejectReasonRequest;
import com.xiaohongshu.fls.opensdk.entity.afterSale.request.ReceiveAndShipRequest;
import com.xiaohongshu.fls.opensdk.entity.afterSale.request.ReturnsAbnormalRequest;
import com.xiaohongshu.fls.opensdk.entity.afterSale.response.GetAfterSaleDetailResponse;
import com.xiaohongshu.fls.opensdk.entity.afterSale.response.GetAfterSaleInfoResponse;
import com.xiaohongshu.fls.opensdk.entity.afterSale.response.GetAfterSaleListResponse;
import com.xiaohongshu.fls.opensdk.entity.afterSale.response.ListAfterSaleInfosResponse;
import com.xiaohongshu.fls.opensdk.entity.afterSale.response.ListReturnRejectReasonResponse;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class AfterSaleClient extends BaseClient {
   public AfterSaleClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse<ListAfterSaleInfosResponse> execute(ListAfterSaleInfosRequest request, String accessToken) throws IOException {
      BaseResponse<ListAfterSaleInfosResponse> response = new BaseResponse<ListAfterSaleInfosResponse>();
      request.setMethod("afterSale.listAfterSaleInfos");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ListAfterSaleInfosResponse listAfterSaleInfosResponse = (ListAfterSaleInfosResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), ListAfterSaleInfosResponse.class);
         response.setSuccessResponse(listAfterSaleInfosResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetAfterSaleInfoResponse> execute(GetAfterSaleInfoRequest request, String accessToken) throws IOException {
      BaseResponse<GetAfterSaleInfoResponse> response = new BaseResponse<GetAfterSaleInfoResponse>();
      request.setMethod("afterSale.getAfterSaleInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetAfterSaleInfoResponse getAfterSaleInfoResponse = (GetAfterSaleInfoResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetAfterSaleInfoResponse.class);
         response.setSuccessResponse(getAfterSaleInfoResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ListReturnRejectReasonResponse> execute(ListReturnRejectReasonRequest request, String accessToken) throws IOException {
      BaseResponse<ListReturnRejectReasonResponse> response = new BaseResponse<ListReturnRejectReasonResponse>();
      request.setMethod("afterSale.rejectReasons");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ListReturnRejectReasonResponse getAfterSaleInfoResponse = (ListReturnRejectReasonResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), ListReturnRejectReasonResponse.class);
         response.setSuccessResponse(getAfterSaleInfoResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetAfterSaleListResponse> execute(GetAfterSaleListRequest request, String accessToken) throws IOException {
      BaseResponse<GetAfterSaleListResponse> response = new BaseResponse<GetAfterSaleListResponse>();
      request.setMethod("afterSale.listAfterSaleApi");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetAfterSaleListResponse getAfterSaleListResponse = (GetAfterSaleListResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetAfterSaleListResponse.class);
         response.setSuccessResponse(getAfterSaleListResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(ConfirmReceiveRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("afterSale.confirmReceive");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("确认收货成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(AuditReturnsRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("afterSale.auditReturns");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("确认收货成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetAfterSaleDetailResponse> execute(GetAfterSaleDetailRequest request, String accessToken) throws IOException {
      BaseResponse<GetAfterSaleDetailResponse> response = new BaseResponse<GetAfterSaleDetailResponse>();
      request.setMethod("afterSale.getAfterSaleDetail");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetAfterSaleDetailResponse getAfterSaleDetailResponse = (GetAfterSaleDetailResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetAfterSaleDetailResponse.class);
         response.setSuccessResponse(getAfterSaleDetailResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(ReturnsAbnormalRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("afterSale.setReturnsAbnormal");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("拒绝售后确认收货完成");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(ReceiveAndShipRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("afterSale.receiveAndShip");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("售后换货成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }
}
