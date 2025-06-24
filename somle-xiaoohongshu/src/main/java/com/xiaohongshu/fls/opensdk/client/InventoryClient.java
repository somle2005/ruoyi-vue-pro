package com.xiaohongshu.fls.opensdk.client;

import com.alibaba.fastjson.JSON;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.CreateWarehouseRequest;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.GetItemStockRequest;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.GetSkuStockRequest;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.GetSkuStockV2Request;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.GetWarehouseRequest;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.IncItemStockRequest;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.IncSkuStockRequest;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.ListWarehouseRequest;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.SetWarehouseCoverageRequest;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.SetWarehousePriorityRequest;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.SyncItemStockRequest;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.SyncSkuStockRequest;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.SyncSkuStockV2Request;
import com.xiaohongshu.fls.opensdk.entity.inventory.request.UpdateWarehouseRequest;
import com.xiaohongshu.fls.opensdk.entity.inventory.response.GetSkuStockV2Response;
import com.xiaohongshu.fls.opensdk.entity.inventory.response.GetWarehouseResponse;
import com.xiaohongshu.fls.opensdk.entity.inventory.response.ItemStockResponse;
import com.xiaohongshu.fls.opensdk.entity.inventory.response.ListWarehouseResponse;
import com.xiaohongshu.fls.opensdk.entity.inventory.response.SkuStockResponse;
import com.xiaohongshu.fls.opensdk.entity.inventory.response.SyncSkuStockV2Response;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class InventoryClient extends BaseClient {
   public InventoryClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse<ItemStockResponse> execute(GetItemStockRequest request, String accessToken) throws IOException {
      BaseResponse<ItemStockResponse> response = new BaseResponse<ItemStockResponse>();
      request.setMethod("inventory.getItemStock");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ItemStockResponse itemStockResponse = (ItemStockResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), ItemStockResponse.class);
         response.setSuccessResponse(itemStockResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ItemStockResponse> execute(SyncItemStockRequest request, String accessToken) throws IOException {
      BaseResponse<ItemStockResponse> response = new BaseResponse<ItemStockResponse>();
      request.setMethod("inventory.syncItemStock");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ItemStockResponse itemStockResponse = (ItemStockResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), ItemStockResponse.class);
         response.setSuccessResponse(itemStockResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ItemStockResponse> execute(IncItemStockRequest request, String accessToken) throws IOException {
      BaseResponse<ItemStockResponse> response = new BaseResponse<ItemStockResponse>();
      request.setMethod("inventory.incItemStock");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ItemStockResponse itemStockResponse = (ItemStockResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), ItemStockResponse.class);
         response.setSuccessResponse(itemStockResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<SkuStockResponse> execute(GetSkuStockRequest request, String accessToken) throws IOException {
      BaseResponse<SkuStockResponse> response = new BaseResponse<SkuStockResponse>();
      request.setMethod("inventory.getSkuStock");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         SkuStockResponse skuStockResponse = (SkuStockResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), SkuStockResponse.class);
         response.setSuccessResponse(skuStockResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<SkuStockResponse> execute(SyncSkuStockRequest request, String accessToken) throws IOException {
      BaseResponse<SkuStockResponse> response = new BaseResponse<SkuStockResponse>();
      request.setMethod("inventory.syncSkuStock");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         SkuStockResponse skuStockResponse = (SkuStockResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), SkuStockResponse.class);
         response.setSuccessResponse(skuStockResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<SkuStockResponse> execute(IncSkuStockRequest request, String accessToken) throws IOException {
      BaseResponse<SkuStockResponse> response = new BaseResponse<SkuStockResponse>();
      request.setMethod("inventory.incSkuStock");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         SkuStockResponse skuStockResponse = (SkuStockResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), SkuStockResponse.class);
         response.setSuccessResponse(skuStockResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetSkuStockV2Response> execute(GetSkuStockV2Request request, String accessToken) throws IOException {
      BaseResponse<GetSkuStockV2Response> response = new BaseResponse<GetSkuStockV2Response>();
      request.setMethod("inventory.getSkuStockV2");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetSkuStockV2Response getSkuStockV2Response = (GetSkuStockV2Response)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetSkuStockV2Response.class);
         response.setSuccessResponse(getSkuStockV2Response);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<SyncSkuStockV2Response> execute(SyncSkuStockV2Request request, String accessToken) throws IOException {
      BaseResponse<SyncSkuStockV2Response> response = new BaseResponse<SyncSkuStockV2Response>();
      request.setMethod("inventory.syncSkuStockV2");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         SyncSkuStockV2Response syncSkuStockV2Response = (SyncSkuStockV2Response)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), SyncSkuStockV2Response.class);
         response.setSuccessResponse(syncSkuStockV2Response);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(CreateWarehouseRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("warehouse.create");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("ok");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(UpdateWarehouseRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("warehouse.update");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("ok");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ListWarehouseResponse> execute(ListWarehouseRequest request, String accessToken) throws IOException {
      BaseResponse<ListWarehouseResponse> response = new BaseResponse<ListWarehouseResponse>();
      request.setMethod("warehouse.list");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ListWarehouseResponse listWarehouseResponse = (ListWarehouseResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), ListWarehouseResponse.class);
         response.setSuccessResponse(listWarehouseResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetWarehouseResponse> execute(GetWarehouseRequest request, String accessToken) throws IOException {
      BaseResponse<GetWarehouseResponse> response = new BaseResponse<GetWarehouseResponse>();
      request.setMethod("warehouse.info");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetWarehouseResponse getWarehouseResponse = (GetWarehouseResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetWarehouseResponse.class);
         response.setSuccessResponse(getWarehouseResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(SetWarehouseCoverageRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("warehouse.setCoverage");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("ok");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(SetWarehousePriorityRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("warehouse.setPriority");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("ok");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }
}
