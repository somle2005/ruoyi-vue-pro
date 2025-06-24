package com.jd.open.api.sdk.domain.seller.ShopSafService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ShopJosResult implements Serializable {
   private Long venderId;
   private Long shopId;
   private String shopName;
   private Date openTime;
   private String logoUrl;
   private String brief;
   private Long categoryMain;
   private String categoryMainName;

   @JsonProperty("vender_id")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("vender_id")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("shop_id")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shop_id")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("shop_name")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shop_name")
   public String getShopName() {
      return this.shopName;
   }

   @JsonProperty("open_time")
   public void setOpenTime(Date openTime) {
      this.openTime = openTime;
   }

   @JsonProperty("open_time")
   public Date getOpenTime() {
      return this.openTime;
   }

   @JsonProperty("logo_url")
   public void setLogoUrl(String logoUrl) {
      this.logoUrl = logoUrl;
   }

   @JsonProperty("logo_url")
   public String getLogoUrl() {
      return this.logoUrl;
   }

   @JsonProperty("brief")
   public void setBrief(String brief) {
      this.brief = brief;
   }

   @JsonProperty("brief")
   public String getBrief() {
      return this.brief;
   }

   @JsonProperty("category_main")
   public void setCategoryMain(Long categoryMain) {
      this.categoryMain = categoryMain;
   }

   @JsonProperty("category_main")
   public Long getCategoryMain() {
      return this.categoryMain;
   }

   @JsonProperty("category_main_name")
   public void setCategoryMainName(String categoryMainName) {
      this.categoryMainName = categoryMainName;
   }

   @JsonProperty("category_main_name")
   public String getCategoryMainName() {
      return this.categoryMainName;
   }
}
