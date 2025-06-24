package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryWarehouseStockOrderFlowByGroup.WarehouseStockOrderFlow;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpStockQueryWarehouseStockOrderFlowByGroupResponse extends AbstractResponse {
   private List<WarehouseStockOrderFlow> resultList;

   @JsonProperty("resultList")
   public void setResultList(List<WarehouseStockOrderFlow> resultList) {
      this.resultList = resultList;
   }

   @JsonProperty("resultList")
   public List<WarehouseStockOrderFlow> getResultList() {
      return this.resultList;
   }
}
