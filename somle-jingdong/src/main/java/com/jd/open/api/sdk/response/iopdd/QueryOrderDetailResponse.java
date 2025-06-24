package com.jd.open.api.sdk.response.iopdd;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.iopdd.QueryOrderOpenProvider.response.queryOrderDetail.BaseRpcResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class QueryOrderDetailResponse extends AbstractResponse {
   private BaseRpcResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(BaseRpcResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public BaseRpcResponse getReturnType() {
      return this.returnType;
   }
}
