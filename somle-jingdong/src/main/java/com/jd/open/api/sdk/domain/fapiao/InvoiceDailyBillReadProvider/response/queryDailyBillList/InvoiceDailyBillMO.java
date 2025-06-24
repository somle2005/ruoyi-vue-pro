package com.jd.open.api.sdk.domain.fapiao.InvoiceDailyBillReadProvider.response.queryDailyBillList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InvoiceDailyBillMO implements Serializable {
   private Long id;
   private String settleEntityId;
   private Long accountId;
   private String companyName;
   private BigDecimal invoiceAmount;
   private BigDecimal receiveAmount;
   private BigDecimal payableAmount;
   private BigDecimal settleAmount;
   private Integer invoiceDirection;
   private Long applyId;
   private String invoiceOrgName;
   private Date billDate;
   private String remark;
   private Date created;
   private Date modified;
   private Long companyId;
   private String invoiceOrg;
   private Integer status;
   private String encryptAccountId;
   private String encryptInvoiceDirection;
   private String encryptApplyId;
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

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("invoiceAmount")
   public void setInvoiceAmount(BigDecimal invoiceAmount) {
      this.invoiceAmount = invoiceAmount;
   }

   @JsonProperty("invoiceAmount")
   public BigDecimal getInvoiceAmount() {
      return this.invoiceAmount;
   }

   @JsonProperty("receiveAmount")
   public void setReceiveAmount(BigDecimal receiveAmount) {
      this.receiveAmount = receiveAmount;
   }

   @JsonProperty("receiveAmount")
   public BigDecimal getReceiveAmount() {
      return this.receiveAmount;
   }

   @JsonProperty("payableAmount")
   public void setPayableAmount(BigDecimal payableAmount) {
      this.payableAmount = payableAmount;
   }

   @JsonProperty("payableAmount")
   public BigDecimal getPayableAmount() {
      return this.payableAmount;
   }

   @JsonProperty("settleAmount")
   public void setSettleAmount(BigDecimal settleAmount) {
      this.settleAmount = settleAmount;
   }

   @JsonProperty("settleAmount")
   public BigDecimal getSettleAmount() {
      return this.settleAmount;
   }

   @JsonProperty("invoiceDirection")
   public void setInvoiceDirection(Integer invoiceDirection) {
      this.invoiceDirection = invoiceDirection;
   }

   @JsonProperty("invoiceDirection")
   public Integer getInvoiceDirection() {
      return this.invoiceDirection;
   }

   @JsonProperty("applyId")
   public void setApplyId(Long applyId) {
      this.applyId = applyId;
   }

   @JsonProperty("applyId")
   public Long getApplyId() {
      return this.applyId;
   }

   @JsonProperty("invoiceOrgName")
   public void setInvoiceOrgName(String invoiceOrgName) {
      this.invoiceOrgName = invoiceOrgName;
   }

   @JsonProperty("invoiceOrgName")
   public String getInvoiceOrgName() {
      return this.invoiceOrgName;
   }

   @JsonProperty("billDate")
   public void setBillDate(Date billDate) {
      this.billDate = billDate;
   }

   @JsonProperty("billDate")
   public Date getBillDate() {
      return this.billDate;
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

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("encrypt_accountId")
   public void setEncryptAccountId(String encryptAccountId) {
      this.encryptAccountId = encryptAccountId;
   }

   @JsonProperty("encrypt_accountId")
   public String getEncryptAccountId() {
      return this.encryptAccountId;
   }

   @JsonProperty("encrypt_invoiceDirection")
   public void setEncryptInvoiceDirection(String encryptInvoiceDirection) {
      this.encryptInvoiceDirection = encryptInvoiceDirection;
   }

   @JsonProperty("encrypt_invoiceDirection")
   public String getEncryptInvoiceDirection() {
      return this.encryptInvoiceDirection;
   }

   @JsonProperty("encrypt_applyId")
   public void setEncryptApplyId(String encryptApplyId) {
      this.encryptApplyId = encryptApplyId;
   }

   @JsonProperty("encrypt_applyId")
   public String getEncryptApplyId() {
      return this.encryptApplyId;
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
