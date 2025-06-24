package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.SpuSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SpuSearchRequest extends AbstractRequest implements JdRequest<SpuSearchResponse> {
   private String categoryId;
   private String uniqueCode;
   private Integer pageNo;
   private Integer pageSize;
   private String brandId;
   private String appName;
   private String ip;
   private String userAgent;
   private String key;
   private String value;

   public void setCategoryId(String categoryId) {
      this.categoryId = categoryId;
   }

   public String getCategoryId() {
      return this.categoryId;
   }

   public void setUniqueCode(String uniqueCode) {
      this.uniqueCode = uniqueCode;
   }

   public String getUniqueCode() {
      return this.uniqueCode;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setBrandId(String brandId) {
      this.brandId = brandId;
   }

   public String getBrandId() {
      return this.brandId;
   }

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setUserAgent(String userAgent) {
      this.userAgent = userAgent;
   }

   public String getUserAgent() {
      return this.userAgent;
   }

   public void setKey(String key) {
      this.key = key;
   }

   public String getKey() {
      return this.key;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public String getValue() {
      return this.value;
   }

   public String getApiMethod() {
      return "jingdong.spu.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("categoryId", this.categoryId);
      pmap.put("uniqueCode", this.uniqueCode);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("brandId", this.brandId);
      pmap.put("appName", this.appName);
      pmap.put("ip", this.ip);
      pmap.put("userAgent", this.userAgent);
      pmap.put("key", this.key);
      pmap.put("value", this.value);
      return JsonUtil.toJson(pmap);
   }

   public Class<SpuSearchResponse> getResponseClass() {
      return SpuSearchResponse.class;
   }
}
