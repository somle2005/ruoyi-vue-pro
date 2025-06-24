package com.jd.open.api.sdk.domain.ware.JosWareImageService.response.airesizeimg;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosWareImageResponse implements Serializable {
   private List<JosRectangleImage> rectangleImageList;

   @JsonProperty("rectangleImageList")
   public void setRectangleImageList(List<JosRectangleImage> rectangleImageList) {
      this.rectangleImageList = rectangleImageList;
   }

   @JsonProperty("rectangleImageList")
   public List<JosRectangleImage> getRectangleImageList() {
      return this.rectangleImageList;
   }
}
