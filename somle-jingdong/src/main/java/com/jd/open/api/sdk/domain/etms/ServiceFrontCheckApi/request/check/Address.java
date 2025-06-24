package com.jd.open.api.sdk.domain.etms.ServiceFrontCheckApi.request.check;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class Address implements Serializable {
   private String provinceName;
   private String cityName;
   private String countyName;
   private String townName;
   private BigDecimal longitude;
   private BigDecimal latitude;
   private String detailedAddress;
   private Integer addressType;

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

   @JsonProperty("longitude")
   public void setLongitude(BigDecimal longitude) {
      this.longitude = longitude;
   }

   @JsonProperty("longitude")
   public BigDecimal getLongitude() {
      return this.longitude;
   }

   @JsonProperty("latitude")
   public void setLatitude(BigDecimal latitude) {
      this.latitude = latitude;
   }

   @JsonProperty("latitude")
   public BigDecimal getLatitude() {
      return this.latitude;
   }

   @JsonProperty("detailedAddress")
   public void setDetailedAddress(String detailedAddress) {
      this.detailedAddress = detailedAddress;
   }

   @JsonProperty("detailedAddress")
   public String getDetailedAddress() {
      return this.detailedAddress;
   }

   @JsonProperty("addressType")
   public void setAddressType(Integer addressType) {
      this.addressType = addressType;
   }

   @JsonProperty("addressType")
   public Integer getAddressType() {
      return this.addressType;
   }
}
