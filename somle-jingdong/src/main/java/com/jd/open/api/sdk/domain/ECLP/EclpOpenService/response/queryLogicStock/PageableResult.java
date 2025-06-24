package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryLogicStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageableResult implements Serializable {
   private List<LogicStockQueryRecord> resultList;
   private long recordCount;

   @JsonProperty("resultList")
   public void setResultList(List<LogicStockQueryRecord> resultList) {
      this.resultList = resultList;
   }

   @JsonProperty("resultList")
   public List<LogicStockQueryRecord> getResultList() {
      return this.resultList;
   }

   @JsonProperty("recordCount")
   public void setRecordCount(long recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("recordCount")
   public long getRecordCount() {
      return this.recordCount;
   }
}
