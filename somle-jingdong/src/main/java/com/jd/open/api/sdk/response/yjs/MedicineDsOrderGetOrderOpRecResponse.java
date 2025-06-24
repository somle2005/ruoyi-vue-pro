package com.jd.open.api.sdk.response.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getOrderOpRec.GetOrderOpRecResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MedicineDsOrderGetOrderOpRecResponse extends AbstractResponse {
   private GetOrderOpRecResult apiResult;

   @JsonProperty("apiResult")
   public void setApiResult(GetOrderOpRecResult apiResult) {
      this.apiResult = apiResult;
   }

   @JsonProperty("apiResult")
   public GetOrderOpRecResult getApiResult() {
      return this.apiResult;
   }
}
