package com.jd.open.api.sdk.domain.unboundedShop.StoreCenterServiceProvider.response.uploadFileUrl;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class ResultBean implements Serializable {
   private Map<String, String> result;
   private int code;
   private boolean success;
   private String message;
   private String jsonResult;

   @JsonProperty("result")
   public void setResult(Map<String, String> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Map<String, String> getResult() {
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

   @JsonProperty("jsonResult")
   public void setJsonResult(String jsonResult) {
      this.jsonResult = jsonResult;
   }

   @JsonProperty("jsonResult")
   public String getJsonResult() {
      return this.jsonResult;
   }
}
