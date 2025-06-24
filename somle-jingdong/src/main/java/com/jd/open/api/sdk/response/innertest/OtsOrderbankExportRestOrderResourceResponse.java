package com.jd.open.api.sdk.response.innertest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.innertest.OrderResource.response.OrderResource.CreateOrderResVo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class OtsOrderbankExportRestOrderResourceResponse extends AbstractResponse {
   private CreateOrderResVo returnType;

   @JsonProperty("returnType")
   public void setReturnType(CreateOrderResVo returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public CreateOrderResVo getReturnType() {
      return this.returnType;
   }
}
