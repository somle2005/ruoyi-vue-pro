package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductConfigSdkService.response.setProductConfig.RpcResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class ProductConfigSdkServiceSetProductConfigResponse extends AbstractResponse {
   private RpcResult configResult;

   @JsonProperty("configResult")
   public void setConfigResult(RpcResult configResult) {
      this.configResult = configResult;
   }

   @JsonProperty("configResult")
   public RpcResult getConfigResult() {
      return this.configResult;
   }
}
