package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.JDeliveryServiceJsf.response.check.ResultInfoDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EtmsRangeCheckResponse extends AbstractResponse {
   private ResultInfoDTO resultInfo;

   @JsonProperty("resultInfo")
   public void setResultInfo(ResultInfoDTO resultInfo) {
      this.resultInfo = resultInfo;
   }

   @JsonProperty("resultInfo")
   public ResultInfoDTO getResultInfo() {
      return this.resultInfo;
   }
}
