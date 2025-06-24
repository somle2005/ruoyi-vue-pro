package com.jd.open.api.sdk.domain.youE.OrderProcessJosService.request.applyFor;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ReminderComplaintParam implements Serializable {
   private String userRemark;
   private String firstLevelComplaintName;
   private String secondLevelComplaintName;
   private String orderNo;
   private String secondLevelComplaintId;
   private List<String> complaintPics;
   private Integer sceneClassification;
   private String firstLevelComplaintId;
   private Integer reminderSource;

   @JsonProperty("userRemark")
   public void setUserRemark(String userRemark) {
      this.userRemark = userRemark;
   }

   @JsonProperty("userRemark")
   public String getUserRemark() {
      return this.userRemark;
   }

   @JsonProperty("firstLevelComplaintName")
   public void setFirstLevelComplaintName(String firstLevelComplaintName) {
      this.firstLevelComplaintName = firstLevelComplaintName;
   }

   @JsonProperty("firstLevelComplaintName")
   public String getFirstLevelComplaintName() {
      return this.firstLevelComplaintName;
   }

   @JsonProperty("secondLevelComplaintName")
   public void setSecondLevelComplaintName(String secondLevelComplaintName) {
      this.secondLevelComplaintName = secondLevelComplaintName;
   }

   @JsonProperty("secondLevelComplaintName")
   public String getSecondLevelComplaintName() {
      return this.secondLevelComplaintName;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("secondLevelComplaintId")
   public void setSecondLevelComplaintId(String secondLevelComplaintId) {
      this.secondLevelComplaintId = secondLevelComplaintId;
   }

   @JsonProperty("secondLevelComplaintId")
   public String getSecondLevelComplaintId() {
      return this.secondLevelComplaintId;
   }

   @JsonProperty("complaintPics")
   public void setComplaintPics(List<String> complaintPics) {
      this.complaintPics = complaintPics;
   }

   @JsonProperty("complaintPics")
   public List<String> getComplaintPics() {
      return this.complaintPics;
   }

   @JsonProperty("sceneClassification")
   public void setSceneClassification(Integer sceneClassification) {
      this.sceneClassification = sceneClassification;
   }

   @JsonProperty("sceneClassification")
   public Integer getSceneClassification() {
      return this.sceneClassification;
   }

   @JsonProperty("firstLevelComplaintId")
   public void setFirstLevelComplaintId(String firstLevelComplaintId) {
      this.firstLevelComplaintId = firstLevelComplaintId;
   }

   @JsonProperty("firstLevelComplaintId")
   public String getFirstLevelComplaintId() {
      return this.firstLevelComplaintId;
   }

   @JsonProperty("reminderSource")
   public void setReminderSource(Integer reminderSource) {
      this.reminderSource = reminderSource;
   }

   @JsonProperty("reminderSource")
   public Integer getReminderSource() {
      return this.reminderSource;
   }
}
