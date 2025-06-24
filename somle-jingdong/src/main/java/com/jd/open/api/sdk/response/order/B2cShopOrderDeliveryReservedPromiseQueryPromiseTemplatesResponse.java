package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.ReservedPromiseTemplateJosService.response.queryPromiseTemplates.Response;
import com.jd.open.api.sdk.response.AbstractResponse;

public class B2cShopOrderDeliveryReservedPromiseQueryPromiseTemplatesResponse extends AbstractResponse {
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
