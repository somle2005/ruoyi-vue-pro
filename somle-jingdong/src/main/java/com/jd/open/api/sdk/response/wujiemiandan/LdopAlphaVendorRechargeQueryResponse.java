package com.jd.open.api.sdk.response.wujiemiandan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wujiemiandan.StockQueryApi.response.query.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopAlphaVendorRechargeQueryResponse extends AbstractResponse {
   private ResponseDTO resultInfo;

   @JsonProperty("resultInfo")
   public void setResultInfo(ResponseDTO resultInfo) {
      this.resultInfo = resultInfo;
   }

   @JsonProperty("resultInfo")
   public ResponseDTO getResultInfo() {
      return this.resultInfo;
   }
}
