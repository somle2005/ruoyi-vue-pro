package com.jd.open.api.sdk.domain.youE.UEService.response.extsearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ExtTast implements Serializable {
   private String extOrderCompleteDate;
   private Integer changeMainSkuQty;
   private String orderNo;
   private String saleOrderNo;
   private String mainSkuSn;
   private Integer settleSkuQty;
   private String bindType;
   private String settleSku;
   private Integer mainSkuQty;
   private String orderCompleteDate;
   private String mainSku;
   private String changeOrderNo;
   private String extOrderNo;
   private String changeMainSkuSn;
   private String extinsuranceType;
   private String mainSkuName;
   private String settleSkuName;
   private String serviceOrderBuyDate;

   @JsonProperty("extOrderCompleteDate")
   public void setExtOrderCompleteDate(String extOrderCompleteDate) {
      this.extOrderCompleteDate = extOrderCompleteDate;
   }

   @JsonProperty("extOrderCompleteDate")
   public String getExtOrderCompleteDate() {
      return this.extOrderCompleteDate;
   }

   @JsonProperty("changeMainSkuQty")
   public void setChangeMainSkuQty(Integer changeMainSkuQty) {
      this.changeMainSkuQty = changeMainSkuQty;
   }

   @JsonProperty("changeMainSkuQty")
   public Integer getChangeMainSkuQty() {
      return this.changeMainSkuQty;
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

   @JsonProperty("mainSkuSn")
   public void setMainSkuSn(String mainSkuSn) {
      this.mainSkuSn = mainSkuSn;
   }

   @JsonProperty("mainSkuSn")
   public String getMainSkuSn() {
      return this.mainSkuSn;
   }

   @JsonProperty("settleSkuQty")
   public void setSettleSkuQty(Integer settleSkuQty) {
      this.settleSkuQty = settleSkuQty;
   }

   @JsonProperty("settleSkuQty")
   public Integer getSettleSkuQty() {
      return this.settleSkuQty;
   }

   @JsonProperty("bindType")
   public void setBindType(String bindType) {
      this.bindType = bindType;
   }

   @JsonProperty("bindType")
   public String getBindType() {
      return this.bindType;
   }

   @JsonProperty("settleSku")
   public void setSettleSku(String settleSku) {
      this.settleSku = settleSku;
   }

   @JsonProperty("settleSku")
   public String getSettleSku() {
      return this.settleSku;
   }

   @JsonProperty("mainSkuQty")
   public void setMainSkuQty(Integer mainSkuQty) {
      this.mainSkuQty = mainSkuQty;
   }

   @JsonProperty("mainSkuQty")
   public Integer getMainSkuQty() {
      return this.mainSkuQty;
   }

   @JsonProperty("orderCompleteDate")
   public void setOrderCompleteDate(String orderCompleteDate) {
      this.orderCompleteDate = orderCompleteDate;
   }

   @JsonProperty("orderCompleteDate")
   public String getOrderCompleteDate() {
      return this.orderCompleteDate;
   }

   @JsonProperty("mainSku")
   public void setMainSku(String mainSku) {
      this.mainSku = mainSku;
   }

   @JsonProperty("mainSku")
   public String getMainSku() {
      return this.mainSku;
   }

   @JsonProperty("changeOrderNo")
   public void setChangeOrderNo(String changeOrderNo) {
      this.changeOrderNo = changeOrderNo;
   }

   @JsonProperty("changeOrderNo")
   public String getChangeOrderNo() {
      return this.changeOrderNo;
   }

   @JsonProperty("extOrderNo")
   public void setExtOrderNo(String extOrderNo) {
      this.extOrderNo = extOrderNo;
   }

   @JsonProperty("extOrderNo")
   public String getExtOrderNo() {
      return this.extOrderNo;
   }

   @JsonProperty("changeMainSkuSn")
   public void setChangeMainSkuSn(String changeMainSkuSn) {
      this.changeMainSkuSn = changeMainSkuSn;
   }

   @JsonProperty("changeMainSkuSn")
   public String getChangeMainSkuSn() {
      return this.changeMainSkuSn;
   }

   @JsonProperty("extinsuranceType")
   public void setExtinsuranceType(String extinsuranceType) {
      this.extinsuranceType = extinsuranceType;
   }

   @JsonProperty("extinsuranceType")
   public String getExtinsuranceType() {
      return this.extinsuranceType;
   }

   @JsonProperty("mainSkuName")
   public void setMainSkuName(String mainSkuName) {
      this.mainSkuName = mainSkuName;
   }

   @JsonProperty("mainSkuName")
   public String getMainSkuName() {
      return this.mainSkuName;
   }

   @JsonProperty("settleSkuName")
   public void setSettleSkuName(String settleSkuName) {
      this.settleSkuName = settleSkuName;
   }

   @JsonProperty("settleSkuName")
   public String getSettleSkuName() {
      return this.settleSkuName;
   }

   @JsonProperty("serviceOrderBuyDate")
   public void setServiceOrderBuyDate(String serviceOrderBuyDate) {
      this.serviceOrderBuyDate = serviceOrderBuyDate;
   }

   @JsonProperty("serviceOrderBuyDate")
   public String getServiceOrderBuyDate() {
      return this.serviceOrderBuyDate;
   }
}
