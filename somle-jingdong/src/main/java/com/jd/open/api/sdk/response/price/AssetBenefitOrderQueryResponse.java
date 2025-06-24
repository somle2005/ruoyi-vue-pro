package com.jd.open.api.sdk.response.price;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.price.ConsumptionJosFacade.response.query.Response;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AssetBenefitOrderQueryResponse extends AbstractResponse {
   private Response response;

   @JsonProperty("response")
   public void setResponse(Response response) {
      this.response = response;
   }

   @JsonProperty("response")
   public Response getResponse() {
      return this.response;
   }
}
