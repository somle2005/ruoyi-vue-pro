package com.jd.open.api.sdk.response.customsglobalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.customsglobalAPI.ServiceCallbackJsfService.response.serviceCallback.ServiceCallbackResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopCustomsCenterServiceCallbackJsfServiceServiceCallbackResponse extends AbstractResponse {
   private ServiceCallbackResult serviceCallbackResult;

   @JsonProperty("serviceCallbackResult")
   public void setServiceCallbackResult(ServiceCallbackResult serviceCallbackResult) {
      this.serviceCallbackResult = serviceCallbackResult;
   }

   @JsonProperty("serviceCallbackResult")
   public ServiceCallbackResult getServiceCallbackResult() {
      return this.serviceCallbackResult;
   }
}
