package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.JhubOrderQueryService.response.querynew.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SamOrderInfoQuerynewResponse extends AbstractResponse {
   private Result queryorderinfoResult;

   @JsonProperty("queryorderinfo_result")
   public void setQueryorderinfoResult(Result queryorderinfoResult) {
      this.queryorderinfoResult = queryorderinfoResult;
   }

   @JsonProperty("queryorderinfo_result")
   public Result getQueryorderinfoResult() {
      return this.queryorderinfoResult;
   }
}
