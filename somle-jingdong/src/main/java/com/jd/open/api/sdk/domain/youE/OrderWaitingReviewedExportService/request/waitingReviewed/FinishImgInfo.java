package com.jd.open.api.sdk.domain.youE.OrderWaitingReviewedExportService.request.waitingReviewed;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class FinishImgInfo implements Serializable {
   private List<ImageInfo> imageInfoList;

   @JsonProperty("imageInfoList")
   public void setImageInfoList(List<ImageInfo> imageInfoList) {
      this.imageInfoList = imageInfoList;
   }

   @JsonProperty("imageInfoList")
   public List<ImageInfo> getImageInfoList() {
      return this.imageInfoList;
   }
}
