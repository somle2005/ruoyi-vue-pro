package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class LogisticsWarehouseListResponse extends AbstractResponse {
   private List<WarehouseDetail> warehouseDetails;

   @JsonProperty("warehouse_details")
   public void setWarehouseDetails(List<WarehouseDetail> warehouseDetails) {
      this.warehouseDetails = warehouseDetails;
   }

   @JsonProperty("warehouse_details")
   public List<WarehouseDetail> getWarehouseDetails() {
      return this.warehouseDetails;
   }
}
