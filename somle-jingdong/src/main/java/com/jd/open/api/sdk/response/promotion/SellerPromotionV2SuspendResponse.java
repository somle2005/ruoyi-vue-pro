package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionV2SuspendResponse extends AbstractResponse {
   private boolean suspendResult;

   @JsonProperty("suspend_result")
   public void setSuspendResult(boolean suspendResult) {
      this.suspendResult = suspendResult;
   }

   @JsonProperty("suspend_result")
   public boolean getSuspendResult() {
      return this.suspendResult;
   }
}
