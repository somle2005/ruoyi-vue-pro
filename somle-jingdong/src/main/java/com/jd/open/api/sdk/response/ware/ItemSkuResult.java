package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ItemSkuResult implements Serializable {
   private Long skuId;
   private Long itemId;
   private Long sellerId;
   private Integer skuStatus;
   private String attributes;
   private Date created;
   private Date modified;
   private String itemName;
   private Long cid;
   private Integer itemStatus;
   private String itemLocation;
   private String brand;
   private Integer weight;
   private String packListing;
   private String aftService;
   private String specParam;
   private List<ItemPictureResult> itemPictureResultList;

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("item_id")
   public void setItemId(Long itemId) {
      this.itemId = itemId;
   }

   @JsonProperty("item_id")
   public Long getItemId() {
      return this.itemId;
   }

   @JsonProperty("seller_id")
   public void setSellerId(Long sellerId) {
      this.sellerId = sellerId;
   }

   @JsonProperty("seller_id")
   public Long getSellerId() {
      return this.sellerId;
   }

   @JsonProperty("sku_status")
   public void setSkuStatus(Integer skuStatus) {
      this.skuStatus = skuStatus;
   }

   @JsonProperty("sku_status")
   public Integer getSkuStatus() {
      return this.skuStatus;
   }

   @JsonProperty("attributes")
   public void setAttributes(String attributes) {
      this.attributes = attributes;
   }

   @JsonProperty("attributes")
   public String getAttributes() {
      return this.attributes;
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

   @JsonProperty("item_picture_result_list")
   public void setItemPictureResultList(List<ItemPictureResult> itemPictureResultList) {
      this.itemPictureResultList = itemPictureResultList;
   }

   @JsonProperty("item_picture_result_list")
   public List<ItemPictureResult> getItemPictureResultList() {
      return this.itemPictureResultList;
   }
}
