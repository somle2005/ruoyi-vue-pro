package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.video.JOSVideoSkuRelativeService.response.delete.JOSRelativeResult;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class PopVideoSkusRelativeDeleteResponse extends AbstractResponse {
   private List<JOSRelativeResult> delRelativeResults;

   @JsonProperty("del_relative_results")
   public void setDelRelativeResults(List<JOSRelativeResult> delRelativeResults) {
      this.delRelativeResults = delRelativeResults;
   }

   @JsonProperty("del_relative_results")
   public List<JOSRelativeResult> getDelRelativeResults() {
      return this.delRelativeResults;
   }
}
