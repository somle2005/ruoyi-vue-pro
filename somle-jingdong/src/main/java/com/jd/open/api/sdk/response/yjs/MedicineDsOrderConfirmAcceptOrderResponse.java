package com.jd.open.api.sdk.response.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.confirmAcceptOrder.ConfirmAcceptOrderResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MedicineDsOrderConfirmAcceptOrderResponse extends AbstractResponse {
   private ConfirmAcceptOrderResult apiResult;

   @JsonProperty("apiResult")
   public void setApiResult(ConfirmAcceptOrderResult apiResult) {
      this.apiResult = apiResult;
   }

   @JsonProperty("apiResult")
   public ConfirmAcceptOrderResult getApiResult() {
      return this.apiResult;
   }
}
