package com.jd.open.api.sdk.domain.fapiao.InvoiceApplyBillReadProvider.response.getInvoiceApplyBillByVenderIdAndApplyId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InvoiceApplyBillMO implements Serializable {
   private Long id;
   private String settleEntityId;
   private Long accountId;
   private String shopName;
   private String companyName;
   private String pin;
   private BigDecimal totalAmount;
   private BigDecimal settleAmount;
   private String currency;
   private Integer invoiceDirection;
   private String orgName;
   private String excelUrl;
   private Integer status;
   private Date beginDate;
   private Date endDate;
   private Integer dailyNum;
   private Date invoiceFinishTime;
   private String remark;
   private Date created;
   private Date modified;
   private String rfBillType;
   private String rejectReason;
   private Integer shopId;
   private Long companyId;
   private String invoiceOrg;
   private String encryptId;
   private String encryptAccountId;
   private String encryptShopId;
   private String encryptCompanyId;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("settleEntityId")
   public void setSettleEntityId(String settleEntityId) {
      this.settleEntityId = settleEntityId;
   }

   @JsonProperty("settleEntityId")
   public String getSettleEntityId() {
      return this.settleEntityId;
   }

   @JsonProperty("accountId")
   public void setAccountId(Long accountId) {
      this.accountId = accountId;
   }

   @JsonProperty("accountId")
   public Long getAccountId() {
      return this.accountId;
   }

   @JsonProperty("shopName")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shopName")
   public String getShopName() {
      return this.shopName;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("pin")
   public void setPin(String pin) {
      this.pin = pin;
   }

   @JsonProperty("pin")
   public String getPin() {
      return this.pin;
   }

   @JsonProperty("totalAmount")
   public void setTotalAmount(BigDecimal totalAmount) {
      this.totalAmount = totalAmount;
   }

   @JsonProperty("totalAmount")
   public BigDecimal getTotalAmount() {
      return this.totalAmount;
   }

   @JsonProperty("settleAmount")
   public void setSettleAmount(BigDecimal settleAmount) {
      this.settleAmount = settleAmount;
   }

   @JsonProperty("settleAmount")
   public BigDecimal getSettleAmount() {
      return this.settleAmount;
   }

   @JsonProperty("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @JsonProperty("currency")
   public String getCurrency() {
      return this.currency;
   }

   @JsonProperty("invoiceDirection")
   public void setInvoiceDirection(Integer invoiceDirection) {
      this.invoiceDirection = invoiceDirection;
   }

   @JsonProperty("invoiceDirection")
   public Integer getInvoiceDirection() {
      return this.invoiceDirection;
   }

   @JsonProperty("orgName")
   public void setOrgName(String orgName) {
      this.orgName = orgName;
   }

   @JsonProperty("orgName")
   public String getOrgName() {
      return this.orgName;
   }

   @JsonProperty("excelUrl")
   public void setExcelUrl(String excelUrl) {
      this.excelUrl = excelUrl;
   }

   @JsonProperty("excelUrl")
   public String getExcelUrl() {
      return this.excelUrl;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("beginDate")
   public void setBeginDate(Date beginDate) {
      this.beginDate = beginDate;
   }

   @JsonProperty("beginDate")
   public Date getBeginDate() {
      return this.beginDate;
   }

   @JsonProperty("endDate")
   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   @JsonProperty("endDate")
   public Date getEndDate() {
      return this.endDate;
   }

   @JsonProperty("dailyNum")
   public void setDailyNum(Integer dailyNum) {
      this.dailyNum = dailyNum;
   }

   @JsonProperty("dailyNum")
   public Integer getDailyNum() {
      return this.dailyNum;
   }

   @JsonProperty("invoiceFinishTime")
   public void setInvoiceFinishTime(Date invoiceFinishTime) {
      this.invoiceFinishTime = invoiceFinishTime;
   }

   @JsonProperty("invoiceFinishTime")
   public Date getInvoiceFinishTime() {
      return this.invoiceFinishTime;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("rfBillType")
   public void setRfBillType(String rfBillType) {
      this.rfBillType = rfBillType;
   }

   @JsonProperty("rfBillType")
   public String getRfBillType() {
      return this.rfBillType;
   }

   @JsonProperty("rejectReason")
   public void setRejectReason(String rejectReason) {
      this.rejectReason = rejectReason;
   }

   @JsonProperty("rejectReason")
   public String getRejectReason() {
      return this.rejectReason;
   }

   @JsonProperty("shopId")
   public void setShopId(Integer shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public Integer getShopId() {
      return this.shopId;
   }

   @JsonProperty("companyId")
   public void setCompanyId(Long companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Long getCompanyId() {
      return this.companyId;
   }

   @JsonProperty("invoiceOrg")
   public void setInvoiceOrg(String invoiceOrg) {
      this.invoiceOrg = invoiceOrg;
   }

   @JsonProperty("invoiceOrg")
   public String getInvoiceOrg() {
      return this.invoiceOrg;
   }

   @JsonProperty("encrypt_id")
   public void setEncryptId(String encryptId) {
      this.encryptId = encryptId;
   }

   @JsonProperty("encrypt_id")
   public String getEncryptId() {
      return this.encryptId;
   }

   @JsonProperty("encrypt_accountId")
   public void setEncryptAccountId(String encryptAccountId) {
      this.encryptAccountId = encryptAccountId;
   }

   @JsonProperty("encrypt_accountId")
   public String getEncryptAccountId() {
      return this.encryptAccountId;
   }

   @JsonProperty("encrypt_shopId")
   public void setEncryptShopId(String encryptShopId) {
      this.encryptShopId = encryptShopId;
   }

   @JsonProperty("encrypt_shopId")
   public String getEncryptShopId() {
      return this.encryptShopId;
   }

   @JsonProperty("encrypt_companyId")
   public void setEncryptCompanyId(String encryptCompanyId) {
      this.encryptCompanyId = encryptCompanyId;
   }

   @JsonProperty("encrypt_companyId")
   public String getEncryptCompanyId() {
      return this.encryptCompanyId;
   }
}
