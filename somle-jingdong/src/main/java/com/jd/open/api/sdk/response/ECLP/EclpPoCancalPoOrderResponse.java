package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.cancalPoOrder.CancelResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpPoCancalPoOrderResponse extends AbstractResponse {
   private CancelResult poResult;

   @JsonProperty("poResult")
   public void setPoResult(CancelResult poResult) {
      this.poResult = poResult;
   }

   @JsonProperty("poResult")
   public CancelResult getPoResult() {
      return this.poResult;
   }
}
