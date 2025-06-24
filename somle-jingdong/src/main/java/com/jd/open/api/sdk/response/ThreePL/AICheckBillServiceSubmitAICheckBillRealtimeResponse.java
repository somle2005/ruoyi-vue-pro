package com.jd.open.api.sdk.response.ThreePL;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ThreePL.AICheckBillService.response.submitAICheckBillRealtime.SdkRpcResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AICheckBillServiceSubmitAICheckBillRealtimeResponse extends AbstractResponse {
   private SdkRpcResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(SdkRpcResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SdkRpcResult getReturnType() {
      return this.returnType;
   }
}
