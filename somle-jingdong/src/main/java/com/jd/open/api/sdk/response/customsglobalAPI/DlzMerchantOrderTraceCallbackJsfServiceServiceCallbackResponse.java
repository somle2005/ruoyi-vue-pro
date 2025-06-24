package com.jd.open.api.sdk.response.customsglobalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.customsglobalAPI.DlzMerchantOrderTraceCallbackJsfService.response.serviceCallback.ServiceCallbackResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class DlzMerchantOrderTraceCallbackJsfServiceServiceCallbackResponse extends AbstractResponse {
   private ServiceCallbackResult result;

   @JsonProperty("result")
   public void setResult(ServiceCallbackResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ServiceCallbackResult getResult() {
      return this.result;
   }
}
