package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.response.queryInteractiveInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AssignmentDetail implements Serializable {
   private String assignmentStartTime;
   private java.util.Map<String, Object> ext;
   private String assignmentImg;
   private Integer timesLimitType;
   private Integer scoreExchangeId;
   private Integer assignmentType;
   private String assignmentEndTime;
   private Integer completionCnt;
   private Integer exchangeRate;
   private java.util.Map<String, Boolean> userVerificationInfo;
   private String encryptAssignmentId;
   private Boolean completionFlag;
   private String assignmentName;
   private Integer assignmentTimesLimit;
   private List<Map> rewards;
   private Integer timeStatus;
   private String assignmentDesc;

   @JsonProperty("assignmentStartTime")
   public void setAssignmentStartTime(String assignmentStartTime) {
      this.assignmentStartTime = assignmentStartTime;
   }

   @JsonProperty("assignmentStartTime")
   public String getAssignmentStartTime() {
      return this.assignmentStartTime;
   }

   @JsonProperty("ext")
   public void setExt(java.util.Map<String, Object> ext) {
      this.ext = ext;
   }

   @JsonProperty("ext")
   public java.util.Map<String, Object> getExt() {
      return this.ext;
   }

   @JsonProperty("assignmentImg")
   public void setAssignmentImg(String assignmentImg) {
      this.assignmentImg = assignmentImg;
   }

   @JsonProperty("assignmentImg")
   public String getAssignmentImg() {
      return this.assignmentImg;
   }

   @JsonProperty("timesLimitType")
   public void setTimesLimitType(Integer timesLimitType) {
      this.timesLimitType = timesLimitType;
   }

   @JsonProperty("timesLimitType")
   public Integer getTimesLimitType() {
      return this.timesLimitType;
   }

   @JsonProperty("scoreExchangeId")
   public void setScoreExchangeId(Integer scoreExchangeId) {
      this.scoreExchangeId = scoreExchangeId;
   }

   @JsonProperty("scoreExchangeId")
   public Integer getScoreExchangeId() {
      return this.scoreExchangeId;
   }

   @JsonProperty("assignmentType")
   public void setAssignmentType(Integer assignmentType) {
      this.assignmentType = assignmentType;
   }

   @JsonProperty("assignmentType")
   public Integer getAssignmentType() {
      return this.assignmentType;
   }

   @JsonProperty("assignmentEndTime")
   public void setAssignmentEndTime(String assignmentEndTime) {
      this.assignmentEndTime = assignmentEndTime;
   }

   @JsonProperty("assignmentEndTime")
   public String getAssignmentEndTime() {
      return this.assignmentEndTime;
   }

   @JsonProperty("completionCnt")
   public void setCompletionCnt(Integer completionCnt) {
      this.completionCnt = completionCnt;
   }

   @JsonProperty("completionCnt")
   public Integer getCompletionCnt() {
      return this.completionCnt;
   }

   @JsonProperty("exchangeRate")
   public void setExchangeRate(Integer exchangeRate) {
      this.exchangeRate = exchangeRate;
   }

   @JsonProperty("exchangeRate")
   public Integer getExchangeRate() {
      return this.exchangeRate;
   }

   @JsonProperty("userVerificationInfo")
   public void setUserVerificationInfo(java.util.Map<String, Boolean> userVerificationInfo) {
      this.userVerificationInfo = userVerificationInfo;
   }

   @JsonProperty("userVerificationInfo")
   public java.util.Map<String, Boolean> getUserVerificationInfo() {
      return this.userVerificationInfo;
   }

   @JsonProperty("encryptAssignmentId")
   public void setEncryptAssignmentId(String encryptAssignmentId) {
      this.encryptAssignmentId = encryptAssignmentId;
   }

   @JsonProperty("encryptAssignmentId")
   public String getEncryptAssignmentId() {
      return this.encryptAssignmentId;
   }

   @JsonProperty("completionFlag")
   public void setCompletionFlag(Boolean completionFlag) {
      this.completionFlag = completionFlag;
   }

   @JsonProperty("completionFlag")
   public Boolean getCompletionFlag() {
      return this.completionFlag;
   }

   @JsonProperty("assignmentName")
   public void setAssignmentName(String assignmentName) {
      this.assignmentName = assignmentName;
   }

   @JsonProperty("assignmentName")
   public String getAssignmentName() {
      return this.assignmentName;
   }

   @JsonProperty("assignmentTimesLimit")
   public void setAssignmentTimesLimit(Integer assignmentTimesLimit) {
      this.assignmentTimesLimit = assignmentTimesLimit;
   }

   @JsonProperty("assignmentTimesLimit")
   public Integer getAssignmentTimesLimit() {
      return this.assignmentTimesLimit;
   }

   @JsonProperty("rewards")
   public void setRewards(List<Map> rewards) {
      this.rewards = rewards;
   }

   @JsonProperty("rewards")
   public List<Map> getRewards() {
      return this.rewards;
   }

   @JsonProperty("timeStatus")
   public void setTimeStatus(Integer timeStatus) {
      this.timeStatus = timeStatus;
   }

   @JsonProperty("timeStatus")
   public Integer getTimeStatus() {
      return this.timeStatus;
   }

   @JsonProperty("assignmentDesc")
   public void setAssignmentDesc(String assignmentDesc) {
      this.assignmentDesc = assignmentDesc;
   }

   @JsonProperty("assignmentDesc")
   public String getAssignmentDesc() {
      return this.assignmentDesc;
   }
}
