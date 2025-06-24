package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsSplitOrderResponse extends AbstractResponse {
   private Result queryExpressInfoResult;

   @JsonProperty("queryExpressInfoResult")
   public void setQueryExpressInfoResult(Result queryExpressInfoResult) {
      this.queryExpressInfoResult = queryExpressInfoResult;
   }

   @JsonProperty("queryExpressInfoResult")
   public Result getQueryExpressInfoResult() {
      return this.queryExpressInfoResult;
   }
}
