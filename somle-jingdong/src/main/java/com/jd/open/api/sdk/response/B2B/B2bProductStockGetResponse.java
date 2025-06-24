package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.B2BProductProvider.response.get.ResultBase;
import com.jd.open.api.sdk.response.AbstractResponse;

public class B2bProductStockGetResponse extends AbstractResponse {
   private ResultBase returnType;

   @JsonProperty("returnType")
   public void setReturnType(ResultBase returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ResultBase getReturnType() {
      return this.returnType;
   }
}
