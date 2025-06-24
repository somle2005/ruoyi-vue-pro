package com.xiaohongshu.fls.opensdk.client;

import com.alibaba.fastjson.JSON;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.boutique.BasicBoutiqueItemData;
import com.xiaohongshu.fls.opensdk.entity.boutique.request.CreateBoutiqueItemRequest;
import com.xiaohongshu.fls.opensdk.entity.boutique.request.CreateBoutiqueSkuRequest;
import com.xiaohongshu.fls.opensdk.entity.boutique.request.UpdateBoutiqueItemRequest;
import com.xiaohongshu.fls.opensdk.entity.boutique.request.UpdateBoutiqueSkuRequest;
import com.xiaohongshu.fls.opensdk.entity.boutique.response.BasicBoutiqueSkuData;
import com.xiaohongshu.fls.opensdk.entity.boutique.response.CreateBoutiqueItemResponse;
import com.xiaohongshu.fls.opensdk.entity.boutique.response.CreateBoutiqueSkuResponse;
import com.xiaohongshu.fls.opensdk.entity.product.request.CreateItemRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.FlsCreateSkuRequest;
import com.xiaohongshu.fls.opensdk.entity.product.response.ItemResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.FlsSkuDetail;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class BoutiqueClient extends BaseClient {
   public BoutiqueClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse<CreateBoutiqueItemResponse> execute(CreateBoutiqueItemRequest request, String accessToken) throws IOException {
      BaseResponse<CreateBoutiqueItemResponse> response = new BaseResponse<CreateBoutiqueItemResponse>();
      request.setMethod("boutique.createBoutiqueItem");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         CreateBoutiqueItemResponse createBoutiqueItemResponse = (CreateBoutiqueItemResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), CreateBoutiqueItemResponse.class);
         response.setSuccessResponse(createBoutiqueItemResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<BasicBoutiqueItemData> execute(UpdateBoutiqueItemRequest request, String accessToken) throws IOException {
      BaseResponse<BasicBoutiqueItemData> response = new BaseResponse<BasicBoutiqueItemData>();
      request.setMethod("boutique.updateBoutiqueItem");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         BasicBoutiqueItemData basicBoutiqueItemData = (BasicBoutiqueItemData)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), BasicBoutiqueItemData.class);
         response.setSuccessResponse(basicBoutiqueItemData);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ItemResponse> execute(CreateItemRequest request, String accessToken) throws IOException {
      BaseResponse<ItemResponse> response = new BaseResponse<ItemResponse>();
      request.setMethod("boutique.createBoutiqueItemV2");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ItemResponse itemResponse = (ItemResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), ItemResponse.class);
         response.setSuccessResponse(itemResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<CreateBoutiqueSkuResponse> execute(CreateBoutiqueSkuRequest request, String accessToken) throws IOException {
      BaseResponse<CreateBoutiqueSkuResponse> response = new BaseResponse<CreateBoutiqueSkuResponse>();
      request.setMethod("boutique.createBoutiqueSku");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         CreateBoutiqueSkuResponse createBoutiqueSkuResponse = (CreateBoutiqueSkuResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), CreateBoutiqueSkuResponse.class);
         response.setSuccessResponse(createBoutiqueSkuResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<BasicBoutiqueSkuData> execute(UpdateBoutiqueSkuRequest request, String accessToken) throws IOException {
      BaseResponse<BasicBoutiqueSkuData> response = new BaseResponse<BasicBoutiqueSkuData>();
      request.setMethod("boutique.updateBoutiqueSku");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         BasicBoutiqueSkuData basicBoutiqueSkuData = (BasicBoutiqueSkuData)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), BasicBoutiqueSkuData.class);
         response.setSuccessResponse(basicBoutiqueSkuData);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<FlsSkuDetail> execute(FlsCreateSkuRequest request, String accessToken) throws IOException {
      BaseResponse<FlsSkuDetail> response = new BaseResponse<FlsSkuDetail>();
      request.setMethod("boutique.createBoutiqueSkuV2");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         FlsSkuDetail flsSkuDetail = (FlsSkuDetail)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), FlsSkuDetail.class);
         response.setSuccessResponse(flsSkuDetail);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }
}
