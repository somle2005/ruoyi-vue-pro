package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpIsvService.response.addLcOrder.ApiStringResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpInsideAddLcOrderResponse extends AbstractResponse {
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
