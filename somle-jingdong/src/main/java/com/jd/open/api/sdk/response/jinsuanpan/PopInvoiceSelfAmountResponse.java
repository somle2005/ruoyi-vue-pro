package com.jd.open.api.sdk.response.jinsuanpan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceOwnProvider.response.amount.InvoiceOwnQueryAmountResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopInvoiceSelfAmountResponse extends AbstractResponse {
   private InvoiceOwnQueryAmountResult queryamountforownResult;

   @JsonProperty("queryamountforown_result")
   public void setQueryamountforownResult(InvoiceOwnQueryAmountResult queryamountforownResult) {
      this.queryamountforownResult = queryamountforownResult;
   }

   @JsonProperty("queryamountforown_result")
   public InvoiceOwnQueryAmountResult getQueryamountforownResult() {
      return this.queryamountforownResult;
   }
}
