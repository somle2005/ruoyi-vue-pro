package com.jd.open.api.sdk.domain.supplier.StatementJosService.response.queryApproveStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class JosStatementApproveDTO implements Serializable {
   private Date approveTime;
   private String approveJobName;
   private Integer approveStatus;

   @JsonProperty("approveTime")
   public void setApproveTime(Date approveTime) {
      this.approveTime = approveTime;
   }

   @JsonProperty("approveTime")
   public Date getApproveTime() {
      return this.approveTime;
   }

   @JsonProperty("approveJobName")
   public void setApproveJobName(String approveJobName) {
      this.approveJobName = approveJobName;
   }

   @JsonProperty("approveJobName")
   public String getApproveJobName() {
      return this.approveJobName;
   }

   @JsonProperty("approveStatus")
   public void setApproveStatus(Integer approveStatus) {
      this.approveStatus = approveStatus;
   }

   @JsonProperty("approveStatus")
   public Integer getApproveStatus() {
      return this.approveStatus;
   }
}
