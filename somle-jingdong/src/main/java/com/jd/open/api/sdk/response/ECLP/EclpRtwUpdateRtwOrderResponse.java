package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.updateRtwOrder.RtwUpdateResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpRtwUpdateRtwOrderResponse extends AbstractResponse {
   private RtwUpdateResult rtwUpdateResult;

   @JsonProperty("rtwUpdateResult")
   public void setRtwUpdateResult(RtwUpdateResult rtwUpdateResult) {
      this.rtwUpdateResult = rtwUpdateResult;
   }

   @JsonProperty("rtwUpdateResult")
   public RtwUpdateResult getRtwUpdateResult() {
      return this.rtwUpdateResult;
   }
}
