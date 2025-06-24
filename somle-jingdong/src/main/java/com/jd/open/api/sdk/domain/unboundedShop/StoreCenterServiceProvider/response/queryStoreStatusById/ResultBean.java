package com.jd.open.api.sdk.domain.unboundedShop.StoreCenterServiceProvider.response.queryStoreStatusById;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultBean implements Serializable {
   private boolean success;
   private String message;
   private String jsonResult;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("jsonResult")
   public void setJsonResult(String jsonResult) {
      this.jsonResult = jsonResult;
   }

   @JsonProperty("jsonResult")
   public String getJsonResult() {
      return this.jsonResult;
   }
}
