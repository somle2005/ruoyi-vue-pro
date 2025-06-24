package com.jd.open.api.sdk.response.refundapply;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.refundapply.RefundApplySoaService.response.queryPageList.QueryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopAfsSoaRefundapplyQueryPageListResponse extends AbstractResponse {
   private QueryResult queryResult;

   @JsonProperty("queryResult")
   public void setQueryResult(QueryResult queryResult) {
      this.queryResult = queryResult;
   }

   @JsonProperty("queryResult")
   public QueryResult getQueryResult() {
      return this.queryResult;
   }
}
