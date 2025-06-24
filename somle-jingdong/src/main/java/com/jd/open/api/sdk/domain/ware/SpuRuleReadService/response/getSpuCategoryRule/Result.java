package com.jd.open.api.sdk.domain.ware.SpuRuleReadService.response.getSpuCategoryRule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String errorMessage;
   private String errorCode;
   private boolean success;
   private SpuCategoryRule obj;

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

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("obj")
   public void setObj(SpuCategoryRule obj) {
      this.obj = obj;
   }

   @JsonProperty("obj")
   public SpuCategoryRule getObj() {
      return this.obj;
   }
}
