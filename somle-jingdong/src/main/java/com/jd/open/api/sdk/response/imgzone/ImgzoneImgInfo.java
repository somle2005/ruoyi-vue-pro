package com.jd.open.api.sdk.response.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ImgzoneImgInfo implements Serializable {
   private String pictureId;
   private Integer pictureCateId;
   private String pictureUrl;
   private String pictureName;
   private String pictureType;
   private Integer referenced;
   private int pictureSize;
   private int pictureWidth;
   private int pictureHeight;
   private Date created;
   private Date modified;

   @JsonProperty("picture_id")
   public void setPictureId(String pictureId) {
      this.pictureId = pictureId;
   }

   @JsonProperty("picture_id")
   public String getPictureId() {
      return this.pictureId;
   }

   @JsonProperty("picture_cate_id")
   public void setPictureCateId(Integer pictureCateId) {
      this.pictureCateId = pictureCateId;
   }

   @JsonProperty("picture_cate_id")
   public Integer getPictureCateId() {
      return this.pictureCateId;
   }

   @JsonProperty("picture_url")
   public void setPictureUrl(String pictureUrl) {
      this.pictureUrl = pictureUrl;
   }

   @JsonProperty("picture_url")
   public String getPictureUrl() {
      return this.pictureUrl;
   }

   @JsonProperty("picture_name")
   public void setPictureName(String pictureName) {
      this.pictureName = pictureName;
   }

   @JsonProperty("picture_name")
   public String getPictureName() {
      return this.pictureName;
   }

   @JsonProperty("picture_type")
   public void setPictureType(String pictureType) {
      this.pictureType = pictureType;
   }

   @JsonProperty("picture_type")
   public String getPictureType() {
      return this.pictureType;
   }

   @JsonProperty("referenced")
   public void setReferenced(Integer referenced) {
      this.referenced = referenced;
   }

   @JsonProperty("referenced")
   public Integer getReferenced() {
      return this.referenced;
   }

   @JsonProperty("picture_size")
   public void setPictureSize(int pictureSize) {
      this.pictureSize = pictureSize;
   }

   @JsonProperty("picture_size")
   public int getPictureSize() {
      return this.pictureSize;
   }

   @JsonProperty("picture_width")
   public void setPictureWidth(int pictureWidth) {
      this.pictureWidth = pictureWidth;
   }

   @JsonProperty("picture_width")
   public int getPictureWidth() {
      return this.pictureWidth;
   }

   @JsonProperty("picture_height")
   public void setPictureHeight(int pictureHeight) {
      this.pictureHeight = pictureHeight;
   }

   @JsonProperty("picture_height")
   public int getPictureHeight() {
      return this.pictureHeight;
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
