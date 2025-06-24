package com.jd.open.api.sdk.response.QL;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.QL.StationInfoJosService.response.delete.StationInfoResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class StationinfojosserviceDeleteResponse extends AbstractResponse {
   private StationInfoResult stationnfoesult;

   @JsonProperty("stationnfoesult")
   public void setStationnfoesult(StationInfoResult stationnfoesult) {
      this.stationnfoesult = stationnfoesult;
   }

   @JsonProperty("stationnfoesult")
   public StationInfoResult getStationnfoesult() {
      return this.stationnfoesult;
   }
}
