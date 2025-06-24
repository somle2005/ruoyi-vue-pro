package com.jd.open.api.sdk.domain.B2B.PoMidProvider.response.queryPurOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VatInvoiceResp implements Serializable {
   private String taxPayerId;
   private String regCompanyName;
   private String regAddress;
   private String regPhone;
   private String regBank;
   private String regBankAccount;

   @JsonProperty("taxPayerId")
   public void setTaxPayerId(String taxPayerId) {
      this.taxPayerId = taxPayerId;
   }

   @JsonProperty("taxPayerId")
   public String getTaxPayerId() {
      return this.taxPayerId;
   }

   @JsonProperty("regCompanyName")
   public void setRegCompanyName(String regCompanyName) {
      this.regCompanyName = regCompanyName;
   }

   @JsonProperty("regCompanyName")
   public String getRegCompanyName() {
      return this.regCompanyName;
   }

   @JsonProperty("regAddress")
   public void setRegAddress(String regAddress) {
      this.regAddress = regAddress;
   }

   @JsonProperty("regAddress")
   public String getRegAddress() {
      return this.regAddress;
   }

   @JsonProperty("regPhone")
   public void setRegPhone(String regPhone) {
      this.regPhone = regPhone;
   }

   @JsonProperty("regPhone")
   public String getRegPhone() {
      return this.regPhone;
   }

   @JsonProperty("regBank")
   public void setRegBank(String regBank) {
      this.regBank = regBank;
   }

   @JsonProperty("regBank")
   public String getRegBank() {
      return this.regBank;
   }

   @JsonProperty("regBankAccount")
   public void setRegBankAccount(String regBankAccount) {
      this.regBankAccount = regBankAccount;
   }

   @JsonProperty("regBankAccount")
   public String getRegBankAccount() {
      return this.regBankAccount;
   }
}
