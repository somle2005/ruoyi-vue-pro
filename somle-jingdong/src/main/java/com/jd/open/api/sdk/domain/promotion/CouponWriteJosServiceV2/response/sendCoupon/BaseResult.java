package com.jd.open.api.sdk.domain.promotion.CouponWriteJosServiceV2.response.sendCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BaseResult implements Serializable {
   private boolean success;
   private String resultCode;
   private String resultMsg;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }
}
