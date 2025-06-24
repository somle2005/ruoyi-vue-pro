package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OcsQueryJsfService.response.query.OcsCommonResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderOcsQueryResponse extends AbstractResponse {
   private OcsCommonResult result;

   @JsonProperty("result")
   public void setResult(OcsCommonResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public OcsCommonResult getResult() {
      return this.result;
   }
}
