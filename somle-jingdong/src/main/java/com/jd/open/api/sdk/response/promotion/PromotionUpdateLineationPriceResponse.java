package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromotionUpdateLineationPriceResponse extends AbstractResponse {
   private String result;

   @JsonProperty("result")
   public void setResult(String result) {
      this.result = result;
   }

   @JsonProperty("result")
   public String getResult() {
      return this.result;
   }
}
