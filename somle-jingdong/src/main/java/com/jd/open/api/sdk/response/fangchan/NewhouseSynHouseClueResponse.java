package com.jd.open.api.sdk.response.fangchan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fangchan.HouseJosCluePublishService.response.synHouseClue.HouseJosClueResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class NewhouseSynHouseClueResponse extends AbstractResponse {
   private HouseJosClueResponse synhouseclueResult;

   @JsonProperty("synhouseclue_result")
   public void setSynhouseclueResult(HouseJosClueResponse synhouseclueResult) {
      this.synhouseclueResult = synhouseclueResult;
   }

   @JsonProperty("synhouseclue_result")
   public HouseJosClueResponse getSynhouseclueResult() {
      return this.synhouseclueResult;
   }
}
