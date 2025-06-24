package com.jd.open.api.sdk.response.stock;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.stock.StoreService.response.createStockInBill.StockInResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class StoreCreateStockInBillResponse extends AbstractResponse {
   private StockInResult stockinResult;

   @JsonProperty("stockin_result")
   public void setStockinResult(StockInResult stockinResult) {
      this.stockinResult = stockinResult;
   }

   @JsonProperty("stockin_result")
   public StockInResult getStockinResult() {
      return this.stockinResult;
   }
}
