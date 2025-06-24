package com.jd.open.api.sdk.domain.order.JhubOrderQueryService.response.querynew;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class OrderInfo implements Serializable {
   private Long orderId;
   private Integer orderType;
   private Long orderTotalFee;
   private Integer orderStatus;
   private String userPin;
   private Date payTime;
   private Date createTime;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("orderTotalFee")
   public void setOrderTotalFee(Long orderTotalFee) {
      this.orderTotalFee = orderTotalFee;
   }

   @JsonProperty("orderTotalFee")
   public Long getOrderTotalFee() {
      return this.orderTotalFee;
   }

   @JsonProperty("orderStatus")
   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   @JsonProperty("orderStatus")
   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   @JsonProperty("userPin")
   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   @JsonProperty("userPin")
   public String getUserPin() {
      return this.userPin;
   }

   @JsonProperty("payTime")
   public void setPayTime(Date payTime) {
      this.payTime = payTime;
   }

   @JsonProperty("payTime")
   public Date getPayTime() {
      return this.payTime;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }
}
