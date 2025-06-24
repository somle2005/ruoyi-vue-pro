package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.OperateLogService.response.operatelog.CountOpLogResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromoActivityCountOperatelogResponse extends AbstractResponse {
   private CountOpLogResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(CountOpLogResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public CountOpLogResponse getReturnType() {
      return this.returnType;
   }
}
