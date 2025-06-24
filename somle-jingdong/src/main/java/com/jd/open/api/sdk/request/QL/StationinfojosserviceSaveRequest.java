package com.jd.open.api.sdk.request.QL;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.QL.StationinfojosserviceSaveResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StationinfojosserviceSaveRequest extends AbstractRequest implements JdRequest<StationinfojosserviceSaveResponse> {
   private String companyCode;
   private String stationCode;
   private String stationName;
   private String stationAddress;
   private Integer provinceId;
   private Integer cityId;
   private Integer countyId;
   private Integer townId;
   private String orgCode;
   private String lat;
   private String lng;
   private String provinceName;
   private String cityName;
   private String countryName;
   private String townName;
   private String orgName;
   private String areaCode;
   private String areaName;

   public void setCompanyCode(String companyCode) {
      this.companyCode = companyCode;
   }

   public String getCompanyCode() {
      return this.companyCode;
   }

   public void setStationCode(String stationCode) {
      this.stationCode = stationCode;
   }

   public String getStationCode() {
      return this.stationCode;
   }

   public void setStationName(String stationName) {
      this.stationName = stationName;
   }

   public String getStationName() {
      return this.stationName;
   }

   public void setStationAddress(String stationAddress) {
      this.stationAddress = stationAddress;
   }

   public String getStationAddress() {
      return this.stationAddress;
   }

   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   public Integer getProvinceId() {
      return this.provinceId;
   }

   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   public Integer getCityId() {
      return this.cityId;
   }

   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   public Integer getCountyId() {
      return this.countyId;
   }

   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   public Integer getTownId() {
      return this.townId;
   }

   public void setOrgCode(String orgCode) {
      this.orgCode = orgCode;
   }

   public String getOrgCode() {
      return this.orgCode;
   }

   public void setLat(String lat) {
      this.lat = lat;
   }

   public String getLat() {
      return this.lat;
   }

   public void setLng(String lng) {
      this.lng = lng;
   }

   public String getLng() {
      return this.lng;
   }

   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   public String getProvinceName() {
      return this.provinceName;
   }

   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   public String getCityName() {
      return this.cityName;
   }

   public void setCountryName(String countryName) {
      this.countryName = countryName;
   }

   public String getCountryName() {
      return this.countryName;
   }

   public void setTownName(String townName) {
      this.townName = townName;
   }

   public String getTownName() {
      return this.townName;
   }

   public void setOrgName(String orgName) {
      this.orgName = orgName;
   }

   public String getOrgName() {
      return this.orgName;
   }

   public void setAreaCode(String areaCode) {
      this.areaCode = areaCode;
   }

   public String getAreaCode() {
      return this.areaCode;
   }

   public void setAreaName(String areaName) {
      this.areaName = areaName;
   }

   public String getAreaName() {
      return this.areaName;
   }

   public String getApiMethod() {
      return "jingdong.stationinfojosservice.save";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("companyCode", this.companyCode);
      pmap.put("stationCode", this.stationCode);
      pmap.put("stationName", this.stationName);
      pmap.put("stationAddress", this.stationAddress);
      pmap.put("provinceId", this.provinceId);
      pmap.put("cityId", this.cityId);
      pmap.put("countyId", this.countyId);
      pmap.put("townId", this.townId);
      pmap.put("orgCode", this.orgCode);
      pmap.put("lat", this.lat);
      pmap.put("lng", this.lng);
      pmap.put("provinceName", this.provinceName);
      pmap.put("cityName", this.cityName);
      pmap.put("countryName", this.countryName);
      pmap.put("townName", this.townName);
      pmap.put("orgName", this.orgName);
      pmap.put("areaCode", this.areaCode);
      pmap.put("areaName", this.areaName);
      return JsonUtil.toJson(pmap);
   }

   public Class<StationinfojosserviceSaveResponse> getResponseClass() {
      return StationinfojosserviceSaveResponse.class;
   }
}
