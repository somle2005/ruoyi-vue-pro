package com.jd.open.api.sdk.request.aqyzzx;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.aqyzzx.MfaInnerValidateMsgCodeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MfaInnerValidateMsgCodeRequest extends AbstractRequest implements JdRequest<MfaInnerValidateMsgCodeResponse> {
   private String msgCode;
   private String rKey;
   private Integer validateType;

   public void setMsgCode(String msgCode) {
      this.msgCode = msgCode;
   }

   public String getMsgCode() {
      return this.msgCode;
   }

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
      return "jingdong.mfa.inner.validateMsgCode";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("msgCode", this.msgCode);
      pmap.put("rKey", this.rKey);
      pmap.put("validateType", this.validateType);
      return JsonUtil.toJson(pmap);
   }

   public Class<MfaInnerValidateMsgCodeResponse> getResponseClass() {
      return MfaInnerValidateMsgCodeResponse.class;
   }
}
