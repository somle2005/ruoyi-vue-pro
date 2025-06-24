package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsSearchsingleorderResponse extends AbstractResponse {
   private QuerySingleOrderForJosResultDto searchSingleResult;

   @JsonProperty("searchSingleResult")
   public void setSearchSingleResult(QuerySingleOrderForJosResultDto searchSingleResult) {
      this.searchSingleResult = searchSingleResult;
   }

   @JsonProperty("searchSingleResult")
   public QuerySingleOrderForJosResultDto getSearchSingleResult() {
      return this.searchSingleResult;
   }
}
