package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.OrderInfoJosService.response.send.SendResultInfoDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EtmsWaybillSendResponse extends AbstractResponse {
   private SendResultInfoDTO resultInfo;

   @JsonProperty("resultInfo")
   public void setResultInfo(SendResultInfoDTO resultInfo) {
      this.resultInfo = resultInfo;
   }

   @JsonProperty("resultInfo")
   public SendResultInfoDTO getResultInfo() {
      return this.resultInfo;
   }
}
