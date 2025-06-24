package com.jd.open.api.sdk.domain.website.cps;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PromoteWare {
   private String wareId;
   private String title;
   private String price;
   private String picUrl;
   private String commissionFee;
   private String clickUrl;
   private String shopClickUrl;

   @JsonProperty("ware_id")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("ware_id")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("price")
   public String getPrice() {
      return this.price;
   }

   @JsonProperty("price")
   public void setPrice(String price) {
      this.price = price;
   }

   @JsonProperty("pic_url")
   public String getPicUrl() {
      return this.picUrl;
   }

   @JsonProperty("pic_url")
   public void setPicUrl(String picUrl) {
      this.picUrl = picUrl;
   }

   @JsonProperty("commission_fee")
   public String getCommissionFee() {
      return this.commissionFee;
   }

   @JsonProperty("commission_fee")
   public void setCommissionFee(String commissionFee) {
      this.commissionFee = commissionFee;
   }

   @JsonProperty("click_url")
   public String getClickUrl() {
      return this.clickUrl;
   }

   @JsonProperty("click_url")
   public void setClickUrl(String clickUrl) {
      this.clickUrl = clickUrl;
   }

   @JsonProperty("shop_click_url")
   public String getShopClickUrl() {
      return this.shopClickUrl;
   }

   @JsonProperty("shop_click_url")
   public void setShopClickUrl(String shopClickUrl) {
      this.shopClickUrl = shopClickUrl;
   }
}
