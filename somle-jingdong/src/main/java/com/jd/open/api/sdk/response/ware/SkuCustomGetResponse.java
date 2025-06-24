package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.Sku;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SkuCustomGetResponse extends AbstractResponse {
   private Sku sku;

   @JsonProperty("sku")
   public Sku getSku() {
      return this.sku;
   }

   @JsonProperty("sku")
   public void setSku(Sku sku) {
      this.sku = sku;
   }
}
