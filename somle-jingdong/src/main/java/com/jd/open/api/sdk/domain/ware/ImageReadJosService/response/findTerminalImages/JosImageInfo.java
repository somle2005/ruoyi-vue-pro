package com.jd.open.api.sdk.domain.ware.ImageReadJosService.response.findTerminalImages;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosImageInfo implements Serializable {
   private Integer imgSize;
   private Integer isMain;
   private Integer index;
   private String imgDfsUrl;
   private Integer imgType;
   private Integer isGgt;

   @JsonProperty("imgSize")
   public void setImgSize(Integer imgSize) {
      this.imgSize = imgSize;
   }

   @JsonProperty("imgSize")
   public Integer getImgSize() {
      return this.imgSize;
   }

   @JsonProperty("isMain")
   public void setIsMain(Integer isMain) {
      this.isMain = isMain;
   }

   @JsonProperty("isMain")
   public Integer getIsMain() {
      return this.isMain;
   }

   @JsonProperty("index")
   public void setIndex(Integer index) {
      this.index = index;
   }

   @JsonProperty("index")
   public Integer getIndex() {
      return this.index;
   }

   @JsonProperty("imgDfsUrl")
   public void setImgDfsUrl(String imgDfsUrl) {
      this.imgDfsUrl = imgDfsUrl;
   }

   @JsonProperty("imgDfsUrl")
   public String getImgDfsUrl() {
      return this.imgDfsUrl;
   }

   @JsonProperty("imgType")
   public void setImgType(Integer imgType) {
      this.imgType = imgType;
   }

   @JsonProperty("imgType")
   public Integer getImgType() {
      return this.imgType;
   }

   @JsonProperty("isGgt")
   public void setIsGgt(Integer isGgt) {
      this.isGgt = isGgt;
   }

   @JsonProperty("isGgt")
   public Integer getIsGgt() {
      return this.isGgt;
   }
}
