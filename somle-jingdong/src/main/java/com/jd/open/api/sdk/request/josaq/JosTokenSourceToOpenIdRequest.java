package com.jd.open.api.sdk.request.josaq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.josaq.JosTokenSourceToOpenIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosTokenSourceToOpenIdRequest extends AbstractRequest implements JdRequest<JosTokenSourceToOpenIdResponse> {
   private String token;
   private String source;
   private String appKey;

   public void setToken(String token) {
      this.token = token;
   }

   public String getToken() {
      return this.token;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public String getApiMethod() {
      return "jingdong.jos.token.source.to.openId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("token", this.token);
      pmap.put("source", this.source);
      pmap.put("appKey", this.appKey);
      return JsonUtil.toJson(pmap);
   }

   public Class<JosTokenSourceToOpenIdResponse> getResponseClass() {
      return JosTokenSourceToOpenIdResponse.class;
   }
}
