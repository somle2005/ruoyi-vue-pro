package com.jd.open.api.sdk.response.stock;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.stock.StoreService.response.queryStockInBill.QueryStockInResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class StoreQueryStockInBillResponse extends AbstractResponse {
   private QueryStockInResult queryStockInResult;

   @JsonProperty("query_stock_in_result")
   public void setQueryStockInResult(QueryStockInResult queryStockInResult) {
      this.queryStockInResult = queryStockInResult;
   }

   @JsonProperty("query_stock_in_result")
   public QueryStockInResult getQueryStockInResult() {
      return this.queryStockInResult;
   }
}
