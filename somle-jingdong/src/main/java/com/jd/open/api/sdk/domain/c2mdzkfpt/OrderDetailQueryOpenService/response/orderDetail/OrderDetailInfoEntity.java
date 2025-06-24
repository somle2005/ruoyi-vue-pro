package com.jd.open.api.sdk.domain.c2mdzkfpt.OrderDetailQueryOpenService.response.orderDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderDetailInfoEntity implements Serializable {
   private String skuName;
   private BigDecimal finalSalePrice;
   private BigDecimal salePrice;
   private BigDecimal totalPrice;
   private BigDecimal finalTotalPrice;
   private String upc;
   private String model;
   private BigDecimal purchasePrice;
   private String sku;
   private Integer skuCount;
   private Long poId;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("finalSalePrice")
   public void setFinalSalePrice(BigDecimal finalSalePrice) {
      this.finalSalePrice = finalSalePrice;
   }

   @JsonProperty("finalSalePrice")
   public BigDecimal getFinalSalePrice() {
      return this.finalSalePrice;
   }

   @JsonProperty("salePrice")
   public void setSalePrice(BigDecimal salePrice) {
      this.salePrice = salePrice;
   }

   @JsonProperty("salePrice")
   public BigDecimal getSalePrice() {
      return this.salePrice;
   }

   @JsonProperty("totalPrice")
   public void setTotalPrice(BigDecimal totalPrice) {
      this.totalPrice = totalPrice;
   }

   @JsonProperty("totalPrice")
   public BigDecimal getTotalPrice() {
      return this.totalPrice;
   }

   @JsonProperty("finalTotalPrice")
   public void setFinalTotalPrice(BigDecimal finalTotalPrice) {
      this.finalTotalPrice = finalTotalPrice;
   }

   @JsonProperty("finalTotalPrice")
   public BigDecimal getFinalTotalPrice() {
      return this.finalTotalPrice;
   }

   @JsonProperty("upc")
   public void setUpc(String upc) {
      this.upc = upc;
   }

   @JsonProperty("upc")
   public String getUpc() {
      return this.upc;
   }

   @JsonProperty("model")
   public void setModel(String model) {
      this.model = model;
   }

   @JsonProperty("model")
   public String getModel() {
      return this.model;
   }

   @JsonProperty("purchasePrice")
   public void setPurchasePrice(BigDecimal purchasePrice) {
      this.purchasePrice = purchasePrice;
   }

   @JsonProperty("purchasePrice")
   public BigDecimal getPurchasePrice() {
      return this.purchasePrice;
   }

   @JsonProperty("sku")
   public void setSku(String sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public String getSku() {
      return this.sku;
   }

   @JsonProperty("skuCount")
   public void setSkuCount(Integer skuCount) {
      this.skuCount = skuCount;
   }

   @JsonProperty("skuCount")
   public Integer getSkuCount() {
      return this.skuCount;
   }

   @JsonProperty("poId")
   public void setPoId(Long poId) {
      this.poId = poId;
   }

   @JsonProperty("poId")
   public Long getPoId() {
      return this.poId;
   }
}
