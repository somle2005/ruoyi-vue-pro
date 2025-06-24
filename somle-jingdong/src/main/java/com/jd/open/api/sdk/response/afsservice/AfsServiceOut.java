package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class AfsServiceOut implements Serializable {
   private Long afsServiceId;
   private Integer afsCategoryId;
   private Long afsApplyId;
   private Long orderId;
   private String orderRemark;
   private Integer wareId;
   private String wareName;
   private Integer pickwareProvince;
   private Integer pickwareCity;
   private Integer pickwareCounty;
   private Integer pickwareVillage;
   private String pickwareAddress;
   private Integer returnwareProvince;
   private Integer returnwareCity;
   private Integer returnwareCounty;
   private Integer returnwareVillage;
   private String returnwareAddress;
   private Integer customerExpect;
   private String questionDesc;
   private String customerName;
   private String customerMobilePhone;
   private String customerEmail;
   private String approveName;
   private Date afsApplyTime;
   private Date approvedDate;
   private Date processedDate;
   private Date receiveDate;
   private String createName;
   private Date createDate;
   private String oaid;
   private String desenCustomerMobilePhone;

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   @JsonProperty("afsCategoryId")
   public void setAfsCategoryId(Integer afsCategoryId) {
      this.afsCategoryId = afsCategoryId;
   }

   @JsonProperty("afsCategoryId")
   public Integer getAfsCategoryId() {
      return this.afsCategoryId;
   }

   @JsonProperty("afsApplyId")
   public void setAfsApplyId(Long afsApplyId) {
      this.afsApplyId = afsApplyId;
   }

   @JsonProperty("afsApplyId")
   public Long getAfsApplyId() {
      return this.afsApplyId;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("orderRemark")
   public void setOrderRemark(String orderRemark) {
      this.orderRemark = orderRemark;
   }

   @JsonProperty("orderRemark")
   public String getOrderRemark() {
      return this.orderRemark;
   }

   @JsonProperty("wareId")
   public void setWareId(Integer wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Integer getWareId() {
      return this.wareId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("pickwareProvince")
   public void setPickwareProvince(Integer pickwareProvince) {
      this.pickwareProvince = pickwareProvince;
   }

   @JsonProperty("pickwareProvince")
   public Integer getPickwareProvince() {
      return this.pickwareProvince;
   }

   @JsonProperty("pickwareCity")
   public void setPickwareCity(Integer pickwareCity) {
      this.pickwareCity = pickwareCity;
   }

   @JsonProperty("pickwareCity")
   public Integer getPickwareCity() {
      return this.pickwareCity;
   }

   @JsonProperty("pickwareCounty")
   public void setPickwareCounty(Integer pickwareCounty) {
      this.pickwareCounty = pickwareCounty;
   }

   @JsonProperty("pickwareCounty")
   public Integer getPickwareCounty() {
      return this.pickwareCounty;
   }

   @JsonProperty("pickwareVillage")
   public void setPickwareVillage(Integer pickwareVillage) {
      this.pickwareVillage = pickwareVillage;
   }

   @JsonProperty("pickwareVillage")
   public Integer getPickwareVillage() {
      return this.pickwareVillage;
   }

   @JsonProperty("pickwareAddress")
   public void setPickwareAddress(String pickwareAddress) {
      this.pickwareAddress = pickwareAddress;
   }

   @JsonProperty("pickwareAddress")
   public String getPickwareAddress() {
      return this.pickwareAddress;
   }

   @JsonProperty("returnwareProvince")
   public void setReturnwareProvince(Integer returnwareProvince) {
      this.returnwareProvince = returnwareProvince;
   }

   @JsonProperty("returnwareProvince")
   public Integer getReturnwareProvince() {
      return this.returnwareProvince;
   }

   @JsonProperty("returnwareCity")
   public void setReturnwareCity(Integer returnwareCity) {
      this.returnwareCity = returnwareCity;
   }

   @JsonProperty("returnwareCity")
   public Integer getReturnwareCity() {
      return this.returnwareCity;
   }

   @JsonProperty("returnwareCounty")
   public void setReturnwareCounty(Integer returnwareCounty) {
      this.returnwareCounty = returnwareCounty;
   }

   @JsonProperty("returnwareCounty")
   public Integer getReturnwareCounty() {
      return this.returnwareCounty;
   }

   @JsonProperty("returnwareVillage")
   public void setReturnwareVillage(Integer returnwareVillage) {
      this.returnwareVillage = returnwareVillage;
   }

   @JsonProperty("returnwareVillage")
   public Integer getReturnwareVillage() {
      return this.returnwareVillage;
   }

   @JsonProperty("returnwareAddress")
   public void setReturnwareAddress(String returnwareAddress) {
      this.returnwareAddress = returnwareAddress;
   }

   @JsonProperty("returnwareAddress")
   public String getReturnwareAddress() {
      return this.returnwareAddress;
   }

   @JsonProperty("customerExpect")
   public void setCustomerExpect(Integer customerExpect) {
      this.customerExpect = customerExpect;
   }

   @JsonProperty("customerExpect")
   public Integer getCustomerExpect() {
      return this.customerExpect;
   }

   @JsonProperty("questionDesc")
   public void setQuestionDesc(String questionDesc) {
      this.questionDesc = questionDesc;
   }

   @JsonProperty("questionDesc")
   public String getQuestionDesc() {
      return this.questionDesc;
   }

   @JsonProperty("customerName")
   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   @JsonProperty("customerName")
   public String getCustomerName() {
      return this.customerName;
   }

   @JsonProperty("customerMobilePhone")
   public void setCustomerMobilePhone(String customerMobilePhone) {
      this.customerMobilePhone = customerMobilePhone;
   }

   @JsonProperty("customerMobilePhone")
   public String getCustomerMobilePhone() {
      return this.customerMobilePhone;
   }

   @JsonProperty("customerEmail")
   public void setCustomerEmail(String customerEmail) {
      this.customerEmail = customerEmail;
   }

   @JsonProperty("customerEmail")
   public String getCustomerEmail() {
      return this.customerEmail;
   }

   @JsonProperty("approveName")
   public void setApproveName(String approveName) {
      this.approveName = approveName;
   }

   @JsonProperty("approveName")
   public String getApproveName() {
      return this.approveName;
   }

   @JsonProperty("afsApplyTime")
   public void setAfsApplyTime(Date afsApplyTime) {
      this.afsApplyTime = afsApplyTime;
   }

   @JsonProperty("afsApplyTime")
   public Date getAfsApplyTime() {
      return this.afsApplyTime;
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

   @JsonProperty("createName")
   public void setCreateName(String createName) {
      this.createName = createName;
   }

   @JsonProperty("createName")
   public String getCreateName() {
      return this.createName;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
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
