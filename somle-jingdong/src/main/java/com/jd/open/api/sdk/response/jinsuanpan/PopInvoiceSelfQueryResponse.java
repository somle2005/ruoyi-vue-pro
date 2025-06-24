package com.jd.open.api.sdk.response.jinsuanpan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceOwnProvider.response.query.InvoiceOwnQueryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopInvoiceSelfQueryResponse extends AbstractResponse {
   private InvoiceOwnQueryResult queryinvoiceforownResult;

   @JsonProperty("queryinvoiceforown_result")
   public void setQueryinvoiceforownResult(InvoiceOwnQueryResult queryinvoiceforownResult) {
      this.queryinvoiceforownResult = queryinvoiceforownResult;
   }

   @JsonProperty("queryinvoiceforown_result")
   public InvoiceOwnQueryResult getQueryinvoiceforownResult() {
      return this.queryinvoiceforownResult;
   }
}
