package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFilter("OrderDetailInfo")
public class ItemInfo {
   private String skuId;
   private String outerSkuId;
   private String skuName;
   private String jdPrice;
   private String giftPoint;
   private String wareId;
   private String itemTotal;
   private String productNo;

   @JsonProperty("product_no")
   public String getProductNo() {
      return this.productNo;
   }

   @JsonProperty("product_no")
   public void setProductNo(String productNo) {
      this.productNo = productNo;
   }

   @JsonProperty("sku_id")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("outer_sku_id")
   public String getOuterSkuId() {
      return this.outerSkuId;
   }

   @JsonProperty("outer_sku_id")
   public void setOuterSkuId(String outerSkuId) {
      this.outerSkuId = outerSkuId;
   }

   @JsonProperty("sku_name")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("sku_name")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("jd_price")
   public String getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("jd_price")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("gift_point")
   public String getGiftPoint() {
      return this.giftPoint;
   }

   @JsonProperty("gift_point")
   public void setGiftPoint(String giftPoint) {
      this.giftPoint = giftPoint;
   }

   @JsonProperty("ware_id")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("item_total")
   public String getItemTotal() {
      return this.itemTotal;
   }

   @JsonProperty("item_total")
   public void setItemTotal(String itemTotal) {
      this.itemTotal = itemTotal;
   }
}
