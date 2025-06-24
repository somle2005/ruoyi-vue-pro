package com.jd.open.api.sdk.domain.etms.ServiceFrontCheckApi.response.check;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseDTO implements Serializable {
   private String errorMessage;
   private String errorCode;
   private String statusMessage;
   private Integer statusCode;
   private Object data;

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

   @JsonProperty("statusMessage")
   public void setStatusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
   }

   @JsonProperty("statusMessage")
   public String getStatusMessage() {
      return this.statusMessage;
   }

   @JsonProperty("statusCode")
   public void setStatusCode(Integer statusCode) {
      this.statusCode = statusCode;
   }

   @JsonProperty("statusCode")
   public Integer getStatusCode() {
      return this.statusCode;
   }

   @JsonProperty("data")
   public void setData(Object data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Object getData() {
      return this.data;
   }
}
