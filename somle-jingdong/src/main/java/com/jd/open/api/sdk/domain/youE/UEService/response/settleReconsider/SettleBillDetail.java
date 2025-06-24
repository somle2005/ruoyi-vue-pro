package com.jd.open.api.sdk.domain.youE.UEService.response.settleReconsider;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class SettleBillDetail implements Serializable {
   private String assessAmount;
   private String taxRate;
   private Date jdCheckDate;
   private String brandName;
   private String amount;
   private String orderNo;
   private String serviceAmount;
   private String settleItem;
   private String assessRemark;
   private String itemCatName;
   private String settleNo;

   @JsonProperty("assessAmount")
   public void setAssessAmount(String assessAmount) {
      this.assessAmount = assessAmount;
   }

   @JsonProperty("assessAmount")
   public String getAssessAmount() {
      return this.assessAmount;
   }

   @JsonProperty("taxRate")
   public void setTaxRate(String taxRate) {
      this.taxRate = taxRate;
   }

   @JsonProperty("taxRate")
   public String getTaxRate() {
      return this.taxRate;
   }

   @JsonProperty("jdCheckDate")
   public void setJdCheckDate(Date jdCheckDate) {
      this.jdCheckDate = jdCheckDate;
   }

   @JsonProperty("jdCheckDate")
   public Date getJdCheckDate() {
      return this.jdCheckDate;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("amount")
   public void setAmount(String amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public String getAmount() {
      return this.amount;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("serviceAmount")
   public void setServiceAmount(String serviceAmount) {
      this.serviceAmount = serviceAmount;
   }

   @JsonProperty("serviceAmount")
   public String getServiceAmount() {
      return this.serviceAmount;
   }

   @JsonProperty("settleItem")
   public void setSettleItem(String settleItem) {
      this.settleItem = settleItem;
   }

   @JsonProperty("settleItem")
   public String getSettleItem() {
      return this.settleItem;
   }

   @JsonProperty("assessRemark")
   public void setAssessRemark(String assessRemark) {
      this.assessRemark = assessRemark;
   }

   @JsonProperty("assessRemark")
   public String getAssessRemark() {
      return this.assessRemark;
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
}
