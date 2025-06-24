package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceCommonProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class SameOrderServiceBill implements Serializable {
   private Long serviceId;
   private Long afsApplyId;
   private Long orderId;
   private Long wareId;
   private String wareName;
   private String approveName;
   private Date afsApplyTime;
   private Date approveDate;
   private String questionDesc;
   private String customerPin;
   private String approveNotes;
   private String applyReason;
   private Integer serviceCount;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("serviceId")
   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   @JsonProperty("serviceId")
   public Long getServiceId() {
      return this.serviceId;
   }

   @JsonProperty("afsApplyId")
   public void setAfsApplyId(Long afsApplyId) {
      this.afsApplyId = afsApplyId;
   }

   @JsonProperty("afsApplyId")
   public Long getAfsApplyId() {
      return this.afsApplyId;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("approveName")
   public void setApproveName(String approveName) {
      this.approveName = approveName;
   }

   @JsonProperty("approveName")
   public String getApproveName() {
      return this.approveName;
   }

   @JsonProperty("afsApplyTime")
   public void setAfsApplyTime(Date afsApplyTime) {
      this.afsApplyTime = afsApplyTime;
   }

   @JsonProperty("afsApplyTime")
   public Date getAfsApplyTime() {
      return this.afsApplyTime;
   }

   @JsonProperty("approveDate")
   public void setApproveDate(Date approveDate) {
      this.approveDate = approveDate;
   }

   @JsonProperty("approveDate")
   public Date getApproveDate() {
      return this.approveDate;
   }

   @JsonProperty("questionDesc")
   public void setQuestionDesc(String questionDesc) {
      this.questionDesc = questionDesc;
   }

   @JsonProperty("questionDesc")
   public String getQuestionDesc() {
      return this.questionDesc;
   }

   @JsonProperty("customerPin")
   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   @JsonProperty("customerPin")
   public String getCustomerPin() {
      return this.customerPin;
   }

   @JsonProperty("approveNotes")
   public void setApproveNotes(String approveNotes) {
      this.approveNotes = approveNotes;
   }

   @JsonProperty("approveNotes")
   public String getApproveNotes() {
      return this.approveNotes;
   }

   @JsonProperty("applyReason")
   public void setApplyReason(String applyReason) {
      this.applyReason = applyReason;
   }

   @JsonProperty("applyReason")
   public String getApplyReason() {
      return this.applyReason;
   }

   @JsonProperty("serviceCount")
   public void setServiceCount(Integer serviceCount) {
      this.serviceCount = serviceCount;
   }

   @JsonProperty("serviceCount")
   public Integer getServiceCount() {
      return this.serviceCount;
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
