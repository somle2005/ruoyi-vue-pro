package com.jd.open.api.sdk.domain.youE.OrderBookedPickUpExportService.request.bookPickUp;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BookPickUpParam implements Serializable {
   private String orderNo;
   private String pickUpTime;
   private String remark;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("pickUpTime")
   public void setPickUpTime(String pickUpTime) {
      this.pickUpTime = pickUpTime;
   }

   @JsonProperty("pickUpTime")
   public String getPickUpTime() {
      return this.pickUpTime;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }
}
