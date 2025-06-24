package com.jd.open.api.sdk.request.jialilue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jialilue.UpdateStoreJosResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UpdateStoreJosRequest extends AbstractRequest implements JdRequest<UpdateStoreJosResponse> {
   private String authKey;
   private Integer storeType;
   private String address;
   private Double lng;
   private String contactName;
   private String mobile;
   private String supplierCode;
   private String licenseUrl;
   private String legalRepresentative;
   private String licenseStart;
   private String licenseEnd;
   private String letterAddress;
   private String companyName;
   private String letterUrl;
   private String letterStart;
   private String letterEnd;
   private String licenseCode;
   private String licenseAddress;
   private Integer mapBenchmark;
   private String pin;
   private String venderStoreId;
   private Integer yn;
   private String phone;
   private String closeTime;
   private String storeName;
   private String openTime;
   private String afterSalePhone;
   private Integer afterSaleType;
   private Double lat;
   private Integer coverage;
   private String irregularityRange;
   private Integer scopeType;
   private Integer businessType;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setStoreType(Integer storeType) {
      this.storeType = storeType;
   }

   public Integer getStoreType() {
      return this.storeType;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress() {
      return this.address;
   }

   public void setLng(Double lng) {
      this.lng = lng;
   }

   public Double getLng() {
      return this.lng;
   }

   public void setContactName(String contactName) {
      this.contactName = contactName;
   }

   public String getContactName() {
      return this.contactName;
   }

   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   public String getMobile() {
      return this.mobile;
   }

   public void setSupplierCode(String supplierCode) {
      this.supplierCode = supplierCode;
   }

   public String getSupplierCode() {
      return this.supplierCode;
   }

   public void setLicenseUrl(String licenseUrl) {
      this.licenseUrl = licenseUrl;
   }

   public String getLicenseUrl() {
      return this.licenseUrl;
   }

   public void setLegalRepresentative(String legalRepresentative) {
      this.legalRepresentative = legalRepresentative;
   }

   public String getLegalRepresentative() {
      return this.legalRepresentative;
   }

   public void setLicenseStart(String licenseStart) {
      this.licenseStart = licenseStart;
   }

   public String getLicenseStart() {
      return this.licenseStart;
   }

   public void setLicenseEnd(String licenseEnd) {
      this.licenseEnd = licenseEnd;
   }

   public String getLicenseEnd() {
      return this.licenseEnd;
   }

   public void setLetterAddress(String letterAddress) {
      this.letterAddress = letterAddress;
   }

   public String getLetterAddress() {
      return this.letterAddress;
   }

   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   public String getCompanyName() {
      return this.companyName;
   }

   public void setLetterUrl(String letterUrl) {
      this.letterUrl = letterUrl;
   }

   public String getLetterUrl() {
      return this.letterUrl;
   }

   public void setLetterStart(String letterStart) {
      this.letterStart = letterStart;
   }

   public String getLetterStart() {
      return this.letterStart;
   }

   public void setLetterEnd(String letterEnd) {
      this.letterEnd = letterEnd;
   }

   public String getLetterEnd() {
      return this.letterEnd;
   }

   public void setLicenseCode(String licenseCode) {
      this.licenseCode = licenseCode;
   }

   public String getLicenseCode() {
      return this.licenseCode;
   }

   public void setLicenseAddress(String licenseAddress) {
      this.licenseAddress = licenseAddress;
   }

   public String getLicenseAddress() {
      return this.licenseAddress;
   }

   public void setMapBenchmark(Integer mapBenchmark) {
      this.mapBenchmark = mapBenchmark;
   }

   public Integer getMapBenchmark() {
      return this.mapBenchmark;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setVenderStoreId(String venderStoreId) {
      this.venderStoreId = venderStoreId;
   }

   public String getVenderStoreId() {
      return this.venderStoreId;
   }

   public void setYn(Integer yn) {
      this.yn = yn;
   }

   public Integer getYn() {
      return this.yn;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getPhone() {
      return this.phone;
   }

   public void setCloseTime(String closeTime) {
      this.closeTime = closeTime;
   }

   public String getCloseTime() {
      return this.closeTime;
   }

   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   public String getStoreName() {
      return this.storeName;
   }

   public void setOpenTime(String openTime) {
      this.openTime = openTime;
   }

   public String getOpenTime() {
      return this.openTime;
   }

   public void setAfterSalePhone(String afterSalePhone) {
      this.afterSalePhone = afterSalePhone;
   }

   public String getAfterSalePhone() {
      return this.afterSalePhone;
   }

   public void setAfterSaleType(Integer afterSaleType) {
      this.afterSaleType = afterSaleType;
   }

   public Integer getAfterSaleType() {
      return this.afterSaleType;
   }

   public void setLat(Double lat) {
      this.lat = lat;
   }

   public Double getLat() {
      return this.lat;
   }

   public void setCoverage(Integer coverage) {
      this.coverage = coverage;
   }

   public Integer getCoverage() {
      return this.coverage;
   }

   public void setIrregularityRange(String irregularityRange) {
      this.irregularityRange = irregularityRange;
   }

   public String getIrregularityRange() {
      return this.irregularityRange;
   }

   public void setScopeType(Integer scopeType) {
      this.scopeType = scopeType;
   }

   public Integer getScopeType() {
      return this.scopeType;
   }

   public void setBusinessType(Integer businessType) {
      this.businessType = businessType;
   }

   public Integer getBusinessType() {
      return this.businessType;
   }

   public String getApiMethod() {
      return "jingdong.updateStoreJos";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("storeType", this.storeType);
      pmap.put("address", this.address);
      pmap.put("lng", this.lng);
      pmap.put("contactName", this.contactName);
      pmap.put("mobile", this.mobile);
      pmap.put("supplierCode", this.supplierCode);
      pmap.put("licenseUrl", this.licenseUrl);
      pmap.put("legalRepresentative", this.legalRepresentative);
      pmap.put("licenseStart", this.licenseStart);
      pmap.put("licenseEnd", this.licenseEnd);
      pmap.put("letterAddress", this.letterAddress);
      pmap.put("companyName", this.companyName);
      pmap.put("letterUrl", this.letterUrl);
      pmap.put("letterStart", this.letterStart);
      pmap.put("letterEnd", this.letterEnd);
      pmap.put("licenseCode", this.licenseCode);
      pmap.put("licenseAddress", this.licenseAddress);
      pmap.put("mapBenchmark", this.mapBenchmark);
      pmap.put("pin", this.pin);
      pmap.put("venderStoreId", this.venderStoreId);
      pmap.put("yn", this.yn);
      pmap.put("phone", this.phone);
      pmap.put("closeTime", this.closeTime);
      pmap.put("storeName", this.storeName);
      pmap.put("openTime", this.openTime);
      pmap.put("afterSalePhone", this.afterSalePhone);
      pmap.put("afterSaleType", this.afterSaleType);
      pmap.put("lat", this.lat);
      pmap.put("coverage", this.coverage);
      pmap.put("irregularityRange", this.irregularityRange);
      pmap.put("scopeType", this.scopeType);
      pmap.put("businessType", this.businessType);
      return JsonUtil.toJson(pmap);
   }

   public Class<UpdateStoreJosResponse> getResponseClass() {
      return UpdateStoreJosResponse.class;
   }
}
