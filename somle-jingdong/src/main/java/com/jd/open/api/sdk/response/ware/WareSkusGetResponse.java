package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.Sku;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class WareSkusGetResponse extends AbstractResponse {
   private List<Sku> skus;

   @JsonProperty("skus")
   public List<Sku> getSkus() {
      return this.skus;
   }

   @JsonProperty("skus")
   public void setSkus(List<Sku> skus) {
      this.skus = skus;
   }
}
