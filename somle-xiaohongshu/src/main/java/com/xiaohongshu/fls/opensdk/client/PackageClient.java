package com.xiaohongshu.fls.opensdk.client;

import com.alibaba.fastjson.JSON;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.packages.request.AddDeclarePortRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.AuditCancelApplyRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.CreateTransferBatchRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.GetCancelApplyListRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.GetItemCustomInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.GetPackageDeclareRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.GetPackageDetailRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.GetPackageListRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.GetPackageTrackRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.GetReceiverInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.GetSupportedPortListRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.ModifyPackageExpressRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.ModifySellerMarkRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.PackageDeliverRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.ResendBondedPaymentRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.SyncItemCustomsRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.request.UpdateProxyPackageWeightRequest;
import com.xiaohongshu.fls.opensdk.entity.packages.response.CreateTransferBatchResponse;
import com.xiaohongshu.fls.opensdk.entity.packages.response.GetCancelApplyListResponse;
import com.xiaohongshu.fls.opensdk.entity.packages.response.GetItemCustomsInfoResponse;
import com.xiaohongshu.fls.opensdk.entity.packages.response.GetPackageDeclareResponse;
import com.xiaohongshu.fls.opensdk.entity.packages.response.GetPackageDetailResponse;
import com.xiaohongshu.fls.opensdk.entity.packages.response.GetPackageTrackResponse;
import com.xiaohongshu.fls.opensdk.entity.packages.response.GetPackagesListResponse;
import com.xiaohongshu.fls.opensdk.entity.packages.response.GetReceiveInfoResponse;
import com.xiaohongshu.fls.opensdk.entity.packages.response.GetSupportedPortListResponse;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class PackageClient extends BaseClient {
   public PackageClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse<GetPackagesListResponse> execute(GetPackageListRequest request, String accessToken) throws IOException {
      BaseResponse<GetPackagesListResponse> response = new BaseResponse<GetPackagesListResponse>();
      request.setMethod("package.getPackageList");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetPackagesListResponse getPackagesListResponse = (GetPackagesListResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetPackagesListResponse.class);
         response.setSuccessResponse(getPackagesListResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetPackageDetailResponse> execute(GetPackageDetailRequest request, String accessToken) throws IOException {
      BaseResponse<GetPackageDetailResponse> response = new BaseResponse<GetPackageDetailResponse>();
      request.setMethod("package.getPackageDetail");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetPackageDetailResponse getPackageDetailResponse = (GetPackageDetailResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetPackageDetailResponse.class);
         response.setSuccessResponse(getPackageDetailResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(ResendBondedPaymentRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("package.resendBondedPaymentRecord");
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

   public BaseResponse<String> execute(SyncItemCustomsRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("package.syncItemCustomsInfo");
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

   public BaseResponse<GetItemCustomsInfoResponse> execute(GetItemCustomInfoRequest request, String accessToken) throws IOException {
      BaseResponse<GetItemCustomsInfoResponse> response = new BaseResponse<GetItemCustomsInfoResponse>();
      request.setMethod("package.getItemCustomsInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetItemCustomsInfoResponse getItemCustomsInfoResponse = (GetItemCustomsInfoResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetItemCustomsInfoResponse.class);
         response.setSuccessResponse(getItemCustomsInfoResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetReceiveInfoResponse> execute(GetReceiverInfoRequest request, String accessToken) throws IOException {
      BaseResponse<GetReceiveInfoResponse> response = new BaseResponse<GetReceiveInfoResponse>();
      request.setMethod("package.getPackageReceiverInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetReceiveInfoResponse getReceiveInfoResponse = (GetReceiveInfoResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetReceiveInfoResponse.class);
         response.setSuccessResponse(getReceiveInfoResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(ModifyPackageExpressRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("package.modifyPackageExpressInfo");
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

   public BaseResponse<String> execute(PackageDeliverRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("package.packageDeliver");
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
      request.setMethod("package.modifySellerMarkInfo");
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

   public BaseResponse<GetPackageTrackResponse> execute(GetPackageTrackRequest request, String accessToken) throws IOException {
      BaseResponse<GetPackageTrackResponse> response = new BaseResponse<GetPackageTrackResponse>();
      request.setMethod("package.getPackageTracking");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetPackageTrackResponse getPackageTrackResponse = (GetPackageTrackResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetPackageTrackResponse.class);
         response.setSuccessResponse(getPackageTrackResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetPackageDeclareResponse> execute(GetPackageDeclareRequest request, String accessToken) throws IOException {
      BaseResponse<GetPackageDeclareResponse> response = new BaseResponse<GetPackageDeclareResponse>();
      request.setMethod("package.getPackageDeclareInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetPackageDeclareResponse getPackageDeclareResponse = (GetPackageDeclareResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetPackageDeclareResponse.class);
         response.setSuccessResponse(getPackageDeclareResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetSupportedPortListResponse> execute(GetSupportedPortListRequest request, String accessToken) throws IOException {
      BaseResponse<GetSupportedPortListResponse> response = new BaseResponse<GetSupportedPortListResponse>();
      request.setMethod("package.getSupportedPortList");
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

   public BaseResponse<GetCancelApplyListResponse> execute(GetCancelApplyListRequest request, String accessToken) throws IOException {
      BaseResponse<GetCancelApplyListResponse> response = new BaseResponse<GetCancelApplyListResponse>();
      request.setMethod("package.getCancelApplyList");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetCancelApplyListResponse getCancelApplyListResponse = (GetCancelApplyListResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetCancelApplyListResponse.class);
         response.setSuccessResponse(getCancelApplyListResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(AuditCancelApplyRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("package.auditCancelApply");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("审核完成");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(AddDeclarePortRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("package.addDeclarePort");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("新增成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(UpdateProxyPackageWeightRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("package.updateProxyPackageWeight");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("回传成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<CreateTransferBatchResponse> execute(CreateTransferBatchRequest request, String accessToken) throws IOException {
      BaseResponse<CreateTransferBatchResponse> response = new BaseResponse<CreateTransferBatchResponse>();
      request.setMethod("package.createTransferBatch");
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
}
