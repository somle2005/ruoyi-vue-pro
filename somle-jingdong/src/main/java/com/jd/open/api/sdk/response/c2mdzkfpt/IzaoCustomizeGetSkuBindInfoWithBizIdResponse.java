package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.BespokeInfoWebService.response.getSkuBindInfoWithBizId.DataResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class IzaoCustomizeGetSkuBindInfoWithBizIdResponse extends AbstractResponse {
   private DataResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(DataResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public DataResponse getReturnType() {
      return this.returnType;
   }
}
