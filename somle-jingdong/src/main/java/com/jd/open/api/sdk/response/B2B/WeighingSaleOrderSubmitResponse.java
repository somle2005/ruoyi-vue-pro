package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.NsspSubmitProvider.response.submit.RPCResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WeighingSaleOrderSubmitResponse extends AbstractResponse {
   private RPCResult RPCResult;

   @JsonProperty("RPCResult")
   public void setRPCResult(RPCResult RPCResult) {
      this.RPCResult = RPCResult;
   }

   @JsonProperty("RPCResult")
   public RPCResult getRPCResult() {
      return this.RPCResult;
   }
}
