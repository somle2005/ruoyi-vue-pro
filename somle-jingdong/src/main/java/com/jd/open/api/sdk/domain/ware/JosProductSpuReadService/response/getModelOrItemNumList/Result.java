package com.jd.open.api.sdk.domain.ware.JosProductSpuReadService.response.getModelOrItemNumList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private boolean success;
   private String errorMessage;
   private String errorCode;
   private Page obj;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorMessage")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   @JsonProperty("errorMessage")
   public String getErrorMessage() {
      return this.errorMessage;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("obj")
   public void setObj(Page obj) {
      this.obj = obj;
   }

   @JsonProperty("obj")
   public Page getObj() {
      return this.obj;
   }
}
