package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EccSkuGetResponse extends AbstractResponse {
   private com.jd.open.api.sdk.request.ware.ItemSkuResult itemSkuResult;

   @JsonProperty("item_sku_result")
   public void setItemSkuResult(com.jd.open.api.sdk.request.ware.ItemSkuResult itemSkuResult) {
      this.itemSkuResult = itemSkuResult;
   }

   @JsonProperty("item_sku_result")
   public com.jd.open.api.sdk.request.ware.ItemSkuResult getItemSkuResult() {
      return this.itemSkuResult;
   }
}
