package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.IDpsPartitionStockInterface.response.query.DropshipStoreResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DropshipDpsPartitionStockStoreQueryResponse extends AbstractResponse {
   private DropshipStoreResult getstoreinfosbyvendorResult;

   @JsonProperty("getstoreinfosbyvendor_result")
   public void setGetstoreinfosbyvendorResult(DropshipStoreResult getstoreinfosbyvendorResult) {
      this.getstoreinfosbyvendorResult = getstoreinfosbyvendorResult;
   }

   @JsonProperty("getstoreinfosbyvendor_result")
   public DropshipStoreResult getGetstoreinfosbyvendorResult() {
      return this.getstoreinfosbyvendorResult;
   }
}
