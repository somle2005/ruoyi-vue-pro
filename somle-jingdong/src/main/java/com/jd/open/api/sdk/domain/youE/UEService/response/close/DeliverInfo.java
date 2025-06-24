package com.jd.open.api.sdk.domain.youE.UEService.response.close;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class DeliverInfo implements Serializable {
   private String orderNo;
   private String deliverSpot;
   private Date deliverDate;
   private Integer deliverType;

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

   @JsonProperty("deliverType")
   public void setDeliverType(Integer deliverType) {
      this.deliverType = deliverType;
   }

   @JsonProperty("deliverType")
   public Integer getDeliverType() {
      return this.deliverType;
   }
}
