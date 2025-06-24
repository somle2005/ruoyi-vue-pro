package com.jd.open.api.sdk.response.customsglobalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.customsglobalAPI.EclpDlzServiceCallbackJsfService.response.serviceCallback.EclpDlzServiceCallbackResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopCustomsCenterServiceSoaDlzServicecallbackServiceCallbackResponse extends AbstractResponse {
   private EclpDlzServiceCallbackResult serviceCallbackResult;

   @JsonProperty("serviceCallbackResult")
   public void setServiceCallbackResult(EclpDlzServiceCallbackResult serviceCallbackResult) {
      this.serviceCallbackResult = serviceCallbackResult;
   }

   @JsonProperty("serviceCallbackResult")
   public EclpDlzServiceCallbackResult getServiceCallbackResult() {
      return this.serviceCallbackResult;
   }
}
