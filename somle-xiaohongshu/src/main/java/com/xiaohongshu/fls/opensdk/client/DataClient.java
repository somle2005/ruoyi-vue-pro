package com.xiaohongshu.fls.opensdk.client;

import com.alibaba.fastjson.JSON;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.data.request.BatchDecryptRequest;
import com.xiaohongshu.fls.opensdk.entity.data.request.BatchDesensitiseRequest;
import com.xiaohongshu.fls.opensdk.entity.data.request.BatchIndexRequest;
import com.xiaohongshu.fls.opensdk.entity.data.response.BatchDecryptResponse;
import com.xiaohongshu.fls.opensdk.entity.data.response.BatchDesensitiseResponse;
import com.xiaohongshu.fls.opensdk.entity.data.response.BatchIndexResponse;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class DataClient extends BaseClient {
   public DataClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse<BatchDecryptResponse> execute(BatchDecryptRequest request, String accessToken) throws IOException {
      BaseResponse<BatchDecryptResponse> response = new BaseResponse<BatchDecryptResponse>();
      request.setMethod("data.batchDecrypt");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         BatchDecryptResponse batchDecryptResponse = (BatchDecryptResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), BatchDecryptResponse.class);
         response.setSuccessResponse(batchDecryptResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<BatchDesensitiseResponse> execute(BatchDesensitiseRequest request, String accessToken) throws IOException {
      BaseResponse<BatchDesensitiseResponse> response = new BaseResponse<BatchDesensitiseResponse>();
      request.setMethod("data.batchDesensitise");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         BatchDesensitiseResponse batchDesensitiseResponse = (BatchDesensitiseResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), BatchDesensitiseResponse.class);
         response.setSuccessResponse(batchDesensitiseResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<BatchIndexResponse> execute(BatchIndexRequest request, String accessToken) throws IOException {
      BaseResponse<BatchIndexResponse> response = new BaseResponse<BatchIndexResponse>();
      request.setMethod("data.batchIndex");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         BatchIndexResponse batchIndexResponse = (BatchIndexResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), BatchIndexResponse.class);
         response.setSuccessResponse(batchIndexResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }
}
