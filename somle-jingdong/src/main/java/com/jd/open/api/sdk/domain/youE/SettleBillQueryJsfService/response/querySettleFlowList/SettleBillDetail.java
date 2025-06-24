package com.jd.open.api.sdk.domain.youE.SettleBillQueryJsfService.response.querySettleFlowList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class SettleBillDetail implements Serializable {
   private double amount;
   private String orderNo;
   private String saleOrderNo;
   private Integer settleStat;
   private String companyName;
   private String settleItem;
   private String itemCatName;
   private Integer secondServiceType;
   private double taxRate;
   private Integer companyId;
   private Date jdCheckDate;
   private Integer itemCatId;
   private double serviceAmount;
   private String imei;
   private String serviceSku;
   private String serviceTypeName;

   @JsonProperty("amount")
   public void setAmount(double amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public double getAmount() {
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

   @JsonProperty("secondServiceType")
   public void setSecondServiceType(Integer secondServiceType) {
      this.secondServiceType = secondServiceType;
   }

   @JsonProperty("secondServiceType")
   public Integer getSecondServiceType() {
      return this.secondServiceType;
   }

   @JsonProperty("taxRate")
   public void setTaxRate(double taxRate) {
      this.taxRate = taxRate;
   }

   @JsonProperty("taxRate")
   public double getTaxRate() {
      return this.taxRate;
   }

   @JsonProperty("companyId")
   public void setCompanyId(Integer companyId) {
      this.companyId = companyId;
   }

   @JsonProperty("companyId")
   public Integer getCompanyId() {
      return this.companyId;
   }

   @JsonProperty("jdCheckDate")
   public void setJdCheckDate(Date jdCheckDate) {
      this.jdCheckDate = jdCheckDate;
   }

   @JsonProperty("jdCheckDate")
   public Date getJdCheckDate() {
      return this.jdCheckDate;
   }

   @JsonProperty("itemCatId")
   public void setItemCatId(Integer itemCatId) {
      this.itemCatId = itemCatId;
   }

   @JsonProperty("itemCatId")
   public Integer getItemCatId() {
      return this.itemCatId;
   }

   @JsonProperty("serviceAmount")
   public void setServiceAmount(double serviceAmount) {
      this.serviceAmount = serviceAmount;
   }

   @JsonProperty("serviceAmount")
   public double getServiceAmount() {
      return this.serviceAmount;
   }

   @JsonProperty("imei")
   public void setImei(String imei) {
      this.imei = imei;
   }

   @JsonProperty("imei")
   public String getImei() {
      return this.imei;
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
