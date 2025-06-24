package com.jd.open.api.sdk.domain.youE.OrderNoFinishExportService.request.noFinishOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NoFinishOrder implements Serializable {
   private String reason;
   private String orderNo;
   private String bookedOrderTime;

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("bookedOrderTime")
   public void setBookedOrderTime(String bookedOrderTime) {
      this.bookedOrderTime = bookedOrderTime;
   }

   @JsonProperty("bookedOrderTime")
   public String getBookedOrderTime() {
      return this.bookedOrderTime;
   }
}
