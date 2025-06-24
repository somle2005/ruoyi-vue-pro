package com.jd.open.api.sdk.response.xny;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xny.CarStationService.response.notifyStationInfo.ChargeResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CarNotifyStationInfoResponse extends AbstractResponse {
   private ChargeResponse response;

   @JsonProperty("response")
   public void setResponse(ChargeResponse response) {
      this.response = response;
   }

   @JsonProperty("response")
   public ChargeResponse getResponse() {
      return this.response;
   }
}
