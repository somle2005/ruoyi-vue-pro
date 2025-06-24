package com.xiaohongshu.fls.opensdk.client;

import com.alibaba.fastjson.JSON;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.common.request.BatchGetDeliveryRuleRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.CategoryMatchRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.CategoryMatchV2Request;
import com.xiaohongshu.fls.opensdk.entity.common.request.CheckForbiddenKeywordRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetAttributeListRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetAttributeValuesRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetBrandRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetCarriageTemplateListRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetCarriageTemplateRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetCategoriesRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetExpressCompanyListRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetLogisticsListRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetLogisticsModeRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetNestZoneRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetSellerAddressRecordBySellerIdRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetSellerKeyInfoRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetVariationsRequest;
import com.xiaohongshu.fls.opensdk.entity.common.request.GetZonesRequest;
import com.xiaohongshu.fls.opensdk.entity.common.response.CarriageTemplate;
import com.xiaohongshu.fls.opensdk.entity.common.response.CategoryMatchResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.CategoryMatchV2Response;
import com.xiaohongshu.fls.opensdk.entity.common.response.CheckForbiddenKeywordResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.GetAttributeListResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.GetAttributeValuesResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.GetBrandResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.GetCarriageTemplateListResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.GetCategoriseResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.GetDeliveryRuleResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.GetExpressCompanyListResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.GetLogisticsListResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.GetLogisticsModeResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.GetNestZoneResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.GetSellerKeyInfoResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.GetVariationsResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.SellerAddressRecordListResponse;
import com.xiaohongshu.fls.opensdk.entity.common.response.ZoneInfo;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class CommonClient extends BaseClient {
   public CommonClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse<GetCategoriseResponse> execute(GetCategoriesRequest request, String accessToken) throws IOException {
      BaseResponse<GetCategoriseResponse> response = new BaseResponse<GetCategoriseResponse>();
      request.setMethod("common.getCategories");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetCategoriseResponse categoryListV3 = (GetCategoriseResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetCategoriseResponse.class);
         response.setSuccessResponse(categoryListV3);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetAttributeValuesResponse> execute(GetAttributeValuesRequest request, String accessToken) throws IOException {
      BaseResponse<GetAttributeValuesResponse> response = new BaseResponse<GetAttributeValuesResponse>();
      request.setMethod("common.getAttributeValues");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetAttributeValuesResponse getAttributeValuesResponse = (GetAttributeValuesResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetAttributeValuesResponse.class);
         response.setSuccessResponse(getAttributeValuesResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetAttributeListResponse> execute(GetAttributeListRequest request, String accessToken) throws IOException {
      BaseResponse<GetAttributeListResponse> response = new BaseResponse<GetAttributeListResponse>();
      request.setMethod("common.getAttributeLists");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetAttributeListResponse getAttributeListResponse = (GetAttributeListResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetAttributeListResponse.class);
         response.setSuccessResponse(getAttributeListResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetVariationsResponse> execute(GetVariationsRequest request, String accessToken) throws IOException {
      BaseResponse<GetVariationsResponse> response = new BaseResponse<GetVariationsResponse>();
      request.setMethod("common.getVariations");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetVariationsResponse getVariationsResponse = (GetVariationsResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetVariationsResponse.class);
         response.setSuccessResponse(getVariationsResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetExpressCompanyListResponse> execute(GetExpressCompanyListRequest request, String accessToken) throws IOException {
      BaseResponse<GetExpressCompanyListResponse> response = new BaseResponse<GetExpressCompanyListResponse>();
      request.setMethod("common.getExpressCompanyList");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         String x = JSON.toJSONString(bodyMap.get("data"));
         GetExpressCompanyListResponse getExpressCompanyResponse = (GetExpressCompanyListResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetExpressCompanyListResponse.class);
         response.setSuccessResponse(getExpressCompanyResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetLogisticsListResponse> execute(GetLogisticsListRequest request, String accessToken) throws IOException {
      BaseResponse<GetLogisticsListResponse> response = new BaseResponse<GetLogisticsListResponse>();
      request.setMethod("common.getLogisticsList");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetLogisticsListResponse getLogisticsPlanListResponse = (GetLogisticsListResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetLogisticsListResponse.class);
         response.setSuccessResponse(getLogisticsPlanListResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetCarriageTemplateListResponse> execute(GetCarriageTemplateListRequest request, String accessToken) throws IOException {
      BaseResponse<GetCarriageTemplateListResponse> response = new BaseResponse<GetCarriageTemplateListResponse>();
      request.setMethod("common.getCarriageTemplateList");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetCarriageTemplateListResponse getCarriageTemplateListResponse = (GetCarriageTemplateListResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetCarriageTemplateListResponse.class);
         response.setSuccessResponse(getCarriageTemplateListResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<CarriageTemplate> execute(GetCarriageTemplateRequest request, String accessToken) throws IOException {
      BaseResponse<CarriageTemplate> response = new BaseResponse<CarriageTemplate>();
      request.setMethod("common.getCarriageTemplate");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         CarriageTemplate carriageTemplate = (CarriageTemplate)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), CarriageTemplate.class);
         response.setSuccessResponse(carriageTemplate);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetBrandResponse> execute(GetBrandRequest request, String accessToken) throws IOException {
      BaseResponse<GetBrandResponse> response = new BaseResponse<GetBrandResponse>();
      request.setMethod("common.brandSearch");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetBrandResponse getBrandResponse = (GetBrandResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetBrandResponse.class);
         response.setSuccessResponse(getBrandResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetLogisticsModeResponse> execute(GetLogisticsModeRequest request, String accessToken) throws IOException {
      BaseResponse<GetLogisticsModeResponse> response = new BaseResponse<GetLogisticsModeResponse>();
      request.setMethod("common.logisticsMode");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetLogisticsModeResponse getLogisticsModeResponse = (GetLogisticsModeResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetLogisticsModeResponse.class);
         response.setSuccessResponse(getLogisticsModeResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetSellerKeyInfoResponse> execute(GetSellerKeyInfoRequest request, String accessToken) throws IOException {
      BaseResponse<GetSellerKeyInfoResponse> response = new BaseResponse<GetSellerKeyInfoResponse>();
      request.setMethod("common.getSellerKeyInfo");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetSellerKeyInfoResponse getSellerKeyInfoResponse = (GetSellerKeyInfoResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetSellerKeyInfoResponse.class);
         response.setSuccessResponse(getSellerKeyInfoResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetNestZoneResponse> execute(GetNestZoneRequest request, String accessToken) throws IOException {
      BaseResponse<GetNestZoneResponse> response = new BaseResponse<GetNestZoneResponse>();
      request.setMethod("common.getNestZone");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetNestZoneResponse getNestZoneResponse = (GetNestZoneResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetNestZoneResponse.class);
         response.setSuccessResponse(getNestZoneResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<CategoryMatchResponse> execute(CategoryMatchRequest request, String accessToken) throws IOException {
      BaseResponse<CategoryMatchResponse> response = new BaseResponse<CategoryMatchResponse>();
      request.setMethod("common.categoryMatch");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         CategoryMatchResponse categoryMatchResponse = (CategoryMatchResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), CategoryMatchResponse.class);
         response.setSuccessResponse(categoryMatchResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<GetDeliveryRuleResponse> execute(BatchGetDeliveryRuleRequest request, String accessToken) throws IOException {
      BaseResponse<GetDeliveryRuleResponse> response = new BaseResponse<GetDeliveryRuleResponse>();
      request.setMethod("common.getDeliveryRule");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetDeliveryRuleResponse getDeliveryRuleResponse = (GetDeliveryRuleResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetDeliveryRuleResponse.class);
         response.setSuccessResponse(getDeliveryRuleResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<SellerAddressRecordListResponse> execute(GetSellerAddressRecordBySellerIdRequest request, String accessToken) throws IOException {
      BaseResponse<SellerAddressRecordListResponse> response = new BaseResponse<SellerAddressRecordListResponse>();
      request.setMethod("common.getAddressRecord");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         SellerAddressRecordListResponse sellerAddressRecordListResponse = (SellerAddressRecordListResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), SellerAddressRecordListResponse.class);
         response.setSuccessResponse(sellerAddressRecordListResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<List<ZoneInfo>> execute(GetZonesRequest request, String accessToken) throws IOException {
      BaseResponse<List<ZoneInfo>> response = new BaseResponse<List<ZoneInfo>>();
      request.setMethod("common.getZones");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         List<ZoneInfo> getZonesResponse = JSON.parseArray(JSON.toJSONString(bodyMap.get("data")), ZoneInfo.class);
         response.setSuccessResponse(getZonesResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<CategoryMatchV2Response> execute(CategoryMatchV2Request request, String accessToken) throws IOException {
      BaseResponse<CategoryMatchV2Response> response = new BaseResponse<CategoryMatchV2Response>();
      request.setMethod("common.categoryMatchV2");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         CategoryMatchV2Response res = (CategoryMatchV2Response)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), CategoryMatchV2Response.class);
         response.setSuccessResponse(res);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<CheckForbiddenKeywordResponse> execute(CheckForbiddenKeywordRequest request, String accessToken) throws IOException {
      BaseResponse<CheckForbiddenKeywordResponse> response = new BaseResponse<CheckForbiddenKeywordResponse>();
      request.setMethod("common.checkForbiddenKeyword");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         CheckForbiddenKeywordResponse res = (CheckForbiddenKeywordResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), CheckForbiddenKeywordResponse.class);
         response.setSuccessResponse(res);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }
}
