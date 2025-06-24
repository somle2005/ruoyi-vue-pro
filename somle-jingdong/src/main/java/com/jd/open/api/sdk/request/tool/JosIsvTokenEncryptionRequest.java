package com.jd.open.api.sdk.request.tool;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.tool.JosIsvTokenEncryptionResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosIsvTokenEncryptionRequest extends AbstractRequest implements JdRequest<JosIsvTokenEncryptionResponse> {
   private String tokenStr;

   public void setTokenStr(String tokenStr) {
      this.tokenStr = tokenStr;
   }

   public String getTokenStr() {
      return this.tokenStr;
   }

   public String getApiMethod() {
      return "jingdong.jos.isv.token.encryption";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("tokenStr", this.tokenStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<JosIsvTokenEncryptionResponse> getResponseClass() {
      return JosIsvTokenEncryptionResponse.class;
   }
}
