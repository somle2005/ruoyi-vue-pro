package com.jd.open.api.sdk.domain.spgl.BatchPoJsfService.response.issue;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SrmWsResult implements Serializable {
   private int code;
   private Boolean success;
   private String message;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
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
