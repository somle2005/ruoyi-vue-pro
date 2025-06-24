package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.OrderBankAdapterJsfService.response.getPaymentNoResultByVender.PaymentNoResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopCustomsCenterOrderBankAdapterJsfServiceGetPaymentNoResultByVenderResponse extends AbstractResponse {
   private PaymentNoResult getPaymentNoResultByVenderResult;

   @JsonProperty("getPaymentNoResultByVender_result")
   public void setGetPaymentNoResultByVenderResult(PaymentNoResult getPaymentNoResultByVenderResult) {
      this.getPaymentNoResultByVenderResult = getPaymentNoResultByVenderResult;
   }

   @JsonProperty("getPaymentNoResultByVender_result")
   public PaymentNoResult getGetPaymentNoResultByVenderResult() {
      return this.getPaymentNoResultByVenderResult;
   }
}
