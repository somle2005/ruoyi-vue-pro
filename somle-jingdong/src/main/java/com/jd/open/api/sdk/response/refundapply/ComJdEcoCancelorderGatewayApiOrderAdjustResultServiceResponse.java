package com.jd.open.api.sdk.response.refundapply;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.refundapply.OrderAdjustResultService.response.OrderAdjustResultService.Response;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ComJdEcoCancelorderGatewayApiOrderAdjustResultServiceResponse extends AbstractResponse {
   private Response returnType;

   @JsonProperty("returnType")
   public void setReturnType(Response returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public Response getReturnType() {
      return this.returnType;
   }
}
