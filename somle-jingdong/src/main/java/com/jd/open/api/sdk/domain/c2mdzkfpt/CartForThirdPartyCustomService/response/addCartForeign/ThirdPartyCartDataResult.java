package com.jd.open.api.sdk.domain.c2mdzkfpt.CartForThirdPartyCustomService.response.addCartForeign;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ThirdPartyCartDataResult implements Serializable {
   private String message;
   private String code;
   private Boolean success;
   private Object data;

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
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

   @JsonProperty("data")
   public void setData(Object data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Object getData() {
      return this.data;
   }
}
