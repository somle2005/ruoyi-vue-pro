package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.DpsStockInterface.response.queryStockInfo.DropshipResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsQueryStockInfoResponse extends AbstractResponse {
   private DropshipResult queryStockResult;

   @JsonProperty("queryStockResult")
   public void setQueryStockResult(DropshipResult queryStockResult) {
      this.queryStockResult = queryStockResult;
   }

   @JsonProperty("queryStockResult")
   public DropshipResult getQueryStockResult() {
      return this.queryStockResult;
   }
}
