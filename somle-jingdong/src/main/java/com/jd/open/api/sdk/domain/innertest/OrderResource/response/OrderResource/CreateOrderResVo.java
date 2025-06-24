package com.jd.open.api.sdk.domain.innertest.OrderResource.response.OrderResource;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CreateOrderResVo implements Serializable {
   private Result result;

   @JsonProperty("result")
   public void setResult(Result result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Result getResult() {
      return this.result;
   }
}
