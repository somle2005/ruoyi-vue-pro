package com.jd.open.api.sdk.domain.ware;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sku {
   private Long skuId;
   private long wareId;
   private long shopId;
   private String status;
   private String attributes;
   private String jdPrice;
   private String costPrice;
   private String marketPrice;
   private long stockNum;
   private String outerId;
   private String created;
   private String modified;
   private String colorValue;
   private String sizeValue;

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("ware_id")
   public long getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("shop_id")
   public long getShopId() {
      return this.shopId;
   }

   @JsonProperty("shop_id")
   public void setShopId(long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("attributes")
   public String getAttributes() {
      return this.attributes;
   }

   @JsonProperty("attributes")
   public void setAttributes(String attributes) {
      this.attributes = attributes;
   }

   @JsonProperty("jd_price")
   public String getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("jd_price")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("cost_price")
   public String getCostPrice() {
      return this.costPrice;
   }

   @JsonProperty("cost_price")
   public void setCostPrice(String costPrice) {
      this.costPrice = costPrice;
   }

   @JsonProperty("market_price")
   public String getMarketPrice() {
      return this.marketPrice;
   }

   @JsonProperty("market_price")
   public void setMarketPrice(String marketPrice) {
      this.marketPrice = marketPrice;
   }

   @JsonProperty("stock_num")
   public long getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("stock_num")
   public void setStockNum(long stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("outer_id")
   public String getOuterId() {
      return this.outerId;
   }

   @JsonProperty("outer_id")
   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   @JsonProperty("created")
   public String getCreated() {
      return this.created;
   }

   @JsonProperty("created")
   public void setCreated(String created) {
      this.created = created;
   }

   @JsonProperty("modified")
   public String getModified() {
      return this.modified;
   }

   @JsonProperty("modified")
   public void setModified(String modified) {
      this.modified = modified;
   }

   @JsonProperty("color_value")
   public String getColorValue() {
      return this.colorValue;
   }

   @JsonProperty("color_value")
   public void setColorValue(String colorValue) {
      this.colorValue = colorValue;
   }

   @JsonProperty("size_value")
   public String getSizeValue() {
      return this.sizeValue;
   }

   @JsonProperty("size_value")
   public void setSizeValue(String sizeValue) {
      this.sizeValue = sizeValue;
   }
}
