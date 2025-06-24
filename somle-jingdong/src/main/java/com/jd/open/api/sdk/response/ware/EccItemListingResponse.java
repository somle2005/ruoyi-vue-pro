package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EccItemListingResponse extends AbstractResponse {
   private ItemResult result;

   @JsonProperty("result")
   public void setResult(ItemResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ItemResult getResult() {
      return this.result;
   }
}
