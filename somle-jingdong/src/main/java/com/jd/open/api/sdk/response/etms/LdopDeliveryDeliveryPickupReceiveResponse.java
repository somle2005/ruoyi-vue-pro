package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.DeliveryPickupReceiveApi.response.deliveryPickupReceive.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopDeliveryDeliveryPickupReceiveResponse extends AbstractResponse {
   private ResponseDTO receivedeliverypickupbillResult;

   @JsonProperty("receivedeliverypickupbill_result")
   public void setReceivedeliverypickupbillResult(ResponseDTO receivedeliverypickupbillResult) {
      this.receivedeliverypickupbillResult = receivedeliverypickupbillResult;
   }

   @JsonProperty("receivedeliverypickupbill_result")
   public ResponseDTO getReceivedeliverypickupbillResult() {
      return this.receivedeliverypickupbillResult;
   }
}
