package com.jd.open.api.sdk.domain.mall.ProductWrapService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ImagePath implements Serializable {
   private Long skuId;
   private List<Image> imageList;

   @JsonProperty("sku_id")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("image_list")
   public void setImageList(List<Image> imageList) {
      this.imageList = imageList;
   }

   @JsonProperty("image_list")
   public List<Image> getImageList() {
      return this.imageList;
   }
}
