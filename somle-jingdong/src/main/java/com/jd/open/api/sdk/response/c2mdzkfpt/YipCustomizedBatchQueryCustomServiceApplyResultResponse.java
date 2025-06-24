package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.response.batchQueryCustomServiceApplyResult.SkuServiceBatchApplyResultResp;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipCustomizedBatchQueryCustomServiceApplyResultResponse extends AbstractResponse {
   private SkuServiceBatchApplyResultResp returnType;

   @JsonProperty("returnType")
   public void setReturnType(SkuServiceBatchApplyResultResp returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SkuServiceBatchApplyResultResp getReturnType() {
      return this.returnType;
   }
}
