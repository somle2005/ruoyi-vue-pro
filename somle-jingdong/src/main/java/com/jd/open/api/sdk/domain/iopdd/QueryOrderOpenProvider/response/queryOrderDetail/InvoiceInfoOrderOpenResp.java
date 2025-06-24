package com.jd.open.api.sdk.domain.iopdd.QueryOrderOpenProvider.response.queryOrderDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class InvoiceInfoOrderOpenResp implements Serializable {
   private Integer submitInvoiceType;

   @JsonProperty("submitInvoiceType")
   public void setSubmitInvoiceType(Integer submitInvoiceType) {
      this.submitInvoiceType = submitInvoiceType;
   }

   @JsonProperty("submitInvoiceType")
   public Integer getSubmitInvoiceType() {
      return this.submitInvoiceType;
   }
}
