package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.createWbOrder.CoCreateLwbResultForCreateWbOrder;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpCoCreateWbOrderResponse extends AbstractResponse {
   private CoCreateLwbResultForCreateWbOrder coCreateLwbResultResult;

   @JsonProperty("CoCreateLwbResult_result")
   public void setCoCreateLwbResultResult(CoCreateLwbResultForCreateWbOrder coCreateLwbResultResult) {
      this.coCreateLwbResultResult = coCreateLwbResultResult;
   }

   @JsonProperty("CoCreateLwbResult_result")
   public CoCreateLwbResultForCreateWbOrder getCoCreateLwbResultResult() {
      return this.coCreateLwbResultResult;
   }
}
