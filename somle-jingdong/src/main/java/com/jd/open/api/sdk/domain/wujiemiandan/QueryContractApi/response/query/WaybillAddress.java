package com.jd.open.api.sdk.domain.wujiemiandan.QueryContractApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaybillAddress implements Serializable {
   private Integer provinceId;
   private String provinceName;
   private Integer cityId;
   private String cityName;
   private Integer countryId;
   private String countryName;
   private Integer countrysideId;
   private String countrysideName;
   private String address;

   @JsonProperty("provinceId")
   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public Integer getProvinceId() {
      return this.provinceId;
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

   @JsonProperty("cityName")
   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   @JsonProperty("cityName")
   public String getCityName() {
      return this.cityName;
   }

   @JsonProperty("countryId")
   public void setCountryId(Integer countryId) {
      this.countryId = countryId;
   }

   @JsonProperty("countryId")
   public Integer getCountryId() {
      return this.countryId;
   }

   @JsonProperty("countryName")
   public void setCountryName(String countryName) {
      this.countryName = countryName;
   }

   @JsonProperty("countryName")
   public String getCountryName() {
      return this.countryName;
   }

   @JsonProperty("countrysideId")
   public void setCountrysideId(Integer countrysideId) {
      this.countrysideId = countrysideId;
   }

   @JsonProperty("countrysideId")
   public Integer getCountrysideId() {
      return this.countrysideId;
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
}
