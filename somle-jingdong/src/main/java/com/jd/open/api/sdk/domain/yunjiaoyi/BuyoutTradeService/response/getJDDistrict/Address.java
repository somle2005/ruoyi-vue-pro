package com.jd.open.api.sdk.domain.yunjiaoyi.BuyoutTradeService.response.getJDDistrict;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Address implements Serializable {
   private String townName;
   private String cityName;
   private int countyId;
   private String fullAddress;
   private String detailAddress;
   private String provinceName;
   private int cityId;
   private int townId;
   private int provinceId;
   private String countyName;

   @JsonProperty("townName")
   public void setTownName(String townName) {
      this.townName = townName;
   }

   @JsonProperty("townName")
   public String getTownName() {
      return this.townName;
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
   public void setCountyId(int countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public int getCountyId() {
      return this.countyId;
   }

   @JsonProperty("fullAddress")
   public void setFullAddress(String fullAddress) {
      this.fullAddress = fullAddress;
   }

   @JsonProperty("fullAddress")
   public String getFullAddress() {
      return this.fullAddress;
   }

   @JsonProperty("detailAddress")
   public void setDetailAddress(String detailAddress) {
      this.detailAddress = detailAddress;
   }

   @JsonProperty("detailAddress")
   public String getDetailAddress() {
      return this.detailAddress;
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
   public void setCityId(int cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public int getCityId() {
      return this.cityId;
   }

   @JsonProperty("townId")
   public void setTownId(int townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public int getTownId() {
      return this.townId;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(int provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public int getProvinceId() {
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
