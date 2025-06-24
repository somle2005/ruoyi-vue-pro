package com.jd.open.api.sdk.response.gxpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.out.GxStockOutResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PurchaseOrderStockOutResponse extends AbstractResponse {
   private GxStockOutResponse result;

   @JsonProperty("result")
   public void setResult(GxStockOutResponse result) {
      this.result = result;
   }

   @JsonProperty("result")
   public GxStockOutResponse getResult() {
      return this.result;
   }
}
