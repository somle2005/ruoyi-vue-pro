package com.jd.open.api.sdk.domain.sellercat;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShopCategory {
   private long cid;
   private long parentId;
   private String name;
   private Boolean isParent;
   private Boolean isOpen;
   private Boolean isHomeShow;
   private long shopId;
   private int orderNo;

   @JsonProperty("shop_id")
   public long getShopId() {
      return this.shopId;
   }

   @JsonProperty("shop_id")
   public void setShopId(long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("cid")
   public long getCid() {
      return this.cid;
   }

   @JsonProperty("cid")
   public void setCid(long cid) {
      this.cid = cid;
   }

   @JsonProperty("parent_id")
   public long getParentId() {
      return this.parentId;
   }

   @JsonProperty("parent_id")
   public void setParentId(long parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("is_parent")
   public Boolean getParent() {
      return this.isParent;
   }

   @JsonProperty("is_parent")
   public void setParent(Boolean parent) {
      this.isParent = parent;
   }

   @JsonProperty("is_open")
   public Boolean getOpen() {
      return this.isOpen;
   }

   @JsonProperty("is_open")
   public void setOpen(Boolean open) {
      this.isOpen = open;
   }

   @JsonProperty("is_home_show")
   public Boolean getHomeShow() {
      return this.isHomeShow;
   }

   @JsonProperty("is_home_show")
   public void setHomeShow(Boolean homeShow) {
      this.isHomeShow = homeShow;
   }

   @JsonProperty("index_id")
   public int getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("index_id")
   public void setOrderNo(int orderNo) {
      this.orderNo = orderNo;
   }
}
