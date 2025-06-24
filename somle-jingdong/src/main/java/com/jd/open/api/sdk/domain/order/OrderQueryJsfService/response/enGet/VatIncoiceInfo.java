package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.enGet;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VatIncoiceInfo implements Serializable {
   private String vatNo;
   private String addressRegIstered;
   private String phoneRegIstered;
   private String depositBank;
   private String bankAccount;
   private String userAddress;
   private String userName;
   private String userPhone;

   @JsonProperty("vatNo")
   public void setVatNo(String vatNo) {
      this.vatNo = vatNo;
   }

   @JsonProperty("vatNo")
   public String getVatNo() {
      return this.vatNo;
   }

   @JsonProperty("addressRegIstered")
   public void setAddressRegIstered(String addressRegIstered) {
      this.addressRegIstered = addressRegIstered;
   }

   @JsonProperty("addressRegIstered")
   public String getAddressRegIstered() {
      return this.addressRegIstered;
   }

   @JsonProperty("phoneRegIstered")
   public void setPhoneRegIstered(String phoneRegIstered) {
      this.phoneRegIstered = phoneRegIstered;
   }

   @JsonProperty("phoneRegIstered")
   public String getPhoneRegIstered() {
      return this.phoneRegIstered;
   }

   @JsonProperty("depositBank")
   public void setDepositBank(String depositBank) {
      this.depositBank = depositBank;
   }

   @JsonProperty("depositBank")
   public String getDepositBank() {
      return this.depositBank;
   }

   @JsonProperty("bankAccount")
   public void setBankAccount(String bankAccount) {
      this.bankAccount = bankAccount;
   }

   @JsonProperty("bankAccount")
   public String getBankAccount() {
      return this.bankAccount;
   }

   @JsonProperty("userAddress")
   public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
   }

   @JsonProperty("userAddress")
   public String getUserAddress() {
      return this.userAddress;
   }

   @JsonProperty("userName")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("userName")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("userPhone")
   public void setUserPhone(String userPhone) {
      this.userPhone = userPhone;
   }

   @JsonProperty("userPhone")
   public String getUserPhone() {
      return this.userPhone;
   }
}
