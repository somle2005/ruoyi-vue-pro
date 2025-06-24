package com.jd.open.api.sdk.domain.youE.UEService.request.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SiteInfoDto implements Serializable {
   private String siteCode;
   private String address;
   private String siteTown;
   private String siteCity;
   private List<ServiceArea> serviceAreaList;
   private String siteCounty;
   private String siteName;
   private List<ServiceCat> serviceCatList;
   private String contactMan;
   private String siteProvince;
   private String siteMobile;
   private String venderCode;
   private String appid;
   private List<EngineerInfo> engineerInfoList;
   private String unifiedCode;
   private String personName;
   private String personMobile;
   private String personPib;
   private String accountName;
   private String bankCode;
   private String bankName;
   private String dutyParagraph;
   private String bankAccount;

   @JsonProperty("siteCode")
   public void setSiteCode(String siteCode) {
      this.siteCode = siteCode;
   }

   @JsonProperty("siteCode")
   public String getSiteCode() {
      return this.siteCode;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("siteTown")
   public void setSiteTown(String siteTown) {
      this.siteTown = siteTown;
   }

   @JsonProperty("siteTown")
   public String getSiteTown() {
      return this.siteTown;
   }

   @JsonProperty("siteCity")
   public void setSiteCity(String siteCity) {
      this.siteCity = siteCity;
   }

   @JsonProperty("siteCity")
   public String getSiteCity() {
      return this.siteCity;
   }

   @JsonProperty("serviceAreaList")
   public void setServiceAreaList(List<ServiceArea> serviceAreaList) {
      this.serviceAreaList = serviceAreaList;
   }

   @JsonProperty("serviceAreaList")
   public List<ServiceArea> getServiceAreaList() {
      return this.serviceAreaList;
   }

   @JsonProperty("siteCounty")
   public void setSiteCounty(String siteCounty) {
      this.siteCounty = siteCounty;
   }

   @JsonProperty("siteCounty")
   public String getSiteCounty() {
      return this.siteCounty;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("serviceCatList")
   public void setServiceCatList(List<ServiceCat> serviceCatList) {
      this.serviceCatList = serviceCatList;
   }

   @JsonProperty("serviceCatList")
   public List<ServiceCat> getServiceCatList() {
      return this.serviceCatList;
   }

   @JsonProperty("contactMan")
   public void setContactMan(String contactMan) {
      this.contactMan = contactMan;
   }

   @JsonProperty("contactMan")
   public String getContactMan() {
      return this.contactMan;
   }

   @JsonProperty("siteProvince")
   public void setSiteProvince(String siteProvince) {
      this.siteProvince = siteProvince;
   }

   @JsonProperty("siteProvince")
   public String getSiteProvince() {
      return this.siteProvince;
   }

   @JsonProperty("siteMobile")
   public void setSiteMobile(String siteMobile) {
      this.siteMobile = siteMobile;
   }

   @JsonProperty("siteMobile")
   public String getSiteMobile() {
      return this.siteMobile;
   }

   @JsonProperty("venderCode")
   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   @JsonProperty("venderCode")
   public String getVenderCode() {
      return this.venderCode;
   }

   @JsonProperty("appid")
   public void setAppid(String appid) {
      this.appid = appid;
   }

   @JsonProperty("appid")
   public String getAppid() {
      return this.appid;
   }

   @JsonProperty("engineerInfoList")
   public void setEngineerInfoList(List<EngineerInfo> engineerInfoList) {
      this.engineerInfoList = engineerInfoList;
   }

   @JsonProperty("engineerInfoList")
   public List<EngineerInfo> getEngineerInfoList() {
      return this.engineerInfoList;
   }

   @JsonProperty("unifiedCode")
   public void setUnifiedCode(String unifiedCode) {
      this.unifiedCode = unifiedCode;
   }

   @JsonProperty("unifiedCode")
   public String getUnifiedCode() {
      return this.unifiedCode;
   }

   @JsonProperty("personName")
   public void setPersonName(String personName) {
      this.personName = personName;
   }

   @JsonProperty("personName")
   public String getPersonName() {
      return this.personName;
   }

   @JsonProperty("personMobile")
   public void setPersonMobile(String personMobile) {
      this.personMobile = personMobile;
   }

   @JsonProperty("personMobile")
   public String getPersonMobile() {
      return this.personMobile;
   }

   @JsonProperty("personPib")
   public void setPersonPib(String personPib) {
      this.personPib = personPib;
   }

   @JsonProperty("personPib")
   public String getPersonPib() {
      return this.personPib;
   }

   @JsonProperty("accountName")
   public void setAccountName(String accountName) {
      this.accountName = accountName;
   }

   @JsonProperty("accountName")
   public String getAccountName() {
      return this.accountName;
   }

   @JsonProperty("bankCode")
   public void setBankCode(String bankCode) {
      this.bankCode = bankCode;
   }

   @JsonProperty("bankCode")
   public String getBankCode() {
      return this.bankCode;
   }

   @JsonProperty("bankName")
   public void setBankName(String bankName) {
      this.bankName = bankName;
   }

   @JsonProperty("bankName")
   public String getBankName() {
      return this.bankName;
   }

   @JsonProperty("dutyParagraph")
   public void setDutyParagraph(String dutyParagraph) {
      this.dutyParagraph = dutyParagraph;
   }

   @JsonProperty("dutyParagraph")
   public String getDutyParagraph() {
      return this.dutyParagraph;
   }

   @JsonProperty("bankAccount")
   public void setBankAccount(String bankAccount) {
      this.bankAccount = bankAccount;
   }

   @JsonProperty("bankAccount")
   public String getBankAccount() {
      return this.bankAccount;
   }
}
