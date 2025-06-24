package com.jd.open.api.sdk.domain.address.JdAddressService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JdAdressResponse implements Serializable {
   private int status;
   private String message;
   private int provinceId;
   private String provinceName;
   private int cityId;
   private String cityName;
   private int countryId;
   private String countryName;
   private int townId;
   private String townName;
   private double lng;
   private double lat;
   private int reliability;
   private ShipCodResult shipCodResult;

   @JsonProperty("status")
   public void setStatus(int status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int getStatus() {
      return this.status;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(int provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public int getProvinceId() {
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
   public void setCityId(int cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public int getCityId() {
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
   public void setCountryId(int countryId) {
      this.countryId = countryId;
   }

   @JsonProperty("countryId")
   public int getCountryId() {
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

   @JsonProperty("townId")
   public void setTownId(int townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public int getTownId() {
      return this.townId;
   }

   @JsonProperty("townName")
   public void setTownName(String townName) {
      this.townName = townName;
   }

   @JsonProperty("townName")
   public String getTownName() {
      return this.townName;
   }

   @JsonProperty("lng")
   public void setLng(double lng) {
      this.lng = lng;
   }

   @JsonProperty("lng")
   public double getLng() {
      return this.lng;
   }

   @JsonProperty("lat")
   public void setLat(double lat) {
      this.lat = lat;
   }

   @JsonProperty("lat")
   public double getLat() {
      return this.lat;
   }

   @JsonProperty("reliability")
   public void setReliability(int reliability) {
      this.reliability = reliability;
   }

   @JsonProperty("reliability")
   public int getReliability() {
      return this.reliability;
   }

   @JsonProperty("shipCodResult")
   public void setShipCodResult(ShipCodResult shipCodResult) {
      this.shipCodResult = shipCodResult;
   }

   @JsonProperty("shipCodResult")
   public ShipCodResult getShipCodResult() {
      return this.shipCodResult;
   }
}
