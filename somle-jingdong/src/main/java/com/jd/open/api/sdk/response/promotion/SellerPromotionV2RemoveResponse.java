package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionV2RemoveResponse extends AbstractResponse {
   private boolean removeResult;

   @JsonProperty("remove_result")
   public void setRemoveResult(boolean removeResult) {
      this.removeResult = removeResult;
   }

   @JsonProperty("remove_result")
   public boolean getRemoveResult() {
      return this.removeResult;
   }
}
