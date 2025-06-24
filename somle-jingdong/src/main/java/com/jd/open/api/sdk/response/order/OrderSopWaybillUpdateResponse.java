package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderSopWaybillUpdateResponse extends AbstractResponse {
   private static final long serialVersionUID = 964142943587456455L;
   private String venderId;
   private String modified;
   private long orderId;

   public OrderSopWaybillUpdateResponse() {
   }

   public OrderSopWaybillUpdateResponse(String venderId, long orderId) {
      this.venderId = venderId;
      this.orderId = orderId;
   }

   @JsonProperty("order_id")
   public long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("order_id")
   public void setOrderId(long orderId) {
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
}
