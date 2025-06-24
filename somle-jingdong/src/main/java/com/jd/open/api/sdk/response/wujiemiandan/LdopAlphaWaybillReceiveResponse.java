package com.jd.open.api.sdk.response.wujiemiandan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveApi.response.receive.WaybillResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopAlphaWaybillReceiveResponse extends AbstractResponse {
   private WaybillResponseDTO resultInfo;

   @JsonProperty("resultInfo")
   public void setResultInfo(WaybillResponseDTO resultInfo) {
      this.resultInfo = resultInfo;
   }

   @JsonProperty("resultInfo")
   public WaybillResponseDTO getResultInfo() {
      return this.resultInfo;
   }
}
