package com.jd.open.api.sdk.domain.youE.VenderQueryOrderJsfService.response.queryVerifyOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderVerifyOrderDetails implements Serializable {
   private String area;
   private String orderNo;
   private String orderType;
   private String subsidyType;
   private String sku;
   private String skuUuid;
   private String uName;
   private String telNo;
   private String certNo;
   private String cardNo;
   private String transNo;
   private String oldDeductAmount;
   private String cloudSubsidyAmount;
   private String energyLevel;
   private String itemName;
   private String buyerVenderId;
   private String buyerVenderName;
   private String dealerPerformanceFlag;
   private String sn;
   private String imei1;
   private String imei2;
   private String eanCode;

   @JsonProperty("area")
   public void setArea(String area) {
      this.area = area;
   }

   @JsonProperty("area")
   public String getArea() {
      return this.area;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("orderType")
   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public String getOrderType() {
      return this.orderType;
   }

   @JsonProperty("subsidyType")
   public void setSubsidyType(String subsidyType) {
      this.subsidyType = subsidyType;
   }

   @JsonProperty("subsidyType")
   public String getSubsidyType() {
      return this.subsidyType;
   }

   @JsonProperty("sku")
   public void setSku(String sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public String getSku() {
      return this.sku;
   }

   @JsonProperty("skuUuid")
   public void setSkuUuid(String skuUuid) {
      this.skuUuid = skuUuid;
   }

   @JsonProperty("skuUuid")
   public String getSkuUuid() {
      return this.skuUuid;
   }

   @JsonProperty("uName")
   public void setUName(String uName) {
      this.uName = uName;
   }

   @JsonProperty("uName")
   public String getUName() {
      return this.uName;
   }

   @JsonProperty("telNo")
   public void setTelNo(String telNo) {
      this.telNo = telNo;
   }

   @JsonProperty("telNo")
   public String getTelNo() {
      return this.telNo;
   }

   @JsonProperty("certNo")
   public void setCertNo(String certNo) {
      this.certNo = certNo;
   }

   @JsonProperty("certNo")
   public String getCertNo() {
      return this.certNo;
   }

   @JsonProperty("cardNo")
   public void setCardNo(String cardNo) {
      this.cardNo = cardNo;
   }

   @JsonProperty("cardNo")
   public String getCardNo() {
      return this.cardNo;
   }

   @JsonProperty("transNo")
   public void setTransNo(String transNo) {
      this.transNo = transNo;
   }

   @JsonProperty("transNo")
   public String getTransNo() {
      return this.transNo;
   }

   @JsonProperty("oldDeductAmount")
   public void setOldDeductAmount(String oldDeductAmount) {
      this.oldDeductAmount = oldDeductAmount;
   }

   @JsonProperty("oldDeductAmount")
   public String getOldDeductAmount() {
      return this.oldDeductAmount;
   }

   @JsonProperty("cloudSubsidyAmount")
   public void setCloudSubsidyAmount(String cloudSubsidyAmount) {
      this.cloudSubsidyAmount = cloudSubsidyAmount;
   }

   @JsonProperty("cloudSubsidyAmount")
   public String getCloudSubsidyAmount() {
      return this.cloudSubsidyAmount;
   }

   @JsonProperty("energyLevel")
   public void setEnergyLevel(String energyLevel) {
      this.energyLevel = energyLevel;
   }

   @JsonProperty("energyLevel")
   public String getEnergyLevel() {
      return this.energyLevel;
   }

   @JsonProperty("itemName")
   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   @JsonProperty("itemName")
   public String getItemName() {
      return this.itemName;
   }

   @JsonProperty("buyerVenderId")
   public void setBuyerVenderId(String buyerVenderId) {
      this.buyerVenderId = buyerVenderId;
   }

   @JsonProperty("buyerVenderId")
   public String getBuyerVenderId() {
      return this.buyerVenderId;
   }

   @JsonProperty("buyerVenderName")
   public void setBuyerVenderName(String buyerVenderName) {
      this.buyerVenderName = buyerVenderName;
   }

   @JsonProperty("buyerVenderName")
   public String getBuyerVenderName() {
      return this.buyerVenderName;
   }

   @JsonProperty("dealerPerformanceFlag")
   public void setDealerPerformanceFlag(String dealerPerformanceFlag) {
      this.dealerPerformanceFlag = dealerPerformanceFlag;
   }

   @JsonProperty("dealerPerformanceFlag")
   public String getDealerPerformanceFlag() {
      return this.dealerPerformanceFlag;
   }

   @JsonProperty("sn")
   public void setSn(String sn) {
      this.sn = sn;
   }

   @JsonProperty("sn")
   public String getSn() {
      return this.sn;
   }

   @JsonProperty("imei1")
   public void setImei1(String imei1) {
      this.imei1 = imei1;
   }

   @JsonProperty("imei1")
   public String getImei1() {
      return this.imei1;
   }

   @JsonProperty("imei2")
   public void setImei2(String imei2) {
      this.imei2 = imei2;
   }

   @JsonProperty("imei2")
   public String getImei2() {
      return this.imei2;
   }

   @JsonProperty("eanCode")
   public void setEanCode(String eanCode) {
      this.eanCode = eanCode;
   }

   @JsonProperty("eanCode")
   public String getEanCode() {
      return this.eanCode;
   }
}
