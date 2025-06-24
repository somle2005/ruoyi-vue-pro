package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.PickupReceiveApi.response.receive.PickUpResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopReceivePickuporderReceiveResponse extends AbstractResponse {
   private PickUpResultDTO receivepickuporderResult;

   @JsonProperty("receivepickuporder_result")
   public void setReceivepickuporderResult(PickUpResultDTO receivepickuporderResult) {
      this.receivepickuporderResult = receivepickuporderResult;
   }

   @JsonProperty("receivepickuporder_result")
   public PickUpResultDTO getReceivepickuporderResult() {
      return this.receivepickuporderResult;
   }
}
