package com.jd.open.api.sdk.response.stock;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.stock.StoreService.response.createStockInBillForSam.StockInSamResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class StoreCreateStockInBillForSamResponse extends AbstractResponse {
   private StockInSamResult stockinSamResult;

   @JsonProperty("stockin_sam_result")
   public void setStockinSamResult(StockInSamResult stockinSamResult) {
      this.stockinSamResult = stockinSamResult;
   }

   @JsonProperty("stockin_sam_result")
   public StockInSamResult getStockinSamResult() {
      return this.stockinSamResult;
   }
}
