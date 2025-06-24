package com.jd.open.api.sdk.response.jinsuanpan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceOwnProvider.response.apply.InvoiceOwnResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopInvoiceSelfApplyResponse extends AbstractResponse {
   private InvoiceOwnResult applyinvoiceforownResult;

   @JsonProperty("applyinvoiceforown_result")
   public void setApplyinvoiceforownResult(InvoiceOwnResult applyinvoiceforownResult) {
      this.applyinvoiceforownResult = applyinvoiceforownResult;
   }

   @JsonProperty("applyinvoiceforown_result")
   public InvoiceOwnResult getApplyinvoiceforownResult() {
      return this.applyinvoiceforownResult;
   }
}
