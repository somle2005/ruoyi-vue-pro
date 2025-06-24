package com.jd.open.api.sdk.domain.order.IOrderService.response.getmobilelist;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class ResponseData implements Serializable {
   private int code;
   private String message;
   private Map<String, OrderPrivacyModel> data;

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

   @JsonProperty("data")
   public void setData(Map<String, OrderPrivacyModel> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Map<String, OrderPrivacyModel> getData() {
      return this.data;
   }
}
