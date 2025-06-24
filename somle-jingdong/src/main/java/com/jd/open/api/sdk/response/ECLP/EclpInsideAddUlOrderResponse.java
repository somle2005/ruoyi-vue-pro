package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpIsvService.response.addUlOrder.ApiStringResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpInsideAddUlOrderResponse extends AbstractResponse {
   private ApiStringResponse apiStringResponseResult;

   @JsonProperty("apiStringResponse_result")
   public void setApiStringResponseResult(ApiStringResponse apiStringResponseResult) {
      this.apiStringResponseResult = apiStringResponseResult;
   }

   @JsonProperty("apiStringResponse_result")
   public ApiStringResponse getApiStringResponseResult() {
      return this.apiStringResponseResult;
   }
}
