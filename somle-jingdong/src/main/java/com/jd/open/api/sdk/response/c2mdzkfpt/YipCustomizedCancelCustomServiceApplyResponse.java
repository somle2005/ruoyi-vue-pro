package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.response.cancelCustomServiceApply.SkuServiceCancelApplyResp;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipCustomizedCancelCustomServiceApplyResponse extends AbstractResponse {
   private SkuServiceCancelApplyResp returnType;

   @JsonProperty("returnType")
   public void setReturnType(SkuServiceCancelApplyResp returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SkuServiceCancelApplyResp getReturnType() {
      return this.returnType;
   }
}
