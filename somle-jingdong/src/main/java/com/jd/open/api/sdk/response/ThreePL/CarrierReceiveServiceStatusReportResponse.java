package com.jd.open.api.sdk.response.ThreePL;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ThreePL.CarrierReceiveService.response.statusReport.SdkRpcResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CarrierReceiveServiceStatusReportResponse extends AbstractResponse {
   private SdkRpcResult result;

   @JsonProperty("result")
   public void setResult(SdkRpcResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public SdkRpcResult getResult() {
      return this.result;
   }
}
