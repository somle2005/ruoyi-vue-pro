package com.jd.open.api.sdk.response.shangjiashouhou;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.shangjiashouhou.CommonQueryProvider.response.serviceTel.StringResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class AscViewServiceTelResponse extends AbstractResponse {
   private StringResult result;

   @JsonProperty("result")
   public void setResult(StringResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public StringResult getResult() {
      return this.result;
   }
}
