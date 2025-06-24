package com.jd.open.api.sdk.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image {
   private String type = "com.jd.pop.ware.ic.api.domain.Image";
   private Long imgId;
   private String imgZoneId;
   private String imgUrl;
   private String colorId;
   private Integer imgIndex;
   private Integer isGgt;

   @JsonProperty("@type")
   public String getType() {
      return this.type;
   }

   public Image() {
   }

   public Image(Long imgId, String imgZoneId, String imgUrl, String colorId, Integer imgIndex) {
      this.imgId = imgId;
      this.imgZoneId = imgZoneId;
      this.imgUrl = imgUrl;
      this.colorId = colorId;
      this.imgIndex = imgIndex;
   }

   public Image(String imgUrl, String colorId, Integer imgIndex) {
      this.imgUrl = imgUrl;
      this.colorId = colorId;
      this.imgIndex = imgIndex;
   }

   public Image(Long imgId, String imgZoneId, String imgUrl, String colorId, Integer imgIndex, Integer isGgt) {
      this.imgId = imgId;
      this.imgZoneId = imgZoneId;
      this.imgUrl = imgUrl;
      this.colorId = colorId;
      this.imgIndex = imgIndex;
      this.isGgt = isGgt;
   }

   public Long getImgId() {
      return this.imgId;
   }

   public void setImgId(Long imgId) {
      this.imgId = imgId;
   }

   public String getImgZoneId() {
      return this.imgZoneId;
   }

   public void setImgZoneId(String imgZoneId) {
      this.imgZoneId = imgZoneId;
   }

   public String getImgUrl() {
      return this.imgUrl;
   }

   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   public String getColorId() {
      return this.colorId;
   }

   public void setColorId(String colorId) {
      this.colorId = colorId;
   }

   public Integer getImgIndex() {
      return this.imgIndex;
   }

   public void setImgIndex(Integer imgIndex) {
      this.imgIndex = imgIndex;
   }

   public Integer getIsGgt() {
      return this.isGgt;
   }

   public void setIsGgt(Integer isGgt) {
      this.isGgt = isGgt;
   }

   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("Image [");
      if (this.imgId != null) {
         builder.append("imgId=").append(this.imgId).append(", ");
      }

      if (this.imgZoneId != null) {
         builder.append("imgZoneId=").append(this.imgZoneId).append(", ");
      }

      if (this.imgUrl != null) {
         builder.append("imgUrl=").append(this.imgUrl).append(", ");
      }

      if (this.colorId != null) {
         builder.append("colorId=").append(this.colorId).append(", ");
      }

      if (this.imgIndex != null) {
         builder.append("imgIndex=").append(this.imgIndex);
      }

      if (this.isGgt != null) {
         builder.append("isGgt=").append(this.isGgt);
      }

      builder.append("]");
      return builder.toString();
   }
}
