package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.InitListRuleResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InitListRuleRequest extends AbstractRequest implements JdRequest<InitListRuleResponse> {
   private String appName;
   private String appId;

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

   public String getApiMethod() {
      return "jingdong.initListRule";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("appId", this.appId);
      return JsonUtil.toJson(pmap);
   }

   public Class<InitListRuleResponse> getResponseClass() {
      return InitListRuleResponse.class;
   }
}
