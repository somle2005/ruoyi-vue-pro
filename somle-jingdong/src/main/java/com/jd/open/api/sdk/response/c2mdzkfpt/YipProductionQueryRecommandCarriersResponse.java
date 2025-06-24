package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.CarrierBaseInfoOpenService.response.queryRecommandCarriers.CarrierBaseResultEntity;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipProductionQueryRecommandCarriersResponse extends AbstractResponse {
   private CarrierBaseResultEntity returnType;

   @JsonProperty("returnType")
   public void setReturnType(CarrierBaseResultEntity returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public CarrierBaseResultEntity getReturnType() {
      return this.returnType;
   }
}
