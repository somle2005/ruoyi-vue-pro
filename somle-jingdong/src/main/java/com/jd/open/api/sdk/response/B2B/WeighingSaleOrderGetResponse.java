package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.NsspInfoProvider.response.get.RPCResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WeighingSaleOrderGetResponse extends AbstractResponse {
   private RPCResult rPCResult;

   @JsonProperty("rPCResult")
   public void setRPCResult(RPCResult rPCResult) {
      this.rPCResult = rPCResult;
   }

   @JsonProperty("rPCResult")
   public RPCResult getRPCResult() {
      return this.rPCResult;
   }
}
