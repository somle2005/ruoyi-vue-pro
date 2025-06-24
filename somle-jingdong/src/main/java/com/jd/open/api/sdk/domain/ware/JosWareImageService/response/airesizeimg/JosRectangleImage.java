package com.jd.open.api.sdk.domain.ware.JosWareImageService.response.airesizeimg;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosRectangleImage implements Serializable {
   private String imgUrl;
   private Integer imgIndex;
   private String skuId;

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("imgIndex")
   public void setImgIndex(Integer imgIndex) {
      this.imgIndex = imgIndex;
   }

   @JsonProperty("imgIndex")
   public Integer getImgIndex() {
      return this.imgIndex;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }
}
