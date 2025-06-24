package com.jd.open.api.sdk.response.spbq;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.spbq.BdsSymbolBindRpc.response.createSpuSymbolBind.BdsRpcResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CreateSpuSymbolBindResponse extends AbstractResponse {
   private BdsRpcResponse response;

   @JsonProperty("response")
   public void setResponse(BdsRpcResponse response) {
      this.response = response;
   }

   @JsonProperty("response")
   public BdsRpcResponse getResponse() {
      return this.response;
   }
}
