package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.queryDeliverInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DeliveryAddressResult implements Serializable {
   private String townName;
   private String providerAddress;
   private String cityName;
   private Integer countyId;
   private String providerContact;
   private String providerMobile;
   private String provinceName;
   private Integer cityId;
   private Integer townId;
   private Integer provinceId;
   private String countyName;

   @JsonProperty("townName")
   public void setTownName(String townName) {
      this.townName = townName;
   }

   @JsonProperty("townName")
   public String getTownName() {
      return this.townName;
   }

   @JsonProperty("providerAddress")
   public void setProviderAddress(String providerAddress) {
      this.providerAddress = providerAddress;
   }

   @JsonProperty("providerAddress")
   public String getProviderAddress() {
      return this.providerAddress;
   }

   @JsonProperty("cityName")
   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   @JsonProperty("cityName")
   public String getCityName() {
      return this.cityName;
   }

   @JsonProperty("countyId")
   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public Integer getCountyId() {
      return this.countyId;
   }

   @JsonProperty("providerContact")
   public void setProviderContact(String providerContact) {
      this.providerContact = providerContact;
   }

   @JsonProperty("providerContact")
   public String getProviderContact() {
      return this.providerContact;
   }

   @JsonProperty("providerMobile")
   public void setProviderMobile(String providerMobile) {
      this.providerMobile = providerMobile;
   }

   @JsonProperty("providerMobile")
   public String getProviderMobile() {
      return this.providerMobile;
   }

   @JsonProperty("provinceName")
   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   @JsonProperty("provinceName")
   public String getProvinceName() {
      return this.provinceName;
   }

   @JsonProperty("cityId")
   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public Integer getCityId() {
      return this.cityId;
   }

   @JsonProperty("townId")
   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public Integer getTownId() {
      return this.townId;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public Integer getProvinceId() {
      return this.provinceId;
   }

   @JsonProperty("countyName")
   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   @JsonProperty("countyName")
   public String getCountyName() {
      return this.countyName;
   }
}
