package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.ServiceErpService.response.queryServiceList.ErpPageResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class B2bGxptServiceErpServiceQueryServiceListResponse extends AbstractResponse {
   private ErpPageResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(ErpPageResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ErpPageResult getReturnType() {
      return this.returnType;
   }
}
