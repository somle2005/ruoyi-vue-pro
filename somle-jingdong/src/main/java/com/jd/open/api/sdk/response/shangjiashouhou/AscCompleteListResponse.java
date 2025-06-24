package com.jd.open.api.sdk.response.shangjiashouhou;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.list.CompletePageResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AscCompleteListResponse extends AbstractResponse {
   private CompletePageResult pageResult;

   @JsonProperty("pageResult")
   public void setPageResult(CompletePageResult pageResult) {
      this.pageResult = pageResult;
   }

   @JsonProperty("pageResult")
   public CompletePageResult getPageResult() {
      return this.pageResult;
   }
}
