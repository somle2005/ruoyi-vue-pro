package com.jd.open.api.sdk.domain.B2B.PoMidProvider.response.queryPurOrderDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ConsigneeResp implements Serializable {
   private String name;
   private Integer provinceId;
   private Integer cityId;
   private Integer countyId;
   private Integer townId;
   private String provinceName;
   private String cityName;
   private String countyName;
   private String townName;
   private String addressDetail;
   private String phone;
   private String mobile;
   private String email;
   private String idCard;
   private String companyName;
   private Date bigItemShipmentDate;
   private String oaid;
   private Long regAddressId;

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public Integer getProvinceId() {
      return this.provinceId;
   }

   @JsonProperty("cityId")
   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public Integer getCityId() {
      return this.cityId;
   }

   @JsonProperty("countyId")
   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public Integer getCountyId() {
      return this.countyId;
   }

   @JsonProperty("townId")
   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public Integer getTownId() {
      return this.townId;
   }

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

   @JsonProperty("countyName")
   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   @JsonProperty("countyName")
   public String getCountyName() {
      return this.countyName;
   }

   @JsonProperty("townName")
   public void setTownName(String townName) {
      this.townName = townName;
   }

   @JsonProperty("townName")
   public String getTownName() {
      return this.townName;
   }

   @JsonProperty("addressDetail")
   public void setAddressDetail(String addressDetail) {
      this.addressDetail = addressDetail;
   }

   @JsonProperty("addressDetail")
   public String getAddressDetail() {
      return this.addressDetail;
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

   @JsonProperty("email")
   public void setEmail(String email) {
      this.email = email;
   }

   @JsonProperty("email")
   public String getEmail() {
      return this.email;
   }

   @JsonProperty("idCard")
   public void setIdCard(String idCard) {
      this.idCard = idCard;
   }

   @JsonProperty("idCard")
   public String getIdCard() {
      return this.idCard;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("bigItemShipmentDate")
   public void setBigItemShipmentDate(Date bigItemShipmentDate) {
      this.bigItemShipmentDate = bigItemShipmentDate;
   }

   @JsonProperty("bigItemShipmentDate")
   public Date getBigItemShipmentDate() {
      return this.bigItemShipmentDate;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }

   @JsonProperty("regAddressId")
   public void setRegAddressId(Long regAddressId) {
      this.regAddressId = regAddressId;
   }

   @JsonProperty("regAddressId")
   public Long getRegAddressId() {
      return this.regAddressId;
   }
}
