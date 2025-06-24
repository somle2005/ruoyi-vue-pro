package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.addDeclareOrderCustoms.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpOrderAddDeclareOrderCustomsResponse extends AbstractResponse {
   private Result declaredOrderCustomsResult;

   @JsonProperty("declaredOrderCustoms_result")
   public void setDeclaredOrderCustomsResult(Result declaredOrderCustomsResult) {
      this.declaredOrderCustomsResult = declaredOrderCustomsResult;
   }

   @JsonProperty("declaredOrderCustoms_result")
   public Result getDeclaredOrderCustomsResult() {
      return this.declaredOrderCustomsResult;
   }
}
