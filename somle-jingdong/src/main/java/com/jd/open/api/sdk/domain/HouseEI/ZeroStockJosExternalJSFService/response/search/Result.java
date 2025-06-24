package com.jd.open.api.sdk.domain.HouseEI.ZeroStockJosExternalJSFService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private boolean success;
   private int errorCode;
   private String errorMessage;
   private AfsServiceStatusResponse content;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(int errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public int getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("errorMessage")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   @JsonProperty("errorMessage")
   public String getErrorMessage() {
      return this.errorMessage;
   }

   @JsonProperty("content")
   public void setContent(AfsServiceStatusResponse content) {
      this.content = content;
   }

   @JsonProperty("content")
   public AfsServiceStatusResponse getContent() {
      return this.content;
   }
}
