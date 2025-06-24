package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ServiceBrief implements Serializable {
   private Long serviceId;
   private Integer customerExpect;
   private Long orderId;
   private Integer serviceStatus;
   private Date applyTime;
   private Integer orderType;
   private String customerPin;
   private String customerName;
   private String customerTel;
   private Long skuId;
   private Integer pickwareType;
   private Integer questionTypeCid1;
   private String questionTypeCid1Name;
   private Integer questionTypeCid2;
   private String questionTypeCid2Name;
   private Integer platformSrc;
   private String platformSrcName;
   private Date updateTime;
   private Integer sysVersion;
   private String expressCode;
   private Date freightUpdateDate;
   private Integer serviceCount;
   private Long parentService;
   private Long applyId;
   private String customerExpectName;
   private String serviceStatusName;
   private Integer customerGrade;
   private String pickwareAddress;
   private String orderTypeName;
   private BigDecimal actualPayPrice;
   private Integer wareType;
   private String wareTypeName;
   private String wareName;
   private Integer skuType;
   private String skuTypeName;
   private String skuUuid;
   private String approvePin;
   private String approveName;
   private Date approveTime;
   private Integer approveResult;
   private String approveResultName;
   private String processPin;
   private String processName;
   private Date processTime;
   private Integer processResult;
   private String processResultName;
   private String extJsonStr;
   private List<Integer> remindRespList;
   private String oaid;
   private Date updateDate;

   @JsonProperty("serviceId")
   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   @JsonProperty("serviceId")
   public Long getServiceId() {
      return this.serviceId;
   }

   @JsonProperty("customerExpect")
   public void setCustomerExpect(Integer customerExpect) {
      this.customerExpect = customerExpect;
   }

   @JsonProperty("customerExpect")
   public Integer getCustomerExpect() {
      return this.customerExpect;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
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

   @JsonProperty("orderType")
   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer getOrderType() {
      return this.orderType;
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

   @JsonProperty("customerTel")
   public void setCustomerTel(String customerTel) {
      this.customerTel = customerTel;
   }

   @JsonProperty("customerTel")
   public String getCustomerTel() {
      return this.customerTel;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
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

   @JsonProperty("platformSrc")
   public void setPlatformSrc(Integer platformSrc) {
      this.platformSrc = platformSrc;
   }

   @JsonProperty("platformSrc")
   public Integer getPlatformSrc() {
      return this.platformSrc;
   }

   @JsonProperty("platformSrcName")
   public void setPlatformSrcName(String platformSrcName) {
      this.platformSrcName = platformSrcName;
   }

   @JsonProperty("platformSrcName")
   public String getPlatformSrcName() {
      return this.platformSrcName;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(Date updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public Date getUpdateTime() {
      return this.updateTime;
   }

   @JsonProperty("sysVersion")
   public void setSysVersion(Integer sysVersion) {
      this.sysVersion = sysVersion;
   }

   @JsonProperty("sysVersion")
   public Integer getSysVersion() {
      return this.sysVersion;
   }

   @JsonProperty("expressCode")
   public void setExpressCode(String expressCode) {
      this.expressCode = expressCode;
   }

   @JsonProperty("expressCode")
   public String getExpressCode() {
      return this.expressCode;
   }

   @JsonProperty("freightUpdateDate")
   public void setFreightUpdateDate(Date freightUpdateDate) {
      this.freightUpdateDate = freightUpdateDate;
   }

   @JsonProperty("freightUpdateDate")
   public Date getFreightUpdateDate() {
      return this.freightUpdateDate;
   }

   @JsonProperty("serviceCount")
   public void setServiceCount(Integer serviceCount) {
      this.serviceCount = serviceCount;
   }

   @JsonProperty("serviceCount")
   public Integer getServiceCount() {
      return this.serviceCount;
   }

   @JsonProperty("parentService")
   public void setParentService(Long parentService) {
      this.parentService = parentService;
   }

   @JsonProperty("parentService")
   public Long getParentService() {
      return this.parentService;
   }

   @JsonProperty("applyId")
   public void setApplyId(Long applyId) {
      this.applyId = applyId;
   }

   @JsonProperty("applyId")
   public Long getApplyId() {
      return this.applyId;
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

   @JsonProperty("orderTypeName")
   public void setOrderTypeName(String orderTypeName) {
      this.orderTypeName = orderTypeName;
   }

   @JsonProperty("orderTypeName")
   public String getOrderTypeName() {
      return this.orderTypeName;
   }

   @JsonProperty("actualPayPrice")
   public void setActualPayPrice(BigDecimal actualPayPrice) {
      this.actualPayPrice = actualPayPrice;
   }

   @JsonProperty("actualPayPrice")
   public BigDecimal getActualPayPrice() {
      return this.actualPayPrice;
   }

   @JsonProperty("wareType")
   public void setWareType(Integer wareType) {
      this.wareType = wareType;
   }

   @JsonProperty("wareType")
   public Integer getWareType() {
      return this.wareType;
   }

   @JsonProperty("wareTypeName")
   public void setWareTypeName(String wareTypeName) {
      this.wareTypeName = wareTypeName;
   }

   @JsonProperty("wareTypeName")
   public String getWareTypeName() {
      return this.wareTypeName;
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

   @JsonProperty("skuUuid")
   public void setSkuUuid(String skuUuid) {
      this.skuUuid = skuUuid;
   }

   @JsonProperty("skuUuid")
   public String getSkuUuid() {
      return this.skuUuid;
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

   @JsonProperty("approveTime")
   public void setApproveTime(Date approveTime) {
      this.approveTime = approveTime;
   }

   @JsonProperty("approveTime")
   public Date getApproveTime() {
      return this.approveTime;
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

   @JsonProperty("processTime")
   public void setProcessTime(Date processTime) {
      this.processTime = processTime;
   }

   @JsonProperty("processTime")
   public Date getProcessTime() {
      return this.processTime;
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

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   @JsonProperty("remindRespList")
   public void setRemindRespList(List<Integer> remindRespList) {
      this.remindRespList = remindRespList;
   }

   @JsonProperty("remindRespList")
   public List<Integer> getRemindRespList() {
      return this.remindRespList;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }

   @JsonProperty("updateDate")
   public void setUpdateDate(Date updateDate) {
      this.updateDate = updateDate;
   }

   @JsonProperty("updateDate")
   public Date getUpdateDate() {
      return this.updateDate;
   }
}
