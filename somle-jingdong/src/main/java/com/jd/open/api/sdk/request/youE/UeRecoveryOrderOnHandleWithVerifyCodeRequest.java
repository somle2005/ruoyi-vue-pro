package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOrderOnHandleWithVerifyCodeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOrderOnHandleWithVerifyCodeRequest extends AbstractRequest implements JdRequest<UeRecoveryOrderOnHandleWithVerifyCodeResponse> {
   private String code;
   private String appid;
   private String verifyCode;
   private String orderNo;

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setVerifyCode(String verifyCode) {
      this.verifyCode = verifyCode;
   }

   public String getVerifyCode() {
      return this.verifyCode;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.order.onHandleWithVerifyCode";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("code", this.code);
      pmap.put("appid", this.appid);
      pmap.put("verifyCode", this.verifyCode);
      pmap.put("orderNo", this.orderNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOrderOnHandleWithVerifyCodeResponse> getResponseClass() {
      return UeRecoveryOrderOnHandleWithVerifyCodeResponse.class;
   }
}
