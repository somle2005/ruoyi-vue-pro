package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class WaitProcessResult implements Serializable {
   private Long serviceId;
   private Integer customerExpect;
   private String customerExpectName;
   private Date applyTime;
   private Integer serviceStatus;
   private String serviceStatusName;
   private String pickwareAddress;
   private Long orderId;
   private Integer orderType;
   private String orderTypeName;
   private Long skuId;
   private String wareName;
   private Integer wareType;
   private String wareTypeName;
   private Integer skuType;
   private String skuTypeName;
   private String customerPin;
   private String customerName;
   private String customerMobile;
   private Integer customerGrade;
   private Date approveTime;
   private Date deliveryDate;
   private Date remindDate;
   private Integer remindNum;
   private Integer remindType;
   private String remindTypeName;
   private String extJsonStr;
   private Integer serviceCount;
   private String oaid;

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

   @JsonProperty("approveTime")
   public void setApproveTime(Date approveTime) {
      this.approveTime = approveTime;
   }

   @JsonProperty("approveTime")
   public Date getApproveTime() {
      return this.approveTime;
   }

   @JsonProperty("deliveryDate")
   public void setDeliveryDate(Date deliveryDate) {
      this.deliveryDate = deliveryDate;
   }

   @JsonProperty("deliveryDate")
   public Date getDeliveryDate() {
      return this.deliveryDate;
   }

   @JsonProperty("remindDate")
   public void setRemindDate(Date remindDate) {
      this.remindDate = remindDate;
   }

   @JsonProperty("remindDate")
   public Date getRemindDate() {
      return this.remindDate;
   }

   @JsonProperty("remindNum")
   public void setRemindNum(Integer remindNum) {
      this.remindNum = remindNum;
   }

   @JsonProperty("remindNum")
   public Integer getRemindNum() {
      return this.remindNum;
   }

   @JsonProperty("remindType")
   public void setRemindType(Integer remindType) {
      this.remindType = remindType;
   }

   @JsonProperty("remindType")
   public Integer getRemindType() {
      return this.remindType;
   }

   @JsonProperty("remindTypeName")
   public void setRemindTypeName(String remindTypeName) {
      this.remindTypeName = remindTypeName;
   }

   @JsonProperty("remindTypeName")
   public String getRemindTypeName() {
      return this.remindTypeName;
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
