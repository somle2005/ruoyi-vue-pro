package com.jd.open.api.sdk.response.jyy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jyy.VenderAppointOrderFacade.response.syncstatus.SoaResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JingyiyueVenderapiSyncstatusResponse extends AbstractResponse {
   private SoaResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(SoaResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SoaResponse getReturnType() {
      return this.returnType;
   }
}
