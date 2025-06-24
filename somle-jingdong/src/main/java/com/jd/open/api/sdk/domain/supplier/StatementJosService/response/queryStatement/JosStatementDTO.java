package com.jd.open.api.sdk.domain.supplier.StatementJosService.response.queryStatement;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class JosStatementDTO implements Serializable {
   private String vendorCode;
   private String vendorName;
   private String billNo;
   private String billTime;
   private BigDecimal finalAmount;
   private Integer auditStatus;
   private Integer verifyStatus;
   private Integer payStatus;

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

   @JsonProperty("billNo")
   public void setBillNo(String billNo) {
      this.billNo = billNo;
   }

   @JsonProperty("billNo")
   public String getBillNo() {
      return this.billNo;
   }

   @JsonProperty("billTime")
   public void setBillTime(String billTime) {
      this.billTime = billTime;
   }

   @JsonProperty("billTime")
   public String getBillTime() {
      return this.billTime;
   }

   @JsonProperty("finalAmount")
   public void setFinalAmount(BigDecimal finalAmount) {
      this.finalAmount = finalAmount;
   }

   @JsonProperty("finalAmount")
   public BigDecimal getFinalAmount() {
      return this.finalAmount;
   }

   @JsonProperty("auditStatus")
   public void setAuditStatus(Integer auditStatus) {
      this.auditStatus = auditStatus;
   }

   @JsonProperty("auditStatus")
   public Integer getAuditStatus() {
      return this.auditStatus;
   }

   @JsonProperty("verifyStatus")
   public void setVerifyStatus(Integer verifyStatus) {
      this.verifyStatus = verifyStatus;
   }

   @JsonProperty("verifyStatus")
   public Integer getVerifyStatus() {
      return this.verifyStatus;
   }

   @JsonProperty("payStatus")
   public void setPayStatus(Integer payStatus) {
      this.payStatus = payStatus;
   }

   @JsonProperty("payStatus")
   public Integer getPayStatus() {
      return this.payStatus;
   }
}
