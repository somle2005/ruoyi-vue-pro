package com.jd.open.api.sdk.response.customsglobalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.customsglobalAPI.EclpdlzServiceProviderJos.response.queryOrderByOrderId.EclpdlzServiceProviderOrderResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DlzGuangzhouCustomsQueryOrderByOrderIdResponse extends AbstractResponse {
   private EclpdlzServiceProviderOrderResult queryorderResult;

   @JsonProperty("queryorder_result")
   public void setQueryorderResult(EclpdlzServiceProviderOrderResult queryorderResult) {
      this.queryorderResult = queryorderResult;
   }

   @JsonProperty("queryorder_result")
   public EclpdlzServiceProviderOrderResult getQueryorderResult() {
      return this.queryorderResult;
   }
}
