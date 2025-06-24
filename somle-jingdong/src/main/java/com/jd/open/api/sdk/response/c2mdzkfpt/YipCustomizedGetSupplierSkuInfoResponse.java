package com.jd.open.api.sdk.response.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.response.getSupplierSkuInfo.SupplierSkuInfoResp;
import com.jd.open.api.sdk.response.AbstractResponse;

public class YipCustomizedGetSupplierSkuInfoResponse extends AbstractResponse {
   private SupplierSkuInfoResp returnType;

   @JsonProperty("returnType")
   public void setReturnType(SupplierSkuInfoResp returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SupplierSkuInfoResp getReturnType() {
      return this.returnType;
   }
}
