package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.PresaleOrderExportServiceForJOS.response.getPresaleOrderCount.ServiceResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PresaleOrderUpdateOrderGetPresaleOrderCountResponse extends AbstractResponse {
   private ServiceResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(ServiceResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ServiceResponse getReturnType() {
      return this.returnType;
   }
}
