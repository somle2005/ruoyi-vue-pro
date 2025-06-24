package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.enGet;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UserInfo implements Serializable {
   private String fullname;
   private String telephone;
   private String mobile;
   private String fullAddress;
   private String province;
   private String city;
   private String county;
   private String town;
   private String provinceId;
   private String cityId;
   private String countyId;
   private String townId;
   private String oaid;
   private String desenTelephone;
   private String desenMobile;

   @JsonProperty("fullname")
   public void setFullname(String fullname) {
      this.fullname = fullname;
   }

   @JsonProperty("fullname")
   public String getFullname() {
      return this.fullname;
   }

   @JsonProperty("telephone")
   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }

   @JsonProperty("telephone")
   public String getTelephone() {
      return this.telephone;
   }

   @JsonProperty("mobile")
   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   @JsonProperty("mobile")
   public String getMobile() {
      return this.mobile;
   }

   @JsonProperty("fullAddress")
   public void setFullAddress(String fullAddress) {
      this.fullAddress = fullAddress;
   }

   @JsonProperty("fullAddress")
   public String getFullAddress() {
      return this.fullAddress;
   }

   @JsonProperty("province")
   public void setProvince(String province) {
      this.province = province;
   }

   @JsonProperty("province")
   public String getProvince() {
      return this.province;
   }

   @JsonProperty("city")
   public void setCity(String city) {
      this.city = city;
   }

   @JsonProperty("city")
   public String getCity() {
      return this.city;
   }

   @JsonProperty("county")
   public void setCounty(String county) {
      this.county = county;
   }

   @JsonProperty("county")
   public String getCounty() {
      return this.county;
   }

   @JsonProperty("town")
   public void setTown(String town) {
      this.town = town;
   }

   @JsonProperty("town")
   public String getTown() {
      return this.town;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(String provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public String getProvinceId() {
      return this.provinceId;
   }

   @JsonProperty("cityId")
   public void setCityId(String cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public String getCityId() {
      return this.cityId;
   }

   @JsonProperty("countyId")
   public void setCountyId(String countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public String getCountyId() {
      return this.countyId;
   }

   @JsonProperty("townId")
   public void setTownId(String townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public String getTownId() {
      return this.townId;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }

   @JsonProperty("desen_telephone")
   public void setDesenTelephone(String desenTelephone) {
      this.desenTelephone = desenTelephone;
   }

   @JsonProperty("desen_telephone")
   public String getDesenTelephone() {
      return this.desenTelephone;
   }

   @JsonProperty("desen_mobile")
   public void setDesenMobile(String desenMobile) {
      this.desenMobile = desenMobile;
   }

   @JsonProperty("desen_mobile")
   public String getDesenMobile() {
      return this.desenMobile;
   }
}
