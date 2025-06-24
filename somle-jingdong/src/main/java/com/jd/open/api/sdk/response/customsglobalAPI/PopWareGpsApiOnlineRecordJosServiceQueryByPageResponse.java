package com.jd.open.api.sdk.response.customsglobalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.customsglobalAPI.OnlineRecordJosService.response.queryByPage.ORStringResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopWareGpsApiOnlineRecordJosServiceQueryByPageResponse extends AbstractResponse {
   private ORStringResult result;

   @JsonProperty("result")
   public void setResult(ORStringResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ORStringResult getResult() {
      return this.result;
   }
}
