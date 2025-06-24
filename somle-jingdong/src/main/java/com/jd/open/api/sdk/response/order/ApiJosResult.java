package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ApiJosResult implements Serializable {
   private boolean success;
   private String resultCode;
   private String resultDescribe;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("result_code")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("result_code")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("result_describe")
   public void setResultDescribe(String resultDescribe) {
      this.resultDescribe = resultDescribe;
   }

   @JsonProperty("result_describe")
   public String getResultDescribe() {
      return this.resultDescribe;
   }
}
