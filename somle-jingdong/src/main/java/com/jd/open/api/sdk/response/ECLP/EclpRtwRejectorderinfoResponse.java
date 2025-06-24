package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.SamReturnStockService.response.rejectorderinfo.SamReturnStockResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpRtwRejectorderinfoResponse extends AbstractResponse {
   private SamReturnStockResponse rejectorderinfoResult;

   @JsonProperty("rejectorderinfo_result")
   public void setRejectorderinfoResult(SamReturnStockResponse rejectorderinfoResult) {
      this.rejectorderinfoResult = rejectorderinfoResult;
   }

   @JsonProperty("rejectorderinfo_result")
   public SamReturnStockResponse getRejectorderinfoResult() {
      return this.rejectorderinfoResult;
   }
}
