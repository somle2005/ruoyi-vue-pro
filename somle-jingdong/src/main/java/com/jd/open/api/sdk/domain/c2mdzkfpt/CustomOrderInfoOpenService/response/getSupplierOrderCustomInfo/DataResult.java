package com.jd.open.api.sdk.domain.c2mdzkfpt.CustomOrderInfoOpenService.response.getSupplierOrderCustomInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DataResult implements Serializable {
   private int code;
   private String message;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
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
}
