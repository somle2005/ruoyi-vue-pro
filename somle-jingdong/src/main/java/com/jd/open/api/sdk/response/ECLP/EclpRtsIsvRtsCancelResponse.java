package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsCancel.RtsResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpRtsIsvRtsCancelResponse extends AbstractResponse {
   private RtsResult rtsResult;

   @JsonProperty("rtsResult")
   public void setRtsResult(RtsResult rtsResult) {
      this.rtsResult = rtsResult;
   }

   @JsonProperty("rtsResult")
   public RtsResult getRtsResult() {
      return this.rtsResult;
   }
}
