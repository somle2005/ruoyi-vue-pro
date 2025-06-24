package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderDetailForJosDto implements Serializable {
   private String skuId;
   private String upc;
   private String commodityName;
   private Integer commodityNum;
   private BigDecimal jdPrice;
   private BigDecimal discount;
   private BigDecimal cost;
   private Integer purchaseOrderId;
   private String poId;

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("upc")
   public void setUpc(String upc) {
      this.upc = upc;
   }

   @JsonProperty("upc")
   public String getUpc() {
      return this.upc;
   }

   @JsonProperty("commodityName")
   public void setCommodityName(String commodityName) {
      this.commodityName = commodityName;
   }

   @JsonProperty("commodityName")
   public String getCommodityName() {
      return this.commodityName;
   }

   @JsonProperty("commodityNum")
   public void setCommodityNum(Integer commodityNum) {
      this.commodityNum = commodityNum;
   }

   @JsonProperty("commodityNum")
   public Integer getCommodityNum() {
      return this.commodityNum;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("discount")
   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public BigDecimal getDiscount() {
      return this.discount;
   }

   @JsonProperty("cost")
   public void setCost(BigDecimal cost) {
      this.cost = cost;
   }

   @JsonProperty("cost")
   public BigDecimal getCost() {
      return this.cost;
   }

   @JsonProperty("purchaseOrderId")
   public void setPurchaseOrderId(Integer purchaseOrderId) {
      this.purchaseOrderId = purchaseOrderId;
   }

   @JsonProperty("purchaseOrderId")
   public Integer getPurchaseOrderId() {
      return this.purchaseOrderId;
   }

   @JsonProperty("poId")
   public void setPoId(String poId) {
      this.poId = poId;
   }

   @JsonProperty("poId")
   public String getPoId() {
      return this.poId;
   }
}
