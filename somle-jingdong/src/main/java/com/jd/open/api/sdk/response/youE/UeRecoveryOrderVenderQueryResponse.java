package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.VenderQueryOrderJsfService.response.query.BaseResultInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UeRecoveryOrderVenderQueryResponse extends AbstractResponse {
   private BaseResultInfo resultInfo;

   @JsonProperty("resultInfo")
   public void setResultInfo(BaseResultInfo resultInfo) {
      this.resultInfo = resultInfo;
   }

   @JsonProperty("resultInfo")
   public BaseResultInfo getResultInfo() {
      return this.resultInfo;
   }
}
