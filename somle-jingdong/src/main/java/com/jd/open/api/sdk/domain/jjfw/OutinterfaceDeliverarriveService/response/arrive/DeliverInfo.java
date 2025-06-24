package com.jd.open.api.sdk.domain.jjfw.OutinterfaceDeliverarriveService.response.arrive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class DeliverInfo implements Serializable {
   private String orderNo;
   private String deliverSpot;
   private Date deliverDate;

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
   public void setDeliverDate(Date deliverDate) {
      this.deliverDate = deliverDate;
   }

   @JsonProperty("deliverDate")
   public Date getDeliverDate() {
      return this.deliverDate;
   }
}
