package com.jd.open.api.sdk.request.josaq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.josaq.JosOauthRpcXidOpenId2XidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosOauthRpcXidOpenId2XidRequest extends AbstractRequest implements JdRequest<JosOauthRpcXidOpenId2XidResponse> {
   private String appKey;
   private String openId;

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setOpenId(String openId) {
      this.openId = openId;
   }

   public String getOpenId() {
      return this.openId;
   }

   public String getApiMethod() {
      return "jingdong.jos.oauth.rpc.xid.openId2Xid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appKey", this.appKey);
      pmap.put("openId", this.openId);
      return JsonUtil.toJson(pmap);
   }

   public Class<JosOauthRpcXidOpenId2XidResponse> getResponseClass() {
      return JosOauthRpcXidOpenId2XidResponse.class;
   }
}
