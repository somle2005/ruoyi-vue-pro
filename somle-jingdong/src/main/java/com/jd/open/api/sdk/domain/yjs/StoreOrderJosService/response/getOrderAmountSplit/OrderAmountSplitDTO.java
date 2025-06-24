package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getOrderAmountSplit;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderAmountSplitDTO implements Serializable {
   private BigDecimal orderSellerPrice;
   private BigDecimal productDiscountAmount;
   private BigDecimal weightFreight;
   private String orderId;
   private BigDecimal distanceFreight;
   private BigDecimal storeAllowance;
   private Integer source;
   private BigDecimal shouldPayAmount;
   private String platformServiceFeeAmount;
   private BigDecimal merchantActivityExpensesAmount;
   private BigDecimal platformSubsidiesFreightAmount;
   private BigDecimal freightPrice;
   private BigDecimal basicFreight;
   private BigDecimal periodFreight;
   private BigDecimal couponsByPlatformAmount;
   private BigDecimal yiBaoPayMoney;
   private String expectedRevenueAmount;

   @JsonProperty("orderSellerPrice")
   public void setOrderSellerPrice(BigDecimal orderSellerPrice) {
      this.orderSellerPrice = orderSellerPrice;
   }

   @JsonProperty("orderSellerPrice")
   public BigDecimal getOrderSellerPrice() {
      return this.orderSellerPrice;
   }

   @JsonProperty("productDiscountAmount")
   public void setProductDiscountAmount(BigDecimal productDiscountAmount) {
      this.productDiscountAmount = productDiscountAmount;
   }

   @JsonProperty("productDiscountAmount")
   public BigDecimal getProductDiscountAmount() {
      return this.productDiscountAmount;
   }

   @JsonProperty("weightFreight")
   public void setWeightFreight(BigDecimal weightFreight) {
      this.weightFreight = weightFreight;
   }

   @JsonProperty("weightFreight")
   public BigDecimal getWeightFreight() {
      return this.weightFreight;
   }

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("distanceFreight")
   public void setDistanceFreight(BigDecimal distanceFreight) {
      this.distanceFreight = distanceFreight;
   }

   @JsonProperty("distanceFreight")
   public BigDecimal getDistanceFreight() {
      return this.distanceFreight;
   }

   @JsonProperty("storeAllowance")
   public void setStoreAllowance(BigDecimal storeAllowance) {
      this.storeAllowance = storeAllowance;
   }

   @JsonProperty("storeAllowance")
   public BigDecimal getStoreAllowance() {
      return this.storeAllowance;
   }

   @JsonProperty("source")
   public void setSource(Integer source) {
      this.source = source;
   }

   @JsonProperty("source")
   public Integer getSource() {
      return this.source;
   }

   @JsonProperty("shouldPayAmount")
   public void setShouldPayAmount(BigDecimal shouldPayAmount) {
      this.shouldPayAmount = shouldPayAmount;
   }

   @JsonProperty("shouldPayAmount")
   public BigDecimal getShouldPayAmount() {
      return this.shouldPayAmount;
   }

   @JsonProperty("platformServiceFeeAmount")
   public void setPlatformServiceFeeAmount(String platformServiceFeeAmount) {
      this.platformServiceFeeAmount = platformServiceFeeAmount;
   }

   @JsonProperty("platformServiceFeeAmount")
   public String getPlatformServiceFeeAmount() {
      return this.platformServiceFeeAmount;
   }

   @JsonProperty("merchantActivityExpensesAmount")
   public void setMerchantActivityExpensesAmount(BigDecimal merchantActivityExpensesAmount) {
      this.merchantActivityExpensesAmount = merchantActivityExpensesAmount;
   }

   @JsonProperty("merchantActivityExpensesAmount")
   public BigDecimal getMerchantActivityExpensesAmount() {
      return this.merchantActivityExpensesAmount;
   }

   @JsonProperty("platformSubsidiesFreightAmount")
   public void setPlatformSubsidiesFreightAmount(BigDecimal platformSubsidiesFreightAmount) {
      this.platformSubsidiesFreightAmount = platformSubsidiesFreightAmount;
   }

   @JsonProperty("platformSubsidiesFreightAmount")
   public BigDecimal getPlatformSubsidiesFreightAmount() {
      return this.platformSubsidiesFreightAmount;
   }

   @JsonProperty("freightPrice")
   public void setFreightPrice(BigDecimal freightPrice) {
      this.freightPrice = freightPrice;
   }

   @JsonProperty("freightPrice")
   public BigDecimal getFreightPrice() {
      return this.freightPrice;
   }

   @JsonProperty("basicFreight")
   public void setBasicFreight(BigDecimal basicFreight) {
      this.basicFreight = basicFreight;
   }

   @JsonProperty("basicFreight")
   public BigDecimal getBasicFreight() {
      return this.basicFreight;
   }

   @JsonProperty("periodFreight")
   public void setPeriodFreight(BigDecimal periodFreight) {
      this.periodFreight = periodFreight;
   }

   @JsonProperty("periodFreight")
   public BigDecimal getPeriodFreight() {
      return this.periodFreight;
   }

   @JsonProperty("couponsByPlatformAmount")
   public void setCouponsByPlatformAmount(BigDecimal couponsByPlatformAmount) {
      this.couponsByPlatformAmount = couponsByPlatformAmount;
   }

   @JsonProperty("couponsByPlatformAmount")
   public BigDecimal getCouponsByPlatformAmount() {
      return this.couponsByPlatformAmount;
   }

   @JsonProperty("yiBaoPayMoney")
   public void setYiBaoPayMoney(BigDecimal yiBaoPayMoney) {
      this.yiBaoPayMoney = yiBaoPayMoney;
   }

   @JsonProperty("yiBaoPayMoney")
   public BigDecimal getYiBaoPayMoney() {
      return this.yiBaoPayMoney;
   }

   @JsonProperty("expectedRevenueAmount")
   public void setExpectedRevenueAmount(String expectedRevenueAmount) {
      this.expectedRevenueAmount = expectedRevenueAmount;
   }

   @JsonProperty("expectedRevenueAmount")
   public String getExpectedRevenueAmount() {
      return this.expectedRevenueAmount;
   }
}
