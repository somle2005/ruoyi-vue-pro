package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.OrderInfoJosService.response.get.GetResultInfoDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EtmsWaybillcodeGetResponse extends AbstractResponse {
   private GetResultInfoDTO resultInfo;

   @JsonProperty("resultInfo")
   public void setResultInfo(GetResultInfoDTO resultInfo) {
      this.resultInfo = resultInfo;
   }

   @JsonProperty("resultInfo")
   public GetResultInfoDTO getResultInfo() {
      return this.resultInfo;
   }
}
