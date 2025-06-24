package com.jd.open.api.sdk.domain.ware.JosWareImageService.request.airesizeimg;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosWareImageRequest implements Serializable {
   private String skuId;
   private List<JosSquareImage> squareImageList;

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("squareImageList")
   public void setSquareImageList(List<JosSquareImage> squareImageList) {
      this.squareImageList = squareImageList;
   }

   @JsonProperty("squareImageList")
   public List<JosSquareImage> getSquareImageList() {
      return this.squareImageList;
   }
}
