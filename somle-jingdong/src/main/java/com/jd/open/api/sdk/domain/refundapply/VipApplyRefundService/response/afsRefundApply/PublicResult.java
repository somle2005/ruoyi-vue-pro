package com.jd.open.api.sdk.domain.refundapply.VipApplyRefundService.response.afsRefundApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PublicResult implements Serializable {
   private Boolean result;
   private String errorCode;
   private String errorMsg;

   @JsonProperty("result")
   public void setResult(Boolean result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Boolean getResult() {
      return this.result;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
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
}
