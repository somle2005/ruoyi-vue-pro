package com.jd.open.api.sdk.domain.supplier.ElectronicPolicyJosService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ElectronicPolicyDTO implements Serializable {
   private String[] purchaseOrderCode;
   private Integer[] mark;
   private String[] brand;
   private String[] category;
   private String[] sku;
   private String[] productName;
   private Double[] orderAmount;
   private Double[] payAmount;
   private Date[] orderCreateTime;
   private Date[] orderLeaveStockTime;
   private Date[] payTime;
   private Date[] finishOrderTime;
   private String[] serialNumber;
   private Double effectPrice;
   private String originOrderId;

   @JsonProperty("purchaseOrderCode")
   public void setPurchaseOrderCode(String[] purchaseOrderCode) {
      this.purchaseOrderCode = purchaseOrderCode;
   }

   @JsonProperty("purchaseOrderCode")
   public String[] getPurchaseOrderCode() {
      return this.purchaseOrderCode;
   }

   @JsonProperty("mark")
   public void setMark(Integer[] mark) {
      this.mark = mark;
   }

   @JsonProperty("mark")
   public Integer[] getMark() {
      return this.mark;
   }

   @JsonProperty("brand")
   public void setBrand(String[] brand) {
      this.brand = brand;
   }

   @JsonProperty("brand")
   public String[] getBrand() {
      return this.brand;
   }

   @JsonProperty("category")
   public void setCategory(String[] category) {
      this.category = category;
   }

   @JsonProperty("category")
   public String[] getCategory() {
      return this.category;
   }

   @JsonProperty("sku")
   public void setSku(String[] sku) {
      this.sku = sku;
   }

   @JsonProperty("sku")
   public String[] getSku() {
      return this.sku;
   }

   @JsonProperty("productName")
   public void setProductName(String[] productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String[] getProductName() {
      return this.productName;
   }

   @JsonProperty("orderAmount")
   public void setOrderAmount(Double[] orderAmount) {
      this.orderAmount = orderAmount;
   }

   @JsonProperty("orderAmount")
   public Double[] getOrderAmount() {
      return this.orderAmount;
   }

   @JsonProperty("payAmount")
   public void setPayAmount(Double[] payAmount) {
      this.payAmount = payAmount;
   }

   @JsonProperty("payAmount")
   public Double[] getPayAmount() {
      return this.payAmount;
   }

   @JsonProperty("orderCreateTime")
   public void setOrderCreateTime(Date[] orderCreateTime) {
      this.orderCreateTime = orderCreateTime;
   }

   @JsonProperty("orderCreateTime")
   public Date[] getOrderCreateTime() {
      return this.orderCreateTime;
   }

   @JsonProperty("orderLeaveStockTime")
   public void setOrderLeaveStockTime(Date[] orderLeaveStockTime) {
      this.orderLeaveStockTime = orderLeaveStockTime;
   }

   @JsonProperty("orderLeaveStockTime")
   public Date[] getOrderLeaveStockTime() {
      return this.orderLeaveStockTime;
   }

   @JsonProperty("payTime")
   public void setPayTime(Date[] payTime) {
      this.payTime = payTime;
   }

   @JsonProperty("payTime")
   public Date[] getPayTime() {
      return this.payTime;
   }

   @JsonProperty("finishOrderTime")
   public void setFinishOrderTime(Date[] finishOrderTime) {
      this.finishOrderTime = finishOrderTime;
   }

   @JsonProperty("finishOrderTime")
   public Date[] getFinishOrderTime() {
      return this.finishOrderTime;
   }

   @JsonProperty("serialNumber")
   public void setSerialNumber(String[] serialNumber) {
      this.serialNumber = serialNumber;
   }

   @JsonProperty("serialNumber")
   public String[] getSerialNumber() {
      return this.serialNumber;
   }

   @JsonProperty("effectPrice")
   public void setEffectPrice(Double effectPrice) {
      this.effectPrice = effectPrice;
   }

   @JsonProperty("effectPrice")
   public Double getEffectPrice() {
      return this.effectPrice;
   }

   @JsonProperty("originOrderId")
   public void setOriginOrderId(String originOrderId) {
      this.originOrderId = originOrderId;
   }

   @JsonProperty("originOrderId")
   public String getOriginOrderId() {
      return this.originOrderId;
   }
}
