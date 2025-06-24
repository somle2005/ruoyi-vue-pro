package com.jd.open.api.sdk.response.EPT;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.EPT.WareApiClient.response.get.WareTempResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EptWarecenterRecommendtempGetResponse extends AbstractResponse {
   private WareTempResult getrecommendtempbyidResult;

   @JsonProperty("getrecommendtempbyid_result")
   public void setGetrecommendtempbyidResult(WareTempResult getrecommendtempbyidResult) {
      this.getrecommendtempbyidResult = getrecommendtempbyidResult;
   }

   @JsonProperty("getrecommendtempbyid_result")
   public WareTempResult getGetrecommendtempbyidResult() {
      return this.getrecommendtempbyidResult;
   }
}
