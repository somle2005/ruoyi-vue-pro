package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.ExternalWarningEventService.response.ExternalWarningEventService.PageModel;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ComJdPopRdmanBaseExternalserviceExternalWarningEventServiceResponse extends AbstractResponse {
   private PageModel returnType;

   @JsonProperty("returnType")
   public void setReturnType(PageModel returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public PageModel getReturnType() {
      return this.returnType;
   }
}
