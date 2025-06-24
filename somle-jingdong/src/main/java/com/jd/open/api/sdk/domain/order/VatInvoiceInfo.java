package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VatInvoiceInfo {
   private String taxpayerIdent;
   private String registeredAddress;
   private String registeredPhone;
   private String depositBank;
   private String bankAccount;

   @JsonProperty("taxpayer_ident")
   public String getTaxpayerIdent() {
      return this.taxpayerIdent;
   }

   @JsonProperty("taxpayer_ident")
   public void setTaxpayerIdent(String taxpayerIdent) {
      this.taxpayerIdent = taxpayerIdent;
   }

   @JsonProperty("registered_address")
   public String getRegisteredAddress() {
      return this.registeredAddress;
   }

   @JsonProperty("registered_address")
   public void setRegisteredAddress(String registeredAddress) {
      this.registeredAddress = registeredAddress;
   }

   @JsonProperty("registered_phone")
   public String getRegisteredPhone() {
      return this.registeredPhone;
   }

   @JsonProperty("registered_phone")
   public void setRegisteredPhone(String registeredPhone) {
      this.registeredPhone = registeredPhone;
   }

   @JsonProperty("deposit_bank")
   public String getDepositBank() {
      return this.depositBank;
   }

   @JsonProperty("deposit_bank")
   public void setDepositBank(String depositBank) {
      this.depositBank = depositBank;
   }

   @JsonProperty("bank_account")
   public String getBankAccount() {
      return this.bankAccount;
   }

   @JsonProperty("bank_account")
   public void setBankAccount(String bankAccount) {
      this.bankAccount = bankAccount;
   }
}
