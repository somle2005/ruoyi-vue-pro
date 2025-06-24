package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpIsvService.response.cancelUlOrder.ApiStringResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpInsideCancelUlOrderResponse extends AbstractResponse {
   private ApiStringResponse apiStringResponse;

   @JsonProperty("apiStringResponse")
   public void setApiStringResponse(ApiStringResponse apiStringResponse) {
      this.apiStringResponse = apiStringResponse;
   }

   @JsonProperty("apiStringResponse")
   public ApiStringResponse getApiStringResponse() {
      return this.apiStringResponse;
   }
}
