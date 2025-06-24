package com.jd.open.api.sdk.response.customsglobalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.customsglobalAPI.EclpdlzServiceProviderJos.response.queryPeriodOrder.EclpdlzServiceProviderOrderListResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DlzGuangzhouCustomsQueryPeriodOrderResponse extends AbstractResponse {
   private EclpdlzServiceProviderOrderListResult queryperiodorderResult;

   @JsonProperty("queryperiodorder_result")
   public void setQueryperiodorderResult(EclpdlzServiceProviderOrderListResult queryperiodorderResult) {
      this.queryperiodorderResult = queryperiodorderResult;
   }

   @JsonProperty("queryperiodorder_result")
   public EclpdlzServiceProviderOrderListResult getQueryperiodorderResult() {
      return this.queryperiodorderResult;
   }
}
