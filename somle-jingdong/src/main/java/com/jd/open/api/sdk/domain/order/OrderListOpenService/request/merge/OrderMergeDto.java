package com.jd.open.api.sdk.domain.order.OrderListOpenService.request.merge;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderMergeDto implements Serializable {
   private String orderId;
   private String oaid;

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }
}
