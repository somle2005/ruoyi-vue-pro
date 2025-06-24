package com.jd.open.api.sdk.response.customsglobalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.customsglobalAPI.OnlineRecordJosService.response.customsUpdate.ORNumberResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopWareGpsApiOnlineRecordJosServiceCustomsUpdateResponse extends AbstractResponse {
   private ORNumberResult result;

   @JsonProperty("result")
   public void setResult(ORNumberResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ORNumberResult getResult() {
      return this.result;
   }
}
