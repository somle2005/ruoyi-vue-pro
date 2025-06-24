package com.jd.open.api.sdk.response.iopdz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.iopdz.QueryAddressOpenProvider.response.queryJdAreaIdList.BaseRpcResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class QueryJdAreaIdListResponse extends AbstractResponse {
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
