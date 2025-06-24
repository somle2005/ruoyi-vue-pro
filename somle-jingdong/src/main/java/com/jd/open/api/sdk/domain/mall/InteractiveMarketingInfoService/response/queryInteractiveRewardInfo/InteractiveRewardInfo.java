package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.response.queryInteractiveRewardInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class InteractiveRewardInfo implements Serializable {
   private String msg;
   private java.util.Map<String, Object> assignmentRewards;
   private String subCode;
   private java.util.Map<String, Object> exchangeRestScoreMap;
   private List<Map> projectFailRewardList;
   private List<Map> detailRewardList;
   private java.util.Map<String, Object> poolRewards;
   private java.util.Map<String, Object> projectRewards;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("assignmentRewards")
   public void setAssignmentRewards(java.util.Map<String, Object> assignmentRewards) {
      this.assignmentRewards = assignmentRewards;
   }

   @JsonProperty("assignmentRewards")
   public java.util.Map<String, Object> getAssignmentRewards() {
      return this.assignmentRewards;
   }

   @JsonProperty("subCode")
   public void setSubCode(String subCode) {
      this.subCode = subCode;
   }

   @JsonProperty("subCode")
   public String getSubCode() {
      return this.subCode;
   }

   @JsonProperty("exchangeRestScoreMap")
   public void setExchangeRestScoreMap(java.util.Map<String, Object> exchangeRestScoreMap) {
      this.exchangeRestScoreMap = exchangeRestScoreMap;
   }

   @JsonProperty("exchangeRestScoreMap")
   public java.util.Map<String, Object> getExchangeRestScoreMap() {
      return this.exchangeRestScoreMap;
   }

   @JsonProperty("projectFailRewardList")
   public void setProjectFailRewardList(List<Map> projectFailRewardList) {
      this.projectFailRewardList = projectFailRewardList;
   }

   @JsonProperty("projectFailRewardList")
   public List<Map> getProjectFailRewardList() {
      return this.projectFailRewardList;
   }

   @JsonProperty("detailRewardList")
   public void setDetailRewardList(List<Map> detailRewardList) {
      this.detailRewardList = detailRewardList;
   }

   @JsonProperty("detailRewardList")
   public List<Map> getDetailRewardList() {
      return this.detailRewardList;
   }

   @JsonProperty("poolRewards")
   public void setPoolRewards(java.util.Map<String, Object> poolRewards) {
      this.poolRewards = poolRewards;
   }

   @JsonProperty("poolRewards")
   public java.util.Map<String, Object> getPoolRewards() {
      return this.poolRewards;
   }

   @JsonProperty("projectRewards")
   public void setProjectRewards(java.util.Map<String, Object> projectRewards) {
      this.projectRewards = projectRewards;
   }

   @JsonProperty("projectRewards")
   public java.util.Map<String, Object> getProjectRewards() {
      return this.projectRewards;
   }
}
