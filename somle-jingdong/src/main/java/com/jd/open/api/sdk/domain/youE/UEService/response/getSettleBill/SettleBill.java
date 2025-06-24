package com.jd.open.api.sdk.domain.youE.UEService.response.getSettleBill;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class SettleBill implements Serializable {
   private Integer stat;
   private String settlePeriod;
   private Integer repeatProcess;
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
   private String serviceTypeName;
   private Date createDate;

   @JsonProperty("stat")
   public void setStat(Integer stat) {
      this.stat = stat;
   }

   @JsonProperty("stat")
   public Integer getStat() {
      return this.stat;
   }

   @JsonProperty("settlePeriod")
   public void setSettlePeriod(String settlePeriod) {
      this.settlePeriod = settlePeriod;
   }

   @JsonProperty("settlePeriod")
   public String getSettlePeriod() {
      return this.settlePeriod;
   }

   @JsonProperty("repeatProcess")
   public void setRepeatProcess(Integer repeatProcess) {
      this.repeatProcess = repeatProcess;
   }

   @JsonProperty("repeatProcess")
   public Integer getRepeatProcess() {
      return this.repeatProcess;
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

   @JsonProperty("settle_no")
   public void setSettleNo(String settleNo) {
      this.settleNo = settleNo;
   }

   @JsonProperty("settle_no")
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

   @JsonProperty("serviceTypeName")
   public void setServiceTypeName(String serviceTypeName) {
      this.serviceTypeName = serviceTypeName;
   }

   @JsonProperty("serviceTypeName")
   public String getServiceTypeName() {
      return this.serviceTypeName;
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
