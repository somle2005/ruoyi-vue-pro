package com.jd.open.api.sdk.response.refundapply;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.refundapply.RefundapplySaf.response.querylist.RefundapplyResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopAfsRefundapplyQuerylistResponse extends AbstractResponse {
   private RefundapplyResponse refundApplyResponse;

   @JsonProperty("refundApplyResponse")
   public void setRefundApplyResponse(RefundapplyResponse refundApplyResponse) {
      this.refundApplyResponse = refundApplyResponse;
   }

   @JsonProperty("refundApplyResponse")
   public RefundapplyResponse getRefundApplyResponse() {
      return this.refundApplyResponse;
   }
}
