package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.video.JOSVideoSkuRelativeService.response.query.JOSPageResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopVideoSkuRelativeQueryResponse extends AbstractResponse {
   private JOSPageResult reltiveInfoResult;

   @JsonProperty("reltive_info_result")
   public void setReltiveInfoResult(JOSPageResult reltiveInfoResult) {
      this.reltiveInfoResult = reltiveInfoResult;
   }

   @JsonProperty("reltive_info_result")
   public JOSPageResult getReltiveInfoResult() {
      return this.reltiveInfoResult;
   }
}
