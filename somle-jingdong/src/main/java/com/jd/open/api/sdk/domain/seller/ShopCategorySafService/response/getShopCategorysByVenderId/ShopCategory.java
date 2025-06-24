package com.jd.open.api.sdk.domain.seller.ShopCategorySafService.response.getShopCategorysByVenderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ShopCategory implements Serializable {
   private Long id;
   private Long shopId;
   private Long parentId;
   private Integer orderNo;
   private String title;
   private String imgUri;
   private Boolean open;
   private Integer status;
   private Date created;
   private Date modified;
   private int[] homeShow;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("shopId")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("parentId")
   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("parentId")
   public Long getParentId() {
      return this.parentId;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(Integer orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public Integer getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("imgUri")
   public void setImgUri(String imgUri) {
      this.imgUri = imgUri;
   }

   @JsonProperty("imgUri")
   public String getImgUri() {
      return this.imgUri;
   }

   @JsonProperty("open")
   public void setOpen(Boolean open) {
      this.open = open;
   }

   @JsonProperty("open")
   public Boolean getOpen() {
      return this.open;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("homeShow")
   public void setHomeShow(int[] homeShow) {
      this.homeShow = homeShow;
   }

   @JsonProperty("homeShow")
   public int[] getHomeShow() {
      return this.homeShow;
   }
}
