package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MarketDbpCartCartDataReadServiceGetCarSkuCountResponse extends AbstractResponse {
   private Long skuCount;

   @JsonProperty("skuCount")
   public void setSkuCount(Long skuCount) {
      this.skuCount = skuCount;
   }

   @JsonProperty("skuCount")
   public Long getSkuCount() {
      return this.skuCount;
   }
}
