package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.response.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class UnitPromoRebateInfo implements Serializable {
   private Integer invoiceParty;
   private BigDecimal supportAmount;
   private String supplierCode;
   private String orgId;
   private String erpCode;
   private Integer excludeSaleBack;
   private String currency;
   private Integer settleCount;
   private String settleBody;
   private Integer calBase;

   @JsonProperty("invoiceParty")
   public void setInvoiceParty(Integer invoiceParty) {
      this.invoiceParty = invoiceParty;
   }

   @JsonProperty("invoiceParty")
   public Integer getInvoiceParty() {
      return this.invoiceParty;
   }

   @JsonProperty("supportAmount")
   public void setSupportAmount(BigDecimal supportAmount) {
      this.supportAmount = supportAmount;
   }

   @JsonProperty("supportAmount")
   public BigDecimal getSupportAmount() {
      return this.supportAmount;
   }

   @JsonProperty("supplierCode")
   public void setSupplierCode(String supplierCode) {
      this.supplierCode = supplierCode;
   }

   @JsonProperty("supplierCode")
   public String getSupplierCode() {
      return this.supplierCode;
   }

   @JsonProperty("orgId")
   public void setOrgId(String orgId) {
      this.orgId = orgId;
   }

   @JsonProperty("orgId")
   public String getOrgId() {
      return this.orgId;
   }

   @JsonProperty("erpCode")
   public void setErpCode(String erpCode) {
      this.erpCode = erpCode;
   }

   @JsonProperty("erpCode")
   public String getErpCode() {
      return this.erpCode;
   }

   @JsonProperty("excludeSaleBack")
   public void setExcludeSaleBack(Integer excludeSaleBack) {
      this.excludeSaleBack = excludeSaleBack;
   }

   @JsonProperty("excludeSaleBack")
   public Integer getExcludeSaleBack() {
      return this.excludeSaleBack;
   }

   @JsonProperty("currency")
   public void setCurrency(String currency) {
      this.currency = currency;
   }

   @JsonProperty("currency")
   public String getCurrency() {
      return this.currency;
   }

   @JsonProperty("settleCount")
   public void setSettleCount(Integer settleCount) {
      this.settleCount = settleCount;
   }

   @JsonProperty("settleCount")
   public Integer getSettleCount() {
      return this.settleCount;
   }

   @JsonProperty("settleBody")
   public void setSettleBody(String settleBody) {
      this.settleBody = settleBody;
   }

   @JsonProperty("settleBody")
   public String getSettleBody() {
      return this.settleBody;
   }

   @JsonProperty("calBase")
   public void setCalBase(Integer calBase) {
      this.calBase = calBase;
   }

   @JsonProperty("calBase")
   public Integer getCalBase() {
      return this.calBase;
   }
}
