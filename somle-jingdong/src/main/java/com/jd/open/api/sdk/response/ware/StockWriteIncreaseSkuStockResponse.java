package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.StockWriteService.response.increaseSkuStock.SkuStockWriteResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class StockWriteIncreaseSkuStockResponse extends AbstractResponse {
   private SkuStockWriteResult result;

   @JsonProperty("result")
   public void setResult(SkuStockWriteResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public SkuStockWriteResult getResult() {
      return this.result;
   }
}
