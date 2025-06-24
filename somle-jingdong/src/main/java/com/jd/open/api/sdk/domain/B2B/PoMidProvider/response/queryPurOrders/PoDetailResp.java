package com.jd.open.api.sdk.domain.B2B.PoMidProvider.response.queryPurOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PoDetailResp implements Serializable {
   private ConsigneeResp consigneeResp;
   private InvoiceResp invoiceResp;

   @JsonProperty("consigneeResp")
   public void setConsigneeResp(ConsigneeResp consigneeResp) {
      this.consigneeResp = consigneeResp;
   }

   @JsonProperty("consigneeResp")
   public ConsigneeResp getConsigneeResp() {
      return this.consigneeResp;
   }

   @JsonProperty("invoiceResp")
   public void setInvoiceResp(InvoiceResp invoiceResp) {
      this.invoiceResp = invoiceResp;
   }

   @JsonProperty("invoiceResp")
   public InvoiceResp getInvoiceResp() {
      return this.invoiceResp;
   }
}
