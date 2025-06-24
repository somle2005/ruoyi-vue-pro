package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.getReceiptFlagPhoto.CoCreateLwbResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpCoGetReceiptFlagPhotoResponse extends AbstractResponse {
   private CoCreateLwbResult coCreateLwbResultResult;

   @JsonProperty("CoCreateLwbResult_result")
   public void setCoCreateLwbResultResult(CoCreateLwbResult coCreateLwbResultResult) {
      this.coCreateLwbResultResult = coCreateLwbResultResult;
   }

   @JsonProperty("CoCreateLwbResult_result")
   public CoCreateLwbResult getCoCreateLwbResultResult() {
      return this.coCreateLwbResultResult;
   }
}
