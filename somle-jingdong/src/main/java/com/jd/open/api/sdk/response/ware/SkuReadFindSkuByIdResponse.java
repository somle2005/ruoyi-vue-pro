package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.SkuReadService.response.findSkuById.Sku;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SkuReadFindSkuByIdResponse extends AbstractResponse {
   private Sku sku;

   @JsonProperty("sku")
   public void setSku(Sku sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public Sku getSku() {
      return this.sku;
   }
}
