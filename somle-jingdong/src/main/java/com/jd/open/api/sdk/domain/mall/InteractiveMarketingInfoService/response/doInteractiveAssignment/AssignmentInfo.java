package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.response.doInteractiveAssignment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AssignmentInfo implements Serializable {
   private Integer completionCnt;
   private Integer maxTimes;
   private List<String[]> signList;
   private String brandRegUrl;
   private String extraPin;
   private Integer usedScore;
   private Integer increUsedScore;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("completionCnt")
   public void setCompletionCnt(Integer completionCnt) {
      this.completionCnt = completionCnt;
   }

   @JsonProperty("completionCnt")
   public Integer getCompletionCnt() {
      return this.completionCnt;
   }

   @JsonProperty("maxTimes")
   public void setMaxTimes(Integer maxTimes) {
      this.maxTimes = maxTimes;
   }

   @JsonProperty("maxTimes")
   public Integer getMaxTimes() {
      return this.maxTimes;
   }

   @JsonProperty("signList")
   public void setSignList(List<String[]> signList) {
      this.signList = signList;
   }

   @JsonProperty("signList")
   public List<String[]> getSignList() {
      return this.signList;
   }

   @JsonProperty("brandRegUrl")
   public void setBrandRegUrl(String brandRegUrl) {
      this.brandRegUrl = brandRegUrl;
   }

   @JsonProperty("brandRegUrl")
   public String getBrandRegUrl() {
      return this.brandRegUrl;
   }

   @JsonProperty("extraPin")
   public void setExtraPin(String extraPin) {
      this.extraPin = extraPin;
   }

   @JsonProperty("extraPin")
   public String getExtraPin() {
      return this.extraPin;
   }

   @JsonProperty("usedScore")
   public void setUsedScore(Integer usedScore) {
      this.usedScore = usedScore;
   }

   @JsonProperty("usedScore")
   public Integer getUsedScore() {
      return this.usedScore;
   }

   @JsonProperty("increUsedScore")
   public void setIncreUsedScore(Integer increUsedScore) {
      this.increUsedScore = increUsedScore;
   }

   @JsonProperty("increUsedScore")
   public Integer getIncreUsedScore() {
      return this.increUsedScore;
   }

   @JsonProperty("open_id_buyer")
   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   @JsonProperty("open_id_buyer")
   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   @JsonProperty("xid_buyer")
   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   @JsonProperty("xid_buyer")
   public String getXidBuyer() {
      return this.xidBuyer;
   }
}
