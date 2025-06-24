package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.OrderInfoOperateSaf.response.intercept.OrderInfoOperateResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopReceiveOrderInterceptResponse extends AbstractResponse {
   private OrderInfoOperateResponse resultInfo;

   @JsonProperty("resultInfo")
   public void setResultInfo(OrderInfoOperateResponse resultInfo) {
      this.resultInfo = resultInfo;
   }

   @JsonProperty("resultInfo")
   public OrderInfoOperateResponse getResultInfo() {
      return this.resultInfo;
   }
}
