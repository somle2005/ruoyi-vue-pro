package com.jd.open.api.sdk.domain.website.ware;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sku {
   private Long skuId;
   private Long wareId;
   private String stockNum;
   private String color;
   private String size;

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("ware_id")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("stock_num")
   public String getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("stock_num")
   public void setStockNum(String stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("color")
   public String getColor() {
      return this.color;
   }

   @JsonProperty("color")
   public void setColor(String color) {
      this.color = color;
   }

   @JsonProperty("size")
   public String getSize() {
      return this.size;
   }

   @JsonProperty("size")
   public void setSize(String size) {
      this.size = size;
   }
}
