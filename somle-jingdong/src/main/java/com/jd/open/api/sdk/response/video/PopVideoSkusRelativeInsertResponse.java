package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.video.JOSVideoSkuRelativeService.response.insert.JOSRelativeResult;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class PopVideoSkusRelativeInsertResponse extends AbstractResponse {
   private List<JOSRelativeResult> relativeResults;

   @JsonProperty("relative_results")
   public void setRelativeResults(List<JOSRelativeResult> relativeResults) {
      this.relativeResults = relativeResults;
   }

   @JsonProperty("relative_results")
   public List<JOSRelativeResult> getRelativeResults() {
      return this.relativeResults;
   }
}
