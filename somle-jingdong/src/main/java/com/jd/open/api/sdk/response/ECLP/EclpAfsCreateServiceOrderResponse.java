package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.createServiceOrder.ServicesResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpAfsCreateServiceOrderResponse extends AbstractResponse {
   private ServicesResult servicesResult;

   @JsonProperty("servicesResult")
   public void setServicesResult(ServicesResult servicesResult) {
      this.servicesResult = servicesResult;
   }

   @JsonProperty("servicesResult")
   public ServicesResult getServicesResult() {
      return this.servicesResult;
   }
}
