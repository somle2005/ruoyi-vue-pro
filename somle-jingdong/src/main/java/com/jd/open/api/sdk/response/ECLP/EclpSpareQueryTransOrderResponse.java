package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryTransOrder.TransMainExtResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpSpareQueryTransOrderResponse extends AbstractResponse {
   private TransMainExtResponse transOrderResponse;

   @JsonProperty("transOrderResponse")
   public void setTransOrderResponse(TransMainExtResponse transOrderResponse) {
      this.transOrderResponse = transOrderResponse;
   }

   @JsonProperty("transOrderResponse")
   public TransMainExtResponse getTransOrderResponse() {
      return this.transOrderResponse;
   }
}
