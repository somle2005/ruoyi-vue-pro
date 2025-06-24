package com.jd.open.api.sdk.domain.youE.BizOrderDetailsJsfService.response.queryBizOrderDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class ElectronicBillOrderDetailDTO implements Serializable {
   private String chargeTypeName;
   private BigDecimal totalAmount;
   private Float skuDiscount;
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

   @JsonProperty("totalAmount")
   public void setTotalAmount(BigDecimal totalAmount) {
      this.totalAmount = totalAmount;
   }

   @JsonProperty("totalAmount")
   public BigDecimal getTotalAmount() {
      return this.totalAmount;
   }

   @JsonProperty("skuDiscount")
   public void setSkuDiscount(Float skuDiscount) {
      this.skuDiscount = skuDiscount;
   }

   @JsonProperty("skuDiscount")
   public Float getSkuDiscount() {
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
