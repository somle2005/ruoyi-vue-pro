package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.IDpsPartitionStockInterface.response.maintain.DropshipResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsPartitionStockMaintainResponse extends AbstractResponse {
   private DropshipResult setpartitionstocknumResult;

   @JsonProperty("setpartitionstocknum_result")
   public void setSetpartitionstocknumResult(DropshipResult setpartitionstocknumResult) {
      this.setpartitionstocknumResult = setpartitionstocknumResult;
   }

   @JsonProperty("setpartitionstocknum_result")
   public DropshipResult getSetpartitionstocknumResult() {
      return this.setpartitionstocknumResult;
   }
}
