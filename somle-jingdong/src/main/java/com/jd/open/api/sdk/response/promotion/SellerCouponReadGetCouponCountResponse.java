package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerCouponReadGetCouponCountResponse extends AbstractResponse {
   private int getcouponcountResult;

   @JsonProperty("getcouponcount_result")
   public void setGetcouponcountResult(int getcouponcountResult) {
      this.getcouponcountResult = getcouponcountResult;
   }

   @JsonProperty("getcouponcount_result")
   public int getGetcouponcountResult() {
      return this.getcouponcountResult;
   }
}
