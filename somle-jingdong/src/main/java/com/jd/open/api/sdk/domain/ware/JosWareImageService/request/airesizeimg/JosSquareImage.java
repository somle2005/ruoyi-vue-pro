package com.jd.open.api.sdk.domain.ware.JosWareImageService.request.airesizeimg;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosSquareImage implements Serializable {
   private Integer imgIndex;
   private String imageUrl;

   @JsonProperty("imgIndex")
   public void setImgIndex(Integer imgIndex) {
      this.imgIndex = imgIndex;
   }

   @JsonProperty("imgIndex")
   public Integer getImgIndex() {
      return this.imgIndex;
   }

   @JsonProperty("imageUrl")
   public void setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
   }

   @JsonProperty("imageUrl")
   public String getImageUrl() {
      return this.imageUrl;
   }
}
