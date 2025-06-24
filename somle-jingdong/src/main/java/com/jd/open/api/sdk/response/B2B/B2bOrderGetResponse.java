package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.B2BOrderMiddleProvider.response.get.ResultBase;
import com.jd.open.api.sdk.response.AbstractResponse;

public class B2bOrderGetResponse extends AbstractResponse {
   private ResultBase resultBase;

   @JsonProperty("resultBase")
   public void setResultBase(ResultBase resultBase) {
      this.resultBase = resultBase;
   }

   @JsonProperty("resultBase")
   public ResultBase getResultBase() {
      return this.resultBase;
   }
}
