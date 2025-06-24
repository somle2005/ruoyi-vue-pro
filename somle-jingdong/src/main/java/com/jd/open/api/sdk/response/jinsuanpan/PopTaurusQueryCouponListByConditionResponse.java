package com.jd.open.api.sdk.response.jinsuanpan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jinsuanpan.BillQueryServiceProvider.response.queryCouponListByCondition.RpcResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopTaurusQueryCouponListByConditionResponse extends AbstractResponse {
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
