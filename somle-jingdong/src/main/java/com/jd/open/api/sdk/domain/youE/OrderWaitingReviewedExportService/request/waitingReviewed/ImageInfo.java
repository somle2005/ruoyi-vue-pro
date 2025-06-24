package com.jd.open.api.sdk.domain.youE.OrderWaitingReviewedExportService.request.waitingReviewed;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ImageInfo implements Serializable {
   private String imgUrl;
   private String imgName;
   private String imgType;

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("imgName")
   public void setImgName(String imgName) {
      this.imgName = imgName;
   }

   @JsonProperty("imgName")
   public String getImgName() {
      return this.imgName;
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
