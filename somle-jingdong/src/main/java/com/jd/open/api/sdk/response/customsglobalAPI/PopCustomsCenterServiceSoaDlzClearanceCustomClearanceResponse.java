package com.jd.open.api.sdk.response.customsglobalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.customsglobalAPI.EclpDlzClearanceCallbackJsfService.response.customClearance.EclpDlzCustomClearanceResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopCustomsCenterServiceSoaDlzClearanceCustomClearanceResponse extends AbstractResponse {
   private EclpDlzCustomClearanceResponse response;

   @JsonProperty("response")
   public void setResponse(EclpDlzCustomClearanceResponse response) {
      this.response = response;
   }

   @JsonProperty("response")
   public EclpDlzCustomClearanceResponse getResponse() {
      return this.response;
   }
}
