package com.jd.open.api.sdk.response.alpha;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.alpha.AlphaService.response.search.StandardListResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DeliRecomdCarriersSearchResponse extends AbstractResponse {
   private StandardListResponse StandardListResponse;

   @JsonProperty("StandardListResponse")
   public void setStandardListResponse(StandardListResponse StandardListResponse) {
      this.StandardListResponse = StandardListResponse;
   }

   @JsonProperty("StandardListResponse")
   public StandardListResponse getStandardListResponse() {
      return this.StandardListResponse;
   }
}
