package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.syncSiteAbilityInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServiceAreaInfo implements Serializable {
   private String townName;
   private String cityName;
   private String countyId;
   private String provinceName;
   private String cityId;
   private String townId;
   private String provinceId;
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
   public void setCountyId(String countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public String getCountyId() {
      return this.countyId;
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
   public void setCityId(String cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public String getCityId() {
      return this.cityId;
   }

   @JsonProperty("townId")
   public void setTownId(String townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public String getTownId() {
      return this.townId;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(String provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public String getProvinceId() {
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
