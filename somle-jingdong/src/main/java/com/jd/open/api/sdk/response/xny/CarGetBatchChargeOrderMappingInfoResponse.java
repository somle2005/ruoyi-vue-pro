package com.jd.open.api.sdk.response.xny;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xny.CarOrderService.response.getBatchChargeOrderMappingInfo.ChargeResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CarGetBatchChargeOrderMappingInfoResponse extends AbstractResponse {
   private ChargeResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(ChargeResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ChargeResponse getReturnType() {
      return this.returnType;
   }
}
