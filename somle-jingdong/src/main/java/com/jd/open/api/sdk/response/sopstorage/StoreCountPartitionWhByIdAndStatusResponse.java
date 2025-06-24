package com.jd.open.api.sdk.response.sopstorage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.sopstorage.PartitionWarehouseService.response.countPartitionWhByIdAndStatus.CountPartitionWarehouseResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class StoreCountPartitionWhByIdAndStatusResponse extends AbstractResponse {
   private CountPartitionWarehouseResult findPartitionWarehouseResult;

   @JsonProperty("find_Partition_Warehouse_Result")
   public void setFindPartitionWarehouseResult(CountPartitionWarehouseResult findPartitionWarehouseResult) {
      this.findPartitionWarehouseResult = findPartitionWarehouseResult;
   }

   @JsonProperty("find_Partition_Warehouse_Result")
   public CountPartitionWarehouseResult getFindPartitionWarehouseResult() {
      return this.findPartitionWarehouseResult;
   }
}
