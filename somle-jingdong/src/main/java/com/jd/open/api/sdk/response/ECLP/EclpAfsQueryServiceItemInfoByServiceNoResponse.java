package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryServiceItemInfoByServiceNo.ServiceDetailResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpAfsQueryServiceItemInfoByServiceNoResponse extends AbstractResponse {
   private ServiceDetailResult queryserviceiteminfobyservicenoResult;

   @JsonProperty("queryserviceiteminfobyserviceno_result")
   public void setQueryserviceiteminfobyservicenoResult(ServiceDetailResult queryserviceiteminfobyservicenoResult) {
      this.queryserviceiteminfobyservicenoResult = queryserviceiteminfobyservicenoResult;
   }

   @JsonProperty("queryserviceiteminfobyserviceno_result")
   public ServiceDetailResult getQueryserviceiteminfobyservicenoResult() {
      return this.queryserviceiteminfobyservicenoResult;
   }
}
