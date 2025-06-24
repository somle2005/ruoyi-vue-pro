package com.jd.open.api.sdk.response.iopsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.iopsp.QueryGoodsOpenProvider.response.getSkuStateListForSku.BaseRpcResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class GetSkuStateListForSkuResponse extends AbstractResponse {
   private BaseRpcResponse baseRpcResponse;

   @JsonProperty("baseRpcResponse")
   public void setBaseRpcResponse(BaseRpcResponse baseRpcResponse) {
      this.baseRpcResponse = baseRpcResponse;
   }

   @JsonProperty("baseRpcResponse")
   public BaseRpcResponse getBaseRpcResponse() {
      return this.baseRpcResponse;
   }
}
