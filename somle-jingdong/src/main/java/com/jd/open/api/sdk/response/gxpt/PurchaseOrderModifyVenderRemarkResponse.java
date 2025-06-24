package com.jd.open.api.sdk.response.gxpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.modifyVenderRemark.GXResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PurchaseOrderModifyVenderRemarkResponse extends AbstractResponse {
   private GXResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(GXResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public GXResponse getReturnType() {
      return this.returnType;
   }
}
