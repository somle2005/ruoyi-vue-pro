package com.jd.open.api.sdk.response.spgl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.spgl.ProductReadRpcService.response.queryProductInfoByPage.RpcResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class BProductProductReadRpcServiceQueryProductInfoByPageResponse extends AbstractResponse {
   private RpcResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(RpcResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public RpcResponse getReturnType() {
      return this.returnType;
   }
}
