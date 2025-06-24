package com.jd.open.api.sdk.domain.imgzone.ImageService.response.queryAll;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ImgzoneImgInfo implements Serializable {
   private Long categoryId;
   private Date created;
   private Integer imgHeight;
   private String imgId;
   private String imgName;
   private Integer imgSize;
   private String imgType;
   private String imgUrl;
   private Integer imgWidth;
   private int state;
   private Integer useFlag;
   private Long venderId;

   @JsonProperty("category_id")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("category_id")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("img_height")
   public void setImgHeight(Integer imgHeight) {
      this.imgHeight = imgHeight;
   }

   @JsonProperty("img_height")
   public Integer getImgHeight() {
      return this.imgHeight;
   }

   @JsonProperty("img_id")
   public void setImgId(String imgId) {
      this.imgId = imgId;
   }

   @JsonProperty("img_id")
   public String getImgId() {
      return this.imgId;
   }

   @JsonProperty("img_name")
   public void setImgName(String imgName) {
      this.imgName = imgName;
   }

   @JsonProperty("img_name")
   public String getImgName() {
      return this.imgName;
   }

   @JsonProperty("img_size")
   public void setImgSize(Integer imgSize) {
      this.imgSize = imgSize;
   }

   @JsonProperty("img_size")
   public Integer getImgSize() {
      return this.imgSize;
   }

   @JsonProperty("img_type")
   public void setImgType(String imgType) {
      this.imgType = imgType;
   }

   @JsonProperty("img_type")
   public String getImgType() {
      return this.imgType;
   }

   @JsonProperty("img_url")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("img_url")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("img_width")
   public void setImgWidth(Integer imgWidth) {
      this.imgWidth = imgWidth;
   }

   @JsonProperty("img_width")
   public Integer getImgWidth() {
      return this.imgWidth;
   }

   @JsonProperty("state")
   public void setState(int state) {
      this.state = state;
   }

   @JsonProperty("state")
   public int getState() {
      return this.state;
   }

   @JsonProperty("use_flag")
   public void setUseFlag(Integer useFlag) {
      this.useFlag = useFlag;
   }

   @JsonProperty("use_flag")
   public Integer getUseFlag() {
      return this.useFlag;
   }

   @JsonProperty("vender_id")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("vender_id")
   public Long getVenderId() {
      return this.venderId;
   }
}
