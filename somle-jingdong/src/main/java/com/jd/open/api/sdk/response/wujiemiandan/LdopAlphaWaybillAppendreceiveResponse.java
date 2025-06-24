package com.jd.open.api.sdk.response.wujiemiandan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wujiemiandan.WaybillAppendApi.response.appendreceive.WaybillResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopAlphaWaybillAppendreceiveResponse extends AbstractResponse {
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
