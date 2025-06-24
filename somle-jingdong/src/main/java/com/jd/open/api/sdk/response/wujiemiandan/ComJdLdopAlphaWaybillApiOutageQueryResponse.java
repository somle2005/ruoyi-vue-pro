package com.jd.open.api.sdk.response.wujiemiandan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wujiemiandan.OutageQueryApi.response.outageQuery.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ComJdLdopAlphaWaybillApiOutageQueryResponse extends AbstractResponse {
   private ResponseDTO returnType;

   @JsonProperty("returnType")
   public void setReturnType(ResponseDTO returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ResponseDTO getReturnType() {
      return this.returnType;
   }
}
