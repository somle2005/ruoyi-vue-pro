package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ItemPictureResult implements Serializable {
   private Long id;
   private Long itemId;
   private Long sellerId;
   private String pictureUrl;
   private int sortNumber;
   private Date created;
   private Date modified;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
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

   @JsonProperty("picture_url")
   public void setPictureUrl(String pictureUrl) {
      this.pictureUrl = pictureUrl;
   }

   @JsonProperty("picture_url")
   public String getPictureUrl() {
      return this.pictureUrl;
   }

   @JsonProperty("sort_number")
   public void setSortNumber(int sortNumber) {
      this.sortNumber = sortNumber;
   }

   @JsonProperty("sort_number")
   public int getSortNumber() {
      return this.sortNumber;
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
