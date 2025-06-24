package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.SpuGetModelOrItemNumListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SpuGetModelOrItemNumListRequest extends AbstractRequest implements JdRequest<SpuGetModelOrItemNumListResponse> {
   private Integer uniqueCodeType;
   private String categoryId;
   private Integer pageNo;
   private Integer pageSize;
   private String brandId;
   private String appName;
   private String ip;
   private String userAgent;

   public void setUniqueCodeType(Integer uniqueCodeType) {
      this.uniqueCodeType = uniqueCodeType;
   }

   public Integer getUniqueCodeType() {
      return this.uniqueCodeType;
   }

   public void setCategoryId(String categoryId) {
      this.categoryId = categoryId;
   }

   public String getCategoryId() {
      return this.categoryId;
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

   public String getApiMethod() {
      return "jingdong.spu.getModelOrItemNumList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("uniqueCodeType", this.uniqueCodeType);
      pmap.put("categoryId", this.categoryId);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("brandId", this.brandId);
      pmap.put("appName", this.appName);
      pmap.put("ip", this.ip);
      pmap.put("userAgent", this.userAgent);
      return JsonUtil.toJson(pmap);
   }

   public Class<SpuGetModelOrItemNumListResponse> getResponseClass() {
      return SpuGetModelOrItemNumListResponse.class;
   }
}
