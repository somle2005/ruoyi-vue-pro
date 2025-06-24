package com.jd.open.api.sdk.response.xny;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xny.CarOrderService.response.notifyChargeStatus.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CarNotifyChargeStatusResponse extends AbstractResponse {
   private Result response;

   @JsonProperty("response")
   public void setResponse(Result response) {
      this.response = response;
   }

   @JsonProperty("response")
   public Result getResponse() {
      return this.response;
   }
}
