package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.evaluateB2BLwbFreightMain.FreightsResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpCoEvaluateB2BLwbFreightMainResponse extends AbstractResponse {
   private FreightsResponseDTO coFreightsResultResult;

   @JsonProperty("CoFreightsResult_result")
   public void setCoFreightsResultResult(FreightsResponseDTO coFreightsResultResult) {
      this.coFreightsResultResult = coFreightsResultResult;
   }

   @JsonProperty("CoFreightsResult_result")
   public FreightsResponseDTO getCoFreightsResultResult() {
      return this.coFreightsResultResult;
   }
}
