package com.jd.open.api.sdk.domain.youE.QueryOrderJsfService.response.queryOrderArriveTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderArriveTime implements Serializable {
   private String arriveTime;
   private Long saleOrderNo;
   private String estimateArriveTime;
   private Integer saleOrderStat;
   private String orderCancelDate;
   private String pickUpNo;
   private String buyDate;

   @JsonProperty("arriveTime")
   public void setArriveTime(String arriveTime) {
      this.arriveTime = arriveTime;
   }

   @JsonProperty("arriveTime")
   public String getArriveTime() {
      return this.arriveTime;
   }

   @JsonProperty("saleOrderNo")
   public void setSaleOrderNo(Long saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   @JsonProperty("saleOrderNo")
   public Long getSaleOrderNo() {
      return this.saleOrderNo;
   }

   @JsonProperty("estimateArriveTime")
   public void setEstimateArriveTime(String estimateArriveTime) {
      this.estimateArriveTime = estimateArriveTime;
   }

   @JsonProperty("estimateArriveTime")
   public String getEstimateArriveTime() {
      return this.estimateArriveTime;
   }

   @JsonProperty("saleOrderStat")
   public void setSaleOrderStat(Integer saleOrderStat) {
      this.saleOrderStat = saleOrderStat;
   }

   @JsonProperty("saleOrderStat")
   public Integer getSaleOrderStat() {
      return this.saleOrderStat;
   }

   @JsonProperty("orderCancelDate")
   public void setOrderCancelDate(String orderCancelDate) {
      this.orderCancelDate = orderCancelDate;
   }

   @JsonProperty("orderCancelDate")
   public String getOrderCancelDate() {
      return this.orderCancelDate;
   }

   @JsonProperty("pickUpNo")
   public void setPickUpNo(String pickUpNo) {
      this.pickUpNo = pickUpNo;
   }

   @JsonProperty("pickUpNo")
   public String getPickUpNo() {
      return this.pickUpNo;
   }

   @JsonProperty("buyDate")
   public void setBuyDate(String buyDate) {
      this.buyDate = buyDate;
   }

   @JsonProperty("buyDate")
   public String getBuyDate() {
      return this.buyDate;
   }
}
