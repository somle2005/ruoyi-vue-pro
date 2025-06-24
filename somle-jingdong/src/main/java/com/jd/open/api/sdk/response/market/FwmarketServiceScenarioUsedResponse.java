package com.jd.open.api.sdk.response.market;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.market.ScenarioRecommendProvider.response.used.ServiceResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class FwmarketServiceScenarioUsedResponse extends AbstractResponse {
   private ServiceResult response;

   @JsonProperty("response")
   public void setResponse(ServiceResult response) {
      this.response = response;
   }

   @JsonProperty("response")
   public ServiceResult getResponse() {
      return this.response;
   }
}
