package com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SubsidyAuditDto implements Serializable {
   private Long orderId;
   private boolean receiveStatus;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("receiveStatus")
   public void setReceiveStatus(boolean receiveStatus) {
      this.receiveStatus = receiveStatus;
   }

   @JsonProperty("receiveStatus")
   public boolean getReceiveStatus() {
      return this.receiveStatus;
   }
}
