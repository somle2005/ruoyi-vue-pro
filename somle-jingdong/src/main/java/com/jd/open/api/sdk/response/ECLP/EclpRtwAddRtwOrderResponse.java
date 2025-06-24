package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.addRtwOrder.RtwResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpRtwAddRtwOrderResponse extends AbstractResponse {
   private RtwResult transportrtwResult;

   @JsonProperty("transportrtw_result")
   public void setTransportrtwResult(RtwResult transportrtwResult) {
      this.transportrtwResult = transportrtwResult;
   }

   @JsonProperty("transportrtw_result")
   public RtwResult getTransportrtwResult() {
      return this.transportrtwResult;
   }
}
