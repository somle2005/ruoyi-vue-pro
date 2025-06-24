package com.jd.open.api.sdk.domain.order.OutShipJosService.response.outship;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OutShipFailDto implements Serializable {
   private Integer code;
   private Long orderId;
   private String failReason;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("failReason")
   public void setFailReason(String failReason) {
      this.failReason = failReason;
   }

   @JsonProperty("failReason")
   public String getFailReason() {
      return this.failReason;
   }
}
