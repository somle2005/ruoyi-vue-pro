package com.jd.open.api.sdk.response.fresh7;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fresh7.JosApi.response.offline.StateResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JiliTcsOfflineResponse extends AbstractResponse {
   private StateResult result;

   @JsonProperty("result")
   public void setResult(StateResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public StateResult getResult() {
      return this.result;
   }
}
