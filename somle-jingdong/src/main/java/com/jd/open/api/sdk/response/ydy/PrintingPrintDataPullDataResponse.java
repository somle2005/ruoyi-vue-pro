package com.jd.open.api.sdk.response.ydy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ydy.PullDataService.response.pullData.PullDataRespDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PrintingPrintDataPullDataResponse extends AbstractResponse {
   private PullDataRespDTO returnType;

   @JsonProperty("returnType")
   public void setReturnType(PullDataRespDTO returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public PullDataRespDTO getReturnType() {
      return this.returnType;
   }
}
