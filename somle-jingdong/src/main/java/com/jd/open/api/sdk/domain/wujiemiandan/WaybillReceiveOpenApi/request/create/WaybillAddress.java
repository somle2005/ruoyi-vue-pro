package com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaybillAddress implements Serializable {
   private String provinceName;
   private String cityName;
   private String countryName;
   private String countrysideName;
   private String address;
   private String contact;
   private String phone;
   private String mobile;
   private String oaid;

   @JsonProperty("provinceName")
   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   @JsonProperty("provinceName")
   public String getProvinceName() {
      return this.provinceName;
   }

   @JsonProperty("cityName")
   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   @JsonProperty("cityName")
   public String getCityName() {
      return this.cityName;
   }

   @JsonProperty("countryName")
   public void setCountryName(String countryName) {
      this.countryName = countryName;
   }

   @JsonProperty("countryName")
   public String getCountryName() {
      return this.countryName;
   }

   @JsonProperty("countrysideName")
   public void setCountrysideName(String countrysideName) {
      this.countrysideName = countrysideName;
   }

   @JsonProperty("countrysideName")
   public String getCountrysideName() {
      return this.countrysideName;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("contact")
   public void setContact(String contact) {
      this.contact = contact;
   }

   @JsonProperty("contact")
   public String getContact() {
      return this.contact;
   }

   @JsonProperty("phone")
   public void setPhone(String phone) {
      this.phone = phone;
   }

   @JsonProperty("phone")
   public String getPhone() {
      return this.phone;
   }

   @JsonProperty("mobile")
   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   @JsonProperty("mobile")
   public String getMobile() {
      return this.mobile;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }
}
