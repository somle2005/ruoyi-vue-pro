package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class InvoiceReq implements Serializable {
   private Integer invoiceType;
   private Integer putType;
   private VatInvoiceReq vatInvoice;
   private InvoiceConsigneeReq invoiceConsignee;
   private ElectricInvoiceReq electricInvoice;

   @JsonProperty("invoiceType")
   public void setInvoiceType(Integer invoiceType) {
      this.invoiceType = invoiceType;
   }

   @JsonProperty("invoiceType")
   public Integer getInvoiceType() {
      return this.invoiceType;
   }

   @JsonProperty("putType")
   public void setPutType(Integer putType) {
      this.putType = putType;
   }

   @JsonProperty("putType")
   public Integer getPutType() {
      return this.putType;
   }

   @JsonProperty("vatInvoice")
   public void setVatInvoice(VatInvoiceReq vatInvoice) {
      this.vatInvoice = vatInvoice;
   }

   @JsonProperty("vatInvoice")
   public VatInvoiceReq getVatInvoice() {
      return this.vatInvoice;
   }

   @JsonProperty("invoiceConsignee")
   public void setInvoiceConsignee(InvoiceConsigneeReq invoiceConsignee) {
      this.invoiceConsignee = invoiceConsignee;
   }

   @JsonProperty("invoiceConsignee")
   public InvoiceConsigneeReq getInvoiceConsignee() {
      return this.invoiceConsignee;
   }

   @JsonProperty("electricInvoice")
   public void setElectricInvoice(ElectricInvoiceReq electricInvoice) {
      this.electricInvoice = electricInvoice;
   }

   @JsonProperty("electricInvoice")
   public ElectricInvoiceReq getElectricInvoice() {
      return this.electricInvoice;
   }
}
