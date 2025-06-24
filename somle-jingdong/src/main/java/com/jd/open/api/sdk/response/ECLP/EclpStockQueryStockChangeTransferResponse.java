package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryStockChangeTransfer.StockResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpStockQueryStockChangeTransferResponse extends AbstractResponse {
   private StockResult querystockchangetransferResult;

   @JsonProperty("querystockchangetransfer_result")
   public void setQuerystockchangetransferResult(StockResult querystockchangetransferResult) {
      this.querystockchangetransferResult = querystockchangetransferResult;
   }

   @JsonProperty("querystockchangetransfer_result")
   public StockResult getQuerystockchangetransferResult() {
      return this.querystockchangetransferResult;
   }
}
