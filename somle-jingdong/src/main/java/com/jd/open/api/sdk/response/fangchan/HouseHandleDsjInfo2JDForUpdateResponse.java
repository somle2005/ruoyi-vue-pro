package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.HouseJosDsjProductPublishService.response.handleDsjInfo2JDForUpdate.HouseJosDsjProductesponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class HouseHandleDsjInfo2JDForUpdateResponse extends AbstractResponse {
   private HouseJosDsjProductesponse handledsjinfo2jdforinsertResult;

   @JsonProperty("handledsjinfo2jdforinsert_result")
   public void setHandledsjinfo2jdforinsertResult(HouseJosDsjProductesponse handledsjinfo2jdforinsertResult) {
      this.handledsjinfo2jdforinsertResult = handledsjinfo2jdforinsertResult;
   }

   @JsonProperty("handledsjinfo2jdforinsert_result")
   public HouseJosDsjProductesponse getHandledsjinfo2jdforinsertResult() {
      return this.handledsjinfo2jdforinsertResult;
   }
}
