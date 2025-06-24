package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getIncrementOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ConsigneeInfoDTO implements Serializable {
   private String consName;
   private String consMobile;
   private Integer provinceId;
   private String provinceName;
   private Integer cityId;
   private String cityName;
   private Integer countyId;
   private String countyName;
   private Integer townId;
   private String townName;
   private String consAddress;
   private String consVirtualMobile;
   private Double addrLatitude;
   private Double addrLongitude;
   private String encryptProvinceId;

   @JsonProperty("consName")
   public void setConsName(String consName) {
      this.consName = consName;
   }

   @JsonProperty("consName")
   public String getConsName() {
      return this.consName;
   }

   @JsonProperty("consMobile")
   public void setConsMobile(String consMobile) {
      this.consMobile = consMobile;
   }

   @JsonProperty("consMobile")
   public String getConsMobile() {
      return this.consMobile;
   }

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

   @JsonProperty("countyId")
   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public Integer getCountyId() {
      return this.countyId;
   }

   @JsonProperty("countyName")
   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   @JsonProperty("countyName")
   public String getCountyName() {
      return this.countyName;
   }

   @JsonProperty("townId")
   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public Integer getTownId() {
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

   @JsonProperty("consAddress")
   public void setConsAddress(String consAddress) {
      this.consAddress = consAddress;
   }

   @JsonProperty("consAddress")
   public String getConsAddress() {
      return this.consAddress;
   }

   @JsonProperty("consVirtualMobile")
   public void setConsVirtualMobile(String consVirtualMobile) {
      this.consVirtualMobile = consVirtualMobile;
   }

   @JsonProperty("consVirtualMobile")
   public String getConsVirtualMobile() {
      return this.consVirtualMobile;
   }

   @JsonProperty("addrLatitude")
   public void setAddrLatitude(Double addrLatitude) {
      this.addrLatitude = addrLatitude;
   }

   @JsonProperty("addrLatitude")
   public Double getAddrLatitude() {
      return this.addrLatitude;
   }

   @JsonProperty("addrLongitude")
   public void setAddrLongitude(Double addrLongitude) {
      this.addrLongitude = addrLongitude;
   }

   @JsonProperty("addrLongitude")
   public Double getAddrLongitude() {
      return this.addrLongitude;
   }

   @JsonProperty("encrypt_provinceId")
   public void setEncryptProvinceId(String encryptProvinceId) {
      this.encryptProvinceId = encryptProvinceId;
   }

   @JsonProperty("encrypt_provinceId")
   public String getEncryptProvinceId() {
      return this.encryptProvinceId;
   }
}
