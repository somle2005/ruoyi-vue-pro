package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.CustomOrderInfoOpenService.response.getOrderCustomInfos.CustomOrderInfoBatchResultEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JingdongYipProductionGetOrderCustomInfosResponse extends AbstractResponse {
   private CustomOrderInfoBatchResultEntity returnType;

   @JsonProperty("returnType")
   public void setReturnType(CustomOrderInfoBatchResultEntity returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public CustomOrderInfoBatchResultEntity getReturnType() {
      return this.returnType;
   }
}
