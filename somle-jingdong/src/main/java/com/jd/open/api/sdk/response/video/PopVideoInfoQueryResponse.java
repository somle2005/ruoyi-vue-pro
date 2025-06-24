package com.jd.open.api.sdk.response.video;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.video.JOSVideoInfoService.response.query.JOSPageResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopVideoInfoQueryResponse extends AbstractResponse {
   private JOSPageResult pageResult;

   @JsonProperty("page_result")
   public void setPageResult(JOSPageResult pageResult) {
      this.pageResult = pageResult;
   }

   @JsonProperty("page_result")
   public JOSPageResult getPageResult() {
      return this.pageResult;
   }
}
