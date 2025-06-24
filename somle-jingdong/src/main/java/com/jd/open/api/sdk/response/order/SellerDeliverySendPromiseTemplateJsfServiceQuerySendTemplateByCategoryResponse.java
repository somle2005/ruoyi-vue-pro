package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.SendPromiseTemplateJsfService.response.querySendTemplateByCategory.Response;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerDeliverySendPromiseTemplateJsfServiceQuerySendTemplateByCategoryResponse extends AbstractResponse {
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
