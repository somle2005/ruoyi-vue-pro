package com.jd.open.api.sdk.response.Marketing;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionRemovePromoUsersResponse extends AbstractResponse {
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
