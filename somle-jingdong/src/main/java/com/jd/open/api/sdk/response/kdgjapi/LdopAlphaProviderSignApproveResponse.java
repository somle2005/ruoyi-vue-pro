package com.jd.open.api.sdk.response.kdgjapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.kdgjapi.SignApproveApi.response.approve.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopAlphaProviderSignApproveResponse extends AbstractResponse {
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
