package com.jd.open.api.sdk.domain.mall.InteractiveMarketingInfoService.response.queryInteractiveInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class InteractiveInfoResult implements Serializable {
   private String msg;
   private boolean hasRisk;
   private String subCode;
   private Integer pinStatusForPhone;
   private String projectName;
   private boolean login;
   private List<AssignmentDetail> assignmentList;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("hasRisk")
   public void setHasRisk(boolean hasRisk) {
      this.hasRisk = hasRisk;
   }

   @JsonProperty("hasRisk")
   public boolean getHasRisk() {
      return this.hasRisk;
   }

   @JsonProperty("subCode")
   public void setSubCode(String subCode) {
      this.subCode = subCode;
   }

   @JsonProperty("subCode")
   public String getSubCode() {
      return this.subCode;
   }

   @JsonProperty("pinStatusForPhone")
   public void setPinStatusForPhone(Integer pinStatusForPhone) {
      this.pinStatusForPhone = pinStatusForPhone;
   }

   @JsonProperty("pinStatusForPhone")
   public Integer getPinStatusForPhone() {
      return this.pinStatusForPhone;
   }

   @JsonProperty("projectName")
   public void setProjectName(String projectName) {
      this.projectName = projectName;
   }

   @JsonProperty("projectName")
   public String getProjectName() {
      return this.projectName;
   }

   @JsonProperty("login")
   public void setLogin(boolean login) {
      this.login = login;
   }

   @JsonProperty("login")
   public boolean getLogin() {
      return this.login;
   }

   @JsonProperty("assignmentList")
   public void setAssignmentList(List<AssignmentDetail> assignmentList) {
      this.assignmentList = assignmentList;
   }

   @JsonProperty("assignmentList")
   public List<AssignmentDetail> getAssignmentList() {
      return this.assignmentList;
   }
}
