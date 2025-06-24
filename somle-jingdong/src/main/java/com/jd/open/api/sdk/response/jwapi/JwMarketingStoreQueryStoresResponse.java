package com.jd.open.api.sdk.response.jwapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jwapi.StoreService.response.queryStores.StoreResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JwMarketingStoreQueryStoresResponse extends AbstractResponse {
   private StoreResponse querystoresResult;

   @JsonProperty("querystores_result")
   public void setQuerystoresResult(StoreResponse querystoresResult) {
      this.querystoresResult = querystoresResult;
   }

   @JsonProperty("querystores_result")
   public StoreResponse getQuerystoresResult() {
      return this.querystoresResult;
   }
}
