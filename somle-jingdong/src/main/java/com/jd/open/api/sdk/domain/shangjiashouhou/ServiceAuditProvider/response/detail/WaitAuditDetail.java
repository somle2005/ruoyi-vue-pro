package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WaitAuditDetail implements Serializable {
   private List<Long> serviceIdList;
   private Integer customerExpect;
   private String customerExpectName;
   private Date applyTime;
   private Long orderId;
   private String questionPic;
   private String questionDesc;
   private Integer questionTypeCid1;
   private String questionTypeCid1Name;
   private Integer questionTypeCid2;
   private String questionTypeCid2Name;
   private Integer orderType;
   private String orderTypeName;
   private Integer expectPickwareType;
   private String expectPickwareTypeName;
   private String invoiceCode;
   private String jdUpgradeSuggestion;
   private Integer skuType;
   private String skuTypeName;
   private Integer sysVersion;
   private String extJsonStr;
   private CustomerInfo customerInfo;
   private List<ApplyDetail> applyDetailList;
   private AddressInfo doorPickwareAddress;
   private AddressInfo receiveWareAddress;
   private Appointment appointment;

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

   @JsonProperty("applyTime")
   public void setApplyTime(Date applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("applyTime")
   public Date getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("questionPic")
   public void setQuestionPic(String questionPic) {
      this.questionPic = questionPic;
   }

   @JsonProperty("questionPic")
   public String getQuestionPic() {
      return this.questionPic;
   }

   @JsonProperty("questionDesc")
   public void setQuestionDesc(String questionDesc) {
      this.questionDesc = questionDesc;
   }

   @JsonProperty("questionDesc")
   public String getQuestionDesc() {
      return this.questionDesc;
   }

   @JsonProperty("questionTypeCid1")
   public void setQuestionTypeCid1(Integer questionTypeCid1) {
      this.questionTypeCid1 = questionTypeCid1;
   }

   @JsonProperty("questionTypeCid1")
   public Integer getQuestionTypeCid1() {
      return this.questionTypeCid1;
   }

   @JsonProperty("questionTypeCid1Name")
   public void setQuestionTypeCid1Name(String questionTypeCid1Name) {
      this.questionTypeCid1Name = questionTypeCid1Name;
   }

   @JsonProperty("questionTypeCid1Name")
   public String getQuestionTypeCid1Name() {
      return this.questionTypeCid1Name;
   }

   @JsonProperty("questionTypeCid2")
   public void setQuestionTypeCid2(Integer questionTypeCid2) {
      this.questionTypeCid2 = questionTypeCid2;
   }

   @JsonProperty("questionTypeCid2")
   public Integer getQuestionTypeCid2() {
      return this.questionTypeCid2;
   }

   @JsonProperty("questionTypeCid2Name")
   public void setQuestionTypeCid2Name(String questionTypeCid2Name) {
      this.questionTypeCid2Name = questionTypeCid2Name;
   }

   @JsonProperty("questionTypeCid2Name")
   public String getQuestionTypeCid2Name() {
      return this.questionTypeCid2Name;
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

   @JsonProperty("expectPickwareType")
   public void setExpectPickwareType(Integer expectPickwareType) {
      this.expectPickwareType = expectPickwareType;
   }

   @JsonProperty("expectPickwareType")
   public Integer getExpectPickwareType() {
      return this.expectPickwareType;
   }

   @JsonProperty("expectPickwareTypeName")
   public void setExpectPickwareTypeName(String expectPickwareTypeName) {
      this.expectPickwareTypeName = expectPickwareTypeName;
   }

   @JsonProperty("expectPickwareTypeName")
   public String getExpectPickwareTypeName() {
      return this.expectPickwareTypeName;
   }

   @JsonProperty("invoiceCode")
   public void setInvoiceCode(String invoiceCode) {
      this.invoiceCode = invoiceCode;
   }

   @JsonProperty("invoiceCode")
   public String getInvoiceCode() {
      return this.invoiceCode;
   }

   @JsonProperty("jdUpgradeSuggestion")
   public void setJdUpgradeSuggestion(String jdUpgradeSuggestion) {
      this.jdUpgradeSuggestion = jdUpgradeSuggestion;
   }

   @JsonProperty("jdUpgradeSuggestion")
   public String getJdUpgradeSuggestion() {
      return this.jdUpgradeSuggestion;
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

   @JsonProperty("sysVersion")
   public void setSysVersion(Integer sysVersion) {
      this.sysVersion = sysVersion;
   }

   @JsonProperty("sysVersion")
   public Integer getSysVersion() {
      return this.sysVersion;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   @JsonProperty("customerInfo")
   public void setCustomerInfo(CustomerInfo customerInfo) {
      this.customerInfo = customerInfo;
   }

   @JsonProperty("customerInfo")
   public CustomerInfo getCustomerInfo() {
      return this.customerInfo;
   }

   @JsonProperty("applyDetailList")
   public void setApplyDetailList(List<ApplyDetail> applyDetailList) {
      this.applyDetailList = applyDetailList;
   }

   @JsonProperty("applyDetailList")
   public List<ApplyDetail> getApplyDetailList() {
      return this.applyDetailList;
   }

   @JsonProperty("doorPickwareAddress")
   public void setDoorPickwareAddress(AddressInfo doorPickwareAddress) {
      this.doorPickwareAddress = doorPickwareAddress;
   }

   @JsonProperty("doorPickwareAddress")
   public AddressInfo getDoorPickwareAddress() {
      return this.doorPickwareAddress;
   }

   @JsonProperty("receiveWareAddress")
   public void setReceiveWareAddress(AddressInfo receiveWareAddress) {
      this.receiveWareAddress = receiveWareAddress;
   }

   @JsonProperty("receiveWareAddress")
   public AddressInfo getReceiveWareAddress() {
      return this.receiveWareAddress;
   }

   @JsonProperty("appointment")
   public void setAppointment(Appointment appointment) {
      this.appointment = appointment;
   }

   @JsonProperty("appointment")
   public Appointment getAppointment() {
      return this.appointment;
   }
}
