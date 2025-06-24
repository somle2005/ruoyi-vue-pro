package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsSearchoutboundorderResponse extends AbstractResponse {
   private QueryOrderForJosResultList searchResult;

   @JsonProperty("searchResult")
   public void setSearchResult(QueryOrderForJosResultList searchResult) {
      this.searchResult = searchResult;
   }

   @JsonProperty("searchResult")
   public QueryOrderForJosResultList getSearchResult() {
      return this.searchResult;
   }
}
