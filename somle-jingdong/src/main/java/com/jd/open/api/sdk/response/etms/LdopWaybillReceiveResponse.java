package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.WaybillJosService.response.receive.WaybillResultInfoDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopWaybillReceiveResponse extends AbstractResponse {
   private WaybillResultInfoDTO receiveorderinfoResult;

   @JsonProperty("receiveorderinfo_result")
   public void setReceiveorderinfoResult(WaybillResultInfoDTO receiveorderinfoResult) {
      this.receiveorderinfoResult = receiveorderinfoResult;
   }

   @JsonProperty("receiveorderinfo_result")
   public WaybillResultInfoDTO getReceiveorderinfoResult() {
      return this.receiveorderinfoResult;
   }
}
