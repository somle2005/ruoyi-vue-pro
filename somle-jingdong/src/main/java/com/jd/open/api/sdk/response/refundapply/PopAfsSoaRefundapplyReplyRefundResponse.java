package com.jd.open.api.sdk.response.refundapply;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.refundapply.RefundApplySoaService.response.replyRefund.ReplyResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopAfsSoaRefundapplyReplyRefundResponse extends AbstractResponse {
   private ReplyResult replyResult;

   @JsonProperty("replyResult")
   public void setReplyResult(ReplyResult replyResult) {
      this.replyResult = replyResult;
   }

   @JsonProperty("replyResult")
   public ReplyResult getReplyResult() {
      return this.replyResult;
   }
}
