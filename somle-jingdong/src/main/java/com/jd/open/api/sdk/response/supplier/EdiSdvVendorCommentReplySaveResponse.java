package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.VendorCommentJosService.response.save.VendorCommentReplyDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiSdvVendorCommentReplySaveResponse extends AbstractResponse {
   private VendorCommentReplyDTO commentReplyResult;

   @JsonProperty("commentReplyResult")
   public void setCommentReplyResult(VendorCommentReplyDTO commentReplyResult) {
      this.commentReplyResult = commentReplyResult;
   }

   @JsonProperty("commentReplyResult")
   public VendorCommentReplyDTO getCommentReplyResult() {
      return this.commentReplyResult;
   }
}
