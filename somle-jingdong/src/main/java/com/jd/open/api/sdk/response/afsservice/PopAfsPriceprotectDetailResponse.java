package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.afsservice.PriceProtectSoaService.response.detail.PublicResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopAfsPriceprotectDetailResponse extends AbstractResponse {
   private PublicResult response;

   @JsonProperty("response")
   public void setResponse(PublicResult response) {
      this.response = response;
   }

   @JsonProperty("response")
   public PublicResult getResponse() {
      return this.response;
   }
}
