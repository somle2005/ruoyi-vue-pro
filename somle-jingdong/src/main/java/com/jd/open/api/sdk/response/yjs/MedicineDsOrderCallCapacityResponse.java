package com.jd.open.api.sdk.response.yjs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.callCapacity.CallCapacityResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class MedicineDsOrderCallCapacityResponse extends AbstractResponse {
   private CallCapacityResult apiResult;

   @JsonProperty("apiResult")
   public void setApiResult(CallCapacityResult apiResult) {
      this.apiResult = apiResult;
   }

   @JsonProperty("apiResult")
   public CallCapacityResult getApiResult() {
      return this.apiResult;
   }
}
