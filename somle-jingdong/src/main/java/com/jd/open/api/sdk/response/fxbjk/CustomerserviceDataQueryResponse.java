package com.jd.open.api.sdk.response.fxbjk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.fxbjk.BdsCustomerService.response.query.BdsServiceResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CustomerserviceDataQueryResponse extends AbstractResponse {
   private BdsServiceResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(BdsServiceResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public BdsServiceResponse getReturnType() {
      return this.returnType;
   }
}
