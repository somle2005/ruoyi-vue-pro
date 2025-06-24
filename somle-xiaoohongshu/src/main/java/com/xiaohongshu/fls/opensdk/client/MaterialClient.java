package com.xiaohongshu.fls.opensdk.client;

import com.alibaba.fastjson.JSON;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.material.request.DeleteMaterialInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.material.request.QueryMaterialInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.material.request.UpdateMaterialInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.material.request.UploadMaterialInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.material.response.MaterialDetail;
import com.xiaohongshu.fls.opensdk.entity.material.response.QueryMaterialInfoResponse;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class MaterialClient extends BaseClient {
   public MaterialClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse<MaterialDetail> execute(UploadMaterialInfoRequest request, String accessToken) throws IOException {
      BaseResponse<MaterialDetail> response = new BaseResponse<MaterialDetail>();
      request.setMethod("material.uploadMaterial");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         MaterialDetail materialDetail = (MaterialDetail)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), MaterialDetail.class);
         response.setSuccessResponse(materialDetail);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<MaterialDetail> execute(UpdateMaterialInfoRequest request, String accessToken) throws IOException {
      BaseResponse<MaterialDetail> response = new BaseResponse<MaterialDetail>();
      request.setMethod("material.updateMaterial");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         MaterialDetail materialDetail = (MaterialDetail)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), MaterialDetail.class);
         response.setSuccessResponse(materialDetail);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(DeleteMaterialInfoRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("material.deleteMaterial");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("删除成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<QueryMaterialInfoResponse> execute(QueryMaterialInfoRequest request, String accessToken) throws IOException {
      BaseResponse<QueryMaterialInfoResponse> response = new BaseResponse<QueryMaterialInfoResponse>();
      request.setMethod("material.queryMaterial");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         QueryMaterialInfoResponse queryMaterialInfoResponse = (QueryMaterialInfoResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), QueryMaterialInfoResponse.class);
         response.setSuccessResponse(queryMaterialInfoResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }
}
