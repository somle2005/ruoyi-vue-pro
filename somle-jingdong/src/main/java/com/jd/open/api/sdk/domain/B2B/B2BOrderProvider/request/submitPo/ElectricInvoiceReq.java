package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ElectricInvoiceReq implements Serializable {
   private Integer title;
   private String taxpayerIdentity;
   private String companyName;
   private Integer bookInvoiceContent;
   private Integer invoiceContent;
   private String phone;
   private String email;

   @JsonProperty("title")
   public void setTitle(Integer title) {
      this.title = title;
   }

   @JsonProperty("title")
   public Integer getTitle() {
      return this.title;
   }

   @JsonProperty("taxpayerIdentity")
   public void setTaxpayerIdentity(String taxpayerIdentity) {
      this.taxpayerIdentity = taxpayerIdentity;
   }

   @JsonProperty("taxpayerIdentity")
   public String getTaxpayerIdentity() {
      return this.taxpayerIdentity;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("bookInvoiceContent")
   public void setBookInvoiceContent(Integer bookInvoiceContent) {
      this.bookInvoiceContent = bookInvoiceContent;
   }

   @JsonProperty("bookInvoiceContent")
   public Integer getBookInvoiceContent() {
      return this.bookInvoiceContent;
   }

   @JsonProperty("invoiceContent")
   public void setInvoiceContent(Integer invoiceContent) {
      this.invoiceContent = invoiceContent;
   }

   @JsonProperty("invoiceContent")
   public Integer getInvoiceContent() {
      return this.invoiceContent;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("email")
   public void setEmail(String email) {
      this.email = email;
   }

   @JsonProperty("email")
   public String getEmail() {
      return this.email;
   }
}
