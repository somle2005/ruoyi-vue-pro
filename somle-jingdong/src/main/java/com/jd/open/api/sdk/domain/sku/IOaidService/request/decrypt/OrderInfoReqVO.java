package com.jd.open.api.sdk.domain.sku.IOaidService.request.decrypt;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderInfoReqVO implements Serializable {
   private Long orderId;
   private String oaid;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
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
