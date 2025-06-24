package com.jd.open.api.sdk.domain.supplier.AccountReconciliationJosService.response.getAccountReconciliation;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class JosArResultDetailDTO implements Serializable {
   private String vendorCode;
   private String vendorName;
   private String payableAccountId;
   private String billType;
   private String billNo;
   private String poNo;
   private String relatedPoNo;
   private BigDecimal amount;
   private Date billDate;
   private Date spCreateTime;
   private String purchaserName;
   private String salerName;
   private String dept;
   private String groupName;
   private Date accountPeriodDate;
   private String createUser;
   private Date createTime;
   private String updateUser;
   private Date updateTime;
   private Integer status;
   private String spareCode;

   @JsonProperty("vendorCode")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("vendorName")
   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   @JsonProperty("vendorName")
   public String getVendorName() {
      return this.vendorName;
   }

   @JsonProperty("payableAccountId")
   public void setPayableAccountId(String payableAccountId) {
      this.payableAccountId = payableAccountId;
   }

   @JsonProperty("payableAccountId")
   public String getPayableAccountId() {
      return this.payableAccountId;
   }

   @JsonProperty("billType")
   public void setBillType(String billType) {
      this.billType = billType;
   }

   @JsonProperty("billType")
   public String getBillType() {
      return this.billType;
   }

   @JsonProperty("billNo")
   public void setBillNo(String billNo) {
      this.billNo = billNo;
   }

   @JsonProperty("billNo")
   public String getBillNo() {
      return this.billNo;
   }

   @JsonProperty("poNo")
   public void setPoNo(String poNo) {
      this.poNo = poNo;
   }

   @JsonProperty("poNo")
   public String getPoNo() {
      return this.poNo;
   }

   @JsonProperty("relatedPoNo")
   public void setRelatedPoNo(String relatedPoNo) {
      this.relatedPoNo = relatedPoNo;
   }

   @JsonProperty("relatedPoNo")
   public String getRelatedPoNo() {
      return this.relatedPoNo;
   }

   @JsonProperty("amount")
   public void setAmount(BigDecimal amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public BigDecimal getAmount() {
      return this.amount;
   }

   @JsonProperty("billDate")
   public void setBillDate(Date billDate) {
      this.billDate = billDate;
   }

   @JsonProperty("billDate")
   public Date getBillDate() {
      return this.billDate;
   }

   @JsonProperty("spCreateTime")
   public void setSpCreateTime(Date spCreateTime) {
      this.spCreateTime = spCreateTime;
   }

   @JsonProperty("spCreateTime")
   public Date getSpCreateTime() {
      return this.spCreateTime;
   }

   @JsonProperty("purchaserName")
   public void setPurchaserName(String purchaserName) {
      this.purchaserName = purchaserName;
   }

   @JsonProperty("purchaserName")
   public String getPurchaserName() {
      return this.purchaserName;
   }

   @JsonProperty("salerName")
   public void setSalerName(String salerName) {
      this.salerName = salerName;
   }

   @JsonProperty("salerName")
   public String getSalerName() {
      return this.salerName;
   }

   @JsonProperty("dept")
   public void setDept(String dept) {
      this.dept = dept;
   }

   @JsonProperty("dept")
   public String getDept() {
      return this.dept;
   }

   @JsonProperty("groupName")
   public void setGroupName(String groupName) {
      this.groupName = groupName;
   }

   @JsonProperty("groupName")
   public String getGroupName() {
      return this.groupName;
   }

   @JsonProperty("accountPeriodDate")
   public void setAccountPeriodDate(Date accountPeriodDate) {
      this.accountPeriodDate = accountPeriodDate;
   }

   @JsonProperty("accountPeriodDate")
   public Date getAccountPeriodDate() {
      return this.accountPeriodDate;
   }

   @JsonProperty("createUser")
   public void setCreateUser(String createUser) {
      this.createUser = createUser;
   }

   @JsonProperty("createUser")
   public String getCreateUser() {
      return this.createUser;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("updateUser")
   public void setUpdateUser(String updateUser) {
      this.updateUser = updateUser;
   }

   @JsonProperty("updateUser")
   public String getUpdateUser() {
      return this.updateUser;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(Date updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public Date getUpdateTime() {
      return this.updateTime;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("spareCode")
   public void setSpareCode(String spareCode) {
      this.spareCode = spareCode;
   }

   @JsonProperty("spareCode")
   public String getSpareCode() {
      return this.spareCode;
   }
}
