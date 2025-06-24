package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.ElectronicBillApi.response.ElectronicBillApi.Result;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ComJdEerdcGrcgEjsfApiOrderElectronicBillApiResponse extends AbstractResponse {
   private Result returnType;

   @JsonProperty("returnType")
   public void setReturnType(Result returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public Result getReturnType() {
      return this.returnType;
   }
}
