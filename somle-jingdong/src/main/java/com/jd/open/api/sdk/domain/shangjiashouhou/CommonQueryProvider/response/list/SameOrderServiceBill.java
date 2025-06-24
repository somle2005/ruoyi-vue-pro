package com.jd.open.api.sdk.domain.shangjiashouhou.CommonQueryProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class SameOrderServiceBill implements Serializable {
   private Long serviceId;
   private Integer serviceState;
   private String serviceStateName;
   private Long orderId;
   private Long wareId;
   private String wareName;
   private String customerPin;
   private String customerName;
   private Integer approveReasonCid1;
   private String approveReasonCid1Name;
   private Integer approveReasonCid2;
   private String approveReasonCid2Name;
   private int approvedResult;
   private String approvedResultName;
   private String approvePin;
   private String approveName;
   private Date approvedDate;
   private String processPin;
   private String processName;
   private Date processedDate;
   private String extJsonStr;

   @JsonProperty("serviceId")
   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   @JsonProperty("serviceId")
   public Long getServiceId() {
      return this.serviceId;
   }

   @JsonProperty("serviceState")
   public void setServiceState(Integer serviceState) {
      this.serviceState = serviceState;
   }

   @JsonProperty("serviceState")
   public Integer getServiceState() {
      return this.serviceState;
   }

   @JsonProperty("serviceStateName")
   public void setServiceStateName(String serviceStateName) {
      this.serviceStateName = serviceStateName;
   }

   @JsonProperty("serviceStateName")
   public String getServiceStateName() {
      return this.serviceStateName;
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

   @JsonProperty("customerPin")
   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   @JsonProperty("customerPin")
   public String getCustomerPin() {
      return this.customerPin;
   }

   @JsonProperty("customerName")
   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   @JsonProperty("customerName")
   public String getCustomerName() {
      return this.customerName;
   }

   @JsonProperty("approveReasonCid1")
   public void setApproveReasonCid1(Integer approveReasonCid1) {
      this.approveReasonCid1 = approveReasonCid1;
   }

   @JsonProperty("approveReasonCid1")
   public Integer getApproveReasonCid1() {
      return this.approveReasonCid1;
   }

   @JsonProperty("approveReasonCid1Name")
   public void setApproveReasonCid1Name(String approveReasonCid1Name) {
      this.approveReasonCid1Name = approveReasonCid1Name;
   }

   @JsonProperty("approveReasonCid1Name")
   public String getApproveReasonCid1Name() {
      return this.approveReasonCid1Name;
   }

   @JsonProperty("approveReasonCid2")
   public void setApproveReasonCid2(Integer approveReasonCid2) {
      this.approveReasonCid2 = approveReasonCid2;
   }

   @JsonProperty("approveReasonCid2")
   public Integer getApproveReasonCid2() {
      return this.approveReasonCid2;
   }

   @JsonProperty("approveReasonCid2Name")
   public void setApproveReasonCid2Name(String approveReasonCid2Name) {
      this.approveReasonCid2Name = approveReasonCid2Name;
   }

   @JsonProperty("approveReasonCid2Name")
   public String getApproveReasonCid2Name() {
      return this.approveReasonCid2Name;
   }

   @JsonProperty("approvedResult")
   public void setApprovedResult(int approvedResult) {
      this.approvedResult = approvedResult;
   }

   @JsonProperty("approvedResult")
   public int getApprovedResult() {
      return this.approvedResult;
   }

   @JsonProperty("approvedResultName")
   public void setApprovedResultName(String approvedResultName) {
      this.approvedResultName = approvedResultName;
   }

   @JsonProperty("approvedResultName")
   public String getApprovedResultName() {
      return this.approvedResultName;
   }

   @JsonProperty("approvePin")
   public void setApprovePin(String approvePin) {
      this.approvePin = approvePin;
   }

   @JsonProperty("approvePin")
   public String getApprovePin() {
      return this.approvePin;
   }

   @JsonProperty("approveName")
   public void setApproveName(String approveName) {
      this.approveName = approveName;
   }

   @JsonProperty("approveName")
   public String getApproveName() {
      return this.approveName;
   }

   @JsonProperty("approvedDate")
   public void setApprovedDate(Date approvedDate) {
      this.approvedDate = approvedDate;
   }

   @JsonProperty("approvedDate")
   public Date getApprovedDate() {
      return this.approvedDate;
   }

   @JsonProperty("processPin")
   public void setProcessPin(String processPin) {
      this.processPin = processPin;
   }

   @JsonProperty("processPin")
   public String getProcessPin() {
      return this.processPin;
   }

   @JsonProperty("processName")
   public void setProcessName(String processName) {
      this.processName = processName;
   }

   @JsonProperty("processName")
   public String getProcessName() {
      return this.processName;
   }

   @JsonProperty("processedDate")
   public void setProcessedDate(Date processedDate) {
      this.processedDate = processedDate;
   }

   @JsonProperty("processedDate")
   public Date getProcessedDate() {
      return this.processedDate;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }
}
