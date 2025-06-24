package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ItemPicSkuDtoGuide implements Serializable {
   private String skuIdGuide;
   private List<ImagePathDtoGuide> imagePathDtoListGuide;

   @JsonProperty("sku_id_guide")
   public void setSkuIdGuide(String skuIdGuide) {
      this.skuIdGuide = skuIdGuide;
   }

   @JsonProperty("sku_id_guide")
   public String getSkuIdGuide() {
      return this.skuIdGuide;
   }

   @JsonProperty("image_path_dto_list_guide")
   public void setImagePathDtoListGuide(List<ImagePathDtoGuide> imagePathDtoListGuide) {
      this.imagePathDtoListGuide = imagePathDtoListGuide;
   }

   @JsonProperty("image_path_dto_list_guide")
   public List<ImagePathDtoGuide> getImagePathDtoListGuide() {
      return this.imagePathDtoListGuide;
   }
}
