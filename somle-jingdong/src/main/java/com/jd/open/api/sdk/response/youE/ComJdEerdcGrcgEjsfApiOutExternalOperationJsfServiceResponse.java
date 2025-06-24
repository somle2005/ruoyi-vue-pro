package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.ExternalOperationJsfService.response.ExternalOperationJsfService.ResultVO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ComJdEerdcGrcgEjsfApiOutExternalOperationJsfServiceResponse extends AbstractResponse {
   private ResultVO returnType;

   @JsonProperty("returnType")
   public void setReturnType(ResultVO returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ResultVO getReturnType() {
      return this.returnType;
   }
}
