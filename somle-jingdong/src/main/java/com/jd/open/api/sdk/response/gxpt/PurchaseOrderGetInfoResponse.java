package com.jd.open.api.sdk.response.gxpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.info.GxOrderInfoResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PurchaseOrderGetInfoResponse extends AbstractResponse {
   private GxOrderInfoResponse result;

   @JsonProperty("result")
   public void setResult(GxOrderInfoResponse result) {
      this.result = result;
   }

   @JsonProperty("result")
   public GxOrderInfoResponse getResult() {
      return this.result;
   }
}
