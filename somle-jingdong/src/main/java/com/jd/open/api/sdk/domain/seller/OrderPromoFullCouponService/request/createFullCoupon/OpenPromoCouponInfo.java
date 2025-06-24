package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.request.createFullCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OpenPromoCouponInfo implements Serializable {
   private BigDecimal couponQuota;
   private BigDecimal discount;
   private Integer validateDays;
   private Integer couponType;
   private String orderDoneTime;
   private Integer limitFirstOrder;
   private Integer orderDayLimit;
   private Integer validityType;
   private String validBeginTime;
   private String validEndTime;
   private Integer storeNum;

   @JsonProperty("couponQuota")
   public void setCouponQuota(BigDecimal couponQuota) {
      this.couponQuota = couponQuota;
   }

   @JsonProperty("couponQuota")
   public BigDecimal getCouponQuota() {
      return this.couponQuota;
   }

   @JsonProperty("discount")
   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public BigDecimal getDiscount() {
      return this.discount;
   }

   @JsonProperty("validateDays")
   public void setValidateDays(Integer validateDays) {
      this.validateDays = validateDays;
   }

   @JsonProperty("validateDays")
   public Integer getValidateDays() {
      return this.validateDays;
   }

   @JsonProperty("couponType")
   public void setCouponType(Integer couponType) {
      this.couponType = couponType;
   }

   @JsonProperty("couponType")
   public Integer getCouponType() {
      return this.couponType;
   }

   @JsonProperty("orderDoneTime")
   public void setOrderDoneTime(String orderDoneTime) {
      this.orderDoneTime = orderDoneTime;
   }

   @JsonProperty("orderDoneTime")
   public String getOrderDoneTime() {
      return this.orderDoneTime;
   }

   @JsonProperty("limitFirstOrder")
   public void setLimitFirstOrder(Integer limitFirstOrder) {
      this.limitFirstOrder = limitFirstOrder;
   }

   @JsonProperty("limitFirstOrder")
   public Integer getLimitFirstOrder() {
      return this.limitFirstOrder;
   }

   @JsonProperty("orderDayLimit")
   public void setOrderDayLimit(Integer orderDayLimit) {
      this.orderDayLimit = orderDayLimit;
   }

   @JsonProperty("orderDayLimit")
   public Integer getOrderDayLimit() {
      return this.orderDayLimit;
   }

   @JsonProperty("validityType")
   public void setValidityType(Integer validityType) {
      this.validityType = validityType;
   }

   @JsonProperty("validityType")
   public Integer getValidityType() {
      return this.validityType;
   }

   @JsonProperty("validBeginTime")
   public void setValidBeginTime(String validBeginTime) {
      this.validBeginTime = validBeginTime;
   }

   @JsonProperty("validBeginTime")
   public String getValidBeginTime() {
      return this.validBeginTime;
   }

   @JsonProperty("validEndTime")
   public void setValidEndTime(String validEndTime) {
      this.validEndTime = validEndTime;
   }

   @JsonProperty("validEndTime")
   public String getValidEndTime() {
      return this.validEndTime;
   }

   @JsonProperty("storeNum")
   public void setStoreNum(Integer storeNum) {
      this.storeNum = storeNum;
   }

   @JsonProperty("storeNum")
   public Integer getStoreNum() {
      return this.storeNum;
   }
}
