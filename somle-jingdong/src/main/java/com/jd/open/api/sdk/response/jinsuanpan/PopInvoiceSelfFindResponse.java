package com.jd.open.api.sdk.response.jinsuanpan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.jinsuanpan.FinInvoiceOwnProvider.response.find.InvoiceOwnGetResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopInvoiceSelfFindResponse extends AbstractResponse {
   private InvoiceOwnGetResult getinvoiceforownbyinvoicenoResult;

   @JsonProperty("getinvoiceforownbyinvoiceno_result")
   public void setGetinvoiceforownbyinvoicenoResult(InvoiceOwnGetResult getinvoiceforownbyinvoicenoResult) {
      this.getinvoiceforownbyinvoicenoResult = getinvoiceforownbyinvoicenoResult;
   }

   @JsonProperty("getinvoiceforownbyinvoiceno_result")
   public InvoiceOwnGetResult getGetinvoiceforownbyinvoicenoResult() {
      return this.getinvoiceforownbyinvoicenoResult;
   }
}
