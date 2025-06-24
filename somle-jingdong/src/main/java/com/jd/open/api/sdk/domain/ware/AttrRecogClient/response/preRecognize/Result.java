package com.jd.open.api.sdk.domain.ware.AttrRecogClient.response.preRecognize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String code;
   private boolean success;
   private String requestId;
   private String message;
   private RecogInfo data;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
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

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("data")
   public void setData(RecogInfo data) {
      this.data = data;
   }

   @JsonProperty("data")
   public RecogInfo getData() {
      return this.data;
   }
}
