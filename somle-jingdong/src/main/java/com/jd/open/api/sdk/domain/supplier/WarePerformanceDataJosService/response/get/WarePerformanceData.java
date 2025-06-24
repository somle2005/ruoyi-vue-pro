package com.jd.open.api.sdk.domain.supplier.WarePerformanceDataJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WarePerformanceData implements Serializable {
   private String[] vendorCode;
   private String[] vendorName;
   private String[] sku;
   private String[] productName;
   private Integer[] financialSaleNum;
   private Double[] income;
   private Double[] cost;
   private Double[] grossProfit;
   private Double[] couponDeduction;
   private Double[] integralDeduction;
   private Double[] fullSubtraction;
   private Integer[] inventoryDays;
   private String[] createTime;

   @JsonProperty("vendorCode")
   public void setVendorCode(String[] vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String[] getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("vendorName")
   public void setVendorName(String[] vendorName) {
      this.vendorName = vendorName;
   }

   @JsonProperty("vendorName")
   public String[] getVendorName() {
      return this.vendorName;
   }

   @JsonProperty("sku")
   public void setSku(String[] sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public String[] getSku() {
      return this.sku;
   }

   @JsonProperty("productName")
   public void setProductName(String[] productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String[] getProductName() {
      return this.productName;
   }

   @JsonProperty("financialSaleNum")
   public void setFinancialSaleNum(Integer[] financialSaleNum) {
      this.financialSaleNum = financialSaleNum;
   }

   @JsonProperty("financialSaleNum")
   public Integer[] getFinancialSaleNum() {
      return this.financialSaleNum;
   }

   @JsonProperty("income")
   public void setIncome(Double[] income) {
      this.income = income;
   }

   @JsonProperty("income")
   public Double[] getIncome() {
      return this.income;
   }

   @JsonProperty("cost")
   public void setCost(Double[] cost) {
      this.cost = cost;
   }

   @JsonProperty("cost")
   public Double[] getCost() {
      return this.cost;
   }

   @JsonProperty("grossProfit")
   public void setGrossProfit(Double[] grossProfit) {
      this.grossProfit = grossProfit;
   }

   @JsonProperty("grossProfit")
   public Double[] getGrossProfit() {
      return this.grossProfit;
   }

   @JsonProperty("couponDeduction")
   public void setCouponDeduction(Double[] couponDeduction) {
      this.couponDeduction = couponDeduction;
   }

   @JsonProperty("couponDeduction")
   public Double[] getCouponDeduction() {
      return this.couponDeduction;
   }

   @JsonProperty("integralDeduction")
   public void setIntegralDeduction(Double[] integralDeduction) {
      this.integralDeduction = integralDeduction;
   }

   @JsonProperty("integralDeduction")
   public Double[] getIntegralDeduction() {
      return this.integralDeduction;
   }

   @JsonProperty("fullSubtraction")
   public void setFullSubtraction(Double[] fullSubtraction) {
      this.fullSubtraction = fullSubtraction;
   }

   @JsonProperty("fullSubtraction")
   public Double[] getFullSubtraction() {
      return this.fullSubtraction;
   }

   @JsonProperty("inventoryDays")
   public void setInventoryDays(Integer[] inventoryDays) {
      this.inventoryDays = inventoryDays;
   }

   @JsonProperty("inventoryDays")
   public Integer[] getInventoryDays() {
      return this.inventoryDays;
   }

   @JsonProperty("createTime")
   public void setCreateTime(String[] createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public String[] getCreateTime() {
      return this.createTime;
   }
}
