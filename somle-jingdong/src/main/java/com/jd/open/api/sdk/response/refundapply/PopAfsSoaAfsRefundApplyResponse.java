package com.jd.open.api.sdk.response.refundapply;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.refundapply.VipApplyRefundService.response.afsRefundApply.PublicResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopAfsSoaAfsRefundApplyResponse extends AbstractResponse {
   private PublicResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(PublicResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public PublicResult getReturnType() {
      return this.returnType;
   }
}
