package com.jd.open.api.sdk.domain.neirong.ContentWriteService.response.getVideoUploadUrl;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JsfResult implements Serializable {
   private String code;
   private Boolean success;
   private String busiCode;
   private String message;
   private VideoUploadResponse result;

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

   @JsonProperty("result")
   public void setResult(VideoUploadResponse result) {
      this.result = result;
   }

   @JsonProperty("result")
   public VideoUploadResponse getResult() {
      return this.result;
   }
}
