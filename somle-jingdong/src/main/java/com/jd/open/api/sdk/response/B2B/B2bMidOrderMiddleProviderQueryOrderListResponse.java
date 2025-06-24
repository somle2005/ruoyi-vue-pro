package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList.RPCResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class B2bMidOrderMiddleProviderQueryOrderListResponse extends AbstractResponse {
   private RPCResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(RPCResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public RPCResult getReturnType() {
      return this.returnType;
   }
}
