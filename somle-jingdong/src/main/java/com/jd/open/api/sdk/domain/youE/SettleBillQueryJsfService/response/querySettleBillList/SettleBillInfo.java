package com.jd.open.api.sdk.domain.youE.SettleBillQueryJsfService.response.querySettleBillList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class SettleBillInfo implements Serializable {
   private String secondServiceTypeName;
   private String settlePeriod;
   private String companyName;
   private String settleAmount;
   private String adjustAmount;
   private String remark;
   private String itemCatName;
   private String settleNo;
   private String settleRate;
   private String taxRate;
   private String adjustRemark;
   private String payAmount;
   private String state;
   private Date createDate;

   @JsonProperty("secondServiceTypeName")
   public void setSecondServiceTypeName(String secondServiceTypeName) {
      this.secondServiceTypeName = secondServiceTypeName;
   }

   @JsonProperty("secondServiceTypeName")
   public String getSecondServiceTypeName() {
      return this.secondServiceTypeName;
   }

   @JsonProperty("settlePeriod")
   public void setSettlePeriod(String settlePeriod) {
      this.settlePeriod = settlePeriod;
   }

   @JsonProperty("settlePeriod")
   public String getSettlePeriod() {
      return this.settlePeriod;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("settleAmount")
   public void setSettleAmount(String settleAmount) {
      this.settleAmount = settleAmount;
   }

   @JsonProperty("settleAmount")
   public String getSettleAmount() {
      return this.settleAmount;
   }

   @JsonProperty("adjustAmount")
   public void setAdjustAmount(String adjustAmount) {
      this.adjustAmount = adjustAmount;
   }

   @JsonProperty("adjustAmount")
   public String getAdjustAmount() {
      return this.adjustAmount;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("itemCatName")
   public void setItemCatName(String itemCatName) {
      this.itemCatName = itemCatName;
   }

   @JsonProperty("itemCatName")
   public String getItemCatName() {
      return this.itemCatName;
   }

   @JsonProperty("settleNo")
   public void setSettleNo(String settleNo) {
      this.settleNo = settleNo;
   }

   @JsonProperty("settleNo")
   public String getSettleNo() {
      return this.settleNo;
   }

   @JsonProperty("settleRate")
   public void setSettleRate(String settleRate) {
      this.settleRate = settleRate;
   }

   @JsonProperty("settleRate")
   public String getSettleRate() {
      return this.settleRate;
   }

   @JsonProperty("taxRate")
   public void setTaxRate(String taxRate) {
      this.taxRate = taxRate;
   }

   @JsonProperty("taxRate")
   public String getTaxRate() {
      return this.taxRate;
   }

   @JsonProperty("adjustRemark")
   public void setAdjustRemark(String adjustRemark) {
      this.adjustRemark = adjustRemark;
   }

   @JsonProperty("adjustRemark")
   public String getAdjustRemark() {
      return this.adjustRemark;
   }

   @JsonProperty("payAmount")
   public void setPayAmount(String payAmount) {
      this.payAmount = payAmount;
   }

   @JsonProperty("payAmount")
   public String getPayAmount() {
      return this.payAmount;
   }

   @JsonProperty("state")
   public void setState(String state) {
      this.state = state;
   }

   @JsonProperty("state")
   public String getState() {
      return this.state;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }
}
