package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WaitAuditApply implements Serializable {
   private Long applyId;
   private List<Long> serviceIdList;
   private Integer customerExpect;
   private String customerExpectName;
   private String serviceStatusName;
   private Integer serviceStatus;
   private Date applyTime;
   private Date auditOvertime;
   private Boolean timeoutFlag;
   private String customerPin;
   private String customerName;
   private String customerMobile;
   private Integer customerGrade;
   private String pickwareAddress;
   private Long orderId;
   private Integer orderType;
   private String orderTypeName;
   private Long skuId;
   private String wareName;
   private Integer skuType;
   private String skuTypeName;
   private String extJsonStr;
   private Integer serviceCount;
   private String oaid;
   private String openIdBuyer;
   private String xidBuyer;

   @JsonProperty("applyId")
   public void setApplyId(Long applyId) {
      this.applyId = applyId;
   }

   @JsonProperty("applyId")
   public Long getApplyId() {
      return this.applyId;
   }

   @JsonProperty("serviceIdList")
   public void setServiceIdList(List<Long> serviceIdList) {
      this.serviceIdList = serviceIdList;
   }

   @JsonProperty("serviceIdList")
   public List<Long> getServiceIdList() {
      return this.serviceIdList;
   }

   @JsonProperty("customerExpect")
   public void setCustomerExpect(Integer customerExpect) {
      this.customerExpect = customerExpect;
   }

   @JsonProperty("customerExpect")
   public Integer getCustomerExpect() {
      return this.customerExpect;
   }

   @JsonProperty("customerExpectName")
   public void setCustomerExpectName(String customerExpectName) {
      this.customerExpectName = customerExpectName;
   }

   @JsonProperty("customerExpectName")
   public String getCustomerExpectName() {
      return this.customerExpectName;
   }

   @JsonProperty("serviceStatusName")
   public void setServiceStatusName(String serviceStatusName) {
      this.serviceStatusName = serviceStatusName;
   }

   @JsonProperty("serviceStatusName")
   public String getServiceStatusName() {
      return this.serviceStatusName;
   }

   @JsonProperty("serviceStatus")
   public void setServiceStatus(Integer serviceStatus) {
      this.serviceStatus = serviceStatus;
   }

   @JsonProperty("serviceStatus")
   public Integer getServiceStatus() {
      return this.serviceStatus;
   }

   @JsonProperty("applyTime")
   public void setApplyTime(Date applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("applyTime")
   public Date getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("auditOvertime")
   public void setAuditOvertime(Date auditOvertime) {
      this.auditOvertime = auditOvertime;
   }

   @JsonProperty("auditOvertime")
   public Date getAuditOvertime() {
      return this.auditOvertime;
   }

   @JsonProperty("timeoutFlag")
   public void setTimeoutFlag(Boolean timeoutFlag) {
      this.timeoutFlag = timeoutFlag;
   }

   @JsonProperty("timeoutFlag")
   public Boolean getTimeoutFlag() {
      return this.timeoutFlag;
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

   @JsonProperty("customerMobile")
   public void setCustomerMobile(String customerMobile) {
      this.customerMobile = customerMobile;
   }

   @JsonProperty("customerMobile")
   public String getCustomerMobile() {
      return this.customerMobile;
   }

   @JsonProperty("customerGrade")
   public void setCustomerGrade(Integer customerGrade) {
      this.customerGrade = customerGrade;
   }

   @JsonProperty("customerGrade")
   public Integer getCustomerGrade() {
      return this.customerGrade;
   }

   @JsonProperty("pickwareAddress")
   public void setPickwareAddress(String pickwareAddress) {
      this.pickwareAddress = pickwareAddress;
   }

   @JsonProperty("pickwareAddress")
   public String getPickwareAddress() {
      return this.pickwareAddress;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("orderTypeName")
   public void setOrderTypeName(String orderTypeName) {
      this.orderTypeName = orderTypeName;
   }

   @JsonProperty("orderTypeName")
   public String getOrderTypeName() {
      return this.orderTypeName;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("skuType")
   public void setSkuType(Integer skuType) {
      this.skuType = skuType;
   }

   @JsonProperty("skuType")
   public Integer getSkuType() {
      return this.skuType;
   }

   @JsonProperty("skuTypeName")
   public void setSkuTypeName(String skuTypeName) {
      this.skuTypeName = skuTypeName;
   }

   @JsonProperty("skuTypeName")
   public String getSkuTypeName() {
      return this.skuTypeName;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   @JsonProperty("serviceCount")
   public void setServiceCount(Integer serviceCount) {
      this.serviceCount = serviceCount;
   }

   @JsonProperty("serviceCount")
   public Integer getServiceCount() {
      return this.serviceCount;
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
}
