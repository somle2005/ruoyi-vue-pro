package com.jd.open.api.sdk.response.qchfw;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.qchfw.ApplyService.response.checkGmsCarCategory.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CheckGmsCarCategoryResponse extends AbstractResponse {
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
