package com.jd.open.api.sdk.response.alpha;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.alpha.OrderTrackSiteExport.response.getTrackShowResult.OrderTrackShowResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderTrackGetTrackShowResultResponse extends AbstractResponse {
   private OrderTrackShowResult result;

   @JsonProperty("result")
   public void setResult(OrderTrackShowResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public OrderTrackShowResult getResult() {
      return this.result;
   }
}
