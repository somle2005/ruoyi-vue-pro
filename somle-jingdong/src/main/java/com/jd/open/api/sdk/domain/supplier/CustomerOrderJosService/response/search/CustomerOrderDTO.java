package com.jd.open.api.sdk.domain.supplier.CustomerOrderJosService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CustomerOrderDTO implements Serializable {
   private String[] userId;
   private String[] level;
   private String[] receiveAddress;
   private String[] client;
   private String[] orderCode;
   private String[] productName;
   private Double[] price;
   private String[] quantity;
   private BigDecimal[] orderAmount;
   private BigDecimal[] amountAfterDiscount;
   private Boolean[] promotion;
   private Boolean[] groupBuying;
   private Boolean[] packageDiscount;
   private Boolean[] fullMinus;
   private Date[] payTime;
   private Date[] orderCreateTime;

   @JsonProperty("userId")
   public void setUserId(String[] userId) {
      this.userId = userId;
   }

   @JsonProperty("userId")
   public String[] getUserId() {
      return this.userId;
   }

   @JsonProperty("level")
   public void setLevel(String[] level) {
      this.level = level;
   }

   @JsonProperty("level")
   public String[] getLevel() {
      return this.level;
   }

   @JsonProperty("receiveAddress")
   public void setReceiveAddress(String[] receiveAddress) {
      this.receiveAddress = receiveAddress;
   }

   @JsonProperty("receiveAddress")
   public String[] getReceiveAddress() {
      return this.receiveAddress;
   }

   @JsonProperty("client")
   public void setClient(String[] client) {
      this.client = client;
   }

   @JsonProperty("client")
   public String[] getClient() {
      return this.client;
   }

   @JsonProperty("orderCode")
   public void setOrderCode(String[] orderCode) {
      this.orderCode = orderCode;
   }

   @JsonProperty("orderCode")
   public String[] getOrderCode() {
      return this.orderCode;
   }

   @JsonProperty("productName")
   public void setProductName(String[] productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String[] getProductName() {
      return this.productName;
   }

   @JsonProperty("price")
   public void setPrice(Double[] price) {
      this.price = price;
   }

   @JsonProperty("price")
   public Double[] getPrice() {
      return this.price;
   }

   @JsonProperty("quantity")
   public void setQuantity(String[] quantity) {
      this.quantity = quantity;
   }

   @JsonProperty("quantity")
   public String[] getQuantity() {
      return this.quantity;
   }

   @JsonProperty("orderAmount")
   public void setOrderAmount(BigDecimal[] orderAmount) {
      this.orderAmount = orderAmount;
   }

   @JsonProperty("orderAmount")
   public BigDecimal[] getOrderAmount() {
      return this.orderAmount;
   }

   @JsonProperty("amountAfterDiscount")
   public void setAmountAfterDiscount(BigDecimal[] amountAfterDiscount) {
      this.amountAfterDiscount = amountAfterDiscount;
   }

   @JsonProperty("amountAfterDiscount")
   public BigDecimal[] getAmountAfterDiscount() {
      return this.amountAfterDiscount;
   }

   @JsonProperty("promotion")
   public void setPromotion(Boolean[] promotion) {
      this.promotion = promotion;
   }

   @JsonProperty("promotion")
   public Boolean[] getPromotion() {
      return this.promotion;
   }

   @JsonProperty("groupBuying")
   public void setGroupBuying(Boolean[] groupBuying) {
      this.groupBuying = groupBuying;
   }

   @JsonProperty("groupBuying")
   public Boolean[] getGroupBuying() {
      return this.groupBuying;
   }

   @JsonProperty("packageDiscount")
   public void setPackageDiscount(Boolean[] packageDiscount) {
      this.packageDiscount = packageDiscount;
   }

   @JsonProperty("packageDiscount")
   public Boolean[] getPackageDiscount() {
      return this.packageDiscount;
   }

   @JsonProperty("fullMinus")
   public void setFullMinus(Boolean[] fullMinus) {
      this.fullMinus = fullMinus;
   }

   @JsonProperty("fullMinus")
   public Boolean[] getFullMinus() {
      return this.fullMinus;
   }

   @JsonProperty("payTime")
   public void setPayTime(Date[] payTime) {
      this.payTime = payTime;
   }

   @JsonProperty("payTime")
   public Date[] getPayTime() {
      return this.payTime;
   }

   @JsonProperty("orderCreateTime")
   public void setOrderCreateTime(Date[] orderCreateTime) {
      this.orderCreateTime = orderCreateTime;
   }

   @JsonProperty("orderCreateTime")
   public Date[] getOrderCreateTime() {
      return this.orderCreateTime;
   }
}
