package com.jd.open.api.sdk.domain.youE.OrderCancelExportService.request.orderCancel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CancelOrder implements Serializable {
   private String orderNo;
   private Integer cancelType;
   private String cancelReason;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("cancelType")
   public void setCancelType(Integer cancelType) {
      this.cancelType = cancelType;
   }

   @JsonProperty("cancelType")
   public Integer getCancelType() {
      return this.cancelType;
   }

   @JsonProperty("cancelReason")
   public void setCancelReason(String cancelReason) {
      this.cancelReason = cancelReason;
   }

   @JsonProperty("cancelReason")
   public String getCancelReason() {
      return this.cancelReason;
   }
}
