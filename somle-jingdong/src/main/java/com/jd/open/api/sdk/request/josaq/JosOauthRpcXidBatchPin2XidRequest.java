package com.jd.open.api.sdk.request.josaq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.josaq.JosOauthRpcXidBatchPin2XidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosOauthRpcXidBatchPin2XidRequest extends AbstractRequest implements JdRequest<JosOauthRpcXidBatchPin2XidResponse> {
   private String appKey;
   private String userPin;

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   public String getUserPin() {
      return this.userPin;
   }

   public String getApiMethod() {
      return "jingdong.jos.oauth.rpc.xid.batchPin2Xid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appKey", this.appKey);
      pmap.put("userPin", this.userPin);
      return JsonUtil.toJson(pmap);
   }

   public Class<JosOauthRpcXidBatchPin2XidResponse> getResponseClass() {
      return JosOauthRpcXidBatchPin2XidResponse.class;
   }
}
