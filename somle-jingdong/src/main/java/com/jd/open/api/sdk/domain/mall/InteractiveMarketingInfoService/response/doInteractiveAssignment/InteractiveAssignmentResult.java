package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.response.doInteractiveAssignment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class InteractiveAssignmentResult implements Serializable {
   private String msg;
   private String subCode;
   private AssignmentInfo assignmentInfo;
   private RewardsInfo rewardsInfo;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("subCode")
   public void setSubCode(String subCode) {
      this.subCode = subCode;
   }

   @JsonProperty("subCode")
   public String getSubCode() {
      return this.subCode;
   }

   @JsonProperty("assignmentInfo")
   public void setAssignmentInfo(AssignmentInfo assignmentInfo) {
      this.assignmentInfo = assignmentInfo;
   }

   @JsonProperty("assignmentInfo")
   public AssignmentInfo getAssignmentInfo() {
      return this.assignmentInfo;
   }

   @JsonProperty("rewardsInfo")
   public void setRewardsInfo(RewardsInfo rewardsInfo) {
      this.rewardsInfo = rewardsInfo;
   }

   @JsonProperty("rewardsInfo")
   public RewardsInfo getRewardsInfo() {
      return this.rewardsInfo;
   }
}
