package com.jd.open.api.sdk.response.qqdkfptjq;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OmnicOrderSyncpickupcodeResponse extends AbstractResponse {
   private String result;

   @JsonProperty("result")
   public void setResult(String result) {
      this.result = result;
   }

   @JsonProperty("result")
   public String getResult() {
      return this.result;
   }
}
