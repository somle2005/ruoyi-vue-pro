package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.getTrackMessagePlusByOrder.BaseResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpOrderGetTrackMessagePlusByOrderResponse extends AbstractResponse {
   private BaseResult getTrackMessagePlusByOrderResult;

   @JsonProperty("getTrackMessagePlusByOrder_result")
   public void setGetTrackMessagePlusByOrderResult(BaseResult getTrackMessagePlusByOrderResult) {
      this.getTrackMessagePlusByOrderResult = getTrackMessagePlusByOrderResult;
   }

   @JsonProperty("getTrackMessagePlusByOrder_result")
   public BaseResult getGetTrackMessagePlusByOrderResult() {
      return this.getTrackMessagePlusByOrderResult;
   }
}
