package com.jd.open.api.sdk.request.xfylapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xfylapi.HealthcarePushStoreInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HealthcarePushStoreInfoRequest extends AbstractRequest implements JdRequest<HealthcarePushStoreInfoResponse> {
   private String storeAddr;
   private String storeName;
   private String storeId;
   private Integer storeType;
   private String storePhone;
   private Long channelType;
   private Integer status;
   private Integer reportSupport;
   private Integer storeLevel;
   private Double storeLat;
   private Double storeLng;
   private String provinceName;
   private String cityName;
   private String countyName;
   private Integer operateType;
   private String storeHours;

   public void setStoreAddr(String storeAddr) {
      this.storeAddr = storeAddr;
   }

   public String getStoreAddr() {
      return this.storeAddr;
   }

   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   public String getStoreName() {
      return this.storeName;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setStoreType(Integer storeType) {
      this.storeType = storeType;
   }

   public Integer getStoreType() {
      return this.storeType;
   }

   public void setStorePhone(String storePhone) {
      this.storePhone = storePhone;
   }

   public String getStorePhone() {
      return this.storePhone;
   }

   public void setChannelType(Long channelType) {
      this.channelType = channelType;
   }

   public Long getChannelType() {
      return this.channelType;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setReportSupport(Integer reportSupport) {
      this.reportSupport = reportSupport;
   }

   public Integer getReportSupport() {
      return this.reportSupport;
   }

   public void setStoreLevel(Integer storeLevel) {
      this.storeLevel = storeLevel;
   }

   public Integer getStoreLevel() {
      return this.storeLevel;
   }

   public void setStoreLat(Double storeLat) {
      this.storeLat = storeLat;
   }

   public Double getStoreLat() {
      return this.storeLat;
   }

   public void setStoreLng(Double storeLng) {
      this.storeLng = storeLng;
   }

   public Double getStoreLng() {
      return this.storeLng;
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

   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   public String getCountyName() {
      return this.countyName;
   }

   public void setOperateType(Integer operateType) {
      this.operateType = operateType;
   }

   public Integer getOperateType() {
      return this.operateType;
   }

   public void setStoreHours(String storeHours) {
      this.storeHours = storeHours;
   }

   public String getStoreHours() {
      return this.storeHours;
   }

   public String getApiMethod() {
      return "jingdong.healthcare.pushStoreInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("storeAddr", this.storeAddr);
      pmap.put("storeName", this.storeName);
      pmap.put("storeId", this.storeId);
      pmap.put("storeType", this.storeType);
      pmap.put("storePhone", this.storePhone);
      pmap.put("channelType", this.channelType);
      pmap.put("status", this.status);
      pmap.put("reportSupport", this.reportSupport);
      pmap.put("storeLevel", this.storeLevel);
      pmap.put("storeLat", this.storeLat);
      pmap.put("storeLng", this.storeLng);
      pmap.put("provinceName", this.provinceName);
      pmap.put("cityName", this.cityName);
      pmap.put("countyName", this.countyName);
      pmap.put("operateType", this.operateType);
      pmap.put("storeHours", this.storeHours);
      return JsonUtil.toJson(pmap);
   }

   public Class<HealthcarePushStoreInfoResponse> getResponseClass() {
      return HealthcarePushStoreInfoResponse.class;
   }
}
