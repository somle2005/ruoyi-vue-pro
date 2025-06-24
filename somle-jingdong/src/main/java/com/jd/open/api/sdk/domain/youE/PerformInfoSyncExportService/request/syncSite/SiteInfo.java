package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.syncSite;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SiteInfo implements Serializable {
   private String address;
   private String siteCity;
   private String siteMobile;
   private String siteCounty;
   private String siteProvince;
   private String siteTown;
   private String siteName;
   private String unifiedCode;
   private String contactMan;
   private Integer engineerNum;

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("siteCity")
   public void setSiteCity(String siteCity) {
      this.siteCity = siteCity;
   }

   @JsonProperty("siteCity")
   public String getSiteCity() {
      return this.siteCity;
   }

   @JsonProperty("siteMobile")
   public void setSiteMobile(String siteMobile) {
      this.siteMobile = siteMobile;
   }

   @JsonProperty("siteMobile")
   public String getSiteMobile() {
      return this.siteMobile;
   }

   @JsonProperty("siteCounty")
   public void setSiteCounty(String siteCounty) {
      this.siteCounty = siteCounty;
   }

   @JsonProperty("siteCounty")
   public String getSiteCounty() {
      return this.siteCounty;
   }

   @JsonProperty("siteProvince")
   public void setSiteProvince(String siteProvince) {
      this.siteProvince = siteProvince;
   }

   @JsonProperty("siteProvince")
   public String getSiteProvince() {
      return this.siteProvince;
   }

   @JsonProperty("siteTown")
   public void setSiteTown(String siteTown) {
      this.siteTown = siteTown;
   }

   @JsonProperty("siteTown")
   public String getSiteTown() {
      return this.siteTown;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("unifiedCode")
   public void setUnifiedCode(String unifiedCode) {
      this.unifiedCode = unifiedCode;
   }

   @JsonProperty("unifiedCode")
   public String getUnifiedCode() {
      return this.unifiedCode;
   }

   @JsonProperty("contactMan")
   public void setContactMan(String contactMan) {
      this.contactMan = contactMan;
   }

   @JsonProperty("contactMan")
   public String getContactMan() {
      return this.contactMan;
   }

   @JsonProperty("engineerNum")
   public void setEngineerNum(Integer engineerNum) {
      this.engineerNum = engineerNum;
   }

   @JsonProperty("engineerNum")
   public Integer getEngineerNum() {
      return this.engineerNum;
   }
}
