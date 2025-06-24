package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class TempComplete implements Serializable {
   private Long serviceId;
   private Date applyTime;
   private Integer serviceStatus;
   private String serviceStatusName;
   private Long orderId;
   private Long skuId;
   private String wareName;
   private Integer wareType;
   private String wareTypeName;
   private Integer skuType;
   private String skuTypeName;
   private String customerPin;
   private String customerName;
   private Integer customerGrade;
   private String customerMobile;
   private String pickwareAddress;
   private Integer processResult;
   private String processResultName;
   private Date processDate;
   private String processPin;
   private Date approveDate;
   private String approvePin;
   private Integer approveReasonCid1;
   private String approveReasonCid1Name;
   private Integer approveReasonCid2;
   private String approveReasonCid2Name;
   private String extJsonStr;
   private Integer serviceCount;
   private String oaid;
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

   @JsonProperty("customerGrade")
   public void setCustomerGrade(Integer customerGrade) {
      this.customerGrade = customerGrade;
   }

   @JsonProperty("customerGrade")
   public Integer getCustomerGrade() {
      return this.customerGrade;
   }

   @JsonProperty("customerMobile")
   public void setCustomerMobile(String customerMobile) {
      this.customerMobile = customerMobile;
   }

   @JsonProperty("customerMobile")
   public String getCustomerMobile() {
      return this.customerMobile;
   }

   @JsonProperty("pickwareAddress")
   public void setPickwareAddress(String pickwareAddress) {
      this.pickwareAddress = pickwareAddress;
   }

   @JsonProperty("pickwareAddress")
   public String getPickwareAddress() {
      return this.pickwareAddress;
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

   @JsonProperty("processDate")
   public void setProcessDate(Date processDate) {
      this.processDate = processDate;
   }

   @JsonProperty("processDate")
   public Date getProcessDate() {
      return this.processDate;
   }

   @JsonProperty("processPin")
   public void setProcessPin(String processPin) {
      this.processPin = processPin;
   }

   @JsonProperty("processPin")
   public String getProcessPin() {
      return this.processPin;
   }

   @JsonProperty("approveDate")
   public void setApproveDate(Date approveDate) {
      this.approveDate = approveDate;
   }

   @JsonProperty("approveDate")
   public Date getApproveDate() {
      return this.approveDate;
   }

   @JsonProperty("approvePin")
   public void setApprovePin(String approvePin) {
      this.approvePin = approvePin;
   }

   @JsonProperty("approvePin")
   public String getApprovePin() {
      return this.approvePin;
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
