package com.jd.open.api.sdk.domain.Account.VenderAccountSafService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderAccountContent implements Serializable {
   private Long accountId;
   private String accountName;
   private String userName;
   private Integer status;
   private int isPhoneOpen;
   private String phone;
   private int authStatus;

   @JsonProperty("account_id")
   public void setAccountId(Long accountId) {
      this.accountId = accountId;
   }

   @JsonProperty("account_id")
   public Long getAccountId() {
      return this.accountId;
   }

   @JsonProperty("account_name")
   public void setAccountName(String accountName) {
      this.accountName = accountName;
   }

   @JsonProperty("account_name")
   public String getAccountName() {
      return this.accountName;
   }

   @JsonProperty("user_name")
   public void setUserName(String userName) {
      this.userName = userName;
   }

   @JsonProperty("user_name")
   public String getUserName() {
      return this.userName;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("is_phone_open")
   public void setIsPhoneOpen(int isPhoneOpen) {
      this.isPhoneOpen = isPhoneOpen;
   }

   @JsonProperty("is_phone_open")
   public int getIsPhoneOpen() {
      return this.isPhoneOpen;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("auth_status")
   public void setAuthStatus(int authStatus) {
      this.authStatus = authStatus;
   }

   @JsonProperty("auth_status")
   public int getAuthStatus() {
      return this.authStatus;
   }
}
