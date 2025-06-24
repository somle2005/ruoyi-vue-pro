package com.jd.open.api.sdk.request.josaq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.josaq.JosOauthRpcXidMixPin2XidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosOauthRpcXidMixPin2XidRequest extends AbstractRequest implements JdRequest<JosOauthRpcXidMixPin2XidResponse> {
   private String appKey;
   private String mixPin;

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setMixPin(String mixPin) {
      this.mixPin = mixPin;
   }

   public String getMixPin() {
      return this.mixPin;
   }

   public String getApiMethod() {
      return "jingdong.jos.oauth.rpc.xid.mixPin2Xid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appKey", this.appKey);
      pmap.put("mixPin", this.mixPin);
      return JsonUtil.toJson(pmap);
   }

   public Class<JosOauthRpcXidMixPin2XidResponse> getResponseClass() {
      return JosOauthRpcXidMixPin2XidResponse.class;
   }
}
