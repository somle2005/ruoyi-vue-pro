package com.jd.open.api.sdk.response.refundapply;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.refundapply.RefundapplySaf.response.querybyid.RefundapplyResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopAfsRefundapplyQuerybyidResponse extends AbstractResponse {
   private RefundapplyResponse refundapplyResponse;

   @JsonProperty("refundapplyResponse")
   public void setRefundapplyResponse(RefundapplyResponse refundapplyResponse) {
      this.refundapplyResponse = refundapplyResponse;
   }

   @JsonProperty("refundapplyResponse")
   public RefundapplyResponse getRefundapplyResponse() {
      return this.refundapplyResponse;
   }
}
