package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ItemPicSkuDtoLucency implements Serializable {
   private List<ImagePathDtoLucency> imagePathDtoListLucency;
   private String skuIdLucency;

   @JsonProperty("image_path_dto_list_lucency")
   public void setImagePathDtoListLucency(List<ImagePathDtoLucency> imagePathDtoListLucency) {
      this.imagePathDtoListLucency = imagePathDtoListLucency;
   }

   @JsonProperty("image_path_dto_list_lucency")
   public List<ImagePathDtoLucency> getImagePathDtoListLucency() {
      return this.imagePathDtoListLucency;
   }

   @JsonProperty("sku_id_lucency")
   public void setSkuIdLucency(String skuIdLucency) {
      this.skuIdLucency = skuIdLucency;
   }

   @JsonProperty("sku_id_lucency")
   public String getSkuIdLucency() {
      return this.skuIdLucency;
   }
}
