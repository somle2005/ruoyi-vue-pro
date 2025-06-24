package com.jd.open.api.sdk.domain.platform.JosDraftReadService.response.getDraftInfoByVersion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosImage implements Serializable {
   private String imgUrl;
   private Long imgId;
   private String colorId;
   private Integer index;
   private String attrValueAlias;
   private Integer isGgt;

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("imgId")
   public void setImgId(Long imgId) {
      this.imgId = imgId;
   }

   @JsonProperty("imgId")
   public Long getImgId() {
      return this.imgId;
   }

   @JsonProperty("colorId")
   public void setColorId(String colorId) {
      this.colorId = colorId;
   }

   @JsonProperty("colorId")
   public String getColorId() {
      return this.colorId;
   }

   @JsonProperty("index")
   public void setIndex(Integer index) {
      this.index = index;
   }

   @JsonProperty("index")
   public Integer getIndex() {
      return this.index;
   }

   @JsonProperty("attrValueAlias")
   public void setAttrValueAlias(String attrValueAlias) {
      this.attrValueAlias = attrValueAlias;
   }

   @JsonProperty("attrValueAlias")
   public String getAttrValueAlias() {
      return this.attrValueAlias;
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
