package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.video.JOSVideoSkuRelativeService.response.query.JOSVideoRelativeInfo;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class PopVideoSkuRelativeBySkuIdsQueryResponse extends AbstractResponse {
   private List<JOSVideoRelativeInfo> relativeResults;

   @JsonProperty("relative_results")
   public void setRelativeResults(List<JOSVideoRelativeInfo> relativeResults) {
      this.relativeResults = relativeResults;
   }

   @JsonProperty("relative_results")
   public List<JOSVideoRelativeInfo> getRelativeResults() {
      return this.relativeResults;
   }
}
