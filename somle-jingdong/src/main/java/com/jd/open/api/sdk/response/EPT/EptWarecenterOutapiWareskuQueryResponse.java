package com.jd.open.api.sdk.response.EPT;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.EPT.WareSkuApiClient.response.query.WareSkuApiResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EptWarecenterOutapiWareskuQueryResponse extends AbstractResponse {
   private WareSkuApiResponse queryskuinfoResult;

   @JsonProperty("queryskuinfo_result")
   public void setQueryskuinfoResult(WareSkuApiResponse queryskuinfoResult) {
      this.queryskuinfoResult = queryskuinfoResult;
   }

   @JsonProperty("queryskuinfo_result")
   public WareSkuApiResponse getQueryskuinfoResult() {
      return this.queryskuinfoResult;
   }
}
