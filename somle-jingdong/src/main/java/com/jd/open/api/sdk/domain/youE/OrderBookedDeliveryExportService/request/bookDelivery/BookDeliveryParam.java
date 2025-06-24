package com.jd.open.api.sdk.domain.youE.OrderBookedDeliveryExportService.request.bookDelivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BookDeliveryParam implements Serializable {
   private String orderNo;
   private String deliveryTime;
   private String remark;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("deliveryTime")
   public void setDeliveryTime(String deliveryTime) {
      this.deliveryTime = deliveryTime;
   }

   @JsonProperty("deliveryTime")
   public String getDeliveryTime() {
      return this.deliveryTime;
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
