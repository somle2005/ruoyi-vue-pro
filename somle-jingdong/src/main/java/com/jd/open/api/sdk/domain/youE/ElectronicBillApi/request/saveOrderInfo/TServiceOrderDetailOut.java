package com.jd.open.api.sdk.domain.youE.ElectronicBillApi.request.saveOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class TServiceOrderDetailOut implements Serializable {
   private String chargeTypeName;
   private BigDecimal totalPrice;
   private BigDecimal skuDiscount;
   private BigDecimal skuPrice;
   private String skuName;
   private String skuNorms;
   private BigDecimal skuNum;

   @JsonProperty("chargeTypeName")
   public void setChargeTypeName(String chargeTypeName) {
      this.chargeTypeName = chargeTypeName;
   }

   @JsonProperty("chargeTypeName")
   public String getChargeTypeName() {
      return this.chargeTypeName;
   }

   @JsonProperty("totalPrice")
   public void setTotalPrice(BigDecimal totalPrice) {
      this.totalPrice = totalPrice;
   }

   @JsonProperty("totalPrice")
   public BigDecimal getTotalPrice() {
      return this.totalPrice;
   }

   @JsonProperty("skuDiscount")
   public void setSkuDiscount(BigDecimal skuDiscount) {
      this.skuDiscount = skuDiscount;
   }

   @JsonProperty("skuDiscount")
   public BigDecimal getSkuDiscount() {
      return this.skuDiscount;
   }

   @JsonProperty("skuPrice")
   public void setSkuPrice(BigDecimal skuPrice) {
      this.skuPrice = skuPrice;
   }

   @JsonProperty("skuPrice")
   public BigDecimal getSkuPrice() {
      return this.skuPrice;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("skuNorms")
   public void setSkuNorms(String skuNorms) {
      this.skuNorms = skuNorms;
   }

   @JsonProperty("skuNorms")
   public String getSkuNorms() {
      return this.skuNorms;
   }

   @JsonProperty("skuNum")
   public void setSkuNum(BigDecimal skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public BigDecimal getSkuNum() {
      return this.skuNum;
   }
}
