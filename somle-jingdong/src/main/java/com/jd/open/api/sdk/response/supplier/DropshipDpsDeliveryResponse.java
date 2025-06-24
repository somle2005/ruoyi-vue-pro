package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsDeliveryResponse extends AbstractResponse {
   private DeliverDoResultSetDto deliverResult;

   @JsonProperty("deliverResult")
   public void setDeliverResult(DeliverDoResultSetDto deliverResult) {
      this.deliverResult = deliverResult;
   }

   @JsonProperty("deliverResult")
   public DeliverDoResultSetDto getDeliverResult() {
      return this.deliverResult;
   }
}
