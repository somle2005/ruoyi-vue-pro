package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryWarehouse.WarehouseOut;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpMasterQueryWarehouseResponse extends AbstractResponse {
   private List<WarehouseOut> querywarehouseResult;

   @JsonProperty("querywarehouse_result")
   public void setQuerywarehouseResult(List<WarehouseOut> querywarehouseResult) {
      this.querywarehouseResult = querywarehouseResult;
   }

   @JsonProperty("querywarehouse_result")
   public List<WarehouseOut> getQuerywarehouseResult() {
      return this.querywarehouseResult;
   }
}
