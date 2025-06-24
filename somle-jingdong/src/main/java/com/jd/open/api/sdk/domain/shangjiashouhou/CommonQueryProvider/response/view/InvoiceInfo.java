package com.jd.open.api.sdk.domain.shangjiashouhou.CommonQueryProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class InvoiceInfo implements Serializable {
   private String invoiceCode;
   private String invoiceState;
   private String invoiceStateName;
   private List<InvoiceLog> invoiceLogList;
   private AfsAddressInfo afsAddress;

   @JsonProperty("invoiceCode")
   public void setInvoiceCode(String invoiceCode) {
      this.invoiceCode = invoiceCode;
   }

   @JsonProperty("invoiceCode")
   public String getInvoiceCode() {
      return this.invoiceCode;
   }

   @JsonProperty("invoiceState")
   public void setInvoiceState(String invoiceState) {
      this.invoiceState = invoiceState;
   }

   @JsonProperty("invoiceState")
   public String getInvoiceState() {
      return this.invoiceState;
   }

   @JsonProperty("invoiceStateName")
   public void setInvoiceStateName(String invoiceStateName) {
      this.invoiceStateName = invoiceStateName;
   }

   @JsonProperty("invoiceStateName")
   public String getInvoiceStateName() {
      return this.invoiceStateName;
   }

   @JsonProperty("invoiceLogList")
   public void setInvoiceLogList(List<InvoiceLog> invoiceLogList) {
      this.invoiceLogList = invoiceLogList;
   }

   @JsonProperty("invoiceLogList")
   public List<InvoiceLog> getInvoiceLogList() {
      return this.invoiceLogList;
   }

   @JsonProperty("afsAddress")
   public void setAfsAddress(AfsAddressInfo afsAddress) {
      this.afsAddress = afsAddress;
   }

   @JsonProperty("afsAddress")
   public AfsAddressInfo getAfsAddress() {
      return this.afsAddress;
   }
}
