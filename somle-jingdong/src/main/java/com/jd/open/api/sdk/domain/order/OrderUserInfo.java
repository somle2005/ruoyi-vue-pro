package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderUserInfo {
   private String fullName;
   private String fullAddress;
   private String telephone;
   private String mobile;

   @JsonProperty("full_name")
   public String getFullName() {
      return this.fullName;
   }

   @JsonProperty("full_name")
   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   @JsonProperty("full_address")
   public String getFullAddress() {
      return this.fullAddress;
   }

   @JsonProperty("full_address")
   public void setFullAddress(String fullAddress) {
      this.fullAddress = fullAddress;
   }

   @JsonProperty("telephone")
   public String getTelephone() {
      return this.telephone;
   }

   @JsonProperty("telephone")
   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }

   @JsonProperty("mobile")
   public String getMobile() {
      return this.mobile;
   }

   @JsonProperty("mobile")
   public void setMobile(String mobile) {
      this.mobile = mobile;
   }
}
