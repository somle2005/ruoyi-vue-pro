package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.OldStationJsfService.response.queryOldStation.BaseResultInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UeRecoveryOldStationQueryOldStationResponse extends AbstractResponse {
   private BaseResultInfo result;

   @JsonProperty("result")
   public void setResult(BaseResultInfo result) {
      this.result = result;
   }

   @JsonProperty("result")
   public BaseResultInfo getResult() {
      return this.result;
   }
}
