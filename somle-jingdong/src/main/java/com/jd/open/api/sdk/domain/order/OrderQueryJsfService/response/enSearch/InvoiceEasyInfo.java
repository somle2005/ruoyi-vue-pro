package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.enSearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class InvoiceEasyInfo implements Serializable {
   private String invoiceType;
   private String invoiceTitle;
   private String invoiceContentId;
   private String invoiceConsigneeEmail;
   private String invoiceConsigneePhone;
   private String invoiceCode;

   @JsonProperty("invoiceType")
   public void setInvoiceType(String invoiceType) {
      this.invoiceType = invoiceType;
   }

   @JsonProperty("invoiceType")
   public String getInvoiceType() {
      return this.invoiceType;
   }

   @JsonProperty("invoiceTitle")
   public void setInvoiceTitle(String invoiceTitle) {
      this.invoiceTitle = invoiceTitle;
   }

   @JsonProperty("invoiceTitle")
   public String getInvoiceTitle() {
      return this.invoiceTitle;
   }

   @JsonProperty("invoiceContentId")
   public void setInvoiceContentId(String invoiceContentId) {
      this.invoiceContentId = invoiceContentId;
   }

   @JsonProperty("invoiceContentId")
   public String getInvoiceContentId() {
      return this.invoiceContentId;
   }

   @JsonProperty("invoiceConsigneeEmail")
   public void setInvoiceConsigneeEmail(String invoiceConsigneeEmail) {
      this.invoiceConsigneeEmail = invoiceConsigneeEmail;
   }

   @JsonProperty("invoiceConsigneeEmail")
   public String getInvoiceConsigneeEmail() {
      return this.invoiceConsigneeEmail;
   }

   @JsonProperty("invoiceConsigneePhone")
   public void setInvoiceConsigneePhone(String invoiceConsigneePhone) {
      this.invoiceConsigneePhone = invoiceConsigneePhone;
   }

   @JsonProperty("invoiceConsigneePhone")
   public String getInvoiceConsigneePhone() {
      return this.invoiceConsigneePhone;
   }

   @JsonProperty("invoiceCode")
   public void setInvoiceCode(String invoiceCode) {
      this.invoiceCode = invoiceCode;
   }

   @JsonProperty("invoiceCode")
   public String getInvoiceCode() {
      return this.invoiceCode;
   }
}
