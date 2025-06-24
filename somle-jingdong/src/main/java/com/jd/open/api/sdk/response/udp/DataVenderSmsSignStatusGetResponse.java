package com.jd.open.api.sdk.response.udp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.udp.IsvJsfService.response.get.StatusDataResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DataVenderSmsSignStatusGetResponse extends AbstractResponse {
   private StatusDataResult result;

   @JsonProperty("result")
   public void setResult(StatusDataResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public StatusDataResult getResult() {
      return this.result;
   }
}
