package com.xiaohongshu.fls.opensdk.client;

import com.alibaba.fastjson.JSON;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.product.SpuInfo;
import com.xiaohongshu.fls.opensdk.entity.product.request.CreateItemRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.CreateSpuRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.DeleteItemRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.DeleteSpuRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.GetBasicItemRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.GetDetailItemRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.GetFatSpuRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.GetSpuRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.UpdateAvailabilityRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.UpdateItemPriceRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.UpdateItemRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.UpdateLogisticsPlanRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.UpdateSpuImage;
import com.xiaohongshu.fls.opensdk.entity.product.request.UpdateSpuRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.UpdateVariantImage;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.CreateItemAndSkuRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.CreateItemV3Request;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.CreateSkuV3Request;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.DeleteItemV3Request;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.DeleteSkuV3Request;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.GetDetailSkuRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.GetItemInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.SearchItemListRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.UpdateItemAndSkuRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.UpdateItemImageRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.UpdateItemV3Request;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.UpdateSkuAvailableRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.UpdateSkuLogisticsPlanRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.UpdateSkuPriceRequest;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.UpdateSkuV3Request;
import com.xiaohongshu.fls.opensdk.entity.product.response.BaseItemResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.GetBasicItemResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.GetDetailItemResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.GetFatSpuResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.GetSpuResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.ItemResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.GetDetailSkuListResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.GetItemInfoResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.ItemAndSkuDetail;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.ItemDetail;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.SearchItemListResponse;
import com.xiaohongshu.fls.opensdk.entity.product.response.v3.SkuDetail;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class ProductClient extends BaseClient {
   public ProductClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse<GetBasicItemResponse> execute(GetBasicItemRequest request, String accessToken) throws IOException {
      BaseResponse<GetBasicItemResponse> response = new BaseResponse<GetBasicItemResponse>();
      request.setMethod("product.getBasicItemList");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetBasicItemResponse itemsBasicResponse = (GetBasicItemResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetBasicItemResponse.class);
         response.setSuccessResponse(itemsBasicResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetDetailItemResponse> execute(GetDetailItemRequest request, String accessToken) throws IOException {
      BaseResponse<GetDetailItemResponse> response = new BaseResponse<GetDetailItemResponse>();
      request.setMethod("product.getDetailItemList");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetDetailItemResponse itemsDetailResponse = (GetDetailItemResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetDetailItemResponse.class);
         response.setSuccessResponse(itemsDetailResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetFatSpuResponse> execute(GetFatSpuRequest request, String accessToken) throws IOException {
      BaseResponse<GetFatSpuResponse> response = new BaseResponse<GetFatSpuResponse>();
      request.setMethod("product.getSpuInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetFatSpuResponse getFatSpuResponse = (GetFatSpuResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetFatSpuResponse.class);
         response.setSuccessResponse(getFatSpuResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<BaseItemResponse> execute(UpdateLogisticsPlanRequest request, String accessToken) throws IOException {
      BaseResponse<BaseItemResponse> response = new BaseResponse<BaseItemResponse>();
      request.setMethod("product.updateLogisticsPlan");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         BaseItemResponse baseItemResponse = (BaseItemResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), BaseItemResponse.class);
         response.setSuccessResponse(baseItemResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<BaseItemResponse> execute(UpdateAvailabilityRequest request, String accessToken) throws IOException {
      BaseResponse<BaseItemResponse> response = new BaseResponse<BaseItemResponse>();
      request.setMethod("product.updateAvailability");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         BaseItemResponse baseItemResponse = (BaseItemResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), BaseItemResponse.class);
         response.setSuccessResponse(baseItemResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<SpuInfo> execute(CreateSpuRequest request, String accessToken) throws IOException {
      BaseResponse<SpuInfo> response = new BaseResponse<SpuInfo>();
      request.setMethod("product.createSpu");
      request.addParameter(this, accessToken);
      String bodyString = Utils.objectMapper.writeValueAsString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         SpuInfo spuResponse = (SpuInfo)Utils.objectMapper.readValue(Utils.objectMapper.writeValueAsString(bodyMap.get("data")), SpuInfo.class);
         response.setSuccessResponse(spuResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<SpuInfo> execute(UpdateSpuRequest request, String accessToken) throws IOException {
      BaseResponse<SpuInfo> response = new BaseResponse<SpuInfo>();
      request.setMethod("product.updateSpu");
      request.addParameter(this, accessToken);
      String bodyString = Utils.objectMapper.writeValueAsString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         SpuInfo spuResponse = (SpuInfo)Utils.objectMapper.readValue(Utils.objectMapper.writeValueAsString(bodyMap.get("data")), SpuInfo.class);
         response.setSuccessResponse(spuResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(DeleteSpuRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("product.deleteSpu");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         String data = JSON.toJSONString(bodyMap.get("data"));
         response.setSuccessResponse(data);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ItemResponse> execute(CreateItemRequest request, String accessToken) throws IOException {
      BaseResponse<ItemResponse> response = new BaseResponse<ItemResponse>();
      request.setMethod("product.createItem");
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

   public BaseResponse<ItemResponse> execute(UpdateItemRequest request, String accessToken) throws IOException {
      BaseResponse<ItemResponse> response = new BaseResponse<ItemResponse>();
      request.setMethod("product.updateItem");
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

   public BaseResponse<String> execute(DeleteItemRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("product.deleteItem");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         String data = JSON.toJSONString(bodyMap.get("data"));
         response.setSuccessResponse(data);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetSpuResponse> execute(GetSpuRequest request, String accessToken) throws IOException {
      BaseResponse<GetSpuResponse> response = new BaseResponse<GetSpuResponse>();
      request.setMethod("product.getBasicSpu");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetSpuResponse getSpuResponse = (GetSpuResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetSpuResponse.class);
         response.setSuccessResponse(getSpuResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(UpdateItemPriceRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("product.updateItemPrice");
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

   public BaseResponse<String> execute(UpdateSpuImage request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("product.updateSpuImage");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("更新成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(UpdateVariantImage request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("product.updateVariantImage");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("更新成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ItemDetail> execute(CreateItemV3Request request, String accessToken) throws IOException {
      BaseResponse<ItemDetail> response = new BaseResponse<ItemDetail>();
      request.setMethod("product.createItemV2");
      request.addParameter(this, accessToken);
      String bodyString = Utils.objectMapper.writeValueAsString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ItemDetail itemDetail = (ItemDetail)Utils.objectMapper.readValue(Utils.objectMapper.writeValueAsString(bodyMap.get("data")), ItemDetail.class);
         response.setSuccessResponse(itemDetail);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ItemAndSkuDetail> execute(CreateItemAndSkuRequest request, String accessToken) throws IOException {
      BaseResponse<ItemAndSkuDetail> response = new BaseResponse<ItemAndSkuDetail>();
      request.setMethod("product.createItemAndSku");
      request.addParameter(this, accessToken);
      String bodyString = Utils.objectMapper.writeValueAsString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ItemAndSkuDetail itemDetail = (ItemAndSkuDetail)Utils.objectMapper.readValue(Utils.objectMapper.writeValueAsString(bodyMap.get("data")), ItemAndSkuDetail.class);
         response.setSuccessResponse(itemDetail);
         response.fillCodeAndMessage(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ItemAndSkuDetail> execute(UpdateItemAndSkuRequest request, String accessToken) throws IOException {
      BaseResponse<ItemAndSkuDetail> response = new BaseResponse<ItemAndSkuDetail>();
      request.setMethod("product.updateItemAndSku");
      request.addParameter(this, accessToken);
      String bodyString = Utils.objectMapper.writeValueAsString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ItemAndSkuDetail itemDetail = (ItemAndSkuDetail)Utils.objectMapper.readValue(Utils.objectMapper.writeValueAsString(bodyMap.get("data")), ItemAndSkuDetail.class);
         response.setSuccessResponse(itemDetail);
         response.fillCodeAndMessage(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<SkuDetail> execute(CreateSkuV3Request request, String accessToken) throws IOException {
      BaseResponse<SkuDetail> response = new BaseResponse<SkuDetail>();
      request.setMethod("product.createSkuV2");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         SkuDetail skuDetail = (SkuDetail)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), SkuDetail.class);
         response.setSuccessResponse(skuDetail);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<ItemDetail> execute(UpdateItemV3Request request, String accessToken) throws IOException {
      BaseResponse<ItemDetail> response = new BaseResponse<ItemDetail>();
      request.setMethod("product.updateItemV2");
      request.addParameter(this, accessToken);
      String bodyString = Utils.objectMapper.writeValueAsString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         ItemDetail itemDetail = (ItemDetail)Utils.objectMapper.readValue(Utils.objectMapper.writeValueAsString(bodyMap.get("data")), ItemDetail.class);
         response.setSuccessResponse(itemDetail);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<SkuDetail> execute(UpdateSkuV3Request request, String accessToken) throws IOException {
      BaseResponse<SkuDetail> response = new BaseResponse<SkuDetail>();
      request.setMethod("product.updateSkuV2");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         SkuDetail skuDetail = (SkuDetail)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), SkuDetail.class);
         response.setSuccessResponse(skuDetail);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(DeleteItemV3Request request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("product.deleteItemV2");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("删除item成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(DeleteSkuV3Request request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("product.deleteSkuV2");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("删除sku成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetDetailSkuListResponse> execute(GetDetailSkuRequest request, String accessToken) throws IOException {
      BaseResponse<GetDetailSkuListResponse> response = new BaseResponse<GetDetailSkuListResponse>();
      request.setMethod("product.getDetailSkuList");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetDetailSkuListResponse getDetailSkuListResponse = (GetDetailSkuListResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetDetailSkuListResponse.class);
         response.setSuccessResponse(getDetailSkuListResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetItemInfoResponse> execute(GetItemInfoRequest request, String accessToken) throws IOException {
      BaseResponse<GetItemInfoResponse> response = new BaseResponse<GetItemInfoResponse>();
      request.setMethod("product.getItemInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetItemInfoResponse getDetailSkuListResponse = (GetItemInfoResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetItemInfoResponse.class);
         response.setSuccessResponse(getDetailSkuListResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<SearchItemListResponse> execute(SearchItemListRequest request, String accessToken) throws IOException {
      BaseResponse<SearchItemListResponse> response = new BaseResponse<SearchItemListResponse>();
      request.setMethod("product.searchItemList");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         SearchItemListResponse searchItemListResponse = (SearchItemListResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), SearchItemListResponse.class);
         response.setSuccessResponse(searchItemListResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(UpdateSkuLogisticsPlanRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("product.updateSkuLogisticsPlan");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("更新成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(UpdateSkuPriceRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("product.updateSkuPrice");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("更新成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(UpdateSkuAvailableRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("product.updateSkuAvailable");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("更新成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<String> execute(UpdateItemImageRequest request, String accessToken) throws IOException {
      BaseResponse<String> response = new BaseResponse<String>();
      request.setMethod("product.updateItemImage");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse("更新成功");
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }
}
