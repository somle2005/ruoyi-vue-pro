package com.jd.open.api.sdk.request.aqyzzx;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.aqyzzx.MfaInnerSendCodeToMobileResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MfaInnerSendCodeToMobileRequest extends AbstractRequest implements JdRequest<MfaInnerSendCodeToMobileResponse> {
   private String rKey;
   private Integer validateType;

   public void setRKey(String rKey) {
      this.rKey = rKey;
   }

   public String getRKey() {
      return this.rKey;
   }

   public void setValidateType(Integer validateType) {
      this.validateType = validateType;
   }

   public Integer getValidateType() {
      return this.validateType;
   }

   public String getApiMethod() {
      return "jingdong.mfa.inner.sendCodeToMobile";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("rKey", this.rKey);
      pmap.put("validateType", this.validateType);
      return JsonUtil.toJson(pmap);
   }

   public Class<MfaInnerSendCodeToMobileResponse> getResponseClass() {
      return MfaInnerSendCodeToMobileResponse.class;
   }
}
