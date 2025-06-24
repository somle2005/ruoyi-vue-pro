package com.jd.open.api.sdk.response.neirong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.neirong.StationInfoJosService.response.getStationInfo.BaseResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class StationinfojosserviceGetStationInfoResponse extends AbstractResponse {
   private BaseResult baseResult;

   @JsonProperty("baseResult")
   public void setBaseResult(BaseResult baseResult) {
      this.baseResult = baseResult;
   }

   @JsonProperty("baseResult")
   public BaseResult getBaseResult() {
      return this.baseResult;
   }
}
