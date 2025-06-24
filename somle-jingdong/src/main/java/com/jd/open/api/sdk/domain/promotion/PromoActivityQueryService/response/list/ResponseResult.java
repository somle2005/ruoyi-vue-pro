package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseResult implements Serializable {
   private boolean success;
   private String errorCode;
   private String subErrorCode;
   private String errorMessage;

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

   @JsonProperty("subErrorCode")
   public void setSubErrorCode(String subErrorCode) {
      this.subErrorCode = subErrorCode;
   }

   @JsonProperty("subErrorCode")
   public String getSubErrorCode() {
      return this.subErrorCode;
   }

   @JsonProperty("errorMessage")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   @JsonProperty("errorMessage")
   public String getErrorMessage() {
      return this.errorMessage;
   }
}
