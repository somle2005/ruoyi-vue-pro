package com.jd.open.api.sdk.domain.youE.ElectronicBillApi.request.ElectronicBillApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class TServiceOrderDetail implements Serializable {
   private BigDecimal totalPrice;
   private BigDecimal skuPrice;
   private BigDecimal skuDiscount;
   private String skuName;
   private String skuNorms;
   private Integer skuNum;

   @JsonProperty("totalPrice")
   public void setTotalPrice(BigDecimal totalPrice) {
      this.totalPrice = totalPrice;
   }

   @JsonProperty("totalPrice")
   public BigDecimal getTotalPrice() {
      return this.totalPrice;
   }

   @JsonProperty("skuPrice")
   public void setSkuPrice(BigDecimal skuPrice) {
      this.skuPrice = skuPrice;
   }

   @JsonProperty("skuPrice")
   public BigDecimal getSkuPrice() {
      return this.skuPrice;
   }

   @JsonProperty("skuDiscount")
   public void setSkuDiscount(BigDecimal skuDiscount) {
      this.skuDiscount = skuDiscount;
   }

   @JsonProperty("skuDiscount")
   public BigDecimal getSkuDiscount() {
      return this.skuDiscount;
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
   public void setSkuNum(Integer skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public Integer getSkuNum() {
      return this.skuNum;
   }
}
