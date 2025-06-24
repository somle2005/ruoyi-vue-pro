package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerCouponWriteCloseResponse extends AbstractResponse {
   private boolean closeResult;

   @JsonProperty("close_result")
   public void setCloseResult(boolean closeResult) {
      this.closeResult = closeResult;
   }

   @JsonProperty("close_result")
   public boolean getCloseResult() {
      return this.closeResult;
   }
}
