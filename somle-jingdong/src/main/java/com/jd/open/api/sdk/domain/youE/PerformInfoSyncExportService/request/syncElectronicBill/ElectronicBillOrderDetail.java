package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.syncElectronicBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class ElectronicBillOrderDetail implements Serializable {
   private String skuName;
   private BigDecimal totalAmount;
   private String skuNorms;
   private String chargeTypeName;
   private BigDecimal skuDiscount;
   private BigDecimal skuPrice;
   private BigDecimal skuNum;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("totalAmount")
   public void setTotalAmount(BigDecimal totalAmount) {
      this.totalAmount = totalAmount;
   }

   @JsonProperty("totalAmount")
   public BigDecimal getTotalAmount() {
      return this.totalAmount;
   }

   @JsonProperty("skuNorms")
   public void setSkuNorms(String skuNorms) {
      this.skuNorms = skuNorms;
   }

   @JsonProperty("skuNorms")
   public String getSkuNorms() {
      return this.skuNorms;
   }

   @JsonProperty("chargeTypeName")
   public void setChargeTypeName(String chargeTypeName) {
      this.chargeTypeName = chargeTypeName;
   }

   @JsonProperty("chargeTypeName")
   public String getChargeTypeName() {
      return this.chargeTypeName;
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

   @JsonProperty("skuNum")
   public void setSkuNum(BigDecimal skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public BigDecimal getSkuNum() {
      return this.skuNum;
   }
}
