package com.jd.open.api.sdk.response.gxpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.infos.GxOrderListResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PurchaseOrderSelectInfosResponse extends AbstractResponse {
   private GxOrderListResponse result;

   @JsonProperty("result")
   public void setResult(GxOrderListResponse result) {
      this.result = result;
   }

   @JsonProperty("result")
   public GxOrderListResponse getResult() {
      return this.result;
   }
}
