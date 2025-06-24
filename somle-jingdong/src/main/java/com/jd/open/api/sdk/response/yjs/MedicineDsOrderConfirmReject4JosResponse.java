package com.jd.open.api.sdk.response.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.confirmReject4Jos.ConfirmReject4JosResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MedicineDsOrderConfirmReject4JosResponse extends AbstractResponse {
   private ConfirmReject4JosResult apiResult;

   @JsonProperty("apiResult")
   public void setApiResult(ConfirmReject4JosResult apiResult) {
      this.apiResult = apiResult;
   }

   @JsonProperty("apiResult")
   public ConfirmReject4JosResult getApiResult() {
      return this.apiResult;
   }
}
