package com.jd.open.api.sdk.domain.neirong.StationInfoJosService.response.getStationInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StationAreaInfoDTO implements Serializable {
   private String companyCode;
   private String stationCode;
   private String stationName;
   private String stationAddress;
   private Double lat;
   private Double lng;
   private Integer status;
   private Integer provinceId;
   private Integer cityId;
   private Integer countyId;
   private Integer townId;
   private String remark;
   private Integer fenceNum;
   private String orgCode;
   private List<StationAreaSimpleInfo> fenceInfo;
   private String areaCode;
   private String areaName;

   @JsonProperty("companyCode")
   public void setCompanyCode(String companyCode) {
      this.companyCode = companyCode;
   }

   @JsonProperty("companyCode")
   public String getCompanyCode() {
      return this.companyCode;
   }

   @JsonProperty("stationCode")
   public void setStationCode(String stationCode) {
      this.stationCode = stationCode;
   }

   @JsonProperty("stationCode")
   public String getStationCode() {
      return this.stationCode;
   }

   @JsonProperty("stationName")
   public void setStationName(String stationName) {
      this.stationName = stationName;
   }

   @JsonProperty("stationName")
   public String getStationName() {
      return this.stationName;
   }

   @JsonProperty("stationAddress")
   public void setStationAddress(String stationAddress) {
      this.stationAddress = stationAddress;
   }

   @JsonProperty("stationAddress")
   public String getStationAddress() {
      return this.stationAddress;
   }

   @JsonProperty("lat")
   public void setLat(Double lat) {
      this.lat = lat;
   }

   @JsonProperty("lat")
   public Double getLat() {
      return this.lat;
   }

   @JsonProperty("lng")
   public void setLng(Double lng) {
      this.lng = lng;
   }

   @JsonProperty("lng")
   public Double getLng() {
      return this.lng;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("provinceId")
   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   @JsonProperty("provinceId")
   public Integer getProvinceId() {
      return this.provinceId;
   }

   @JsonProperty("cityId")
   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   @JsonProperty("cityId")
   public Integer getCityId() {
      return this.cityId;
   }

   @JsonProperty("countyId")
   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   @JsonProperty("countyId")
   public Integer getCountyId() {
      return this.countyId;
   }

   @JsonProperty("townId")
   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   @JsonProperty("townId")
   public Integer getTownId() {
      return this.townId;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("fenceNum")
   public void setFenceNum(Integer fenceNum) {
      this.fenceNum = fenceNum;
   }

   @JsonProperty("fenceNum")
   public Integer getFenceNum() {
      return this.fenceNum;
   }

   @JsonProperty("orgCode")
   public void setOrgCode(String orgCode) {
      this.orgCode = orgCode;
   }

   @JsonProperty("orgCode")
   public String getOrgCode() {
      return this.orgCode;
   }

   @JsonProperty("fenceInfo")
   public void setFenceInfo(List<StationAreaSimpleInfo> fenceInfo) {
      this.fenceInfo = fenceInfo;
   }

   @JsonProperty("fenceInfo")
   public List<StationAreaSimpleInfo> getFenceInfo() {
      return this.fenceInfo;
   }

   @JsonProperty("areaCode")
   public void setAreaCode(String areaCode) {
      this.areaCode = areaCode;
   }

   @JsonProperty("areaCode")
   public String getAreaCode() {
      return this.areaCode;
   }

   @JsonProperty("areaName")
   public void setAreaName(String areaName) {
      this.areaName = areaName;
   }

   @JsonProperty("areaName")
   public String getAreaName() {
      return this.areaName;
   }
}
