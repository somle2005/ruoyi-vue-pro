package com.xiaohongshu.fls.opensdk.client;

import com.google.gson.Gson;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.express.request.ElectronicBillOrderCancelRequest;
import com.xiaohongshu.fls.opensdk.entity.express.request.ElectronicBillOrderQueryRequest;
import com.xiaohongshu.fls.opensdk.entity.express.request.ElectronicBillOrderUpdateRequest;
import com.xiaohongshu.fls.opensdk.entity.express.request.ElectronicBillOrdersCreateRequest;
import com.xiaohongshu.fls.opensdk.entity.express.request.ElectronicBillSubscribesQueryRequest;
import com.xiaohongshu.fls.opensdk.entity.express.request.ElectronicBillTemplatesQueryRequest;
import com.xiaohongshu.fls.opensdk.entity.express.response.ElectronicBillOrderCancelResponse;
import com.xiaohongshu.fls.opensdk.entity.express.response.ElectronicBillOrderQueryResponse;
import com.xiaohongshu.fls.opensdk.entity.express.response.ElectronicBillOrderUpdateResponse;
import com.xiaohongshu.fls.opensdk.entity.express.response.ElectronicBillOrdersCreateResponse;
import com.xiaohongshu.fls.opensdk.entity.express.response.ElectronicBillSubscribesQueryResponse;
import com.xiaohongshu.fls.opensdk.entity.express.response.ElectronicBillTemplatesQueryResponse;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class ExpressClient extends BaseClient {
   public ExpressClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse<ElectronicBillSubscribesQueryResponse> execute(ElectronicBillSubscribesQueryRequest request, String accessToken) throws IOException {
      BaseResponse<ElectronicBillSubscribesQueryResponse> response = new BaseResponse<ElectronicBillSubscribesQueryResponse>();
      request.setMethod("express.queryEbillSubscribes");
      request.addParameter(this, accessToken);
      Gson gson = new Gson();
      String bodyString = gson.toJson((Object)request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ElectronicBillSubscribesQueryResponse electronicBillSubscribesQueryResponse = (ElectronicBillSubscribesQueryResponse)Utils.objectMapper.readValue(Utils.objectMapper.writeValueAsString(bodyMap.get("data")), ElectronicBillSubscribesQueryResponse.class);
         response.setSuccessResponse(electronicBillSubscribesQueryResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ElectronicBillTemplatesQueryResponse> execute(ElectronicBillTemplatesQueryRequest request, String accessToken) throws IOException {
      BaseResponse<ElectronicBillTemplatesQueryResponse> response = new BaseResponse<ElectronicBillTemplatesQueryResponse>();
      request.setMethod("express.queryEbillTemplates");
      request.addParameter(this, accessToken);
      Gson gson = new Gson();
      String bodyString = gson.toJson((Object)request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ElectronicBillTemplatesQueryResponse sucessResponse = (ElectronicBillTemplatesQueryResponse)Utils.objectMapper.readValue(Utils.objectMapper.writeValueAsString(bodyMap.get("data")), ElectronicBillTemplatesQueryResponse.class);
         response.setSuccessResponse(sucessResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ElectronicBillOrderQueryResponse> execute(ElectronicBillOrderQueryRequest request, String accessToken) throws IOException {
      BaseResponse<ElectronicBillOrderQueryResponse> response = new BaseResponse<ElectronicBillOrderQueryResponse>();
      request.setMethod("express.queryEbillOrder");
      request.addParameter(this, accessToken);
      Gson gson = new Gson();
      String bodyString = gson.toJson((Object)request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ElectronicBillOrderQueryResponse sucessResponse = (ElectronicBillOrderQueryResponse)Utils.objectMapper.readValue(Utils.objectMapper.writeValueAsString(bodyMap.get("data")), ElectronicBillOrderQueryResponse.class);
         response.setSuccessResponse(sucessResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ElectronicBillOrdersCreateResponse> execute(ElectronicBillOrdersCreateRequest request, String accessToken) throws IOException {
      BaseResponse<ElectronicBillOrdersCreateResponse> response = new BaseResponse<ElectronicBillOrdersCreateResponse>();
      request.setMethod("express.createEbillOrders");
      request.addParameter(this, accessToken);
      Gson gson = new Gson();
      String bodyString = gson.toJson((Object)request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ElectronicBillOrdersCreateResponse sucessResponse = (ElectronicBillOrdersCreateResponse)Utils.objectMapper.readValue(Utils.objectMapper.writeValueAsString(bodyMap.get("data")), ElectronicBillOrdersCreateResponse.class);
         response.setSuccessResponse(sucessResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
         if (null != bodyMap.get("data") && ((Map)bodyMap.get("data")).containsKey("subErrorCode")) {
            ElectronicBillOrdersCreateResponse createResponse = new ElectronicBillOrdersCreateResponse();
            createResponse.setSubErrorCode((String)((Map)bodyMap.get("data")).get("subErrorCode"));
            response.setData(createResponse);
         }
      }

      return response;
   }

   public BaseResponse<ElectronicBillOrderUpdateResponse> execute(ElectronicBillOrderUpdateRequest request, String accessToken) throws IOException {
      BaseResponse<ElectronicBillOrderUpdateResponse> response = new BaseResponse<ElectronicBillOrderUpdateResponse>();
      request.setMethod("express.updateEbillOrder");
      request.addParameter(this, accessToken);
      Gson gson = new Gson();
      String bodyString = gson.toJson((Object)request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ElectronicBillOrderUpdateResponse sucessResponse = (ElectronicBillOrderUpdateResponse)Utils.objectMapper.readValue(Utils.objectMapper.writeValueAsString(bodyMap.get("data")), ElectronicBillOrderUpdateResponse.class);
         response.setSuccessResponse(sucessResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
         if (null != bodyMap.get("data") && ((Map)bodyMap.get("data")).containsKey("subErrorCode")) {
            ElectronicBillOrderUpdateResponse updateResponse = new ElectronicBillOrderUpdateResponse();
            updateResponse.setSubErrorCode((String)((Map)bodyMap.get("data")).get("subErrorCode"));
            response.setData(updateResponse);
         }
      }

      return response;
   }

   public BaseResponse<ElectronicBillOrderCancelResponse> execute(ElectronicBillOrderCancelRequest request, String accessToken) throws IOException {
      BaseResponse<ElectronicBillOrderCancelResponse> response = new BaseResponse<ElectronicBillOrderCancelResponse>();
      request.setMethod("express.cancelEbillOrder");
      request.addParameter(this, accessToken);
      Gson gson = new Gson();
      String bodyString = gson.toJson((Object)request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccess(true);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
         if (null != bodyMap.get("data") && ((Map)bodyMap.get("data")).containsKey("subErrorCode")) {
            ElectronicBillOrderCancelResponse cancelResponse = new ElectronicBillOrderCancelResponse();
            cancelResponse.setSubErrorCode((String)((Map)bodyMap.get("data")).get("subErrorCode"));
            response.setData(cancelResponse);
         }
      }

      return response;
   }
}
