package com.jd.open.api.sdk.request.user;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.user.UserRelatedRpcI18nServiceGetOpenIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UserRelatedRpcI18nServiceGetOpenIdRequest extends AbstractRequest implements JdRequest<UserRelatedRpcI18nServiceGetOpenIdResponse> {
   private String pin;

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public String getApiMethod() {
      return "jingdong.UserRelatedRpcI18nService.getOpenId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pin", this.pin);
      return JsonUtil.toJson(pmap);
   }

   public Class<UserRelatedRpcI18nServiceGetOpenIdResponse> getResponseClass() {
      return UserRelatedRpcI18nServiceGetOpenIdResponse.class;
   }
}
