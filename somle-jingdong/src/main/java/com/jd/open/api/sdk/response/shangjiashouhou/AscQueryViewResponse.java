package com.jd.open.api.sdk.response.shangjiashouhou;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.view.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AscQueryViewResponse extends AbstractResponse {
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
