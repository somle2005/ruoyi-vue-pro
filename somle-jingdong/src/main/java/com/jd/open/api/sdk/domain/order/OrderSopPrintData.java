package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderSopPrintData extends OrderPrintData {
   private String invoiceTitle;
   private String invoiceType;
   private String invoiceContent;

   @JsonProperty("invoice_title")
   public String getInvoiceTitle() {
      return this.invoiceTitle;
   }

   @JsonProperty("invoice_title")
   public void setInvoiceTitle(String invoiceTitle) {
      this.invoiceTitle = invoiceTitle;
   }

   @JsonProperty("invoice_type")
   public String getInvoiceType() {
      return this.invoiceType;
   }

   @JsonProperty("invoice_type")
   public void setInvoiceType(String invoiceType) {
      this.invoiceType = invoiceType;
   }

   @JsonProperty("invoice_content")
   public String getInvoiceContent() {
      return this.invoiceContent;
   }

   @JsonProperty("invoice_content")
   public void setInvoiceContent(String invoiceContent) {
      this.invoiceContent = invoiceContent;
   }
}
