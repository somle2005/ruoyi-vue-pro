package com.jd.open.api.sdk.response.wujiemiandan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wujiemiandan.QueryContractApi.response.query.Response;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LogisticsEwaybillContractQueryResponse extends AbstractResponse {
   private Response returnType;

   @JsonProperty("returnType")
   public void setReturnType(Response returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public Response getReturnType() {
      return this.returnType;
   }
}
