package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.BizOrderJsfService.response.getChangeOrder.ResultInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UeNewSaaSOrderGetChangeOrderResponse extends AbstractResponse {
   private ResultInfo resultInfo;

   @JsonProperty("resultInfo")
   public void setResultInfo(ResultInfo resultInfo) {
      this.resultInfo = resultInfo;
   }

   @JsonProperty("resultInfo")
   public ResultInfo getResultInfo() {
      return this.resultInfo;
   }
}
