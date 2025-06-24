package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryFeeAccountWithPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FeeAccountResult implements Serializable {
   private String[] deptNo;
   private String[] accountNo;
   private int[] incomePayoutFlag;
   private int[] settlementTarget;
   private String[] settlementPerson;
   private String[] settlementPersonName;
   private Date[] accountDay;
   private BigDecimal[] amount;
   private int[] status;
   private int[] totalRecord;

   @JsonProperty("deptNo")
   public void setDeptNo(String[] deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String[] getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("accountNo")
   public void setAccountNo(String[] accountNo) {
      this.accountNo = accountNo;
   }

   @JsonProperty("accountNo")
   public String[] getAccountNo() {
      return this.accountNo;
   }

   @JsonProperty("incomePayoutFlag")
   public void setIncomePayoutFlag(int[] incomePayoutFlag) {
      this.incomePayoutFlag = incomePayoutFlag;
   }

   @JsonProperty("incomePayoutFlag")
   public int[] getIncomePayoutFlag() {
      return this.incomePayoutFlag;
   }

   @JsonProperty("settlementTarget")
   public void setSettlementTarget(int[] settlementTarget) {
      this.settlementTarget = settlementTarget;
   }

   @JsonProperty("settlementTarget")
   public int[] getSettlementTarget() {
      return this.settlementTarget;
   }

   @JsonProperty("settlementPerson")
   public void setSettlementPerson(String[] settlementPerson) {
      this.settlementPerson = settlementPerson;
   }

   @JsonProperty("settlementPerson")
   public String[] getSettlementPerson() {
      return this.settlementPerson;
   }

   @JsonProperty("settlementPersonName")
   public void setSettlementPersonName(String[] settlementPersonName) {
      this.settlementPersonName = settlementPersonName;
   }

   @JsonProperty("settlementPersonName")
   public String[] getSettlementPersonName() {
      return this.settlementPersonName;
   }

   @JsonProperty("accountDay")
   public void setAccountDay(Date[] accountDay) {
      this.accountDay = accountDay;
   }

   @JsonProperty("accountDay")
   public Date[] getAccountDay() {
      return this.accountDay;
   }

   @JsonProperty("amount")
   public void setAmount(BigDecimal[] amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public BigDecimal[] getAmount() {
      return this.amount;
   }

   @JsonProperty("status")
   public void setStatus(int[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int[] getStatus() {
      return this.status;
   }

   @JsonProperty("totalRecord")
   public void setTotalRecord(int[] totalRecord) {
      this.totalRecord = totalRecord;
   }

   @JsonProperty("totalRecord")
   public int[] getTotalRecord() {
      return this.totalRecord;
   }
}
