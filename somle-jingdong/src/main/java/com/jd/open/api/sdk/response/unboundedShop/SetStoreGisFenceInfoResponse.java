package com.jd.open.api.sdk.response.unboundedShop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.unboundedShop.StoreCenterServiceProvider.response.setStoreGisFenceInfo.ResultMessageTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SetStoreGisFenceInfoResponse extends AbstractResponse {
   private ResultMessageTO returnType;

   @JsonProperty("returnType")
   public void setReturnType(ResultMessageTO returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ResultMessageTO getReturnType() {
      return this.returnType;
   }
}
