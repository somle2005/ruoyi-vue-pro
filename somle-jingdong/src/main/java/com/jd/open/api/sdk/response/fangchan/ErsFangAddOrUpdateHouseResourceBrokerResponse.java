package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.BrokerSoaService.response.addOrUpdateHouseResourceBroker.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ErsFangAddOrUpdateHouseResourceBrokerResponse extends AbstractResponse {
   private Result addplotrateResult;

   @JsonProperty("addplotrate_result")
   public void setAddplotrateResult(Result addplotrateResult) {
      this.addplotrateResult = addplotrateResult;
   }

   @JsonProperty("addplotrate_result")
   public Result getAddplotrateResult() {
      return this.addplotrateResult;
   }
}
