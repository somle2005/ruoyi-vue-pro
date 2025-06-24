package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.BrokerSoaService.response.addOrUpdateBroker.IntValueResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ErsFangAddOrUpdateBrokerResponse extends AbstractResponse {
   private IntValueResult addorupdatebrokerResult;

   @JsonProperty("addorupdatebroker_result")
   public void setAddorupdatebrokerResult(IntValueResult addorupdatebrokerResult) {
      this.addorupdatebrokerResult = addorupdatebrokerResult;
   }

   @JsonProperty("addorupdatebroker_result")
   public IntValueResult getAddorupdatebrokerResult() {
      return this.addorupdatebrokerResult;
   }
}
