package com.jd.open.api.sdk.request.josaq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.josaq.JosOauthRpcXidPin2XidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosOauthRpcXidPin2XidRequest extends AbstractRequest implements JdRequest<JosOauthRpcXidPin2XidResponse> {
   private String userPin;
   private String appKey;

   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   public String getUserPin() {
      return this.userPin;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public String getApiMethod() {
      return "jingdong.jos.oauth.rpc.xid.pin2Xid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("userPin", this.userPin);
      pmap.put("appKey", this.appKey);
      return JsonUtil.toJson(pmap);
   }

   public Class<JosOauthRpcXidPin2XidResponse> getResponseClass() {
      return JosOauthRpcXidPin2XidResponse.class;
   }
}
