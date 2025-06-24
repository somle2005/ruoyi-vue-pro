package com.jd.open.api.sdk.domain.imgzone.ImageInfoJosService.response.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ImageInfoDto implements Serializable {
   private String ext;
   private Integer imgWidth;
   private String imgId;
   private Integer imgSize;
   private Integer opType;
   private String imgName;
   private String imgUrl;
   private Long cateId;
   private Integer imgHeight;
   private Integer state;
   private Integer imgSrc;
   private String imgType;

   @JsonProperty("ext")
   public void setExt(String ext) {
      this.ext = ext;
   }

   @JsonProperty("ext")
   public String getExt() {
      return this.ext;
   }

   @JsonProperty("imgWidth")
   public void setImgWidth(Integer imgWidth) {
      this.imgWidth = imgWidth;
   }

   @JsonProperty("imgWidth")
   public Integer getImgWidth() {
      return this.imgWidth;
   }

   @JsonProperty("imgId")
   public void setImgId(String imgId) {
      this.imgId = imgId;
   }

   @JsonProperty("imgId")
   public String getImgId() {
      return this.imgId;
   }

   @JsonProperty("imgSize")
   public void setImgSize(Integer imgSize) {
      this.imgSize = imgSize;
   }

   @JsonProperty("imgSize")
   public Integer getImgSize() {
      return this.imgSize;
   }

   @JsonProperty("opType")
   public void setOpType(Integer opType) {
      this.opType = opType;
   }

   @JsonProperty("opType")
   public Integer getOpType() {
      return this.opType;
   }

   @JsonProperty("imgName")
   public void setImgName(String imgName) {
      this.imgName = imgName;
   }

   @JsonProperty("imgName")
   public String getImgName() {
      return this.imgName;
   }

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("cateId")
   public void setCateId(Long cateId) {
      this.cateId = cateId;
   }

   @JsonProperty("cateId")
   public Long getCateId() {
      return this.cateId;
   }

   @JsonProperty("imgHeight")
   public void setImgHeight(Integer imgHeight) {
      this.imgHeight = imgHeight;
   }

   @JsonProperty("imgHeight")
   public Integer getImgHeight() {
      return this.imgHeight;
   }

   @JsonProperty("state")
   public void setState(Integer state) {
      this.state = state;
   }

   @JsonProperty("state")
   public Integer getState() {
      return this.state;
   }

   @JsonProperty("imgSrc")
   public void setImgSrc(Integer imgSrc) {
      this.imgSrc = imgSrc;
   }

   @JsonProperty("imgSrc")
   public Integer getImgSrc() {
      return this.imgSrc;
   }

   @JsonProperty("imgType")
   public void setImgType(String imgType) {
      this.imgType = imgType;
   }

   @JsonProperty("imgType")
   public String getImgType() {
      return this.imgType;
   }
}
