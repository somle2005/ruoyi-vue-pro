package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ProductWrapService.response.query.SearchResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class NewWareVenderSkusQueryResponse extends AbstractResponse {
   private SearchResult searchResult;

   @JsonProperty("search_result")
   public void setSearchResult(SearchResult searchResult) {
      this.searchResult = searchResult;
   }

   @JsonProperty("search_result")
   public SearchResult getSearchResult() {
      return this.searchResult;
   }
}
