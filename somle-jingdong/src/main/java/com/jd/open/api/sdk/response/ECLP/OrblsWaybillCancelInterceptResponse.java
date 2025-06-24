package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.OrbLsCancelWaybillInterceptService.response.intercept.CancelWaybillInterceptRes;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrblsWaybillCancelInterceptResponse extends AbstractResponse {
   private CancelWaybillInterceptRes returnType;

   @JsonProperty("returnType")
   public void setReturnType(CancelWaybillInterceptRes returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public CancelWaybillInterceptRes getReturnType() {
      return this.returnType;
   }
}
