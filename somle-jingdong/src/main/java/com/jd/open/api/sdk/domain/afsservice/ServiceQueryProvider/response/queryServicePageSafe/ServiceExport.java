package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.queryServicePageSafe;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ServiceExport implements Serializable {
   private Integer orderType;
   private Long orderId;
   private Date approveDate;
   private String wareName;
   private String processPin;
   private Integer afsServiceStep;
   private Integer approveResonCid2;
   private Date processedDate;
   private Integer approveResonCid1;
   private String pickwareAddress;
   private Integer afsServiceProcessResult;
   private String processName;
   private List<AfsSpecialPropertyExport> afsSpecialProperties;
   private Long wareId;
   private Long afsServiceId;
   private String afsServiceProcessResultName;
   private Date afsApplyTime;
   private String afsServiceStatusName;
   private String customerName;
   private String orderTypeName;
   private String customerPin;
   private String customerMobilePhone;
   private Integer afsServiceStatus;
   private Integer customerGrade;
   private String oaid;
   private String openIdBuyer;
   private String xidBuyer;
   private String desenCustomerMobilePhone;

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("approveDate")
   public void setApproveDate(Date approveDate) {
      this.approveDate = approveDate;
   }

   @JsonProperty("approveDate")
   public Date getApproveDate() {
      return this.approveDate;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("processPin")
   public void setProcessPin(String processPin) {
      this.processPin = processPin;
   }

   @JsonProperty("processPin")
   public String getProcessPin() {
      return this.processPin;
   }

   @JsonProperty("afsServiceStep")
   public void setAfsServiceStep(Integer afsServiceStep) {
      this.afsServiceStep = afsServiceStep;
   }

   @JsonProperty("afsServiceStep")
   public Integer getAfsServiceStep() {
      return this.afsServiceStep;
   }

   @JsonProperty("approveResonCid2")
   public void setApproveResonCid2(Integer approveResonCid2) {
      this.approveResonCid2 = approveResonCid2;
   }

   @JsonProperty("approveResonCid2")
   public Integer getApproveResonCid2() {
      return this.approveResonCid2;
   }

   @JsonProperty("processedDate")
   public void setProcessedDate(Date processedDate) {
      this.processedDate = processedDate;
   }

   @JsonProperty("processedDate")
   public Date getProcessedDate() {
      return this.processedDate;
   }

   @JsonProperty("approveResonCid1")
   public void setApproveResonCid1(Integer approveResonCid1) {
      this.approveResonCid1 = approveResonCid1;
   }

   @JsonProperty("approveResonCid1")
   public Integer getApproveResonCid1() {
      return this.approveResonCid1;
   }

   @JsonProperty("pickwareAddress")
   public void setPickwareAddress(String pickwareAddress) {
      this.pickwareAddress = pickwareAddress;
   }

   @JsonProperty("pickwareAddress")
   public String getPickwareAddress() {
      return this.pickwareAddress;
   }

   @JsonProperty("afsServiceProcessResult")
   public void setAfsServiceProcessResult(Integer afsServiceProcessResult) {
      this.afsServiceProcessResult = afsServiceProcessResult;
   }

   @JsonProperty("afsServiceProcessResult")
   public Integer getAfsServiceProcessResult() {
      return this.afsServiceProcessResult;
   }

   @JsonProperty("processName")
   public void setProcessName(String processName) {
      this.processName = processName;
   }

   @JsonProperty("processName")
   public String getProcessName() {
      return this.processName;
   }

   @JsonProperty("afsSpecialProperties")
   public void setAfsSpecialProperties(List<AfsSpecialPropertyExport> afsSpecialProperties) {
      this.afsSpecialProperties = afsSpecialProperties;
   }

   @JsonProperty("afsSpecialProperties")
   public List<AfsSpecialPropertyExport> getAfsSpecialProperties() {
      return this.afsSpecialProperties;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   @JsonProperty("afsServiceProcessResultName")
   public void setAfsServiceProcessResultName(String afsServiceProcessResultName) {
      this.afsServiceProcessResultName = afsServiceProcessResultName;
   }

   @JsonProperty("afsServiceProcessResultName")
   public String getAfsServiceProcessResultName() {
      return this.afsServiceProcessResultName;
   }

   @JsonProperty("afsApplyTime")
   public void setAfsApplyTime(Date afsApplyTime) {
      this.afsApplyTime = afsApplyTime;
   }

   @JsonProperty("afsApplyTime")
   public Date getAfsApplyTime() {
      return this.afsApplyTime;
   }

   @JsonProperty("afsServiceStatusName")
   public void setAfsServiceStatusName(String afsServiceStatusName) {
      this.afsServiceStatusName = afsServiceStatusName;
   }

   @JsonProperty("afsServiceStatusName")
   public String getAfsServiceStatusName() {
      return this.afsServiceStatusName;
   }

   @JsonProperty("customerName")
   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   @JsonProperty("customerName")
   public String getCustomerName() {
      return this.customerName;
   }

   @JsonProperty("orderTypeName")
   public void setOrderTypeName(String orderTypeName) {
      this.orderTypeName = orderTypeName;
   }

   @JsonProperty("orderTypeName")
   public String getOrderTypeName() {
      return this.orderTypeName;
   }

   @JsonProperty("customerPin")
   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   @JsonProperty("customerPin")
   public String getCustomerPin() {
      return this.customerPin;
   }

   @JsonProperty("customerMobilePhone")
   public void setCustomerMobilePhone(String customerMobilePhone) {
      this.customerMobilePhone = customerMobilePhone;
   }

   @JsonProperty("customerMobilePhone")
   public String getCustomerMobilePhone() {
      return this.customerMobilePhone;
   }

   @JsonProperty("afsServiceStatus")
   public void setAfsServiceStatus(Integer afsServiceStatus) {
      this.afsServiceStatus = afsServiceStatus;
   }

   @JsonProperty("afsServiceStatus")
   public Integer getAfsServiceStatus() {
      return this.afsServiceStatus;
   }

   @JsonProperty("customerGrade")
   public void setCustomerGrade(Integer customerGrade) {
      this.customerGrade = customerGrade;
   }

   @JsonProperty("customerGrade")
   public Integer getCustomerGrade() {
      return this.customerGrade;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
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

   @JsonProperty("desen_customerMobilePhone")
   public void setDesenCustomerMobilePhone(String desenCustomerMobilePhone) {
      this.desenCustomerMobilePhone = desenCustomerMobilePhone;
   }

   @JsonProperty("desen_customerMobilePhone")
   public String getDesenCustomerMobilePhone() {
      return this.desenCustomerMobilePhone;
   }
}
