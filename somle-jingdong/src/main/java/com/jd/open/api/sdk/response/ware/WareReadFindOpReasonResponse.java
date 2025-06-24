package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.OpReasonReadService.response.findOpReason.OpReason;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareReadFindOpReasonResponse extends AbstractResponse {
   private OpReason opReason;

   @JsonProperty("opReason")
   public void setOpReason(OpReason opReason) {
      this.opReason = opReason;
   }

   @JsonProperty("opReason")
   public OpReason getOpReason() {
      return this.opReason;
   }
}
