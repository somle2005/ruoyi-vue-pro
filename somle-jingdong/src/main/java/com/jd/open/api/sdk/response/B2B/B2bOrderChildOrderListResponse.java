package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.B2BOrderMiddleProvider.response.childOrderList.ResultBase;
import com.jd.open.api.sdk.response.AbstractResponse;

public class B2bOrderChildOrderListResponse extends AbstractResponse {
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
