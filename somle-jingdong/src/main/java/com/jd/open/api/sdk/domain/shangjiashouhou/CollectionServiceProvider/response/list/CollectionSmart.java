package com.jd.open.api.sdk.domain.shangjiashouhou.CollectionServiceProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CollectionSmart implements Serializable {
   private Integer receivableId;
   private BigDecimal amount;
   private Integer receivableState;
   private String receivableStateName;
   private Date applyTime;
   private Date reconciliationTime;
   private Integer companyId;
   private String companyName;
   private Date updateDate;
   private String paymentChannel;
   private Integer balanceFlag;
   private Integer receivableType;
   private String receivableTypeName;
   private Long orderId;
   private Long skuId;
   private String wareName;
   private String customerPin;
   private String customerName;
   private String customerMobile;
   private Integer customerGrade;
   private String pickwareAddress;
   private Integer serviceStatus;
   private String serviceStatusName;
   private Date serviceApplyTime;
   private Date expirationDate;
   private Long serviceId;
   private String extJsonStr;
   private Integer serviceCount;
   private String oaid;

   @JsonProperty("receivableId")
   public void setReceivableId(Integer receivableId) {
      this.receivableId = receivableId;
   }

   @JsonProperty("receivableId")
   public Integer getReceivableId() {
      return this.receivableId;
   }

   @JsonProperty("amount")
   public void setAmount(BigDecimal amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public BigDecimal getAmount() {
      return this.amount;
   }

   @JsonProperty("receivableState")
   public void setReceivableState(Integer receivableState) {
      this.receivableState = receivableState;
   }

   @JsonProperty("receivableState")
   public Integer getReceivableState() {
      return this.receivableState;
   }

   @JsonProperty("receivableStateName")
   public void setReceivableStateName(String receivableStateName) {
      this.receivableStateName = receivableStateName;
   }

   @JsonProperty("receivableStateName")
   public String getReceivableStateName() {
      return this.receivableStateName;
   }

   @JsonProperty("applyTime")
   public void setApplyTime(Date applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("applyTime")
   public Date getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("reconciliationTime")
   public void setReconciliationTime(Date reconciliationTime) {
      this.reconciliationTime = reconciliationTime;
   }

   @JsonProperty("reconciliationTime")
   public Date getReconciliationTime() {
      return this.reconciliationTime;
   }

   @JsonProperty("companyId")
   public void setCompanyId(Integer companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Integer getCompanyId() {
      return this.companyId;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("updateDate")
   public void setUpdateDate(Date updateDate) {
      this.updateDate = updateDate;
   }

   @JsonProperty("updateDate")
   public Date getUpdateDate() {
      return this.updateDate;
   }

   @JsonProperty("paymentChannel")
   public void setPaymentChannel(String paymentChannel) {
      this.paymentChannel = paymentChannel;
   }

   @JsonProperty("paymentChannel")
   public String getPaymentChannel() {
      return this.paymentChannel;
   }

   @JsonProperty("balanceFlag")
   public void setBalanceFlag(Integer balanceFlag) {
      this.balanceFlag = balanceFlag;
   }

   @JsonProperty("balanceFlag")
   public Integer getBalanceFlag() {
      return this.balanceFlag;
   }

   @JsonProperty("receivableType")
   public void setReceivableType(Integer receivableType) {
      this.receivableType = receivableType;
   }

   @JsonProperty("receivableType")
   public Integer getReceivableType() {
      return this.receivableType;
   }

   @JsonProperty("receivableTypeName")
   public void setReceivableTypeName(String receivableTypeName) {
      this.receivableTypeName = receivableTypeName;
   }

   @JsonProperty("receivableTypeName")
   public String getReceivableTypeName() {
      return this.receivableTypeName;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
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

   @JsonProperty("serviceStatus")
   public void setServiceStatus(Integer serviceStatus) {
      this.serviceStatus = serviceStatus;
   }

   @JsonProperty("serviceStatus")
   public Integer getServiceStatus() {
      return this.serviceStatus;
   }

   @JsonProperty("serviceStatusName")
   public void setServiceStatusName(String serviceStatusName) {
      this.serviceStatusName = serviceStatusName;
   }

   @JsonProperty("serviceStatusName")
   public String getServiceStatusName() {
      return this.serviceStatusName;
   }

   @JsonProperty("serviceApplyTime")
   public void setServiceApplyTime(Date serviceApplyTime) {
      this.serviceApplyTime = serviceApplyTime;
   }

   @JsonProperty("serviceApplyTime")
   public Date getServiceApplyTime() {
      return this.serviceApplyTime;
   }

   @JsonProperty("expirationDate")
   public void setExpirationDate(Date expirationDate) {
      this.expirationDate = expirationDate;
   }

   @JsonProperty("expirationDate")
   public Date getExpirationDate() {
      return this.expirationDate;
   }

   @JsonProperty("serviceId")
   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   @JsonProperty("serviceId")
   public Long getServiceId() {
      return this.serviceId;
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
}
