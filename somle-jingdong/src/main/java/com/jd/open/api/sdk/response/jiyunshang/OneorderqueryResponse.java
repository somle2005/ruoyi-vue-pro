package com.jd.open.api.sdk.response.jiyunshang;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jiyunshang.ConsolidatorOutOperationJsfService.response.oneorderquery.ResultVO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OneorderqueryResponse extends AbstractResponse {
   private ResultVO oneorderqueryResult;

   @JsonProperty("oneorderquery_result")
   public void setOneorderqueryResult(ResultVO oneorderqueryResult) {
      this.oneorderqueryResult = oneorderqueryResult;
   }

   @JsonProperty("oneorderquery_result")
   public ResultVO getOneorderqueryResult() {
      return this.oneorderqueryResult;
   }
}
