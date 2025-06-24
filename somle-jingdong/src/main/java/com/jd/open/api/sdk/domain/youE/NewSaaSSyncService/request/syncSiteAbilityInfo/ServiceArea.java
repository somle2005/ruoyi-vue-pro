package com.jd.open.api.sdk.domain.youE.NewSaaSSyncService.request.syncSiteAbilityInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServiceArea implements Serializable {
   private String townName;
   private String province;
   private String cityName;
   private String town;
   private String city;
   private String county;
   private String provinceName;
   private String countyName;

   @JsonProperty("townName")
   public void setTownName(String townName) {
      this.townName = townName;
   }

   @JsonProperty("townName")
   public String getTownName() {
      return this.townName;
   }

   @JsonProperty("province")
   public void setProvince(String province) {
      this.province = province;
   }

   @JsonProperty("province")
   public String getProvince() {
      return this.province;
   }

   @JsonProperty("cityName")
   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   @JsonProperty("cityName")
   public String getCityName() {
      return this.cityName;
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

   @JsonProperty("county")
   public void setCounty(String county) {
      this.county = county;
   }

   @JsonProperty("county")
   public String getCounty() {
      return this.county;
   }

   @JsonProperty("provinceName")
   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   @JsonProperty("provinceName")
   public String getProvinceName() {
      return this.provinceName;
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
