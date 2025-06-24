package com.jd.open.api.sdk.domain.website.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderCreateResult {
   private Long orderId;
   private String message;
   private boolean flag;

   @JsonProperty("order_id")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("order_id")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("flag")
   public boolean isFlag() {
      return this.flag;
   }

   @JsonProperty("flag")
   public void setFlag(boolean flag) {
      this.flag = flag;
   }
}
