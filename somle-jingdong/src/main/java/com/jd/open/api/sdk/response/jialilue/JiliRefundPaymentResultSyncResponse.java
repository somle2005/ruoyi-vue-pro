package com.jd.open.api.sdk.response.jialilue;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jialilue.RefundWriteProvider.response.sync.RefundResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JiliRefundPaymentResultSyncResponse extends AbstractResponse {
   private RefundResponse returnType;

   @JsonProperty("returnType")
   public void setReturnType(RefundResponse returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public RefundResponse getReturnType() {
      return this.returnType;
   }
}
