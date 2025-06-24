package com.jd.open.api.sdk.domain.promotion.TokenManageService.response.del;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RespResult implements Serializable {
   private boolean success;
   private String errorCode;
   private String errorMsg;
   private HashMap result;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
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

   @JsonProperty("result")
   public void setResult(HashMap result) {
      this.result = result;
   }

   @JsonProperty("result")
   public HashMap getResult() {
      return this.result;
   }
}
