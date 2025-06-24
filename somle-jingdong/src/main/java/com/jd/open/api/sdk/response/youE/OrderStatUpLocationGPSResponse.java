package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.OrderStatJsfService.response.upLocationGPS.ServiceResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OrderStatUpLocationGPSResponse extends AbstractResponse {
   private ServiceResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(ServiceResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ServiceResult getReturnType() {
      return this.returnType;
   }
}
