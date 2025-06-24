package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.Sku;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class SkuWriteUpdateSkusResponse extends AbstractResponse {
   private List<Sku> skuList;

   @JsonProperty("skuList")
   public void setSkuList(List<Sku> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("skuList")
   public List<Sku> getSkuList() {
      return this.skuList;
   }
}
