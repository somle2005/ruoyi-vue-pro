package com.jd.open.api.sdk.request.neirong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.neirong.StationinfojosserviceGetStationInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StationinfojosserviceGetStationInfoRequest extends AbstractRequest implements JdRequest<StationinfojosserviceGetStationInfoResponse> {
   private String companyCode;
   private String stationCode;
   private String stationName;
   private String stationAddress;
   private Integer provinceId;
   private Integer cityId;
   private Integer countyId;
   private Integer townId;

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

   public String getApiMethod() {
      return "jingdong.stationinfojosservice.getStationInfo";
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
      return JsonUtil.toJson(pmap);
   }

   public Class<StationinfojosserviceGetStationInfoResponse> getResponseClass() {
      return StationinfojosserviceGetStationInfoResponse.class;
   }
}
