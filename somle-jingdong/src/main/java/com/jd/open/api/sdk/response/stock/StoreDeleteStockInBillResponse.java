package com.jd.open.api.sdk.response.stock;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.stock.StoreService.response.deleteStockInBill.StockInDeleteResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class StoreDeleteStockInBillResponse extends AbstractResponse {
   private StockInDeleteResult stockInDeleteResult;

   @JsonProperty("stock_in_delete_result")
   public void setStockInDeleteResult(StockInDeleteResult stockInDeleteResult) {
      this.stockInDeleteResult = stockInDeleteResult;
   }

   @JsonProperty("stock_in_delete_result")
   public StockInDeleteResult getStockInDeleteResult() {
      return this.stockInDeleteResult;
   }
}
