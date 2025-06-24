package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ItemPicSkuDtoLong implements Serializable {
   private List<ImagePathDtoLong> imagePathDtoListLong;
   private String skuIdLong;

   @JsonProperty("image_path_dto_list_long")
   public void setImagePathDtoListLong(List<ImagePathDtoLong> imagePathDtoListLong) {
      this.imagePathDtoListLong = imagePathDtoListLong;
   }

   @JsonProperty("image_path_dto_list_long")
   public List<ImagePathDtoLong> getImagePathDtoListLong() {
      return this.imagePathDtoListLong;
   }

   @JsonProperty("sku_id_long")
   public void setSkuIdLong(String skuIdLong) {
      this.skuIdLong = skuIdLong;
   }

   @JsonProperty("sku_id_long")
   public String getSkuIdLong() {
      return this.skuIdLong;
   }
}
