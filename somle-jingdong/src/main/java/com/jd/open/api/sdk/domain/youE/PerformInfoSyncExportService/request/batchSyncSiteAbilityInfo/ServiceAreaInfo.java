package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.batchSyncSiteAbilityInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServiceAreaInfo implements Serializable {
   private String provinceId;
   private String provinceName;
   private String cityId;
   private String cityeName;
   private String countyId;
   private String countyName;
   private String townId;
   private String townName;

   @JsonProperty("provinceId")
   public void setProvinceId(String provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public String getProvinceId() {
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
   public void setCityId(String cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public String getCityId() {
      return this.cityId;
   }

   @JsonProperty("cityeName")
   public void setCityeName(String cityeName) {
      this.cityeName = cityeName;
   }

   @JsonProperty("cityeName")
   public String getCityeName() {
      return this.cityeName;
   }

   @JsonProperty("countyId")
   public void setCountyId(String countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public String getCountyId() {
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
   public void setTownId(String townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public String getTownId() {
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
}
