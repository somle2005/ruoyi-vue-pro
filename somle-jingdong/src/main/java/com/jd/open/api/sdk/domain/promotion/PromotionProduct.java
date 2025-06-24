package com.jd.open.api.sdk.domain.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PromotionProduct {
   private long skuId;
   private String prodName;
   private long prodId;
   private String price;
   private String promoPrice;
   private String isMain;

   @JsonProperty("is_main")
   public String getMain() {
      return this.isMain;
   }

   @JsonProperty("is_main")
   public void setMain(String main) {
      this.isMain = main;
   }

   @JsonProperty("sku_id")
   public long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("sku_id")
   public void setSkuId(long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("prod_name")
   public String getProdName() {
      return this.prodName;
   }

   @JsonProperty("prod_name")
   public void setProdName(String prodName) {
      this.prodName = prodName;
   }

   @JsonProperty("prod_id")
   public long getProdId() {
      return this.prodId;
   }

   @JsonProperty("prod_id")
   public void setProdId(long prodId) {
      this.prodId = prodId;
   }

   @JsonProperty("price")
   public String getPrice() {
      return this.price;
   }

   @JsonProperty("price")
   public void setPrice(String price) {
      this.price = price;
   }

   @JsonProperty("promo_price")
   public String getPromoPrice() {
      return this.promoPrice;
   }

   @JsonProperty("promo_price")
   public void setPromoPrice(String promoPrice) {
      this.promoPrice = promoPrice;
   }
}
