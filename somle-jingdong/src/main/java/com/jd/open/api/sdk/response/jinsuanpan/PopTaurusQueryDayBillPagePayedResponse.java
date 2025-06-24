package com.jd.open.api.sdk.response.jinsuanpan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jinsuanpan.SunMoonStatementProvider.response.queryDayBillPagePayed.Response;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopTaurusQueryDayBillPagePayedResponse extends AbstractResponse {
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
