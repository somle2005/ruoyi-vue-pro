package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryDept;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DeptOut implements Serializable {
   private String[] deptNo;
   private String[] deptName;
   private String[] sellerNo;
   private String[] sellerName;
   private String[] enableTemplate;
   private String[] managerName;
   private String[] managerPhone;
   private String[] managerFax;
   private String[] managerEmail;
   private String[] managerAddress;
   private String[] settlementMode;
   private String[] settlementBody;
   private String[] resultsSection;
   private String[] accountData;
   private String[] qualification;
   private String[] billingConditions;
   private String[] status;
   private String[] reserve1;
   private String[] reserve2;
   private String[] reserve3;
   private String[] reserve4;
   private String[] reserve5;

   @JsonProperty("deptNo")
   public void setDeptNo(String[] deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String[] getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("deptName")
   public void setDeptName(String[] deptName) {
      this.deptName = deptName;
   }

   @JsonProperty("deptName")
   public String[] getDeptName() {
      return this.deptName;
   }

   @JsonProperty("sellerNo")
   public void setSellerNo(String[] sellerNo) {
      this.sellerNo = sellerNo;
   }

   @JsonProperty("sellerNo")
   public String[] getSellerNo() {
      return this.sellerNo;
   }

   @JsonProperty("sellerName")
   public void setSellerName(String[] sellerName) {
      this.sellerName = sellerName;
   }

   @JsonProperty("sellerName")
   public String[] getSellerName() {
      return this.sellerName;
   }

   @JsonProperty("enableTemplate")
   public void setEnableTemplate(String[] enableTemplate) {
      this.enableTemplate = enableTemplate;
   }

   @JsonProperty("enableTemplate")
   public String[] getEnableTemplate() {
      return this.enableTemplate;
   }

   @JsonProperty("managerName")
   public void setManagerName(String[] managerName) {
      this.managerName = managerName;
   }

   @JsonProperty("managerName")
   public String[] getManagerName() {
      return this.managerName;
   }

   @JsonProperty("managerPhone")
   public void setManagerPhone(String[] managerPhone) {
      this.managerPhone = managerPhone;
   }

   @JsonProperty("managerPhone")
   public String[] getManagerPhone() {
      return this.managerPhone;
   }

   @JsonProperty("managerFax")
   public void setManagerFax(String[] managerFax) {
      this.managerFax = managerFax;
   }

   @JsonProperty("managerFax")
   public String[] getManagerFax() {
      return this.managerFax;
   }

   @JsonProperty("managerEmail")
   public void setManagerEmail(String[] managerEmail) {
      this.managerEmail = managerEmail;
   }

   @JsonProperty("managerEmail")
   public String[] getManagerEmail() {
      return this.managerEmail;
   }

   @JsonProperty("managerAddress")
   public void setManagerAddress(String[] managerAddress) {
      this.managerAddress = managerAddress;
   }

   @JsonProperty("managerAddress")
   public String[] getManagerAddress() {
      return this.managerAddress;
   }

   @JsonProperty("settlementMode")
   public void setSettlementMode(String[] settlementMode) {
      this.settlementMode = settlementMode;
   }

   @JsonProperty("settlementMode")
   public String[] getSettlementMode() {
      return this.settlementMode;
   }

   @JsonProperty("settlementBody")
   public void setSettlementBody(String[] settlementBody) {
      this.settlementBody = settlementBody;
   }

   @JsonProperty("settlementBody")
   public String[] getSettlementBody() {
      return this.settlementBody;
   }

   @JsonProperty("resultsSection")
   public void setResultsSection(String[] resultsSection) {
      this.resultsSection = resultsSection;
   }

   @JsonProperty("resultsSection")
   public String[] getResultsSection() {
      return this.resultsSection;
   }

   @JsonProperty("accountData")
   public void setAccountData(String[] accountData) {
      this.accountData = accountData;
   }

   @JsonProperty("accountData")
   public String[] getAccountData() {
      return this.accountData;
   }

   @JsonProperty("qualification")
   public void setQualification(String[] qualification) {
      this.qualification = qualification;
   }

   @JsonProperty("qualification")
   public String[] getQualification() {
      return this.qualification;
   }

   @JsonProperty("billingConditions")
   public void setBillingConditions(String[] billingConditions) {
      this.billingConditions = billingConditions;
   }

   @JsonProperty("billingConditions")
   public String[] getBillingConditions() {
      return this.billingConditions;
   }

   @JsonProperty("status")
   public void setStatus(String[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String[] getStatus() {
      return this.status;
   }

   @JsonProperty("reserve1")
   public void setReserve1(String[] reserve1) {
      this.reserve1 = reserve1;
   }

   @JsonProperty("reserve1")
   public String[] getReserve1() {
      return this.reserve1;
   }

   @JsonProperty("reserve2")
   public void setReserve2(String[] reserve2) {
      this.reserve2 = reserve2;
   }

   @JsonProperty("reserve2")
   public String[] getReserve2() {
      return this.reserve2;
   }

   @JsonProperty("reserve3")
   public void setReserve3(String[] reserve3) {
      this.reserve3 = reserve3;
   }

   @JsonProperty("reserve3")
   public String[] getReserve3() {
      return this.reserve3;
   }

   @JsonProperty("reserve4")
   public void setReserve4(String[] reserve4) {
      this.reserve4 = reserve4;
   }

   @JsonProperty("reserve4")
   public String[] getReserve4() {
      return this.reserve4;
   }

   @JsonProperty("reserve5")
   public void setReserve5(String[] reserve5) {
      this.reserve5 = reserve5;
   }

   @JsonProperty("reserve5")
   public String[] getReserve5() {
      return this.reserve5;
   }
}
