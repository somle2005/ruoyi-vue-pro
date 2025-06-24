package com.jd.open.api.sdk.response.market;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.market.PaymentOutProvider.response.paymentout.JmServiceResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class FwMarketPaymentoutResponse extends AbstractResponse {
   private JmServiceResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(JmServiceResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public JmServiceResult getReturnType() {
      return this.returnType;
   }
}
