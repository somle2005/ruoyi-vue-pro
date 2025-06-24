package com.jd.open.api.sdk.domain.website.cps;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.website.ware.Ware;

public class JingdongrenWareDetail {
   private Ware ware;
   private String clickUrl;
   private String shopClickUrl;

   @JsonProperty("ware")
   public Ware getWare() {
      return this.ware;
   }

   @JsonProperty("ware")
   public void setWare(Ware ware) {
      this.ware = ware;
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
