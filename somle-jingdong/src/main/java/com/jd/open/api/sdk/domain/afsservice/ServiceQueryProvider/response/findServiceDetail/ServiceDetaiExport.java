package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findServiceDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ServiceDetaiExport implements Serializable {
   private Long afsApplyId;
   private Long afsServiceId;
   private Date afsApplyTime;
   private Long orderId;
   private int isHasInvoice;
   private int isNeedDetectionReport;
   private int isHasPackage;
   private Integer customerExpect;
   private String questionPic;
   private Integer afsServiceStep;
   private String afsServiceStepName;
   private String approveNotes;
   private String questionDesc;
   private Integer approvedResult;
   private String approvedResultName;
   private Integer processResult;
   private String processResultName;
   private Integer afsServiceStatus;
   private String afsServiceStatusName;
   private ServiceCustomerInfoExport serviceCustomerInfoExport;
   private AddressInfoExport doorPickwareAddressInfoExport;
   private AddressInfoExport receiveWareAddressInfoExport;
   private ContactsInfoExport afterserviceContactsInfoExport;
   private ServiceExpressInfoExport serviceExpressInfoExport;
   private List<ServiceFinanceDetailInfoExport> serviceFinanceDetailInfoExports;
   private List<ServiceTrackInfoExport> serviceTrackInfoExports;
   private List<ServiceDetailInfoExport> serviceDetailInfoExports;
   private List<Integer[]> allowOperations;
   private Integer orderType;
   private AppointmentInfoExport appointmentInfoExport;
   private String buId;
   private String approvePin;
   private String approveName;
   private Date approvedDate;
   private Date processedDate;
   private Date receiveDate;
   private Integer afsCategoryId;
   private ServiceApplyInfoExport serviceApplyInfoExport;
   private Integer companyId;
   private Integer pickwareType;
   private Integer questionTypeCid1;
   private Integer questionTypeCid2;
   private Long newOrderId;
   private String updateName;
   private Date updateDate;
   private Integer afsServiceState;
   private String jdUpgradeSuggestion;

   @JsonProperty("afsApplyId")
   public void setAfsApplyId(Long afsApplyId) {
      this.afsApplyId = afsApplyId;
   }

   @JsonProperty("afsApplyId")
   public Long getAfsApplyId() {
      return this.afsApplyId;
   }

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   @JsonProperty("afsApplyTime")
   public void setAfsApplyTime(Date afsApplyTime) {
      this.afsApplyTime = afsApplyTime;
   }

   @JsonProperty("afsApplyTime")
   public Date getAfsApplyTime() {
      return this.afsApplyTime;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("isHasInvoice")
   public void setIsHasInvoice(int isHasInvoice) {
      this.isHasInvoice = isHasInvoice;
   }

   @JsonProperty("isHasInvoice")
   public int getIsHasInvoice() {
      return this.isHasInvoice;
   }

   @JsonProperty("isNeedDetectionReport")
   public void setIsNeedDetectionReport(int isNeedDetectionReport) {
      this.isNeedDetectionReport = isNeedDetectionReport;
   }

   @JsonProperty("isNeedDetectionReport")
   public int getIsNeedDetectionReport() {
      return this.isNeedDetectionReport;
   }

   @JsonProperty("isHasPackage")
   public void setIsHasPackage(int isHasPackage) {
      this.isHasPackage = isHasPackage;
   }

   @JsonProperty("isHasPackage")
   public int getIsHasPackage() {
      return this.isHasPackage;
   }

   @JsonProperty("customerExpect")
   public void setCustomerExpect(Integer customerExpect) {
      this.customerExpect = customerExpect;
   }

   @JsonProperty("customerExpect")
   public Integer getCustomerExpect() {
      return this.customerExpect;
   }

   @JsonProperty("questionPic")
   public void setQuestionPic(String questionPic) {
      this.questionPic = questionPic;
   }

   @JsonProperty("questionPic")
   public String getQuestionPic() {
      return this.questionPic;
   }

   @JsonProperty("afsServiceStep")
   public void setAfsServiceStep(Integer afsServiceStep) {
      this.afsServiceStep = afsServiceStep;
   }

   @JsonProperty("afsServiceStep")
   public Integer getAfsServiceStep() {
      return this.afsServiceStep;
   }

   @JsonProperty("afsServiceStepName")
   public void setAfsServiceStepName(String afsServiceStepName) {
      this.afsServiceStepName = afsServiceStepName;
   }

   @JsonProperty("afsServiceStepName")
   public String getAfsServiceStepName() {
      return this.afsServiceStepName;
   }

   @JsonProperty("approveNotes")
   public void setApproveNotes(String approveNotes) {
      this.approveNotes = approveNotes;
   }

   @JsonProperty("approveNotes")
   public String getApproveNotes() {
      return this.approveNotes;
   }

   @JsonProperty("questionDesc")
   public void setQuestionDesc(String questionDesc) {
      this.questionDesc = questionDesc;
   }

   @JsonProperty("questionDesc")
   public String getQuestionDesc() {
      return this.questionDesc;
   }

   @JsonProperty("approvedResult")
   public void setApprovedResult(Integer approvedResult) {
      this.approvedResult = approvedResult;
   }

   @JsonProperty("approvedResult")
   public Integer getApprovedResult() {
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

   @JsonProperty("afsServiceStatus")
   public void setAfsServiceStatus(Integer afsServiceStatus) {
      this.afsServiceStatus = afsServiceStatus;
   }

   @JsonProperty("afsServiceStatus")
   public Integer getAfsServiceStatus() {
      return this.afsServiceStatus;
   }

   @JsonProperty("afsServiceStatusName")
   public void setAfsServiceStatusName(String afsServiceStatusName) {
      this.afsServiceStatusName = afsServiceStatusName;
   }

   @JsonProperty("afsServiceStatusName")
   public String getAfsServiceStatusName() {
      return this.afsServiceStatusName;
   }

   @JsonProperty("serviceCustomerInfoExport")
   public void setServiceCustomerInfoExport(ServiceCustomerInfoExport serviceCustomerInfoExport) {
      this.serviceCustomerInfoExport = serviceCustomerInfoExport;
   }

   @JsonProperty("serviceCustomerInfoExport")
   public ServiceCustomerInfoExport getServiceCustomerInfoExport() {
      return this.serviceCustomerInfoExport;
   }

   @JsonProperty("doorPickwareAddressInfoExport")
   public void setDoorPickwareAddressInfoExport(AddressInfoExport doorPickwareAddressInfoExport) {
      this.doorPickwareAddressInfoExport = doorPickwareAddressInfoExport;
   }

   @JsonProperty("doorPickwareAddressInfoExport")
   public AddressInfoExport getDoorPickwareAddressInfoExport() {
      return this.doorPickwareAddressInfoExport;
   }

   @JsonProperty("receiveWareAddressInfoExport")
   public void setReceiveWareAddressInfoExport(AddressInfoExport receiveWareAddressInfoExport) {
      this.receiveWareAddressInfoExport = receiveWareAddressInfoExport;
   }

   @JsonProperty("receiveWareAddressInfoExport")
   public AddressInfoExport getReceiveWareAddressInfoExport() {
      return this.receiveWareAddressInfoExport;
   }

   @JsonProperty("afterserviceContactsInfoExport")
   public void setAfterserviceContactsInfoExport(ContactsInfoExport afterserviceContactsInfoExport) {
      this.afterserviceContactsInfoExport = afterserviceContactsInfoExport;
   }

   @JsonProperty("afterserviceContactsInfoExport")
   public ContactsInfoExport getAfterserviceContactsInfoExport() {
      return this.afterserviceContactsInfoExport;
   }

   @JsonProperty("serviceExpressInfoExport")
   public void setServiceExpressInfoExport(ServiceExpressInfoExport serviceExpressInfoExport) {
      this.serviceExpressInfoExport = serviceExpressInfoExport;
   }

   @JsonProperty("serviceExpressInfoExport")
   public ServiceExpressInfoExport getServiceExpressInfoExport() {
      return this.serviceExpressInfoExport;
   }

   @JsonProperty("serviceFinanceDetailInfoExports")
   public void setServiceFinanceDetailInfoExports(List<ServiceFinanceDetailInfoExport> serviceFinanceDetailInfoExports) {
      this.serviceFinanceDetailInfoExports = serviceFinanceDetailInfoExports;
   }

   @JsonProperty("serviceFinanceDetailInfoExports")
   public List<ServiceFinanceDetailInfoExport> getServiceFinanceDetailInfoExports() {
      return this.serviceFinanceDetailInfoExports;
   }

   @JsonProperty("serviceTrackInfoExports")
   public void setServiceTrackInfoExports(List<ServiceTrackInfoExport> serviceTrackInfoExports) {
      this.serviceTrackInfoExports = serviceTrackInfoExports;
   }

   @JsonProperty("serviceTrackInfoExports")
   public List<ServiceTrackInfoExport> getServiceTrackInfoExports() {
      return this.serviceTrackInfoExports;
   }

   @JsonProperty("serviceDetailInfoExports")
   public void setServiceDetailInfoExports(List<ServiceDetailInfoExport> serviceDetailInfoExports) {
      this.serviceDetailInfoExports = serviceDetailInfoExports;
   }

   @JsonProperty("serviceDetailInfoExports")
   public List<ServiceDetailInfoExport> getServiceDetailInfoExports() {
      return this.serviceDetailInfoExports;
   }

   @JsonProperty("allowOperations")
   public void setAllowOperations(List<Integer[]> allowOperations) {
      this.allowOperations = allowOperations;
   }

   @JsonProperty("allowOperations")
   public List<Integer[]> getAllowOperations() {
      return this.allowOperations;
   }

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
   }

   @JsonProperty("appointmentInfoExport")
   public void setAppointmentInfoExport(AppointmentInfoExport appointmentInfoExport) {
      this.appointmentInfoExport = appointmentInfoExport;
   }

   @JsonProperty("appointmentInfoExport")
   public AppointmentInfoExport getAppointmentInfoExport() {
      return this.appointmentInfoExport;
   }

   @JsonProperty("buId")
   public void setBuId(String buId) {
      this.buId = buId;
   }

   @JsonProperty("buId")
   public String getBuId() {
      return this.buId;
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

   @JsonProperty("processedDate")
   public void setProcessedDate(Date processedDate) {
      this.processedDate = processedDate;
   }

   @JsonProperty("processedDate")
   public Date getProcessedDate() {
      return this.processedDate;
   }

   @JsonProperty("receiveDate")
   public void setReceiveDate(Date receiveDate) {
      this.receiveDate = receiveDate;
   }

   @JsonProperty("receiveDate")
   public Date getReceiveDate() {
      return this.receiveDate;
   }

   @JsonProperty("afsCategoryId")
   public void setAfsCategoryId(Integer afsCategoryId) {
      this.afsCategoryId = afsCategoryId;
   }

   @JsonProperty("afsCategoryId")
   public Integer getAfsCategoryId() {
      return this.afsCategoryId;
   }

   @JsonProperty("serviceApplyInfoExport")
   public void setServiceApplyInfoExport(ServiceApplyInfoExport serviceApplyInfoExport) {
      this.serviceApplyInfoExport = serviceApplyInfoExport;
   }

   @JsonProperty("serviceApplyInfoExport")
   public ServiceApplyInfoExport getServiceApplyInfoExport() {
      return this.serviceApplyInfoExport;
   }

   @JsonProperty("companyId")
   public void setCompanyId(Integer companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Integer getCompanyId() {
      return this.companyId;
   }

   @JsonProperty("pickwareType")
   public void setPickwareType(Integer pickwareType) {
      this.pickwareType = pickwareType;
   }

   @JsonProperty("pickwareType")
   public Integer getPickwareType() {
      return this.pickwareType;
   }

   @JsonProperty("questionTypeCid1")
   public void setQuestionTypeCid1(Integer questionTypeCid1) {
      this.questionTypeCid1 = questionTypeCid1;
   }

   @JsonProperty("questionTypeCid1")
   public Integer getQuestionTypeCid1() {
      return this.questionTypeCid1;
   }

   @JsonProperty("questionTypeCid2")
   public void setQuestionTypeCid2(Integer questionTypeCid2) {
      this.questionTypeCid2 = questionTypeCid2;
   }

   @JsonProperty("questionTypeCid2")
   public Integer getQuestionTypeCid2() {
      return this.questionTypeCid2;
   }

   @JsonProperty("newOrderId")
   public void setNewOrderId(Long newOrderId) {
      this.newOrderId = newOrderId;
   }

   @JsonProperty("newOrderId")
   public Long getNewOrderId() {
      return this.newOrderId;
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

   @JsonProperty("afsServiceState")
   public void setAfsServiceState(Integer afsServiceState) {
      this.afsServiceState = afsServiceState;
   }

   @JsonProperty("afsServiceState")
   public Integer getAfsServiceState() {
      return this.afsServiceState;
   }

   @JsonProperty("jdUpgradeSuggestion")
   public void setJdUpgradeSuggestion(String jdUpgradeSuggestion) {
      this.jdUpgradeSuggestion = jdUpgradeSuggestion;
   }

   @JsonProperty("jdUpgradeSuggestion")
   public String getJdUpgradeSuggestion() {
      return this.jdUpgradeSuggestion;
   }
}
