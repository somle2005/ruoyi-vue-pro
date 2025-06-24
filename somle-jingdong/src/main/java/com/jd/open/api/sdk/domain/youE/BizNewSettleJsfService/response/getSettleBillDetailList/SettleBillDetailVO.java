package com.jd.open.api.sdk.domain.youE.BizNewSettleJsfService.response.getSettleBillDetailList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class SettleBillDetailVO implements Serializable {
   private String amount;
   private String orderNo;
   private String saleOrderNo;
   private Integer settleStat;
   private String companyName;
   private String settleItem;
   private String itemCatName;
   private String taxRate;
   private Date jdCheckDate;
   private Integer companyId;
   private String serviceAmount;
   private Integer itemCatId;
   private String imei;
   private String serviceTypeId;
   private String serviceSku;
   private String serviceTypeName;

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

   @JsonProperty("saleOrderNo")
   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   @JsonProperty("saleOrderNo")
   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   @JsonProperty("settleStat")
   public void setSettleStat(Integer settleStat) {
      this.settleStat = settleStat;
   }

   @JsonProperty("settleStat")
   public Integer getSettleStat() {
      return this.settleStat;
   }

   @JsonProperty("companyName")
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   @JsonProperty("companyName")
   public String getCompanyName() {
      return this.companyName;
   }

   @JsonProperty("settleItem")
   public void setSettleItem(String settleItem) {
      this.settleItem = settleItem;
   }

   @JsonProperty("settleItem")
   public String getSettleItem() {
      return this.settleItem;
   }

   @JsonProperty("itemCatName")
   public void setItemCatName(String itemCatName) {
      this.itemCatName = itemCatName;
   }

   @JsonProperty("itemCatName")
   public String getItemCatName() {
      return this.itemCatName;
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

   @JsonProperty("companyId")
   public void setCompanyId(Integer companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Integer getCompanyId() {
      return this.companyId;
   }

   @JsonProperty("serviceAmount")
   public void setServiceAmount(String serviceAmount) {
      this.serviceAmount = serviceAmount;
   }

   @JsonProperty("serviceAmount")
   public String getServiceAmount() {
      return this.serviceAmount;
   }

   @JsonProperty("itemCatId")
   public void setItemCatId(Integer itemCatId) {
      this.itemCatId = itemCatId;
   }

   @JsonProperty("itemCatId")
   public Integer getItemCatId() {
      return this.itemCatId;
   }

   @JsonProperty("imei")
   public void setImei(String imei) {
      this.imei = imei;
   }

   @JsonProperty("imei")
   public String getImei() {
      return this.imei;
   }

   @JsonProperty("serviceTypeId")
   public void setServiceTypeId(String serviceTypeId) {
      this.serviceTypeId = serviceTypeId;
   }

   @JsonProperty("serviceTypeId")
   public String getServiceTypeId() {
      return this.serviceTypeId;
   }

   @JsonProperty("serviceSku")
   public void setServiceSku(String serviceSku) {
      this.serviceSku = serviceSku;
   }

   @JsonProperty("serviceSku")
   public String getServiceSku() {
      return this.serviceSku;
   }

   @JsonProperty("serviceTypeName")
   public void setServiceTypeName(String serviceTypeName) {
      this.serviceTypeName = serviceTypeName;
   }

   @JsonProperty("serviceTypeName")
   public String getServiceTypeName() {
      return this.serviceTypeName;
   }
}
