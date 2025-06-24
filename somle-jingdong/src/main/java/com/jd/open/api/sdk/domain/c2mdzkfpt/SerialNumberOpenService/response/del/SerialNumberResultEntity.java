package com.jd.open.api.sdk.domain.c2mdzkfpt.SerialNumberOpenService.response.del;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SerialNumberResultEntity implements Serializable {
   private Boolean success;
   private String errorCode;
   private String errorMsg;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
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
