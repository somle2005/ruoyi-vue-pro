package com.jd.open.api.sdk.response.shangjiashouhou;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.view.ApplyResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AscApplyViewResponse extends AbstractResponse {
   private ApplyResult result;

   @JsonProperty("result")
   public void setResult(ApplyResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public ApplyResult getResult() {
      return this.result;
   }
}
