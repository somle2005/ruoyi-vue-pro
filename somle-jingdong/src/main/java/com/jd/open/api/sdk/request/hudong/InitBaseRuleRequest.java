package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.InitBaseRuleResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InitBaseRuleRequest extends AbstractRequest implements JdRequest<InitBaseRuleResponse> {
   private String appName;
   private String appId;
   private Long venderId;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   public Long getVenderId() {
      return this.venderId;
   }

   public String getApiMethod() {
      return "jingdong.initBaseRule";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("appId", this.appId);
      pmap.put("venderId", this.venderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<InitBaseRuleResponse> getResponseClass() {
      return InitBaseRuleResponse.class;
   }
}
