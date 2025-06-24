package com.jd.open.api.sdk.response.ydy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ydy.PullDataService.response.sensitivePullData.SensitivePullDataRespDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PrintingPrintDataSensitivePullDataResponse extends AbstractResponse {
   private SensitivePullDataRespDTO returnType;

   @JsonProperty("returnType")
   public void setReturnType(SensitivePullDataRespDTO returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SensitivePullDataRespDTO getReturnType() {
      return this.returnType;
   }
}
