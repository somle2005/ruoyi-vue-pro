package com.jd.open.api.sdk.domain.youE.BizDeliverArriveJsfService.response.searchOrderDeliverList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderDeliverVO implements Serializable {
   private String orderNo;
   private String deliverSpot;
   private String deliverDate;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("deliverSpot")
   public void setDeliverSpot(String deliverSpot) {
      this.deliverSpot = deliverSpot;
   }

   @JsonProperty("deliverSpot")
   public String getDeliverSpot() {
      return this.deliverSpot;
   }

   @JsonProperty("deliverDate")
   public void setDeliverDate(String deliverDate) {
      this.deliverDate = deliverDate;
   }

   @JsonProperty("deliverDate")
   public String getDeliverDate() {
      return this.deliverDate;
   }
}
