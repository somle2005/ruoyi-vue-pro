package com.jd.open.api.sdk.domain.etms.WaybillJosService.response.receive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PreSortResult implements Serializable {
   private Integer siteId;
   private String siteName;
   private String road;
   private String slideNo;
   private Integer sourceSortCenterId;
   private String sourceSortCenterName;
   private String sourceCrossCode;
   private String sourceTabletrolleyCode;
   private Integer targetSortCenterId;
   private String targetSortCenterName;
   private String targetTabletrolleyCode;
   private Integer aging;
   private String agingName;
   private Integer siteType;
   private Integer isHideName;
   private Integer isHideContractNumbers;
   private String collectionAddress;
   private String distributeCode;
   private String coverCode;
   private String qrcodeUrl;

   @JsonProperty("siteId")
   public void setSiteId(Integer siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public Integer getSiteId() {
      return this.siteId;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("road")
   public void setRoad(String road) {
      this.road = road;
   }

   @JsonProperty("road")
   public String getRoad() {
      return this.road;
   }

   @JsonProperty("slideNo")
   public void setSlideNo(String slideNo) {
      this.slideNo = slideNo;
   }

   @JsonProperty("slideNo")
   public String getSlideNo() {
      return this.slideNo;
   }

   @JsonProperty("sourceSortCenterId")
   public void setSourceSortCenterId(Integer sourceSortCenterId) {
      this.sourceSortCenterId = sourceSortCenterId;
   }

   @JsonProperty("sourceSortCenterId")
   public Integer getSourceSortCenterId() {
      return this.sourceSortCenterId;
   }

   @JsonProperty("sourceSortCenterName")
   public void setSourceSortCenterName(String sourceSortCenterName) {
      this.sourceSortCenterName = sourceSortCenterName;
   }

   @JsonProperty("sourceSortCenterName")
   public String getSourceSortCenterName() {
      return this.sourceSortCenterName;
   }

   @JsonProperty("sourceCrossCode")
   public void setSourceCrossCode(String sourceCrossCode) {
      this.sourceCrossCode = sourceCrossCode;
   }

   @JsonProperty("sourceCrossCode")
   public String getSourceCrossCode() {
      return this.sourceCrossCode;
   }

   @JsonProperty("sourceTabletrolleyCode")
   public void setSourceTabletrolleyCode(String sourceTabletrolleyCode) {
      this.sourceTabletrolleyCode = sourceTabletrolleyCode;
   }

   @JsonProperty("sourceTabletrolleyCode")
   public String getSourceTabletrolleyCode() {
      return this.sourceTabletrolleyCode;
   }

   @JsonProperty("targetSortCenterId")
   public void setTargetSortCenterId(Integer targetSortCenterId) {
      this.targetSortCenterId = targetSortCenterId;
   }

   @JsonProperty("targetSortCenterId")
   public Integer getTargetSortCenterId() {
      return this.targetSortCenterId;
   }

   @JsonProperty("targetSortCenterName")
   public void setTargetSortCenterName(String targetSortCenterName) {
      this.targetSortCenterName = targetSortCenterName;
   }

   @JsonProperty("targetSortCenterName")
   public String getTargetSortCenterName() {
      return this.targetSortCenterName;
   }

   @JsonProperty("targetTabletrolleyCode")
   public void setTargetTabletrolleyCode(String targetTabletrolleyCode) {
      this.targetTabletrolleyCode = targetTabletrolleyCode;
   }

   @JsonProperty("targetTabletrolleyCode")
   public String getTargetTabletrolleyCode() {
      return this.targetTabletrolleyCode;
   }

   @JsonProperty("aging")
   public void setAging(Integer aging) {
      this.aging = aging;
   }

   @JsonProperty("aging")
   public Integer getAging() {
      return this.aging;
   }

   @JsonProperty("agingName")
   public void setAgingName(String agingName) {
      this.agingName = agingName;
   }

   @JsonProperty("agingName")
   public String getAgingName() {
      return this.agingName;
   }

   @JsonProperty("siteType")
   public void setSiteType(Integer siteType) {
      this.siteType = siteType;
   }

   @JsonProperty("siteType")
   public Integer getSiteType() {
      return this.siteType;
   }

   @JsonProperty("isHideName")
   public void setIsHideName(Integer isHideName) {
      this.isHideName = isHideName;
   }

   @JsonProperty("isHideName")
   public Integer getIsHideName() {
      return this.isHideName;
   }

   @JsonProperty("isHideContractNumbers")
   public void setIsHideContractNumbers(Integer isHideContractNumbers) {
      this.isHideContractNumbers = isHideContractNumbers;
   }

   @JsonProperty("isHideContractNumbers")
   public Integer getIsHideContractNumbers() {
      return this.isHideContractNumbers;
   }

   @JsonProperty("collectionAddress")
   public void setCollectionAddress(String collectionAddress) {
      this.collectionAddress = collectionAddress;
   }

   @JsonProperty("collectionAddress")
   public String getCollectionAddress() {
      return this.collectionAddress;
   }

   @JsonProperty("distributeCode")
   public void setDistributeCode(String distributeCode) {
      this.distributeCode = distributeCode;
   }

   @JsonProperty("distributeCode")
   public String getDistributeCode() {
      return this.distributeCode;
   }

   @JsonProperty("coverCode")
   public void setCoverCode(String coverCode) {
      this.coverCode = coverCode;
   }

   @JsonProperty("coverCode")
   public String getCoverCode() {
      return this.coverCode;
   }

   @JsonProperty("qrcodeUrl")
   public void setQrcodeUrl(String qrcodeUrl) {
      this.qrcodeUrl = qrcodeUrl;
   }

   @JsonProperty("qrcodeUrl")
   public String getQrcodeUrl() {
      return this.qrcodeUrl;
   }
}
