package com.jd.open.api.sdk.domain.B2B.PoMidProvider.response.queryPurOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NormalInvoiceResp implements Serializable {
   private Integer invoiceTitle;
   private Integer invoiceContent;
   private Integer bookInvoiceContent;
   private String companyName;
   private String taxPayerId;

   @JsonProperty("invoiceTitle")
   public void setInvoiceTitle(Integer invoiceTitle) {
      this.invoiceTitle = invoiceTitle;
   }

   @JsonProperty("invoiceTitle")
   public Integer getInvoiceTitle() {
      return this.invoiceTitle;
   }

   @JsonProperty("invoiceContent")
   public void setInvoiceContent(Integer invoiceContent) {
      this.invoiceContent = invoiceContent;
   }

   @JsonProperty("invoiceContent")
   public Integer getInvoiceContent() {
      return this.invoiceContent;
   }

   @JsonProperty("bookInvoiceContent")
   public void setBookInvoiceContent(Integer bookInvoiceContent) {
      this.bookInvoiceContent = bookInvoiceContent;
   }

   @JsonProperty("bookInvoiceContent")
   public Integer getBookInvoiceContent() {
      return this.bookInvoiceContent;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("taxPayerId")
   public void setTaxPayerId(String taxPayerId) {
      this.taxPayerId = taxPayerId;
   }

   @JsonProperty("taxPayerId")
   public String getTaxPayerId() {
      return this.taxPayerId;
   }
}
