package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.CustomOrderInfoOpenService.response.getOrderInfoByWaybillCode.CustomOrderInfoResultEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipProductionGetOrderInfoByWaybillCodeResponse extends AbstractResponse {
   private CustomOrderInfoResultEntity returnType;

   @JsonProperty("returnType")
   public void setReturnType(CustomOrderInfoResultEntity returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public CustomOrderInfoResultEntity getReturnType() {
      return this.returnType;
   }
}
