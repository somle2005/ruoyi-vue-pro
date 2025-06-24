package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ServiceBill implements Serializable {
   private Long serviceId;
   private Long applyId;
   private Date applyTime;
   private Integer serviceStatus;
   private String serviceStatusName;
   private Integer questionTypeCid1;
   private String questionTypeCid1Name;
   private Integer questionTypeCid2;
   private String questionTypeCid2Name;
   private String questionDesc;
   private String questionPic;
   private Long orderId;
   private Integer orderType;
   private String orderTypeName;
   private String updateName;
   private Date updateDate;
   private Integer sysVersion;
   private Boolean hasInvoice;
   private Boolean needDetectionReport;
   private Boolean hasPackage;
   private Integer customerExpect;
   private String customerExpectName;
   private Integer refundType;
   private String refundTypeName;
   private Integer pickwareType;
   private String pickwareTypeName;
   private Integer expectPickwareType;
   private String expectPickwareTypeName;
   private Integer returnWareType;
   private String returnWareTypeName;
   private Integer companyId;
   private String approvePin;
   private String approveName;
   private Integer approveResult;
   private String approveResultName;
   private String approveNotes;
   private Date approveDate;
   private Integer approveReasonCid1;
   private String approveReasonCid1Name;
   private Integer approveReasonCid2;
   private String approveReasonCid2Name;
   private String processPin;
   private String processName;
   private Integer processResult;
   private String processResultName;
   private String processNotes;
   private Date processDate;
   private Date receiveDate;
   private Long newOrderId;
   private String invoiceCode;
   private String jdUpgradeSuggestion;
   private Integer skuType;
   private String skuTypeName;
   private List<Long> serviceIdList;
   private CustomerInfo customerInfo;
   private AddressInfo pickwareAddress;
   private AddressInfo returnWareAddress;
   private List<ServiceBillDetail> serviceBillDetailList;
   private ContactInfo afsContactInfo;
   private List<ApplyDetail> applyDetailList;
   private Appointment appointment;
   private String orderShopId;
   private WareChangeWithApplyDTO wareChangeWithApplyDTO;
   private String extJsonStr;
   private Integer serviceCount;
   private BigDecimal refundAmt;

   @JsonProperty("serviceId")
   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   @JsonProperty("serviceId")
   public Long getServiceId() {
      return this.serviceId;
   }

   @JsonProperty("applyId")
   public void setApplyId(Long applyId) {
      this.applyId = applyId;
   }

   @JsonProperty("applyId")
   public Long getApplyId() {
      return this.applyId;
   }

   @JsonProperty("applyTime")
   public void setApplyTime(Date applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("applyTime")
   public Date getApplyTime() {
      return this.applyTime;
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

   @JsonProperty("questionDesc")
   public void setQuestionDesc(String questionDesc) {
      this.questionDesc = questionDesc;
   }

   @JsonProperty("questionDesc")
   public String getQuestionDesc() {
      return this.questionDesc;
   }

   @JsonProperty("questionPic")
   public void setQuestionPic(String questionPic) {
      this.questionPic = questionPic;
   }

   @JsonProperty("questionPic")
   public String getQuestionPic() {
      return this.questionPic;
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

   @JsonProperty("updateName")
   public void setUpdateName(String updateName) {
      this.updateName = updateName;
   }

   @JsonProperty("updateName")
   public String getUpdateName() {
      return this.updateName;
   }

   @JsonProperty("updateDate")
   public void setUpdateDate(Date updateDate) {
      this.updateDate = updateDate;
   }

   @JsonProperty("updateDate")
   public Date getUpdateDate() {
      return this.updateDate;
   }

   @JsonProperty("sysVersion")
   public void setSysVersion(Integer sysVersion) {
      this.sysVersion = sysVersion;
   }

   @JsonProperty("sysVersion")
   public Integer getSysVersion() {
      return this.sysVersion;
   }

   @JsonProperty("hasInvoice")
   public void setHasInvoice(Boolean hasInvoice) {
      this.hasInvoice = hasInvoice;
   }

   @JsonProperty("hasInvoice")
   public Boolean getHasInvoice() {
      return this.hasInvoice;
   }

   @JsonProperty("needDetectionReport")
   public void setNeedDetectionReport(Boolean needDetectionReport) {
      this.needDetectionReport = needDetectionReport;
   }

   @JsonProperty("needDetectionReport")
   public Boolean getNeedDetectionReport() {
      return this.needDetectionReport;
   }

   @JsonProperty("hasPackage")
   public void setHasPackage(Boolean hasPackage) {
      this.hasPackage = hasPackage;
   }

   @JsonProperty("hasPackage")
   public Boolean getHasPackage() {
      return this.hasPackage;
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

   @JsonProperty("refundType")
   public void setRefundType(Integer refundType) {
      this.refundType = refundType;
   }

   @JsonProperty("refundType")
   public Integer getRefundType() {
      return this.refundType;
   }

   @JsonProperty("refundTypeName")
   public void setRefundTypeName(String refundTypeName) {
      this.refundTypeName = refundTypeName;
   }

   @JsonProperty("refundTypeName")
   public String getRefundTypeName() {
      return this.refundTypeName;
   }

   @JsonProperty("pickwareType")
   public void setPickwareType(Integer pickwareType) {
      this.pickwareType = pickwareType;
   }

   @JsonProperty("pickwareType")
   public Integer getPickwareType() {
      return this.pickwareType;
   }

   @JsonProperty("pickwareTypeName")
   public void setPickwareTypeName(String pickwareTypeName) {
      this.pickwareTypeName = pickwareTypeName;
   }

   @JsonProperty("pickwareTypeName")
   public String getPickwareTypeName() {
      return this.pickwareTypeName;
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

   @JsonProperty("returnWareType")
   public void setReturnWareType(Integer returnWareType) {
      this.returnWareType = returnWareType;
   }

   @JsonProperty("returnWareType")
   public Integer getReturnWareType() {
      return this.returnWareType;
   }

   @JsonProperty("returnWareTypeName")
   public void setReturnWareTypeName(String returnWareTypeName) {
      this.returnWareTypeName = returnWareTypeName;
   }

   @JsonProperty("returnWareTypeName")
   public String getReturnWareTypeName() {
      return this.returnWareTypeName;
   }

   @JsonProperty("companyId")
   public void setCompanyId(Integer companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Integer getCompanyId() {
      return this.companyId;
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

   @JsonProperty("approveResult")
   public void setApproveResult(Integer approveResult) {
      this.approveResult = approveResult;
   }

   @JsonProperty("approveResult")
   public Integer getApproveResult() {
      return this.approveResult;
   }

   @JsonProperty("approveResultName")
   public void setApproveResultName(String approveResultName) {
      this.approveResultName = approveResultName;
   }

   @JsonProperty("approveResultName")
   public String getApproveResultName() {
      return this.approveResultName;
   }

   @JsonProperty("approveNotes")
   public void setApproveNotes(String approveNotes) {
      this.approveNotes = approveNotes;
   }

   @JsonProperty("approveNotes")
   public String getApproveNotes() {
      return this.approveNotes;
   }

   @JsonProperty("approveDate")
   public void setApproveDate(Date approveDate) {
      this.approveDate = approveDate;
   }

   @JsonProperty("approveDate")
   public Date getApproveDate() {
      return this.approveDate;
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

   @JsonProperty("processResult")
   public void setProcessResult(Integer processResult) {
      this.processResult = processResult;
   }

   @JsonProperty("processResult")
   public Integer getProcessResult() {
      return this.processResult;
   }

   @JsonProperty("processResultName")
   public void setProcessResultName(String processResultName) {
      this.processResultName = processResultName;
   }

   @JsonProperty("processResultName")
   public String getProcessResultName() {
      return this.processResultName;
   }

   @JsonProperty("processNotes")
   public void setProcessNotes(String processNotes) {
      this.processNotes = processNotes;
   }

   @JsonProperty("processNotes")
   public String getProcessNotes() {
      return this.processNotes;
   }

   @JsonProperty("processDate")
   public void setProcessDate(Date processDate) {
      this.processDate = processDate;
   }

   @JsonProperty("processDate")
   public Date getProcessDate() {
      return this.processDate;
   }

   @JsonProperty("receiveDate")
   public void setReceiveDate(Date receiveDate) {
      this.receiveDate = receiveDate;
   }

   @JsonProperty("receiveDate")
   public Date getReceiveDate() {
      return this.receiveDate;
   }

   @JsonProperty("newOrderId")
   public void setNewOrderId(Long newOrderId) {
      this.newOrderId = newOrderId;
   }

   @JsonProperty("newOrderId")
   public Long getNewOrderId() {
      return this.newOrderId;
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

   @JsonProperty("serviceIdList")
   public void setServiceIdList(List<Long> serviceIdList) {
      this.serviceIdList = serviceIdList;
   }

   @JsonProperty("serviceIdList")
   public List<Long> getServiceIdList() {
      return this.serviceIdList;
   }

   @JsonProperty("customerInfo")
   public void setCustomerInfo(CustomerInfo customerInfo) {
      this.customerInfo = customerInfo;
   }

   @JsonProperty("customerInfo")
   public CustomerInfo getCustomerInfo() {
      return this.customerInfo;
   }

   @JsonProperty("pickwareAddress")
   public void setPickwareAddress(AddressInfo pickwareAddress) {
      this.pickwareAddress = pickwareAddress;
   }

   @JsonProperty("pickwareAddress")
   public AddressInfo getPickwareAddress() {
      return this.pickwareAddress;
   }

   @JsonProperty("returnWareAddress")
   public void setReturnWareAddress(AddressInfo returnWareAddress) {
      this.returnWareAddress = returnWareAddress;
   }

   @JsonProperty("returnWareAddress")
   public AddressInfo getReturnWareAddress() {
      return this.returnWareAddress;
   }

   @JsonProperty("serviceBillDetailList")
   public void setServiceBillDetailList(List<ServiceBillDetail> serviceBillDetailList) {
      this.serviceBillDetailList = serviceBillDetailList;
   }

   @JsonProperty("serviceBillDetailList")
   public List<ServiceBillDetail> getServiceBillDetailList() {
      return this.serviceBillDetailList;
   }

   @JsonProperty("afsContactInfo")
   public void setAfsContactInfo(ContactInfo afsContactInfo) {
      this.afsContactInfo = afsContactInfo;
   }

   @JsonProperty("afsContactInfo")
   public ContactInfo getAfsContactInfo() {
      return this.afsContactInfo;
   }

   @JsonProperty("applyDetailList")
   public void setApplyDetailList(List<ApplyDetail> applyDetailList) {
      this.applyDetailList = applyDetailList;
   }

   @JsonProperty("applyDetailList")
   public List<ApplyDetail> getApplyDetailList() {
      return this.applyDetailList;
   }

   @JsonProperty("appointment")
   public void setAppointment(Appointment appointment) {
      this.appointment = appointment;
   }

   @JsonProperty("appointment")
   public Appointment getAppointment() {
      return this.appointment;
   }

   @JsonProperty("orderShopId")
   public void setOrderShopId(String orderShopId) {
      this.orderShopId = orderShopId;
   }

   @JsonProperty("orderShopId")
   public String getOrderShopId() {
      return this.orderShopId;
   }

   @JsonProperty("wareChangeWithApplyDTO")
   public void setWareChangeWithApplyDTO(WareChangeWithApplyDTO wareChangeWithApplyDTO) {
      this.wareChangeWithApplyDTO = wareChangeWithApplyDTO;
   }

   @JsonProperty("wareChangeWithApplyDTO")
   public WareChangeWithApplyDTO getWareChangeWithApplyDTO() {
      return this.wareChangeWithApplyDTO;
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

   @JsonProperty("refundAmt")
   public void setRefundAmt(BigDecimal refundAmt) {
      this.refundAmt = refundAmt;
   }

   @JsonProperty("refundAmt")
   public BigDecimal getRefundAmt() {
      return this.refundAmt;
   }
}
