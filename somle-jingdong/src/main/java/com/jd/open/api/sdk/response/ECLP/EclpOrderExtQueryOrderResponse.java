package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrder.QueryOrderExtResult;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpOrderExtQueryOrderResponse extends AbstractResponse {
   private List<QueryOrderExtResult> queryorderResult;

   @JsonProperty("queryorder_result")
   public void setQueryorderResult(List<QueryOrderExtResult> queryorderResult) {
      this.queryorderResult = queryorderResult;
   }

   @JsonProperty("queryorder_result")
   public List<QueryOrderExtResult> getQueryorderResult() {
      return this.queryorderResult;
   }
}
