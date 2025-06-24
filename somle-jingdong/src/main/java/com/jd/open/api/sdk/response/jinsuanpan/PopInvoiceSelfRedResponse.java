package com.jd.open.api.sdk.response.jinsuanpan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceOwnProvider.response.red.InvoiceOwnResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopInvoiceSelfRedResponse extends AbstractResponse {
   private InvoiceOwnResult redinvoiceforownResult;

   @JsonProperty("redinvoiceforown_result")
   public void setRedinvoiceforownResult(InvoiceOwnResult redinvoiceforownResult) {
      this.redinvoiceforownResult = redinvoiceforownResult;
   }

   @JsonProperty("redinvoiceforown_result")
   public InvoiceOwnResult getRedinvoiceforownResult() {
      return this.redinvoiceforownResult;
   }
}
