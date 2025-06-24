package com.jd.open.api.sdk.domain.unboundedShop.StoreCenterServiceProvider.response.submitStoreOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class ResultBean implements Serializable {
   private Map<String, Object> result;
   private int code;
   private boolean success;
   private String message;

   @JsonProperty("result")
   public void setResult(Map<String, Object> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Map<String, Object> getResult() {
      return this.result;
   }

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

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
}
