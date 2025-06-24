package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderShipmentService.response.shipment.OperatorResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderShipmentResponse extends AbstractResponse {
   private OperatorResult sopjosshipmentResult;

   @JsonProperty("sopjosshipment_result")
   public void setSopjosshipmentResult(OperatorResult sopjosshipmentResult) {
      this.sopjosshipmentResult = sopjosshipmentResult;
   }

   @JsonProperty("sopjosshipment_result")
   public OperatorResult getSopjosshipmentResult() {
      return this.sopjosshipmentResult;
   }
}
