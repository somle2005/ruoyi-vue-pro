package com.jd.open.api.sdk.domain.ware.ProductManagementService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ShopSkuInfoDto implements Serializable {
   private Long skuId;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }
}
