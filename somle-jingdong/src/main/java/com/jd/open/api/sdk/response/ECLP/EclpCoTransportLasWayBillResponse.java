package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.transportLasWayBill.CoResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpCoTransportLasWayBillResponse extends AbstractResponse {
   private CoResult v1;

   @JsonProperty("v1")
   public void setV1(CoResult v1) {
      this.v1 = v1;
   }

   @JsonProperty("v1")
   public CoResult getV1() {
      return this.v1;
   }
}
