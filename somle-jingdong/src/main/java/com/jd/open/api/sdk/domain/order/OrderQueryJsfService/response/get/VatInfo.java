package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VatInfo implements Serializable {
   private String vatNo;
   private String addressRegIstered;
   private String phoneRegIstered;
   private String depositBank;
   private String bankAccount;
   private String companyName;
   private String userName;
   private String userPhone;
   private Long userProvinceId;
   private String userProvinceName;
   private Long userCityId;
   private String userCityName;
   private Long userAreaId;
   private String userAreaName;
   private Long userTownId;
   private String userTownName;
   private String userAddress;

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

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
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

   @JsonProperty("userProvinceId")
   public void setUserProvinceId(Long userProvinceId) {
      this.userProvinceId = userProvinceId;
   }

   @JsonProperty("userProvinceId")
   public Long getUserProvinceId() {
      return this.userProvinceId;
   }

   @JsonProperty("userProvinceName")
   public void setUserProvinceName(String userProvinceName) {
      this.userProvinceName = userProvinceName;
   }

   @JsonProperty("userProvinceName")
   public String getUserProvinceName() {
      return this.userProvinceName;
   }

   @JsonProperty("userCityId")
   public void setUserCityId(Long userCityId) {
      this.userCityId = userCityId;
   }

   @JsonProperty("userCityId")
   public Long getUserCityId() {
      return this.userCityId;
   }

   @JsonProperty("userCityName")
   public void setUserCityName(String userCityName) {
      this.userCityName = userCityName;
   }

   @JsonProperty("userCityName")
   public String getUserCityName() {
      return this.userCityName;
   }

   @JsonProperty("userAreaId")
   public void setUserAreaId(Long userAreaId) {
      this.userAreaId = userAreaId;
   }

   @JsonProperty("userAreaId")
   public Long getUserAreaId() {
      return this.userAreaId;
   }

   @JsonProperty("userAreaName")
   public void setUserAreaName(String userAreaName) {
      this.userAreaName = userAreaName;
   }

   @JsonProperty("userAreaName")
   public String getUserAreaName() {
      return this.userAreaName;
   }

   @JsonProperty("userTownId")
   public void setUserTownId(Long userTownId) {
      this.userTownId = userTownId;
   }

   @JsonProperty("userTownId")
   public Long getUserTownId() {
      return this.userTownId;
   }

   @JsonProperty("userTownName")
   public void setUserTownName(String userTownName) {
      this.userTownName = userTownName;
   }

   @JsonProperty("userTownName")
   public String getUserTownName() {
      return this.userTownName;
   }

   @JsonProperty("userAddress")
   public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
   }

   @JsonProperty("userAddress")
   public String getUserAddress() {
      return this.userAddress;
   }
}
