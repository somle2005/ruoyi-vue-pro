package com.jd.open.api.sdk.response.HouseEI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class QueryServiceOrderResponse extends AbstractResponse {
   private String queryServiceOrderResult;

   @JsonProperty("queryServiceOrder_result")
   public void setQueryServiceOrderResult(String queryServiceOrderResult) {
      this.queryServiceOrderResult = queryServiceOrderResult;
   }

   @JsonProperty("queryServiceOrder_result")
   public String getQueryServiceOrderResult() {
      return this.queryServiceOrderResult;
   }
}
