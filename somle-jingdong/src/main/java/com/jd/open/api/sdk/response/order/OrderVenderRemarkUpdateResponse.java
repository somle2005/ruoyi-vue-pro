package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderVenderRemarkUpdateResponse extends AbstractResponse {
   private String venderId;
   private String modified;
   private String orderId;

   public OrderVenderRemarkUpdateResponse() {
   }

   public OrderVenderRemarkUpdateResponse(String venderId, String orderId) {
      this.venderId = venderId;
      this.orderId = orderId;
   }

   @JsonProperty("vender_id")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("order_id")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("order_id")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }
}
