package com.jd.open.api.sdk.domain.youE.OrderQueryJsfService.response.queryUnHandleReminderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RemindOrderInfo implements Serializable {
   private String userRemark;
   private String orderNo;
   private Long remindId;
   private String brandRemark;
   private Integer sceneClassification;
   private Date createDate;
   private Integer reminderSource;
   private Integer cnt;
   private String complaintFirstType;
   private String complaintSecondType;
   private List<String> complaintPics;
   private String complaintFirstTypeId;
   private String complaintSecondTypeId;

   @JsonProperty("userRemark")
   public void setUserRemark(String userRemark) {
      this.userRemark = userRemark;
   }

   @JsonProperty("userRemark")
   public String getUserRemark() {
      return this.userRemark;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("remindId")
   public void setRemindId(Long remindId) {
      this.remindId = remindId;
   }

   @JsonProperty("remindId")
   public Long getRemindId() {
      return this.remindId;
   }

   @JsonProperty("brandRemark")
   public void setBrandRemark(String brandRemark) {
      this.brandRemark = brandRemark;
   }

   @JsonProperty("brandRemark")
   public String getBrandRemark() {
      return this.brandRemark;
   }

   @JsonProperty("sceneClassification")
   public void setSceneClassification(Integer sceneClassification) {
      this.sceneClassification = sceneClassification;
   }

   @JsonProperty("sceneClassification")
   public Integer getSceneClassification() {
      return this.sceneClassification;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("reminderSource")
   public void setReminderSource(Integer reminderSource) {
      this.reminderSource = reminderSource;
   }

   @JsonProperty("reminderSource")
   public Integer getReminderSource() {
      return this.reminderSource;
   }

   @JsonProperty("cnt")
   public void setCnt(Integer cnt) {
      this.cnt = cnt;
   }

   @JsonProperty("cnt")
   public Integer getCnt() {
      return this.cnt;
   }

   @JsonProperty("complaintFirstType")
   public void setComplaintFirstType(String complaintFirstType) {
      this.complaintFirstType = complaintFirstType;
   }

   @JsonProperty("complaintFirstType")
   public String getComplaintFirstType() {
      return this.complaintFirstType;
   }

   @JsonProperty("complaintSecondType")
   public void setComplaintSecondType(String complaintSecondType) {
      this.complaintSecondType = complaintSecondType;
   }

   @JsonProperty("complaintSecondType")
   public String getComplaintSecondType() {
      return this.complaintSecondType;
   }

   @JsonProperty("complaintPics")
   public void setComplaintPics(List<String> complaintPics) {
      this.complaintPics = complaintPics;
   }

   @JsonProperty("complaintPics")
   public List<String> getComplaintPics() {
      return this.complaintPics;
   }

   @JsonProperty("complaintFirstTypeId")
   public void setComplaintFirstTypeId(String complaintFirstTypeId) {
      this.complaintFirstTypeId = complaintFirstTypeId;
   }

   @JsonProperty("complaintFirstTypeId")
   public String getComplaintFirstTypeId() {
      return this.complaintFirstTypeId;
   }

   @JsonProperty("complaintSecondTypeId")
   public void setComplaintSecondTypeId(String complaintSecondTypeId) {
      this.complaintSecondTypeId = complaintSecondTypeId;
   }

   @JsonProperty("complaintSecondTypeId")
   public String getComplaintSecondTypeId() {
      return this.complaintSecondTypeId;
   }
}
