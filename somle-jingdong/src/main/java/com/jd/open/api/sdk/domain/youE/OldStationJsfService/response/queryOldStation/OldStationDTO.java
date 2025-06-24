package com.jd.open.api.sdk.domain.youE.OldStationJsfService.response.queryOldStation;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OldStationDTO implements Serializable {
   private String contactMobileEnc;
   private Integer stat;
   private String addressEnc;
   private String town;
   private String city;
   private String contactNameEnc;
   private String county;
   private Long cityId;
   private Long townId;
   private Long provinceId;
   private String province;
   private Long countyId;
   private String stationName;
   private Long stationId;

   @JsonProperty("contactMobileEnc")
   public void setContactMobileEnc(String contactMobileEnc) {
      this.contactMobileEnc = contactMobileEnc;
   }

   @JsonProperty("contactMobileEnc")
   public String getContactMobileEnc() {
      return this.contactMobileEnc;
   }

   @JsonProperty("stat")
   public void setStat(Integer stat) {
      this.stat = stat;
   }

   @JsonProperty("stat")
   public Integer getStat() {
      return this.stat;
   }

   @JsonProperty("addressEnc")
   public void setAddressEnc(String addressEnc) {
      this.addressEnc = addressEnc;
   }

   @JsonProperty("addressEnc")
   public String getAddressEnc() {
      return this.addressEnc;
   }

   @JsonProperty("town")
   public void setTown(String town) {
      this.town = town;
   }

   @JsonProperty("town")
   public String getTown() {
      return this.town;
   }

   @JsonProperty("city")
   public void setCity(String city) {
      this.city = city;
   }

   @JsonProperty("city")
   public String getCity() {
      return this.city;
   }

   @JsonProperty("contactNameEnc")
   public void setContactNameEnc(String contactNameEnc) {
      this.contactNameEnc = contactNameEnc;
   }

   @JsonProperty("contactNameEnc")
   public String getContactNameEnc() {
      return this.contactNameEnc;
   }

   @JsonProperty("county")
   public void setCounty(String county) {
      this.county = county;
   }

   @JsonProperty("county")
   public String getCounty() {
      return this.county;
   }

   @JsonProperty("cityId")
   public void setCityId(Long cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public Long getCityId() {
      return this.cityId;
   }

   @JsonProperty("townId")
   public void setTownId(Long townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public Long getTownId() {
      return this.townId;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(Long provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public Long getProvinceId() {
      return this.provinceId;
   }

   @JsonProperty("province")
   public void setProvince(String province) {
      this.province = province;
   }

   @JsonProperty("province")
   public String getProvince() {
      return this.province;
   }

   @JsonProperty("countyId")
   public void setCountyId(Long countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public Long getCountyId() {
      return this.countyId;
   }

   @JsonProperty("stationName")
   public void setStationName(String stationName) {
      this.stationName = stationName;
   }

   @JsonProperty("stationName")
   public String getStationName() {
      return this.stationName;
   }

   @JsonProperty("stationId")
   public void setStationId(Long stationId) {
      this.stationId = stationId;
   }

   @JsonProperty("stationId")
   public Long getStationId() {
      return this.stationId;
   }
}
