package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EccItemDelistingResponse extends AbstractResponse {
   private ItemResult result;

   @JsonProperty("item_result")
   public void setResult(ItemResult result) {
      this.result = result;
   }

   @JsonProperty("item_result")
   public ItemResult getResult() {
      return this.result;
   }
}
