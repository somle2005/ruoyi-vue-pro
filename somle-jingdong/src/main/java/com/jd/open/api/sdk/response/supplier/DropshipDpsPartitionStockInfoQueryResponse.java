package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.IDpsPartitionStockInterface.response.query.DropshipResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsPartitionStockInfoQueryResponse extends AbstractResponse {
   private DropshipResult querypartitionstockinfosResult;

   @JsonProperty("querypartitionstockinfos_result")
   public void setQuerypartitionstockinfosResult(DropshipResult querypartitionstockinfosResult) {
      this.querypartitionstockinfosResult = querypartitionstockinfosResult;
   }

   @JsonProperty("querypartitionstockinfos_result")
   public DropshipResult getQuerypartitionstockinfosResult() {
      return this.querypartitionstockinfosResult;
   }
}
