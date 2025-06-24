package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.StockWebService.response.batchGetProdStockInfo.AplsVCResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcAplsStockBatchGetProdStockInfoResponse extends AbstractResponse {
   private AplsVCResponse batchGetProdStockInfoResponse;

   @JsonProperty("batchGetProdStockInfoResponse")
   public void setBatchGetProdStockInfoResponse(AplsVCResponse batchGetProdStockInfoResponse) {
      this.batchGetProdStockInfoResponse = batchGetProdStockInfoResponse;
   }

   @JsonProperty("batchGetProdStockInfoResponse")
   public AplsVCResponse getBatchGetProdStockInfoResponse() {
      return this.batchGetProdStockInfoResponse;
   }
}
