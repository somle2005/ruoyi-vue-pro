package com.jd.open.api.sdk.response.sopstorage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.sopstorage.PartitionWarehouseService.response.findPartitionWhByIdAndStatus.FindPartitionWarehouseResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class StoreFindPartitionWhByIdAndStatusResponse extends AbstractResponse {
   private FindPartitionWarehouseResult findPartitionWarehouseResult;

   @JsonProperty("find_Partition_Warehouse_Result")
   public void setFindPartitionWarehouseResult(FindPartitionWarehouseResult findPartitionWarehouseResult) {
      this.findPartitionWarehouseResult = findPartitionWarehouseResult;
   }

   @JsonProperty("find_Partition_Warehouse_Result")
   public FindPartitionWarehouseResult getFindPartitionWarehouseResult() {
      return this.findPartitionWarehouseResult;
   }
}
