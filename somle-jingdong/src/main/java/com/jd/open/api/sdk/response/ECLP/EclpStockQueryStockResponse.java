package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryStock.WarehouseStockResponse;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpStockQueryStockResponse extends AbstractResponse {
   private List<WarehouseStockResponse> querystockResult;

   @JsonProperty("querystock_result")
   public void setQuerystockResult(List<WarehouseStockResponse> querystockResult) {
      this.querystockResult = querystockResult;
   }

   @JsonProperty("querystock_result")
   public List<WarehouseStockResponse> getQuerystockResult() {
      return this.querystockResult;
   }
}
