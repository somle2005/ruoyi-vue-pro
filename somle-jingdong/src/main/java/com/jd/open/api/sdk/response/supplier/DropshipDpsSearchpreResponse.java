package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsSearchpreResponse extends AbstractResponse {
   private ReturnOrderPreForJosResultList searchPreResult;

   @JsonProperty("searchPreResult")
   public void setSearchPreResult(ReturnOrderPreForJosResultList searchPreResult) {
      this.searchPreResult = searchPreResult;
   }

   @JsonProperty("searchPreResult")
   public ReturnOrderPreForJosResultList getSearchPreResult() {
      return this.searchPreResult;
   }
}
