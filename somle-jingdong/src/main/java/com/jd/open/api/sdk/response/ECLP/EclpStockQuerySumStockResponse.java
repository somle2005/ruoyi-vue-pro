package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.querySumStock.IsvDayStockLog;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpStockQuerySumStockResponse extends AbstractResponse {
   private IsvDayStockLog isvDayStockLog;

   @JsonProperty("isvDayStockLog")
   public void setIsvDayStockLog(IsvDayStockLog isvDayStockLog) {
      this.isvDayStockLog = isvDayStockLog;
   }

   @JsonProperty("isvDayStockLog")
   public IsvDayStockLog getIsvDayStockLog() {
      return this.isvDayStockLog;
   }
}
