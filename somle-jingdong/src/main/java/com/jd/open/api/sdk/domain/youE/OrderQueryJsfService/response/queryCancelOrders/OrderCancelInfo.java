package com.jd.open.api.sdk.domain.youE.OrderQueryJsfService.response.queryCancelOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderCancelInfo implements Serializable {
   private String cancelDate;
   private String orderNo;
   private String cancelReason;

   @JsonProperty("cancelDate")
   public void setCancelDate(String cancelDate) {
      this.cancelDate = cancelDate;
   }

   @JsonProperty("cancelDate")
   public String getCancelDate() {
      return this.cancelDate;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
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
