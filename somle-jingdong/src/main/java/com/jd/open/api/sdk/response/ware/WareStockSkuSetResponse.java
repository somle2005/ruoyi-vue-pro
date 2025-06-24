package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.JosStockService.response.set.CommonResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareStockSkuSetResponse extends AbstractResponse {
   private CommonResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(CommonResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public CommonResult getReturnType() {
      return this.returnType;
   }
}
