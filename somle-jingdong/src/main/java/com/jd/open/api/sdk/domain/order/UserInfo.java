package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFilter("OrderDetailInfo")
public class UserInfo {
   private String fullname;
   private String telephone;
   private String mobile;
   private String fullAddress;
   private String province;
   private String city;
   private String county;

   @JsonProperty("fullname")
   public String getFullname() {
      return this.fullname;
   }

   @JsonProperty("fullname")
   public void setFullname(String fullname) {
      this.fullname = fullname;
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

   @JsonProperty("full_address")
   public String getFullAddress() {
      return this.fullAddress;
   }

   @JsonProperty("full_address")
   public void setFullAddress(String fullAddress) {
      this.fullAddress = fullAddress;
   }

   @JsonProperty("province")
   public String getProvince() {
      return this.province;
   }

   @JsonProperty("province")
   public void setProvince(String province) {
      this.province = province;
   }

   @JsonProperty("city")
   public String getCity() {
      return this.city;
   }

   @JsonProperty("city")
   public void setCity(String city) {
      this.city = city;
   }

   @JsonProperty("county")
   public String getCounty() {
      return this.county;
   }

   @JsonProperty("county")
   public void setCounty(String county) {
      this.county = county;
   }
}
