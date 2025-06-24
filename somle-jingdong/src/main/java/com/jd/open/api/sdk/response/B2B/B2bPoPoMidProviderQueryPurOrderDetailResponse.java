package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.PoMidProvider.response.queryPurOrderDetail.RPCResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class B2bPoPoMidProviderQueryPurOrderDetailResponse extends AbstractResponse {
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
