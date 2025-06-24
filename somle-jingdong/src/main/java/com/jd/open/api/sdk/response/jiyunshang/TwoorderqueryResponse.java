package com.jd.open.api.sdk.response.jiyunshang;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jiyunshang.ConsolidatorOutOperationJsfService.response.twoorderquery.ResultVO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class TwoorderqueryResponse extends AbstractResponse {
   private ResultVO twoorderqueryResult;

   @JsonProperty("twoorderquery_result")
   public void setTwoorderqueryResult(ResultVO twoorderqueryResult) {
      this.twoorderqueryResult = twoorderqueryResult;
   }

   @JsonProperty("twoorderquery_result")
   public ResultVO getTwoorderqueryResult() {
      return this.twoorderqueryResult;
   }
}
