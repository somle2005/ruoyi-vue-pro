package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EccItemSearchResponse extends AbstractResponse {
   private ItemPagingProxyResult result;

   @JsonProperty("result")
   public void setResult(ItemPagingProxyResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ItemPagingProxyResult getResult() {
      return this.result;
   }
}
