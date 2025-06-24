package com.jd.open.api.sdk.response.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.ProductService.response.queryProductStock.ErpResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class B2bGxptProductServiceQueryProductStockResponse extends AbstractResponse {
   private ErpResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(ErpResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public ErpResult getReturnType() {
      return this.returnType;
   }
}
