package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.getOrderTrackMessage.TrackMessageOut;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpOrderGetOrderTrackMessageResponse extends AbstractResponse {
   private List<TrackMessageOut> getOrderTrackMessageResult;

   @JsonProperty("getOrderTrackMessage_result")
   public void setGetOrderTrackMessageResult(List<TrackMessageOut> getOrderTrackMessageResult) {
      this.getOrderTrackMessageResult = getOrderTrackMessageResult;
   }

   @JsonProperty("getOrderTrackMessage_result")
   public List<TrackMessageOut> getGetOrderTrackMessageResult() {
      return this.getOrderTrackMessageResult;
   }
}
