package com.jd.open.api.sdk.request.im;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.im.RiskSensitiveWordCheckResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class RiskSensitiveWordCheckRequest extends AbstractRequest implements JdRequest<RiskSensitiveWordCheckResponse> {
   private String appId;
   private String clientType;
   private String content;
   private String scope;

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setClientType(String clientType) {
      this.clientType = clientType;
   }

   public String getClientType() {
      return this.clientType;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getContent() {
      return this.content;
   }

   public void setScope(String scope) {
      this.scope = scope;
   }

   public String getScope() {
      return this.scope;
   }

   public String getApiMethod() {
      return "jingdong.risk.sensitiveWordCheck";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("clientType", this.clientType);
      pmap.put("content", this.content);
      pmap.put("scope", this.scope);
      return JsonUtil.toJson(pmap);
   }

   public Class<RiskSensitiveWordCheckResponse> getResponseClass() {
      return RiskSensitiveWordCheckResponse.class;
   }
}
