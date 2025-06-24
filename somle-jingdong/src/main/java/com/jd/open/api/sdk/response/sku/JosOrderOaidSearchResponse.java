package com.jd.open.api.sdk.response.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.sku.OrderListOpenService.response.search.DsmResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JosOrderOaidSearchResponse extends AbstractResponse {
   private DsmResponse response;

   @JsonProperty("response")
   public void setResponse(DsmResponse response) {
      this.response = response;
   }

   @JsonProperty("response")
   public DsmResponse getResponse() {
      return this.response;
   }
}
