package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findTempCompletePage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class TempComplete implements Serializable {
   private Long[] afsServiceId;
   private Long[] orderId;
   private Long[] wareId;
   private String[] wareName;
   private String[] customerPin;
   private String[] customerName;
   private Integer[] afsServiceProcessResult;
   private String[] afsServiceProcessResultName;
   private Date[] afsApplyTime;
   private Date[] processDate;
   private String[] processPin;
   private Integer[] afsDetailType;
   private Integer[] customerGrade;
   private String[] customerMobilePhone;
   private String[] pickwareAddress;
   private Integer[] approveResonCid1;
   private Integer[] approveResonCid2;
   private Integer[] afsServiceState;
   private Integer[] afsCategoryId;
   private String oaid;

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long[] afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long[] getAfsServiceId() {
      return this.afsServiceId;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long[] orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long[] getOrderId() {
      return this.orderId;
   }

   @JsonProperty("wareId")
   public void setWareId(Long[] wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long[] getWareId() {
      return this.wareId;
   }

   @JsonProperty("wareName")
   public void setWareName(String[] wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String[] getWareName() {
      return this.wareName;
   }

   @JsonProperty("customerPin")
   public void setCustomerPin(String[] customerPin) {
      this.customerPin = customerPin;
   }

   @JsonProperty("customerPin")
   public String[] getCustomerPin() {
      return this.customerPin;
   }

   @JsonProperty("customerName")
   public void setCustomerName(String[] customerName) {
      this.customerName = customerName;
   }

   @JsonProperty("customerName")
   public String[] getCustomerName() {
      return this.customerName;
   }

   @JsonProperty("afsServiceProcessResult")
   public void setAfsServiceProcessResult(Integer[] afsServiceProcessResult) {
      this.afsServiceProcessResult = afsServiceProcessResult;
   }

   @JsonProperty("afsServiceProcessResult")
   public Integer[] getAfsServiceProcessResult() {
      return this.afsServiceProcessResult;
   }

   @JsonProperty("afsServiceProcessResultName")
   public void setAfsServiceProcessResultName(String[] afsServiceProcessResultName) {
      this.afsServiceProcessResultName = afsServiceProcessResultName;
   }

   @JsonProperty("afsServiceProcessResultName")
   public String[] getAfsServiceProcessResultName() {
      return this.afsServiceProcessResultName;
   }

   @JsonProperty("afsApplyTime")
   public void setAfsApplyTime(Date[] afsApplyTime) {
      this.afsApplyTime = afsApplyTime;
   }

   @JsonProperty("afsApplyTime")
   public Date[] getAfsApplyTime() {
      return this.afsApplyTime;
   }

   @JsonProperty("processDate")
   public void setProcessDate(Date[] processDate) {
      this.processDate = processDate;
   }

   @JsonProperty("processDate")
   public Date[] getProcessDate() {
      return this.processDate;
   }

   @JsonProperty("processPin")
   public void setProcessPin(String[] processPin) {
      this.processPin = processPin;
   }

   @JsonProperty("processPin")
   public String[] getProcessPin() {
      return this.processPin;
   }

   @JsonProperty("afsDetailType")
   public void setAfsDetailType(Integer[] afsDetailType) {
      this.afsDetailType = afsDetailType;
   }

   @JsonProperty("afsDetailType")
   public Integer[] getAfsDetailType() {
      return this.afsDetailType;
   }

   @JsonProperty("customerGrade")
   public void setCustomerGrade(Integer[] customerGrade) {
      this.customerGrade = customerGrade;
   }

   @JsonProperty("customerGrade")
   public Integer[] getCustomerGrade() {
      return this.customerGrade;
   }

   @JsonProperty("customerMobilePhone")
   public void setCustomerMobilePhone(String[] customerMobilePhone) {
      this.customerMobilePhone = customerMobilePhone;
   }

   @JsonProperty("customerMobilePhone")
   public String[] getCustomerMobilePhone() {
      return this.customerMobilePhone;
   }

   @JsonProperty("pickwareAddress")
   public void setPickwareAddress(String[] pickwareAddress) {
      this.pickwareAddress = pickwareAddress;
   }

   @JsonProperty("pickwareAddress")
   public String[] getPickwareAddress() {
      return this.pickwareAddress;
   }

   @JsonProperty("approveResonCid1")
   public void setApproveResonCid1(Integer[] approveResonCid1) {
      this.approveResonCid1 = approveResonCid1;
   }

   @JsonProperty("approveResonCid1")
   public Integer[] getApproveResonCid1() {
      return this.approveResonCid1;
   }

   @JsonProperty("approveResonCid2")
   public void setApproveResonCid2(Integer[] approveResonCid2) {
      this.approveResonCid2 = approveResonCid2;
   }

   @JsonProperty("approveResonCid2")
   public Integer[] getApproveResonCid2() {
      return this.approveResonCid2;
   }

   @JsonProperty("afsServiceState")
   public void setAfsServiceState(Integer[] afsServiceState) {
      this.afsServiceState = afsServiceState;
   }

   @JsonProperty("afsServiceState")
   public Integer[] getAfsServiceState() {
      return this.afsServiceState;
   }

   @JsonProperty("afsCategoryId")
   public void setAfsCategoryId(Integer[] afsCategoryId) {
      this.afsCategoryId = afsCategoryId;
   }

   @JsonProperty("afsCategoryId")
   public Integer[] getAfsCategoryId() {
      return this.afsCategoryId;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }
}
