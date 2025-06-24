package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class SellerPromotionDeleteSkuInPromoResponse extends AbstractResponse {
   private List<Long> result;

   @JsonProperty("result")
   public void setResult(List<Long> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<Long> getResult() {
      return this.result;
   }
}
