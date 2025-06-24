package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryFeeDetailWithPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class FeeDetailResult implements Serializable {
   private String[] deptNo;
   private Date[] feeDay;
   private String[] jobNo;
   private int[] incomePayoutFlag;
   private int[] settlementTarget;
   private String[] settlementPerson;
   private String[] settlementPersonName;
   private Integer[] businessType;
   private String[] billType;
   private String[] billTypeName;
   private String[] accountNo;
   private int[] status;
   private int[] feeType;
   private String[] subjectNo;
   private String[] subjectName;
   private int[] feeMode;
   private BigDecimal[] amount;
   private BigDecimal[] feeQty;
   private String[] createUser;
   private Date[] createTime;
   private int[] totalRecord;

   @JsonProperty("deptNo")
   public void setDeptNo(String[] deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String[] getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("feeDay")
   public void setFeeDay(Date[] feeDay) {
      this.feeDay = feeDay;
   }

   @JsonProperty("feeDay")
   public Date[] getFeeDay() {
      return this.feeDay;
   }

   @JsonProperty("jobNo")
   public void setJobNo(String[] jobNo) {
      this.jobNo = jobNo;
   }

   @JsonProperty("jobNo")
   public String[] getJobNo() {
      return this.jobNo;
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

   @JsonProperty("businessType")
   public void setBusinessType(Integer[] businessType) {
      this.businessType = businessType;
   }

   @JsonProperty("businessType")
   public Integer[] getBusinessType() {
      return this.businessType;
   }

   @JsonProperty("billType")
   public void setBillType(String[] billType) {
      this.billType = billType;
   }

   @JsonProperty("billType")
   public String[] getBillType() {
      return this.billType;
   }

   @JsonProperty("billTypeName")
   public void setBillTypeName(String[] billTypeName) {
      this.billTypeName = billTypeName;
   }

   @JsonProperty("billTypeName")
   public String[] getBillTypeName() {
      return this.billTypeName;
   }

   @JsonProperty("accountNo")
   public void setAccountNo(String[] accountNo) {
      this.accountNo = accountNo;
   }

   @JsonProperty("accountNo")
   public String[] getAccountNo() {
      return this.accountNo;
   }

   @JsonProperty("status")
   public void setStatus(int[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int[] getStatus() {
      return this.status;
   }

   @JsonProperty("feeType")
   public void setFeeType(int[] feeType) {
      this.feeType = feeType;
   }

   @JsonProperty("feeType")
   public int[] getFeeType() {
      return this.feeType;
   }

   @JsonProperty("subjectNo")
   public void setSubjectNo(String[] subjectNo) {
      this.subjectNo = subjectNo;
   }

   @JsonProperty("subjectNo")
   public String[] getSubjectNo() {
      return this.subjectNo;
   }

   @JsonProperty("subjectName")
   public void setSubjectName(String[] subjectName) {
      this.subjectName = subjectName;
   }

   @JsonProperty("subjectName")
   public String[] getSubjectName() {
      return this.subjectName;
   }

   @JsonProperty("feeMode")
   public void setFeeMode(int[] feeMode) {
      this.feeMode = feeMode;
   }

   @JsonProperty("feeMode")
   public int[] getFeeMode() {
      return this.feeMode;
   }

   @JsonProperty("amount")
   public void setAmount(BigDecimal[] amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public BigDecimal[] getAmount() {
      return this.amount;
   }

   @JsonProperty("feeQty")
   public void setFeeQty(BigDecimal[] feeQty) {
      this.feeQty = feeQty;
   }

   @JsonProperty("feeQty")
   public BigDecimal[] getFeeQty() {
      return this.feeQty;
   }

   @JsonProperty("createUser")
   public void setCreateUser(String[] createUser) {
      this.createUser = createUser;
   }

   @JsonProperty("createUser")
   public String[] getCreateUser() {
      return this.createUser;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date[] createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date[] getCreateTime() {
      return this.createTime;
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
