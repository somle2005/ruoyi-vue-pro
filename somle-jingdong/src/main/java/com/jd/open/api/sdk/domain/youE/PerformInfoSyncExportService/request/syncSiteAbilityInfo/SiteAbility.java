package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.syncSiteAbilityInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SiteAbility implements Serializable {
   private String category2;
   private String category3;
   private String secondServiceTypeName;
   private String category1;
   private List<ServiceAreaInfo> serviceAreaList;
   private String siteName;
   private String categoryId1;
   private String categoryId2;
   private String categoryId3;
   private String secondServiceTypeId;
   private String unifiedCode;
   private String siteId;

   @JsonProperty("category2")
   public void setCategory2(String category2) {
      this.category2 = category2;
   }

   @JsonProperty("category2")
   public String getCategory2() {
      return this.category2;
   }

   @JsonProperty("category3")
   public void setCategory3(String category3) {
      this.category3 = category3;
   }

   @JsonProperty("category3")
   public String getCategory3() {
      return this.category3;
   }

   @JsonProperty("secondServiceTypeName")
   public void setSecondServiceTypeName(String secondServiceTypeName) {
      this.secondServiceTypeName = secondServiceTypeName;
   }

   @JsonProperty("secondServiceTypeName")
   public String getSecondServiceTypeName() {
      return this.secondServiceTypeName;
   }

   @JsonProperty("category1")
   public void setCategory1(String category1) {
      this.category1 = category1;
   }

   @JsonProperty("category1")
   public String getCategory1() {
      return this.category1;
   }

   @JsonProperty("serviceAreaList")
   public void setServiceAreaList(List<ServiceAreaInfo> serviceAreaList) {
      this.serviceAreaList = serviceAreaList;
   }

   @JsonProperty("serviceAreaList")
   public List<ServiceAreaInfo> getServiceAreaList() {
      return this.serviceAreaList;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("categoryId1")
   public void setCategoryId1(String categoryId1) {
      this.categoryId1 = categoryId1;
   }

   @JsonProperty("categoryId1")
   public String getCategoryId1() {
      return this.categoryId1;
   }

   @JsonProperty("categoryId2")
   public void setCategoryId2(String categoryId2) {
      this.categoryId2 = categoryId2;
   }

   @JsonProperty("categoryId2")
   public String getCategoryId2() {
      return this.categoryId2;
   }

   @JsonProperty("categoryId3")
   public void setCategoryId3(String categoryId3) {
      this.categoryId3 = categoryId3;
   }

   @JsonProperty("categoryId3")
   public String getCategoryId3() {
      return this.categoryId3;
   }

   @JsonProperty("secondServiceTypeId")
   public void setSecondServiceTypeId(String secondServiceTypeId) {
      this.secondServiceTypeId = secondServiceTypeId;
   }

   @JsonProperty("secondServiceTypeId")
   public String getSecondServiceTypeId() {
      return this.secondServiceTypeId;
   }

   @JsonProperty("unifiedCode")
   public void setUnifiedCode(String unifiedCode) {
      this.unifiedCode = unifiedCode;
   }

   @JsonProperty("unifiedCode")
   public String getUnifiedCode() {
      return this.unifiedCode;
   }

   @JsonProperty("siteId")
   public void setSiteId(String siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public String getSiteId() {
      return this.siteId;
   }
}
