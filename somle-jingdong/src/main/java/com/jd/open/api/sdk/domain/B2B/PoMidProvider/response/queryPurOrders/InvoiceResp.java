package com.jd.open.api.sdk.domain.B2B.PoMidProvider.response.queryPurOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class InvoiceResp implements Serializable {
   private Integer invoiceType;
   private Integer invoicePutType;
   private Long regAddressId;
   private NormalInvoiceResp normalInvoiceResp;
   private VatInvoiceResp vatInvoiceResp;
   private ConsigneeResp consigneeResp;

   @JsonProperty("invoiceType")
   public void setInvoiceType(Integer invoiceType) {
      this.invoiceType = invoiceType;
   }

   @JsonProperty("invoiceType")
   public Integer getInvoiceType() {
      return this.invoiceType;
   }

   @JsonProperty("invoicePutType")
   public void setInvoicePutType(Integer invoicePutType) {
      this.invoicePutType = invoicePutType;
   }

   @JsonProperty("invoicePutType")
   public Integer getInvoicePutType() {
      return this.invoicePutType;
   }

   @JsonProperty("regAddressId")
   public void setRegAddressId(Long regAddressId) {
      this.regAddressId = regAddressId;
   }

   @JsonProperty("regAddressId")
   public Long getRegAddressId() {
      return this.regAddressId;
   }

   @JsonProperty("normalInvoiceResp")
   public void setNormalInvoiceResp(NormalInvoiceResp normalInvoiceResp) {
      this.normalInvoiceResp = normalInvoiceResp;
   }

   @JsonProperty("normalInvoiceResp")
   public NormalInvoiceResp getNormalInvoiceResp() {
      return this.normalInvoiceResp;
   }

   @JsonProperty("vatInvoiceResp")
   public void setVatInvoiceResp(VatInvoiceResp vatInvoiceResp) {
      this.vatInvoiceResp = vatInvoiceResp;
   }

   @JsonProperty("vatInvoiceResp")
   public VatInvoiceResp getVatInvoiceResp() {
      return this.vatInvoiceResp;
   }

   @JsonProperty("consigneeResp")
   public void setConsigneeResp(ConsigneeResp consigneeResp) {
      this.consigneeResp = consigneeResp;
   }

   @JsonProperty("consigneeResp")
   public ConsigneeResp getConsigneeResp() {
      return this.consigneeResp;
   }
}
