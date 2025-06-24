package com.jd.open.api.sdk.request.xfylapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xfylapi.DentistryPushStoreInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DentistryPushStoreInfoRequest extends AbstractRequest implements JdRequest<DentistryPushStoreInfoResponse> {
   private Long channelType;
   private String storeName;
   private String operateType;
   private Integer status;
   private String storeImg;
   private String cityName;
   private String provinceName;
   private Double storeLat;
   private String storePhone;
   private String storeAddr;
   private String countyName;
   private Double storeLng;
   private String storeId;
   private String storeHours;
   private Integer reportSupport;

   public void setChannelType(Long channelType) {
      this.channelType = channelType;
   }

   public Long getChannelType() {
      return this.channelType;
   }

   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   public String getStoreName() {
      return this.storeName;
   }

   public void setOperateType(String operateType) {
      this.operateType = operateType;
   }

   public String getOperateType() {
      return this.operateType;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setStoreImg(String storeImg) {
      this.storeImg = storeImg;
   }

   public String getStoreImg() {
      return this.storeImg;
   }

   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   public String getCityName() {
      return this.cityName;
   }

   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   public String getProvinceName() {
      return this.provinceName;
   }

   public void setStoreLat(Double storeLat) {
      this.storeLat = storeLat;
   }

   public Double getStoreLat() {
      return this.storeLat;
   }

   public void setStorePhone(String storePhone) {
      this.storePhone = storePhone;
   }

   public String getStorePhone() {
      return this.storePhone;
   }

   public void setStoreAddr(String storeAddr) {
      this.storeAddr = storeAddr;
   }

   public String getStoreAddr() {
      return this.storeAddr;
   }

   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   public String getCountyName() {
      return this.countyName;
   }

   public void setStoreLng(Double storeLng) {
      this.storeLng = storeLng;
   }

   public Double getStoreLng() {
      return this.storeLng;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setStoreHours(String storeHours) {
      this.storeHours = storeHours;
   }

   public String getStoreHours() {
      return this.storeHours;
   }

   public void setReportSupport(Integer reportSupport) {
      this.reportSupport = reportSupport;
   }

   public Integer getReportSupport() {
      return this.reportSupport;
   }

   public String getApiMethod() {
      return "jingdong.dentistry.pushStoreInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channelType", this.channelType);
      pmap.put("storeName", this.storeName);
      pmap.put("operateType", this.operateType);
      pmap.put("status", this.status);
      pmap.put("storeImg", this.storeImg);
      pmap.put("cityName", this.cityName);
      pmap.put("provinceName", this.provinceName);
      pmap.put("storeLat", this.storeLat);
      pmap.put("storePhone", this.storePhone);
      pmap.put("storeAddr", this.storeAddr);
      pmap.put("countyName", this.countyName);
      pmap.put("storeLng", this.storeLng);
      pmap.put("storeId", this.storeId);
      pmap.put("storeHours", this.storeHours);
      pmap.put("reportSupport", this.reportSupport);
      return JsonUtil.toJson(pmap);
   }

   public Class<DentistryPushStoreInfoResponse> getResponseClass() {
      return DentistryPushStoreInfoResponse.class;
   }
}
