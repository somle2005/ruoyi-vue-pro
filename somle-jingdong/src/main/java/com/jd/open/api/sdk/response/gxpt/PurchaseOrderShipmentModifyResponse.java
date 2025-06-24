package com.jd.open.api.sdk.response.gxpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.modify.GxModifyShipmentResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PurchaseOrderShipmentModifyResponse extends AbstractResponse {
   private GxModifyShipmentResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(GxModifyShipmentResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public GxModifyShipmentResponse getReturnType() {
      return this.returnType;
   }
}
