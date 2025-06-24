package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.ComJdLdopAlphaWaybillApiOutageQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ComJdLdopAlphaWaybillApiOutageQueryRequest extends AbstractRequest implements JdRequest<ComJdLdopAlphaWaybillApiOutageQueryResponse> {
   private String providerCode;
   private Integer providerId;
   private Integer provinceId;
   private String provinceName;
   private Integer cityId;
   private String cityName;
   private Integer countryId;
   private String countryName;
   private Integer countrysideId;
   private String countrysideName;
   private String address;

   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   public String getProviderCode() {
      return this.providerCode;
   }

   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   public Integer getProviderId() {
      return this.providerId;
   }

   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }

   public Integer getProvinceId() {
      return this.provinceId;
   }

   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   public String getProvinceName() {
      return this.provinceName;
   }

   public void setCityId(Integer cityId) {
      this.cityId = cityId;
   }

   public Integer getCityId() {
      return this.cityId;
   }

   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   public String getCityName() {
      return this.cityName;
   }

   public void setCountryId(Integer countryId) {
      this.countryId = countryId;
   }

   public Integer getCountryId() {
      return this.countryId;
   }

   public void setCountryName(String countryName) {
      this.countryName = countryName;
   }

   public String getCountryName() {
      return this.countryName;
   }

   public void setCountrysideId(Integer countrysideId) {
      this.countrysideId = countrysideId;
   }

   public Integer getCountrysideId() {
      return this.countrysideId;
   }

   public void setCountrysideName(String countrysideName) {
      this.countrysideName = countrysideName;
   }

   public String getCountrysideName() {
      return this.countrysideName;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress() {
      return this.address;
   }

   public String getApiMethod() {
      return "jingdong.com.jd.ldop.alpha.waybill.api.outageQuery";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("providerCode", this.providerCode);
      pmap.put("providerId", this.providerId);
      pmap.put("provinceId", this.provinceId);
      pmap.put("provinceName", this.provinceName);
      pmap.put("cityId", this.cityId);
      pmap.put("cityName", this.cityName);
      pmap.put("countryId", this.countryId);
      pmap.put("countryName", this.countryName);
      pmap.put("countrysideId", this.countrysideId);
      pmap.put("countrysideName", this.countrysideName);
      pmap.put("address", this.address);
      return JsonUtil.toJson(pmap);
   }

   public Class<ComJdLdopAlphaWaybillApiOutageQueryResponse> getResponseClass() {
      return ComJdLdopAlphaWaybillApiOutageQueryResponse.class;
   }
}
