package com.jd.open.api.sdk.domain.iopdz.QueryAddressOpenProvider.response.convertFourAreaByDetailStr;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class QueryAreaFourIdOpenResp implements Serializable {
   private String nationName;
   private String townName;
   private String cityName;
   private Long countyId;
   private Long nationId;
   private String provinceName;
   private Long cityId;
   private Long townId;
   private Long provinceId;
   private String countyName;

   @JsonProperty("nationName")
   public void setNationName(String nationName) {
      this.nationName = nationName;
   }

   @JsonProperty("nationName")
   public String getNationName() {
      return this.nationName;
   }

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
   public void setCountyId(Long countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public Long getCountyId() {
      return this.countyId;
   }

   @JsonProperty("nationId")
   public void setNationId(Long nationId) {
      this.nationId = nationId;
   }

   @JsonProperty("nationId")
   public Long getNationId() {
      return this.nationId;
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

   @JsonProperty("countyName")
   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   @JsonProperty("countyName")
   public String getCountyName() {
      return this.countyName;
   }
}
