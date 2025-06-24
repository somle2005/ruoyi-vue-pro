package com.jd.open.api.sdk.domain.neirong.ContentStatusJsfService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class ContentReleaseResult implements Serializable {
   private Map<String, String> result;
   private String code;
   private Boolean success;
   private String busiCode;
   private String message;

   @JsonProperty("result")
   public void setResult(Map<String, String> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Map<String, String> getResult() {
      return this.result;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
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

   @JsonProperty("busiCode")
   public void setBusiCode(String busiCode) {
      this.busiCode = busiCode;
   }

   @JsonProperty("busiCode")
   public String getBusiCode() {
      return this.busiCode;
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
