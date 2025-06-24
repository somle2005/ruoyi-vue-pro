package com.jd.open.api.sdk.domain.fapiao.InvoiceDetailReadProvider.response.getInvoiceDetailListByDailyIdOrApplyId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class InvoiceDetailMO implements Serializable {
   private String orderId;
   private String skuId;
   private String productName;
   private Date happenTime;
   private Date orderFinishTime;
   private String feeName;
   private BigDecimal settleBal;
   private Integer num;
   private String storeId;
   private String settleEntityId;
   private String extJson;
   private Integer rfBusiType;
   private String rfBusiId;

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("happenTime")
   public void setHappenTime(Date happenTime) {
      this.happenTime = happenTime;
   }

   @JsonProperty("happenTime")
   public Date getHappenTime() {
      return this.happenTime;
   }

   @JsonProperty("orderFinishTime")
   public void setOrderFinishTime(Date orderFinishTime) {
      this.orderFinishTime = orderFinishTime;
   }

   @JsonProperty("orderFinishTime")
   public Date getOrderFinishTime() {
      return this.orderFinishTime;
   }

   @JsonProperty("feeName")
   public void setFeeName(String feeName) {
      this.feeName = feeName;
   }

   @JsonProperty("feeName")
   public String getFeeName() {
      return this.feeName;
   }

   @JsonProperty("settleBal")
   public void setSettleBal(BigDecimal settleBal) {
      this.settleBal = settleBal;
   }

   @JsonProperty("settleBal")
   public BigDecimal getSettleBal() {
      return this.settleBal;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }

   @JsonProperty("settleEntityId")
   public void setSettleEntityId(String settleEntityId) {
      this.settleEntityId = settleEntityId;
   }

   @JsonProperty("settleEntityId")
   public String getSettleEntityId() {
      return this.settleEntityId;
   }

   @JsonProperty("extJson")
   public void setExtJson(String extJson) {
      this.extJson = extJson;
   }

   @JsonProperty("extJson")
   public String getExtJson() {
      return this.extJson;
   }

   @JsonProperty("rfBusiType")
   public void setRfBusiType(Integer rfBusiType) {
      this.rfBusiType = rfBusiType;
   }

   @JsonProperty("rfBusiType")
   public Integer getRfBusiType() {
      return this.rfBusiType;
   }

   @JsonProperty("rfBusiId")
   public void setRfBusiId(String rfBusiId) {
      this.rfBusiId = rfBusiId;
   }

   @JsonProperty("rfBusiId")
   public String getRfBusiId() {
      return this.rfBusiId;
   }
}
