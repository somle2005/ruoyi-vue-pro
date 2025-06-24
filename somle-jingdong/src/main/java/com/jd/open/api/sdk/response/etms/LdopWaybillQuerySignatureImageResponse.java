package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.GeneralWaybillQueryApi.response.querySignatureImage.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopWaybillQuerySignatureImageResponse extends AbstractResponse {
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
