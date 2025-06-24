package com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.response.getServiceProjectInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ServiceProjectInfo implements Serializable {
   private Integer secondCdCode;
   private String secondCdName;
   private Integer thirdCdCode;
   private String thirdCdName;
   private List<ServiceCdInfo> serviceCdInfos;
   private String serviceProjectName;
   private String firstCdName;
   private Integer firstCdCode;
   private List<ServiceTechInfo> serviceTechInfos;
   private Date modifiedDate;
   private Long serviceProjectId;

   @JsonProperty("secondCdCode")
   public void setSecondCdCode(Integer secondCdCode) {
      this.secondCdCode = secondCdCode;
   }

   @JsonProperty("secondCdCode")
   public Integer getSecondCdCode() {
      return this.secondCdCode;
   }

   @JsonProperty("secondCdName")
   public void setSecondCdName(String secondCdName) {
      this.secondCdName = secondCdName;
   }

   @JsonProperty("secondCdName")
   public String getSecondCdName() {
      return this.secondCdName;
   }

   @JsonProperty("thirdCdCode")
   public void setThirdCdCode(Integer thirdCdCode) {
      this.thirdCdCode = thirdCdCode;
   }

   @JsonProperty("thirdCdCode")
   public Integer getThirdCdCode() {
      return this.thirdCdCode;
   }

   @JsonProperty("thirdCdName")
   public void setThirdCdName(String thirdCdName) {
      this.thirdCdName = thirdCdName;
   }

   @JsonProperty("thirdCdName")
   public String getThirdCdName() {
      return this.thirdCdName;
   }

   @JsonProperty("serviceCdInfos")
   public void setServiceCdInfos(List<ServiceCdInfo> serviceCdInfos) {
      this.serviceCdInfos = serviceCdInfos;
   }

   @JsonProperty("serviceCdInfos")
   public List<ServiceCdInfo> getServiceCdInfos() {
      return this.serviceCdInfos;
   }

   @JsonProperty("serviceProjectName")
   public void setServiceProjectName(String serviceProjectName) {
      this.serviceProjectName = serviceProjectName;
   }

   @JsonProperty("serviceProjectName")
   public String getServiceProjectName() {
      return this.serviceProjectName;
   }

   @JsonProperty("firstCdName")
   public void setFirstCdName(String firstCdName) {
      this.firstCdName = firstCdName;
   }

   @JsonProperty("firstCdName")
   public String getFirstCdName() {
      return this.firstCdName;
   }

   @JsonProperty("firstCdCode")
   public void setFirstCdCode(Integer firstCdCode) {
      this.firstCdCode = firstCdCode;
   }

   @JsonProperty("firstCdCode")
   public Integer getFirstCdCode() {
      return this.firstCdCode;
   }

   @JsonProperty("serviceTechInfos")
   public void setServiceTechInfos(List<ServiceTechInfo> serviceTechInfos) {
      this.serviceTechInfos = serviceTechInfos;
   }

   @JsonProperty("serviceTechInfos")
   public List<ServiceTechInfo> getServiceTechInfos() {
      return this.serviceTechInfos;
   }

   @JsonProperty("modifiedDate")
   public void setModifiedDate(Date modifiedDate) {
      this.modifiedDate = modifiedDate;
   }

   @JsonProperty("modifiedDate")
   public Date getModifiedDate() {
      return this.modifiedDate;
   }

   @JsonProperty("serviceProjectId")
   public void setServiceProjectId(Long serviceProjectId) {
      this.serviceProjectId = serviceProjectId;
   }

   @JsonProperty("serviceProjectId")
   public Long getServiceProjectId() {
      return this.serviceProjectId;
   }
}
