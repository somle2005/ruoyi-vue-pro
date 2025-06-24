package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ItemResult implements Serializable {
   private Long itemId;
   private String itemName;
   private Long cid;
   private Long sellerId;
   private Integer itemStatus;
   private String itemLocation;
   private String brand;
   private String itemDes;
   private Integer weight;
   private String packListing;
   private String aftService;
   private String specParam;
   private Date created;
   private Date modified;
   private List<SkuResult> skuResultList;
   private List<ItemPictureResult> itemPictureResultList;

   @JsonProperty("item_id")
   public void setItemId(Long itemId) {
      this.itemId = itemId;
   }

   @JsonProperty("item_id")
   public Long getItemId() {
      return this.itemId;
   }

   @JsonProperty("item_name")
   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   @JsonProperty("item_name")
   public String getItemName() {
      return this.itemName;
   }

   @JsonProperty("cid")
   public void setCid(Long cid) {
      this.cid = cid;
   }

   @JsonProperty("cid")
   public Long getCid() {
      return this.cid;
   }

   @JsonProperty("seller_id")
   public void setSellerId(Long sellerId) {
      this.sellerId = sellerId;
   }

   @JsonProperty("seller_id")
   public Long getSellerId() {
      return this.sellerId;
   }

   @JsonProperty("item_status")
   public void setItemStatus(Integer itemStatus) {
      this.itemStatus = itemStatus;
   }

   @JsonProperty("item_status")
   public Integer getItemStatus() {
      return this.itemStatus;
   }

   @JsonProperty("item_location")
   public void setItemLocation(String itemLocation) {
      this.itemLocation = itemLocation;
   }

   @JsonProperty("item_location")
   public String getItemLocation() {
      return this.itemLocation;
   }

   @JsonProperty("brand")
   public void setBrand(String brand) {
      this.brand = brand;
   }

   @JsonProperty("brand")
   public String getBrand() {
      return this.brand;
   }

   @JsonProperty("item_des")
   public void setItemDes(String itemDes) {
      this.itemDes = itemDes;
   }

   @JsonProperty("item_des")
   public String getItemDes() {
      return this.itemDes;
   }

   @JsonProperty("weight")
   public void setWeight(Integer weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public Integer getWeight() {
      return this.weight;
   }

   @JsonProperty("pack_listing")
   public void setPackListing(String packListing) {
      this.packListing = packListing;
   }

   @JsonProperty("pack_listing")
   public String getPackListing() {
      return this.packListing;
   }

   @JsonProperty("aft_service")
   public void setAftService(String aftService) {
      this.aftService = aftService;
   }

   @JsonProperty("aft_service")
   public String getAftService() {
      return this.aftService;
   }

   @JsonProperty("spec_param")
   public void setSpecParam(String specParam) {
      this.specParam = specParam;
   }

   @JsonProperty("spec_param")
   public String getSpecParam() {
      return this.specParam;
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

   @JsonProperty("sku_result_list")
   public void setSkuResultList(List<SkuResult> skuResultList) {
      this.skuResultList = skuResultList;
   }

   @JsonProperty("sku_result_list")
   public List<SkuResult> getSkuResultList() {
      return this.skuResultList;
   }

   @JsonProperty("item_picture_result_list")
   public void setItemPictureResultList(List<ItemPictureResult> itemPictureResultList) {
      this.itemPictureResultList = itemPictureResultList;
   }

   @JsonProperty("item_picture_result_list")
   public List<ItemPictureResult> getItemPictureResultList() {
      return this.itemPictureResultList;
   }
}
