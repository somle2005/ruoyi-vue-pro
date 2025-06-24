package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.gotoB2BSWbMainAllTrack.CoCreateLwbResultForGotoB2BSWbMainAllTrack;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpCoGotoB2BSWbMainAllTrackResponse extends AbstractResponse {
   private CoCreateLwbResultForGotoB2BSWbMainAllTrack coCreateLwbResultResult;

   @JsonProperty("CoCreateLwbResult_result")
   public void setCoCreateLwbResultResult(CoCreateLwbResultForGotoB2BSWbMainAllTrack coCreateLwbResultResult) {
      this.coCreateLwbResultResult = coCreateLwbResultResult;
   }

   @JsonProperty("CoCreateLwbResult_result")
   public CoCreateLwbResultForGotoB2BSWbMainAllTrack getCoCreateLwbResultResult() {
      return this.coCreateLwbResultResult;
   }
}
