package com.jd.open.api.sdk.domain.refundapply.OrderAdjustService.response.OrderAdjustService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AdjustResultDto implements Serializable {
   private Long orderId;
   private Long requestId;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("requestId")
   public void setRequestId(Long requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public Long getRequestId() {
      return this.requestId;
   }
}
