package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ItemPicSkuDto implements Serializable {
   private List<ImagePathDto> imagePathDtoList;
   private String skuId;

   @JsonProperty("image_path_dto_list")
   public void setImagePathDtoList(List<ImagePathDto> imagePathDtoList) {
      this.imagePathDtoList = imagePathDtoList;
   }

   @JsonProperty("image_path_dto_list")
   public List<ImagePathDto> getImagePathDtoList() {
      return this.imagePathDtoList;
   }

   @JsonProperty("sku_id")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("sku_id")
   public String getSkuId() {
      return this.skuId;
   }
}
