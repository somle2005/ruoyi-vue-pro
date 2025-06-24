package com.jd.open.api.sdk.request.qqdkfptjq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qqdkfptjq.OmnicStoreImportResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OmnicStoreImportRequest extends AbstractRequest implements JdRequest<OmnicStoreImportResponse> {
   private String authKey;
   private String latitude;
   private String storeContactName;
   private String supplierCode;
   private Integer cityId;
   private Integer townId;
   private String storeContactTelephone;
   private Integer storeStatus;
   private Integer mapDatum;
   private String cityName;
   private Integer scopeType;
   private String venderStoreName;
   private Integer countyId;
   private String storeFullAddress;
   private String closeTime;
   private String openTime;
   private String longitude;
   private String countyName;
   private String coverage;
   private String supplierName;
   private String townName;
   private Integer provinceId;
   private String storeContactPhone;
   private String venderStoreId;
   private String provinceName;
   private String vertexs;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setLatitude(String latitude) {
      this.latitude = latitude;
   }

   public String getLatitude() {
      return this.latitude;
   }

   public void setStoreContactName(String storeContactName) {
      this.storeContactName = storeContactName;
   }

   public String getStoreContactName() {
      return this.storeContactName;
   }

   public void setSupplierCode(String supplierCode) {
      this.supplierCode = supplierCode;
   }

   public String getSupplierCode() {
      return this.supplierCode;
   }

   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   public Integer getCityId() {
      return this.cityId;
   }

   public void setTownId(Integer townId) {
      this.townId = townId;
   }

   public Integer getTownId() {
      return this.townId;
   }

   public void setStoreContactTelephone(String storeContactTelephone) {
      this.storeContactTelephone = storeContactTelephone;
   }

   public String getStoreContactTelephone() {
      return this.storeContactTelephone;
   }

   public void setStoreStatus(Integer storeStatus) {
      this.storeStatus = storeStatus;
   }

   public Integer getStoreStatus() {
      return this.storeStatus;
   }

   public void setMapDatum(Integer mapDatum) {
      this.mapDatum = mapDatum;
   }

   public Integer getMapDatum() {
      return this.mapDatum;
   }

   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   public String getCityName() {
      return this.cityName;
   }

   public void setScopeType(Integer scopeType) {
      this.scopeType = scopeType;
   }

   public Integer getScopeType() {
      return this.scopeType;
   }

   public void setVenderStoreName(String venderStoreName) {
      this.venderStoreName = venderStoreName;
   }

   public String getVenderStoreName() {
      return this.venderStoreName;
   }

   public void setCountyId(Integer countyId) {
      this.countyId = countyId;
   }

   public Integer getCountyId() {
      return this.countyId;
   }

   public void setStoreFullAddress(String storeFullAddress) {
      this.storeFullAddress = storeFullAddress;
   }

   public String getStoreFullAddress() {
      return this.storeFullAddress;
   }

   public void setCloseTime(String closeTime) {
      this.closeTime = closeTime;
   }

   public String getCloseTime() {
      return this.closeTime;
   }

   public void setOpenTime(String openTime) {
      this.openTime = openTime;
   }

   public String getOpenTime() {
      return this.openTime;
   }

   public void setLongitude(String longitude) {
      this.longitude = longitude;
   }

   public String getLongitude() {
      return this.longitude;
   }

   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   public String getCountyName() {
      return this.countyName;
   }

   public void setCoverage(String coverage) {
      this.coverage = coverage;
   }

   public String getCoverage() {
      return this.coverage;
   }

   public void setSupplierName(String supplierName) {
      this.supplierName = supplierName;
   }

   public String getSupplierName() {
      return this.supplierName;
   }

   public void setTownName(String townName) {
      this.townName = townName;
   }

   public String getTownName() {
      return this.townName;
   }

   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   public Integer getProvinceId() {
      return this.provinceId;
   }

   public void setStoreContactPhone(String storeContactPhone) {
      this.storeContactPhone = storeContactPhone;
   }

   public String getStoreContactPhone() {
      return this.storeContactPhone;
   }

   public void setVenderStoreId(String venderStoreId) {
      this.venderStoreId = venderStoreId;
   }

   public String getVenderStoreId() {
      return this.venderStoreId;
   }

   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   public String getProvinceName() {
      return this.provinceName;
   }

   public void setVertexs(String vertexs) {
      this.vertexs = vertexs;
   }

   public String getVertexs() {
      return this.vertexs;
   }

   public String getApiMethod() {
      return "jingdong.omnic.store.import";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("latitude", this.latitude);
      pmap.put("storeContactName", this.storeContactName);
      pmap.put("supplierCode", this.supplierCode);
      pmap.put("cityId", this.cityId);
      pmap.put("townId", this.townId);
      pmap.put("storeContactTelephone", this.storeContactTelephone);
      pmap.put("storeStatus", this.storeStatus);
      pmap.put("mapDatum", this.mapDatum);
      pmap.put("cityName", this.cityName);
      pmap.put("scopeType", this.scopeType);
      pmap.put("venderStoreName", this.venderStoreName);
      pmap.put("countyId", this.countyId);
      pmap.put("storeFullAddress", this.storeFullAddress);
      pmap.put("closeTime", this.closeTime);
      pmap.put("openTime", this.openTime);
      pmap.put("longitude", this.longitude);
      pmap.put("countyName", this.countyName);
      pmap.put("coverage", this.coverage);
      pmap.put("supplierName", this.supplierName);
      pmap.put("townName", this.townName);
      pmap.put("provinceId", this.provinceId);
      pmap.put("storeContactPhone", this.storeContactPhone);
      pmap.put("venderStoreId", this.venderStoreId);
      pmap.put("provinceName", this.provinceName);
      pmap.put("vertexs", this.vertexs);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicStoreImportResponse> getResponseClass() {
      return OmnicStoreImportResponse.class;
   }
}
