package com.jd.open.api.sdk.domain.category;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShopCategoryInfo {
   private String shopId;
   private String parentId;
   private String orderNo;
   private String title;
   private String homeShow;
   private String id;

   @JsonProperty("id")
   public String getId() {
      return this.id;
   }

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("shop_id")
   public String getShopId() {
      return this.shopId;
   }

   @JsonProperty("shop_id")
   public void setShopId(String shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("parent_id")
   public String getParentId() {
      return this.parentId;
   }

   @JsonProperty("parent_id")
   public void setParentId(String parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("order_no")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("order_no")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("home_show")
   public String getHomeShow() {
      return this.homeShow;
   }

   @JsonProperty("home_show")
   public void setHomeShow(String homeShow) {
      this.homeShow = homeShow;
   }
}
