package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.video.JOSVideoSkuRelativeService.response.unRelativeSku.RelativeResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopUnRelativeSkuResponse extends AbstractResponse {
   private RelativeResult unRelativeResult;

   @JsonProperty("unRelativeResult")
   public void setUnRelativeResult(RelativeResult unRelativeResult) {
      this.unRelativeResult = unRelativeResult;
   }

   @JsonProperty("unRelativeResult")
   public RelativeResult getUnRelativeResult() {
      return this.unRelativeResult;
   }
}
