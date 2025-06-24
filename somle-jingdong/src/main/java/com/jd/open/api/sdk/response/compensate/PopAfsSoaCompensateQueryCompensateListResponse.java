package com.jd.open.api.sdk.response.compensate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.compensate.AfsCompensateForJosService.response.queryCompensateList.CompensateResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopAfsSoaCompensateQueryCompensateListResponse extends AbstractResponse {
   private CompensateResult queryResult;

   @JsonProperty("queryResult")
   public void setQueryResult(CompensateResult queryResult) {
      this.queryResult = queryResult;
   }

   @JsonProperty("queryResult")
   public CompensateResult getQueryResult() {
      return this.queryResult;
   }
}
