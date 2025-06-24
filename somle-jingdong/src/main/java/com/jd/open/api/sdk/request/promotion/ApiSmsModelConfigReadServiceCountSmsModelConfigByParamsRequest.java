package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.ApiSmsModelConfigReadServiceCountSmsModelConfigByParamsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ApiSmsModelConfigReadServiceCountSmsModelConfigByParamsRequest extends AbstractRequest implements JdRequest<ApiSmsModelConfigReadServiceCountSmsModelConfigByParamsResponse> {
   private Integer serveType;
   private String name;
   private Integer businessType;

   public void setServeType(Integer serveType) {
      this.serveType = serveType;
   }

   public Integer getServeType() {
      return this.serveType;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setBusinessType(Integer businessType) {
      this.businessType = businessType;
   }

   public Integer getBusinessType() {
      return this.businessType;
   }

   public String getApiMethod() {
      return "jingdong.api.SmsModelConfigReadService.countSmsModelConfigByParams";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("serveType", this.serveType);
      pmap.put("name", this.name);
      pmap.put("businessType", this.businessType);
      return JsonUtil.toJson(pmap);
   }

   public Class<ApiSmsModelConfigReadServiceCountSmsModelConfigByParamsResponse> getResponseClass() {
      return ApiSmsModelConfigReadServiceCountSmsModelConfigByParamsResponse.class;
   }
}
