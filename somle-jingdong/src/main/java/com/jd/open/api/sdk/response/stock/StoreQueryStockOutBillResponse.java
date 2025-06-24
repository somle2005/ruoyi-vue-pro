package com.jd.open.api.sdk.response.stock;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.stock.StoreService.response.queryStockOutBill.QueryStockOutResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class StoreQueryStockOutBillResponse extends AbstractResponse {
   private QueryStockOutResult queryStockOutResult;

   @JsonProperty("query_stock_out_result")
   public void setQueryStockOutResult(QueryStockOutResult queryStockOutResult) {
      this.queryStockOutResult = queryStockOutResult;
   }

   @JsonProperty("query_stock_out_result")
   public QueryStockOutResult getQueryStockOutResult() {
      return this.queryStockOutResult;
   }
}
