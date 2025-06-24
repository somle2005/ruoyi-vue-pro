package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VatInvoiceReq implements Serializable {
   private String companyName;
   private String taxpayerIdentity;
   private String registeredAddress;
   private String registeredBank;
   private String registeredBankAccount;
   private String registeredPhone;

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("taxpayerIdentity")
   public void setTaxpayerIdentity(String taxpayerIdentity) {
      this.taxpayerIdentity = taxpayerIdentity;
   }

   @JsonProperty("taxpayerIdentity")
   public String getTaxpayerIdentity() {
      return this.taxpayerIdentity;
   }

   @JsonProperty("registeredAddress")
   public void setRegisteredAddress(String registeredAddress) {
      this.registeredAddress = registeredAddress;
   }

   @JsonProperty("registeredAddress")
   public String getRegisteredAddress() {
      return this.registeredAddress;
   }

   @JsonProperty("registeredBank")
   public void setRegisteredBank(String registeredBank) {
      this.registeredBank = registeredBank;
   }

   @JsonProperty("registeredBank")
   public String getRegisteredBank() {
      return this.registeredBank;
   }

   @JsonProperty("registeredBankAccount")
   public void setRegisteredBankAccount(String registeredBankAccount) {
      this.registeredBankAccount = registeredBankAccount;
   }

   @JsonProperty("registeredBankAccount")
   public String getRegisteredBankAccount() {
      return this.registeredBankAccount;
   }

   @JsonProperty("registeredPhone")
   public void setRegisteredPhone(String registeredPhone) {
      this.registeredPhone = registeredPhone;
   }

   @JsonProperty("registeredPhone")
   public String getRegisteredPhone() {
      return this.registeredPhone;
   }
}
