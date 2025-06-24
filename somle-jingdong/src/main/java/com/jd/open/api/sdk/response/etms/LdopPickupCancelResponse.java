package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.PickupOrderCancelApi.response.cancel.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopPickupCancelResponse extends AbstractResponse {
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
