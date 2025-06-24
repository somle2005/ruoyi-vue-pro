package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryB2BSWbMain.CoCreateLwbResultForQueryB2BSWbMain;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpCoQueryB2BSWbMainResponse extends AbstractResponse {
   private CoCreateLwbResultForQueryB2BSWbMain coCreateLwbResultResult;

   @JsonProperty("CoCreateLwbResult_result")
   public void setCoCreateLwbResultResult(CoCreateLwbResultForQueryB2BSWbMain coCreateLwbResultResult) {
      this.coCreateLwbResultResult = coCreateLwbResultResult;
   }

   @JsonProperty("CoCreateLwbResult_result")
   public CoCreateLwbResultForQueryB2BSWbMain getCoCreateLwbResultResult() {
      return this.coCreateLwbResultResult;
   }
}
