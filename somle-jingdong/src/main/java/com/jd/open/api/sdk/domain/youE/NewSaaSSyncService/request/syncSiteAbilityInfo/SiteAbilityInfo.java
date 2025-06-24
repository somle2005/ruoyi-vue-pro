package com.jd.open.api.sdk.domain.youE.NewSaaSSyncService.request.syncSiteAbilityInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SiteAbilityInfo implements Serializable {
   private String siteCode;
   private String appId;
   private List<ServiceArea> serviceAreaList;
   private String unifiedCode;
   private String siteName;
   private String serviceCatName;
   private String serviceTypeId;
   private String serviceTypeName;
   private String serviceCatId;

   @JsonProperty("siteCode")
   public void setSiteCode(String siteCode) {
      this.siteCode = siteCode;
   }

   @JsonProperty("siteCode")
   public String getSiteCode() {
      return this.siteCode;
   }

   @JsonProperty("appId")
   public void setAppId(String appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public String getAppId() {
      return this.appId;
   }

   @JsonProperty("serviceAreaList")
   public void setServiceAreaList(List<ServiceArea> serviceAreaList) {
      this.serviceAreaList = serviceAreaList;
   }

   @JsonProperty("serviceAreaList")
   public List<ServiceArea> getServiceAreaList() {
      return this.serviceAreaList;
   }

   @JsonProperty("unifiedCode")
   public void setUnifiedCode(String unifiedCode) {
      this.unifiedCode = unifiedCode;
   }

   @JsonProperty("unifiedCode")
   public String getUnifiedCode() {
      return this.unifiedCode;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("serviceCatName")
   public void setServiceCatName(String serviceCatName) {
      this.serviceCatName = serviceCatName;
   }

   @JsonProperty("serviceCatName")
   public String getServiceCatName() {
      return this.serviceCatName;
   }

   @JsonProperty("serviceTypeId")
   public void setServiceTypeId(String serviceTypeId) {
      this.serviceTypeId = serviceTypeId;
   }

   @JsonProperty("serviceTypeId")
   public String getServiceTypeId() {
      return this.serviceTypeId;
   }

   @JsonProperty("serviceTypeName")
   public void setServiceTypeName(String serviceTypeName) {
      this.serviceTypeName = serviceTypeName;
   }

   @JsonProperty("serviceTypeName")
   public String getServiceTypeName() {
      return this.serviceTypeName;
   }

   @JsonProperty("serviceCatId")
   public void setServiceCatId(String serviceCatId) {
      this.serviceCatId = serviceCatId;
   }

   @JsonProperty("serviceCatId")
   public String getServiceCatId() {
      return this.serviceCatId;
   }
}
