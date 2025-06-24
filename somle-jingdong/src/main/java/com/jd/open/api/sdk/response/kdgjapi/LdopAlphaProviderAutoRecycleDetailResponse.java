package com.jd.open.api.sdk.response.kdgjapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.kdgjapi.WaybillAutoRecoverDetailApi.response.autoRecycleDetail.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopAlphaProviderAutoRecycleDetailResponse extends AbstractResponse {
   private ResponseDTO result;

   @JsonProperty("result")
   public void setResult(ResponseDTO result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ResponseDTO getResult() {
      return this.result;
   }
}
