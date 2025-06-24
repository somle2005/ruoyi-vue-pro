package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerPromotionV2ApproveResponse extends AbstractResponse {
   private boolean approveResult;

   @JsonProperty("approve_result")
   public void setApproveResult(boolean approveResult) {
      this.approveResult = approveResult;
   }

   @JsonProperty("approve_result")
   public boolean getApproveResult() {
      return this.approveResult;
   }
}
