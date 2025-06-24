package com.jd.open.api.sdk.domain.jialilue.RefundWriteProvider.response.sync;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RefundResponse implements Serializable {
   private Boolean success;
   private String resultCode;
   private String message;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
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

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }
}
