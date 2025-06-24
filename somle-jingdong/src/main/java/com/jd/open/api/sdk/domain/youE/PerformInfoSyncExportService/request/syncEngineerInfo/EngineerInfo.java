package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.syncEngineerInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class EngineerInfo implements Serializable {
   private String headImg;
   private String nucleicTime;
   private String idCard;
   private String nucleicResults;
   private String siteId;
   private String unifiedCode;
   private String siteName;
   private String engineerName;
   private String engineerMobile;

   @JsonProperty("headImg")
   public void setHeadImg(String headImg) {
      this.headImg = headImg;
   }

   @JsonProperty("headImg")
   public String getHeadImg() {
      return this.headImg;
   }

   @JsonProperty("nucleicTime")
   public void setNucleicTime(String nucleicTime) {
      this.nucleicTime = nucleicTime;
   }

   @JsonProperty("nucleicTime")
   public String getNucleicTime() {
      return this.nucleicTime;
   }

   @JsonProperty("idCard")
   public void setIdCard(String idCard) {
      this.idCard = idCard;
   }

   @JsonProperty("idCard")
   public String getIdCard() {
      return this.idCard;
   }

   @JsonProperty("nucleicResults")
   public void setNucleicResults(String nucleicResults) {
      this.nucleicResults = nucleicResults;
   }

   @JsonProperty("nucleicResults")
   public String getNucleicResults() {
      return this.nucleicResults;
   }

   @JsonProperty("siteId")
   public void setSiteId(String siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public String getSiteId() {
      return this.siteId;
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

   @JsonProperty("engineerName")
   public void setEngineerName(String engineerName) {
      this.engineerName = engineerName;
   }

   @JsonProperty("engineerName")
   public String getEngineerName() {
      return this.engineerName;
   }

   @JsonProperty("engineerMobile")
   public void setEngineerMobile(String engineerMobile) {
      this.engineerMobile = engineerMobile;
   }

   @JsonProperty("engineerMobile")
   public String getEngineerMobile() {
      return this.engineerMobile;
   }
}
