package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.OfflineSettleJsfService.response.getRecyclerSettleBill.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UeRecoveryOrderGetRecyclerSettleBillResponse extends AbstractResponse {
   private Result returnType;

   @JsonProperty("returnType")
   public void setReturnType(Result returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public Result getReturnType() {
      return this.returnType;
   }
}
