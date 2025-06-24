package com.jd.open.api.sdk.request.user;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.user.PopJmCenterUserGetEncryptPinNewResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopJmCenterUserGetEncryptPinNewRequest extends AbstractRequest implements JdRequest<PopJmCenterUserGetEncryptPinNewResponse> {
   private String source;
   private String token;

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public void setToken(String token) {
      this.token = token;
   }

   public String getToken() {
      return this.token;
   }

   public String getApiMethod() {
      return "jingdong.pop.jm.center.user.getEncryptPinNew";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("source", this.source);
      pmap.put("token", this.token);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopJmCenterUserGetEncryptPinNewResponse> getResponseClass() {
      return PopJmCenterUserGetEncryptPinNewResponse.class;
   }
}
