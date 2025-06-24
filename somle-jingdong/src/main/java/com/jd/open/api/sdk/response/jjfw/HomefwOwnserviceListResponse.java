package com.jd.open.api.sdk.response.jjfw;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jjfw.ErpAccessService.response.list.ResultInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class HomefwOwnserviceListResponse extends AbstractResponse {
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
