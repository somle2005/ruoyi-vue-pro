package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.SpuGetSpuCategoryRuleResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SpuGetSpuCategoryRuleRequest extends AbstractRequest implements JdRequest<SpuGetSpuCategoryRuleResponse> {
   private Long categoryId;
   private String appId;
   private String appName;
   private String ip;
   private String userAgent;

   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   public Long getCategoryId() {
      return this.categoryId;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
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
      return "jingdong.spu.getSpuCategoryRule";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("categoryId", this.categoryId);
      pmap.put("appId", this.appId);
      pmap.put("appName", this.appName);
      pmap.put("ip", this.ip);
      pmap.put("userAgent", this.userAgent);
      return JsonUtil.toJson(pmap);
   }

   public Class<SpuGetSpuCategoryRuleResponse> getResponseClass() {
      return SpuGetSpuCategoryRuleResponse.class;
   }
}
