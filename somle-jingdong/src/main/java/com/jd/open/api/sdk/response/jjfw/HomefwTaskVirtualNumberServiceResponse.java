package com.jd.open.api.sdk.response.jjfw;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jjfw.VirtualNumberService.response.virtualNumberService.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class HomefwTaskVirtualNumberServiceResponse extends AbstractResponse {
   private Result Result;

   @JsonProperty("Result")
   public void setResult(Result Result) {
      this.Result = Result;
   }

   @JsonProperty("Result")
   public Result getResult() {
      return this.Result;
   }
}
