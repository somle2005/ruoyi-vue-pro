package com.jd.open.api.sdk.domain.order.SendPromiseTemplateJsfService.response.querySendTemplateByCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Response implements Serializable {
   private String code;
   private boolean success;
   private String message;
   private CategorySendPromiseDto bizResponse;

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

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("bizResponse")
   public void setBizResponse(CategorySendPromiseDto bizResponse) {
      this.bizResponse = bizResponse;
   }

   @JsonProperty("bizResponse")
   public CategorySendPromiseDto getBizResponse() {
      return this.bizResponse;
   }
}
