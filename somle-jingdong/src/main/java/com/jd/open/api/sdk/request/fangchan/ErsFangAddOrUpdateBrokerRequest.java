package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.ErsFangAddOrUpdateBrokerResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ErsFangAddOrUpdateBrokerRequest extends AbstractRequest implements JdRequest<ErsFangAddOrUpdateBrokerResponse> {
   private Long channelId;
   private String name;
   private String extensionNum;
   private String extensionPhone;
   private Long phoneNum;
   private String headImg;
   private String infoCard;
   private String businessLicense;
   private String cityName;
   private String areaName;
   private String company;
   private Long tradingAreaId;
   private String shop;
   private String declaration;
   private String speciality;
   private String seniority;
   private Double workHours;
   private String workingExperience;
   private Short brokerStatus;
   private Integer cityCode;
   private Long sourceId;

   public void setChannelId(Long channelId) {
      this.channelId = channelId;
   }

   public Long getChannelId() {
      return this.channelId;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setExtensionNum(String extensionNum) {
      this.extensionNum = extensionNum;
   }

   public String getExtensionNum() {
      return this.extensionNum;
   }

   public void setExtensionPhone(String extensionPhone) {
      this.extensionPhone = extensionPhone;
   }

   public String getExtensionPhone() {
      return this.extensionPhone;
   }

   public void setPhoneNum(Long phoneNum) {
      this.phoneNum = phoneNum;
   }

   public Long getPhoneNum() {
      return this.phoneNum;
   }

   public void setHeadImg(String headImg) {
      this.headImg = headImg;
   }

   public String getHeadImg() {
      return this.headImg;
   }

   public void setInfoCard(String infoCard) {
      this.infoCard = infoCard;
   }

   public String getInfoCard() {
      return this.infoCard;
   }

   public void setBusinessLicense(String businessLicense) {
      this.businessLicense = businessLicense;
   }

   public String getBusinessLicense() {
      return this.businessLicense;
   }

   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   public String getCityName() {
      return this.cityName;
   }

   public void setAreaName(String areaName) {
      this.areaName = areaName;
   }

   public String getAreaName() {
      return this.areaName;
   }

   public void setCompany(String company) {
      this.company = company;
   }

   public String getCompany() {
      return this.company;
   }

   public void setTradingAreaId(Long tradingAreaId) {
      this.tradingAreaId = tradingAreaId;
   }

   public Long getTradingAreaId() {
      return this.tradingAreaId;
   }

   public void setShop(String shop) {
      this.shop = shop;
   }

   public String getShop() {
      return this.shop;
   }

   public void setDeclaration(String declaration) {
      this.declaration = declaration;
   }

   public String getDeclaration() {
      return this.declaration;
   }

   public void setSpeciality(String speciality) {
      this.speciality = speciality;
   }

   public String getSpeciality() {
      return this.speciality;
   }

   public void setSeniority(String seniority) {
      this.seniority = seniority;
   }

   public String getSeniority() {
      return this.seniority;
   }

   public void setWorkHours(Double workHours) {
      this.workHours = workHours;
   }

   public Double getWorkHours() {
      return this.workHours;
   }

   public void setWorkingExperience(String workingExperience) {
      this.workingExperience = workingExperience;
   }

   public String getWorkingExperience() {
      return this.workingExperience;
   }

   public void setBrokerStatus(Short brokerStatus) {
      this.brokerStatus = brokerStatus;
   }

   public Short getBrokerStatus() {
      return this.brokerStatus;
   }

   public void setCityCode(Integer cityCode) {
      this.cityCode = cityCode;
   }

   public Integer getCityCode() {
      return this.cityCode;
   }

   public void setSourceId(Long sourceId) {
      this.sourceId = sourceId;
   }

   public Long getSourceId() {
      return this.sourceId;
   }

   public String getApiMethod() {
      return "jingdong.ers.fang.addOrUpdateBroker";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channelId", this.channelId);
      pmap.put("name", this.name);
      pmap.put("extensionNum", this.extensionNum);
      pmap.put("extensionPhone", this.extensionPhone);
      pmap.put("phoneNum", this.phoneNum);
      pmap.put("headImg", this.headImg);
      pmap.put("infoCard", this.infoCard);
      pmap.put("businessLicense", this.businessLicense);
      pmap.put("cityName", this.cityName);
      pmap.put("areaName", this.areaName);
      pmap.put("company", this.company);
      pmap.put("tradingAreaId", this.tradingAreaId);
      pmap.put("shop", this.shop);
      pmap.put("declaration", this.declaration);
      pmap.put("speciality", this.speciality);
      pmap.put("seniority", this.seniority);
      pmap.put("workHours", this.workHours);
      pmap.put("workingExperience", this.workingExperience);
      pmap.put("brokerStatus", this.brokerStatus);
      pmap.put("cityCode", this.cityCode);
      pmap.put("sourceId", this.sourceId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ErsFangAddOrUpdateBrokerResponse> getResponseClass() {
      return ErsFangAddOrUpdateBrokerResponse.class;
   }
}
