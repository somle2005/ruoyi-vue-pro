package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getIncrementOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PaymentDTO implements Serializable {
   private BigDecimal orderSellerPrice;
   private BigDecimal orderPayment;
   private BigDecimal freightPrice;
   private BigDecimal discount;
   private BigDecimal basicFreight;
   private BigDecimal periodFreight;
   private BigDecimal storeAllowance;
   private BigDecimal weightFreight;
   private BigDecimal distanceFreight;
   private BigDecimal yiBaoPayMoney;
   private BigDecimal insuranceMoney;

   @JsonProperty("orderSellerPrice")
   public void setOrderSellerPrice(BigDecimal orderSellerPrice) {
      this.orderSellerPrice = orderSellerPrice;
   }

   @JsonProperty("orderSellerPrice")
   public BigDecimal getOrderSellerPrice() {
      return this.orderSellerPrice;
   }

   @JsonProperty("orderPayment")
   public void setOrderPayment(BigDecimal orderPayment) {
      this.orderPayment = orderPayment;
   }

   @JsonProperty("orderPayment")
   public BigDecimal getOrderPayment() {
      return this.orderPayment;
   }

   @JsonProperty("freightPrice")
   public void setFreightPrice(BigDecimal freightPrice) {
      this.freightPrice = freightPrice;
   }

   @JsonProperty("freightPrice")
   public BigDecimal getFreightPrice() {
      return this.freightPrice;
   }

   @JsonProperty("discount")
   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public BigDecimal getDiscount() {
      return this.discount;
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

   @JsonProperty("storeAllowance")
   public void setStoreAllowance(BigDecimal storeAllowance) {
      this.storeAllowance = storeAllowance;
   }

   @JsonProperty("storeAllowance")
   public BigDecimal getStoreAllowance() {
      return this.storeAllowance;
   }

   @JsonProperty("weightFreight")
   public void setWeightFreight(BigDecimal weightFreight) {
      this.weightFreight = weightFreight;
   }

   @JsonProperty("weightFreight")
   public BigDecimal getWeightFreight() {
      return this.weightFreight;
   }

   @JsonProperty("distanceFreight")
   public void setDistanceFreight(BigDecimal distanceFreight) {
      this.distanceFreight = distanceFreight;
   }

   @JsonProperty("distanceFreight")
   public BigDecimal getDistanceFreight() {
      return this.distanceFreight;
   }

   @JsonProperty("yiBaoPayMoney")
   public void setYiBaoPayMoney(BigDecimal yiBaoPayMoney) {
      this.yiBaoPayMoney = yiBaoPayMoney;
   }

   @JsonProperty("yiBaoPayMoney")
   public BigDecimal getYiBaoPayMoney() {
      return this.yiBaoPayMoney;
   }

   @JsonProperty("insuranceMoney")
   public void setInsuranceMoney(BigDecimal insuranceMoney) {
      this.insuranceMoney = insuranceMoney;
   }

   @JsonProperty("insuranceMoney")
   public BigDecimal getInsuranceMoney() {
      return this.insuranceMoney;
   }
}
