package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipCustomizedUserApiCheckBPinResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipCustomizedUserApiCheckBPinRequest extends AbstractRequest implements JdRequest<YipCustomizedUserApiCheckBPinResponse> {
   private String pin;

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public String getApiMethod() {
      return "jingdong.yip.customized.userApi.checkBPin";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pin", this.pin);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipCustomizedUserApiCheckBPinResponse> getResponseClass() {
      return YipCustomizedUserApiCheckBPinResponse.class;
   }
}
