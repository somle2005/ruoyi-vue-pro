package com.jd.open.api.sdk.domain.supplier.PoBackForJosWebService.response.confirmpurchaseorder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BaseResult implements Serializable {
   private boolean success;
   private String resultCode;
   private String resultMessage;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("result_code")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("result_code")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("result_message")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("result_message")
   public String getResultMessage() {
      return this.resultMessage;
   }
}
