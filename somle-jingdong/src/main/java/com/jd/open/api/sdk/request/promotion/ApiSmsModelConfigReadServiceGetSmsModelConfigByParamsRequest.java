package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.ApiSmsModelConfigReadServiceGetSmsModelConfigByParamsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ApiSmsModelConfigReadServiceGetSmsModelConfigByParamsRequest extends AbstractRequest implements JdRequest<ApiSmsModelConfigReadServiceGetSmsModelConfigByParamsResponse> {
   private int pageNumber;
   private Integer serveType;
   private int pageSize;
   private Integer businessType;
   private String name;

   public void setPageNumber(int pageNumber) {
      this.pageNumber = pageNumber;
   }

   public int getPageNumber() {
      return this.pageNumber;
   }

   public void setServeType(Integer serveType) {
      this.serveType = serveType;
   }

   public Integer getServeType() {
      return this.serveType;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setBusinessType(Integer businessType) {
      this.businessType = businessType;
   }

   public Integer getBusinessType() {
      return this.businessType;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public String getApiMethod() {
      return "jingdong.api.SmsModelConfigReadService.getSmsModelConfigByParams";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageNumber", this.pageNumber);
      pmap.put("serveType", this.serveType);
      pmap.put("pageSize", this.pageSize);
      pmap.put("businessType", this.businessType);
      pmap.put("name", this.name);
      return JsonUtil.toJson(pmap);
   }

   public Class<ApiSmsModelConfigReadServiceGetSmsModelConfigByParamsResponse> getResponseClass() {
      return ApiSmsModelConfigReadServiceGetSmsModelConfigByParamsResponse.class;
   }
}
