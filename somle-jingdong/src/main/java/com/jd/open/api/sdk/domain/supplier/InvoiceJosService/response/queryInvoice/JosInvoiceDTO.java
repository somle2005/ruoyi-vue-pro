package com.jd.open.api.sdk.domain.supplier.InvoiceJosService.response.queryInvoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class JosInvoiceDTO implements Serializable {
   private String invoiceNo;
   private String invoiceCode;
   private String saveTime;
   private String createTime;
   private BigDecimal amountWithTax;
   private BigDecimal discountAmount;
   private String taxRate;
   private BigDecimal taxAmount;
   private Integer invoiceType;
   private Integer verificationStatus;
   private String verificationTime;

   @JsonProperty("invoiceNo")
   public void setInvoiceNo(String invoiceNo) {
      this.invoiceNo = invoiceNo;
   }

   @JsonProperty("invoiceNo")
   public String getInvoiceNo() {
      return this.invoiceNo;
   }

   @JsonProperty("invoiceCode")
   public void setInvoiceCode(String invoiceCode) {
      this.invoiceCode = invoiceCode;
   }

   @JsonProperty("invoiceCode")
   public String getInvoiceCode() {
      return this.invoiceCode;
   }

   @JsonProperty("saveTime")
   public void setSaveTime(String saveTime) {
      this.saveTime = saveTime;
   }

   @JsonProperty("saveTime")
   public String getSaveTime() {
      return this.saveTime;
   }

   @JsonProperty("createTime")
   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public String getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("amountWithTax")
   public void setAmountWithTax(BigDecimal amountWithTax) {
      this.amountWithTax = amountWithTax;
   }

   @JsonProperty("amountWithTax")
   public BigDecimal getAmountWithTax() {
      return this.amountWithTax;
   }

   @JsonProperty("discountAmount")
   public void setDiscountAmount(BigDecimal discountAmount) {
      this.discountAmount = discountAmount;
   }

   @JsonProperty("discountAmount")
   public BigDecimal getDiscountAmount() {
      return this.discountAmount;
   }

   @JsonProperty("taxRate")
   public void setTaxRate(String taxRate) {
      this.taxRate = taxRate;
   }

   @JsonProperty("taxRate")
   public String getTaxRate() {
      return this.taxRate;
   }

   @JsonProperty("taxAmount")
   public void setTaxAmount(BigDecimal taxAmount) {
      this.taxAmount = taxAmount;
   }

   @JsonProperty("taxAmount")
   public BigDecimal getTaxAmount() {
      return this.taxAmount;
   }

   @JsonProperty("invoiceType")
   public void setInvoiceType(Integer invoiceType) {
      this.invoiceType = invoiceType;
   }

   @JsonProperty("invoiceType")
   public Integer getInvoiceType() {
      return this.invoiceType;
   }

   @JsonProperty("verificationStatus")
   public void setVerificationStatus(Integer verificationStatus) {
      this.verificationStatus = verificationStatus;
   }

   @JsonProperty("verificationStatus")
   public Integer getVerificationStatus() {
      return this.verificationStatus;
   }

   @JsonProperty("verificationTime")
   public void setVerificationTime(String verificationTime) {
      this.verificationTime = verificationTime;
   }

   @JsonProperty("verificationTime")
   public String getVerificationTime() {
      return this.verificationTime;
   }
}
