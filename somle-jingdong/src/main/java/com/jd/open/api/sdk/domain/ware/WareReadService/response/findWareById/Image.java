package com.jd.open.api.sdk.domain.ware.WareReadService.response.findWareById;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Image implements Serializable {
   private String colorId;
   private Long imgId;
   private Integer imgIndex;
   private String imgUrl;
   private String imgZoneId;
   private Integer isGgt;

   @JsonProperty("colorId")
   public void setColorId(String colorId) {
      this.colorId = colorId;
   }

   @JsonProperty("colorId")
   public String getColorId() {
      return this.colorId;
   }

   @JsonProperty("imgId")
   public void setImgId(Long imgId) {
      this.imgId = imgId;
   }

   @JsonProperty("imgId")
   public Long getImgId() {
      return this.imgId;
   }

   @JsonProperty("imgIndex")
   public void setImgIndex(Integer imgIndex) {
      this.imgIndex = imgIndex;
   }

   @JsonProperty("imgIndex")
   public Integer getImgIndex() {
      return this.imgIndex;
   }

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("imgZoneId")
   public void setImgZoneId(String imgZoneId) {
      this.imgZoneId = imgZoneId;
   }

   @JsonProperty("imgZoneId")
   public String getImgZoneId() {
      return this.imgZoneId;
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
