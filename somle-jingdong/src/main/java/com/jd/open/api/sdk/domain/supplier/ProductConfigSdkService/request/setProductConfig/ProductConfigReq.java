package com.jd.open.api.sdk.domain.supplier.ProductConfigSdkService.request.setProductConfig;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ProductConfigReq implements Serializable {
   private List<ProductConfigInfoDto> productConfigInfoDtoList;

   @JsonProperty("productConfigInfoDtoList")
   public void setProductConfigInfoDtoList(List<ProductConfigInfoDto> productConfigInfoDtoList) {
      this.productConfigInfoDtoList = productConfigInfoDtoList;
   }

   @JsonProperty("productConfigInfoDtoList")
   public List<ProductConfigInfoDto> getProductConfigInfoDtoList() {
      return this.productConfigInfoDtoList;
   }
}
