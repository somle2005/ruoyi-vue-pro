package com.jd.open.api.sdk.domain.supplier.OrderCustomInfoGetterJos.response.getOrderCustomeInfos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DataResult implements Serializable {
   private int code;
   private String message;
   private Object result;

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

   @JsonProperty("result")
   public void setResult(Object result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Object getResult() {
      return this.result;
   }
}
