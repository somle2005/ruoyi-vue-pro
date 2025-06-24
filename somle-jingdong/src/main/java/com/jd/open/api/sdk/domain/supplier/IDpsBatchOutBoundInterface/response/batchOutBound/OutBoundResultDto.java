package com.jd.open.api.sdk.domain.supplier.IDpsBatchOutBoundInterface.response.batchOutBound;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OutBoundResultDto implements Serializable {
   private int status;
   private String message;
   private String errorCode;

   @JsonProperty("status")
   public void setStatus(int status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int getStatus() {
      return this.status;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }
}
