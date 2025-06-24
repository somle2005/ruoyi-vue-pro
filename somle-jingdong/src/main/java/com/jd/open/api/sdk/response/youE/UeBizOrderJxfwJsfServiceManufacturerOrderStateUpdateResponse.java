package com.jd.open.api.sdk.response.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.BizOrderJxfwJsfService.response.manufacturerOrderStateUpdate.ResultInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class UeBizOrderJxfwJsfServiceManufacturerOrderStateUpdateResponse extends AbstractResponse {
   private ResultInfo returnType;

   @JsonProperty("returnType")
   public void setReturnType(ResultInfo returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ResultInfo getReturnType() {
      return this.returnType;
   }
}
