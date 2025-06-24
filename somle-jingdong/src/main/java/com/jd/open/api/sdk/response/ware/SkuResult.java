package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class SkuResult implements Serializable {
   private Long skuId;
   private Long itemId;
   private Long sellerId;
   private Integer skuStatus;
   private String attributes;
   private Date created;
   private Date modified;

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
}
