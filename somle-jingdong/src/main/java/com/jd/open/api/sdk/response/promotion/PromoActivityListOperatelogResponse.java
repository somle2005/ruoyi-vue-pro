package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.OperateLogService.response.operatelog.ListOpLogResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PromoActivityListOperatelogResponse extends AbstractResponse {
   private ListOpLogResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(ListOpLogResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ListOpLogResponse getReturnType() {
      return this.returnType;
   }
}
