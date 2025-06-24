package com.jd.open.api.sdk.domain.youE.OrderQueryJsfService.response.queryChangeBookDateOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderChangeBookDateInfo implements Serializable {
   private String orderNo;
   private String wishBookTime;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("wishBookTime")
   public void setWishBookTime(String wishBookTime) {
      this.wishBookTime = wishBookTime;
   }

   @JsonProperty("wishBookTime")
   public String getWishBookTime() {
      return this.wishBookTime;
   }
}
