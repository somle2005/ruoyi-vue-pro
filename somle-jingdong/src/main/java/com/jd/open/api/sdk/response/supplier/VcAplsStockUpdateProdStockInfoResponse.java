package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.StockWebService.response.updateProdStockInfo.AplsVCResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcAplsStockUpdateProdStockInfoResponse extends AbstractResponse {
   private AplsVCResponse batchStockModifyResponse;

   @JsonProperty("batchStockModifyResponse")
   public void setBatchStockModifyResponse(AplsVCResponse batchStockModifyResponse) {
      this.batchStockModifyResponse = batchStockModifyResponse;
   }

   @JsonProperty("batchStockModifyResponse")
   public AplsVCResponse getBatchStockModifyResponse() {
      return this.batchStockModifyResponse;
   }
}
