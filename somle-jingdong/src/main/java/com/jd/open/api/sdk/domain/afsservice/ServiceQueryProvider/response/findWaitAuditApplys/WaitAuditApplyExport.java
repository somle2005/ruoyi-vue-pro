package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.findWaitAuditApplys;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class WaitAuditApplyExport implements Serializable {
   private List<Long[]> serviceIdList;
   private Long[] afsApplyId;
   private String[] customerPin;
   private String[] customerName;
   private Integer[] customerExpect;
   private String[] customerExpectName;
   private String[] afsServiceStatusName;
   private Integer[] afsServiceStatus;
   private Date[] afsApplyTime;
   private Date[] auditOvertime;
   private Long[] orderId;
   private Long[] wareId;
   private String[] wareName;
   private Boolean[] ifTimeoutSoon;
   private BigDecimal[] actualPayPrice;
   private String[] customerMobilePhone;
   private Integer[] customerGrade;
   private String[] pickwareAddress;
   private Integer[] orderType;
   private String[] orderShopId;
   private Integer[] shopAfs;
   private String oaid;

   @JsonProperty("serviceIdList")
   public void setServiceIdList(List<Long[]> serviceIdList) {
      this.serviceIdList = serviceIdList;
   }

   @JsonProperty("serviceIdList")
   public List<Long[]> getServiceIdList() {
      return this.serviceIdList;
   }

   @JsonProperty("afsApplyId")
   public void setAfsApplyId(Long[] afsApplyId) {
      this.afsApplyId = afsApplyId;
   }

   @JsonProperty("afsApplyId")
   public Long[] getAfsApplyId() {
      return this.afsApplyId;
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

   @JsonProperty("customerExpect")
   public void setCustomerExpect(Integer[] customerExpect) {
      this.customerExpect = customerExpect;
   }

   @JsonProperty("customerExpect")
   public Integer[] getCustomerExpect() {
      return this.customerExpect;
   }

   @JsonProperty("customerExpectName")
   public void setCustomerExpectName(String[] customerExpectName) {
      this.customerExpectName = customerExpectName;
   }

   @JsonProperty("customerExpectName")
   public String[] getCustomerExpectName() {
      return this.customerExpectName;
   }

   @JsonProperty("afsServiceStatusName")
   public void setAfsServiceStatusName(String[] afsServiceStatusName) {
      this.afsServiceStatusName = afsServiceStatusName;
   }

   @JsonProperty("afsServiceStatusName")
   public String[] getAfsServiceStatusName() {
      return this.afsServiceStatusName;
   }

   @JsonProperty("afsServiceStatus")
   public void setAfsServiceStatus(Integer[] afsServiceStatus) {
      this.afsServiceStatus = afsServiceStatus;
   }

   @JsonProperty("afsServiceStatus")
   public Integer[] getAfsServiceStatus() {
      return this.afsServiceStatus;
   }

   @JsonProperty("afsApplyTime")
   public void setAfsApplyTime(Date[] afsApplyTime) {
      this.afsApplyTime = afsApplyTime;
   }

   @JsonProperty("afsApplyTime")
   public Date[] getAfsApplyTime() {
      return this.afsApplyTime;
   }

   @JsonProperty("auditOvertime")
   public void setAuditOvertime(Date[] auditOvertime) {
      this.auditOvertime = auditOvertime;
   }

   @JsonProperty("auditOvertime")
   public Date[] getAuditOvertime() {
      return this.auditOvertime;
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

   @JsonProperty("ifTimeoutSoon")
   public void setIfTimeoutSoon(Boolean[] ifTimeoutSoon) {
      this.ifTimeoutSoon = ifTimeoutSoon;
   }

   @JsonProperty("ifTimeoutSoon")
   public Boolean[] getIfTimeoutSoon() {
      return this.ifTimeoutSoon;
   }

   @JsonProperty("actualPayPrice")
   public void setActualPayPrice(BigDecimal[] actualPayPrice) {
      this.actualPayPrice = actualPayPrice;
   }

   @JsonProperty("actualPayPrice")
   public BigDecimal[] getActualPayPrice() {
      return this.actualPayPrice;
   }

   @JsonProperty("customerMobilePhone")
   public void setCustomerMobilePhone(String[] customerMobilePhone) {
      this.customerMobilePhone = customerMobilePhone;
   }

   @JsonProperty("customerMobilePhone")
   public String[] getCustomerMobilePhone() {
      return this.customerMobilePhone;
   }

   @JsonProperty("customerGrade")
   public void setCustomerGrade(Integer[] customerGrade) {
      this.customerGrade = customerGrade;
   }

   @JsonProperty("customerGrade")
   public Integer[] getCustomerGrade() {
      return this.customerGrade;
   }

   @JsonProperty("pickwareAddress")
   public void setPickwareAddress(String[] pickwareAddress) {
      this.pickwareAddress = pickwareAddress;
   }

   @JsonProperty("pickwareAddress")
   public String[] getPickwareAddress() {
      return this.pickwareAddress;
   }

   @JsonProperty("orderType")
   public void setOrderType(Integer[] orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public Integer[] getOrderType() {
      return this.orderType;
   }

   @JsonProperty("orderShopId")
   public void setOrderShopId(String[] orderShopId) {
      this.orderShopId = orderShopId;
   }

   @JsonProperty("orderShopId")
   public String[] getOrderShopId() {
      return this.orderShopId;
   }

   @JsonProperty("shopAfs")
   public void setShopAfs(Integer[] shopAfs) {
      this.shopAfs = shopAfs;
   }

   @JsonProperty("shopAfs")
   public Integer[] getShopAfs() {
      return this.shopAfs;
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
