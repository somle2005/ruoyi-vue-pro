package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.OrderStartOpenService.response.startProduct.StartResultEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipProductionStartProductResponse extends AbstractResponse {
   private StartResultEntity returnType;

   @JsonProperty("returnType")
   public void setReturnType(StartResultEntity returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public StartResultEntity getReturnType() {
      return this.returnType;
   }
}
