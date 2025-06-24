package com.jd.open.api.sdk.response.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.AppointmentReadOuterService.response.queryAppointmentPage.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class QueryAppointmentPageResponse extends AbstractResponse {
   private Result returnType;

   @JsonProperty("returnType")
   public void setReturnType(Result returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public Result getReturnType() {
      return this.returnType;
   }
}
