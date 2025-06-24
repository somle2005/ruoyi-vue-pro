package com.jd.open.api.sdk.domain.market.PaymentOutProvider.response.paymentout;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JmServiceResult implements Serializable {
   private int errorCode;
   private String errorMsg;
   private boolean success;
   private SubmitOrderOutResult body;

   @JsonProperty("errorCode")
   public void setErrorCode(int errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public int getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("body")
   public void setBody(SubmitOrderOutResult body) {
      this.body = body;
   }

   @JsonProperty("body")
   public SubmitOrderOutResult getBody() {
      return this.body;
   }
}
