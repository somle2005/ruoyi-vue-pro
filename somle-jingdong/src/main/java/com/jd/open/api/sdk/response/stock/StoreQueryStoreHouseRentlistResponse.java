package com.jd.open.api.sdk.response.stock;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.stock.StoreService.response.queryStoreHouseRentlist.QueryStockHouseRentResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class StoreQueryStoreHouseRentlistResponse extends AbstractResponse {
   private QueryStockHouseRentResult queryStockHouseRentResult;

   @JsonProperty("query_stock_house_rent_result")
   public void setQueryStockHouseRentResult(QueryStockHouseRentResult queryStockHouseRentResult) {
      this.queryStockHouseRentResult = queryStockHouseRentResult;
   }

   @JsonProperty("query_stock_house_rent_result")
   public QueryStockHouseRentResult getQueryStockHouseRentResult() {
      return this.queryStockHouseRentResult;
   }
}
