package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.response.skuCustomServiceBatchApply.SkuServiceBatchApplyResp;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipCustomizedSkuCustomServiceBatchApplyResponse extends AbstractResponse {
   private SkuServiceBatchApplyResp returnType;

   @JsonProperty("returnType")
   public void setReturnType(SkuServiceBatchApplyResp returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SkuServiceBatchApplyResp getReturnType() {
      return this.returnType;
   }
}
