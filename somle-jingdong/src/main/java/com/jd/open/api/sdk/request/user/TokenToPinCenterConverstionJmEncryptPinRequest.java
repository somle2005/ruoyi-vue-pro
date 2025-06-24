package com.jd.open.api.sdk.request.user;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.user.TokenToPinCenterConverstionJmEncryptPinResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class TokenToPinCenterConverstionJmEncryptPinRequest extends AbstractRequest implements JdRequest<TokenToPinCenterConverstionJmEncryptPinResponse> {
   private String encryptPin;
   private String appKey;

   public void setEncryptPin(String encryptPin) {
      this.encryptPin = encryptPin;
   }

   public String getEncryptPin() {
      return this.encryptPin;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public String getApiMethod() {
      return "jingdong.TokenToPinCenter.converstionJmEncryptPin";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("encryptPin", this.encryptPin);
      pmap.put("appKey", this.appKey);
      return JsonUtil.toJson(pmap);
   }

   public Class<TokenToPinCenterConverstionJmEncryptPinResponse> getResponseClass() {
      return TokenToPinCenterConverstionJmEncryptPinResponse.class;
   }
}
