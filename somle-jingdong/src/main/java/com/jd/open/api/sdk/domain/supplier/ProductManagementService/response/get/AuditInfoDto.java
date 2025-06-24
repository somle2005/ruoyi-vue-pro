package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class AuditInfoDto implements Serializable {
   private String taskId;
   private String approverCode;
   private String approverName;
   private String opinion;
   private int state;
   private Date approveTime;

   @JsonProperty("task_id")
   public void setTaskId(String taskId) {
      this.taskId = taskId;
   }

   @JsonProperty("task_id")
   public String getTaskId() {
      return this.taskId;
   }

   @JsonProperty("approver_code")
   public void setApproverCode(String approverCode) {
      this.approverCode = approverCode;
   }

   @JsonProperty("approver_code")
   public String getApproverCode() {
      return this.approverCode;
   }

   @JsonProperty("approver_name")
   public void setApproverName(String approverName) {
      this.approverName = approverName;
   }

   @JsonProperty("approver_name")
   public String getApproverName() {
      return this.approverName;
   }

   @JsonProperty("opinion")
   public void setOpinion(String opinion) {
      this.opinion = opinion;
   }

   @JsonProperty("opinion")
   public String getOpinion() {
      return this.opinion;
   }

   @JsonProperty("state")
   public void setState(int state) {
      this.state = state;
   }

   @JsonProperty("state")
   public int getState() {
      return this.state;
   }

   @JsonProperty("approve_time")
   public void setApproveTime(Date approveTime) {
      this.approveTime = approveTime;
   }

   @JsonProperty("approve_time")
   public Date getApproveTime() {
      return this.approveTime;
   }
}
