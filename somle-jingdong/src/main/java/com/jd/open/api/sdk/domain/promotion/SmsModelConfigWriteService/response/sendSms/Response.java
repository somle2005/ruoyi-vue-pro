package com.jd.open.api.sdk.domain.promotion.SmsModelConfigWriteService.response.sendSms;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Response implements Serializable {
   private Long code;
   private String message;
   private Boolean data;

   @JsonProperty("code")
   public void setCode(Long code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Long getCode() {
      return this.code;
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
   public void setData(Boolean data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Boolean getData() {
      return this.data;
   }
}
