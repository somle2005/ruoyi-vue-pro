package com.jd.open.api.sdk.domain.B2B.PurchaseOrderErpService.response.findPurchaseOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ErpOrder implements Serializable {
   private BigDecimal purchaseOrderPrice;
   private String consigneeTel;
   private String sellerName;
   private List<OrderSku> orderSkuList;
   private Date complateDate;
   private String userPin;
   private String consigneeName;
   private BigDecimal purchaseOrderTotalPrice;
   private Date submiteDate;
   private Long purchaseOrderId;
   private String erpOrderStatus;
   private BigDecimal freightPrice;
   private Long jdOrderId;
   private String consigneeAddress;

   @JsonProperty("purchaseOrderPrice")
   public void setPurchaseOrderPrice(BigDecimal purchaseOrderPrice) {
      this.purchaseOrderPrice = purchaseOrderPrice;
   }

   @JsonProperty("purchaseOrderPrice")
   public BigDecimal getPurchaseOrderPrice() {
      return this.purchaseOrderPrice;
   }

   @JsonProperty("consigneeTel")
   public void setConsigneeTel(String consigneeTel) {
      this.consigneeTel = consigneeTel;
   }

   @JsonProperty("consigneeTel")
   public String getConsigneeTel() {
      return this.consigneeTel;
   }

   @JsonProperty("sellerName")
   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   @JsonProperty("sellerName")
   public String getSellerName() {
      return this.sellerName;
   }

   @JsonProperty("orderSkuList")
   public void setOrderSkuList(List<OrderSku> orderSkuList) {
      this.orderSkuList = orderSkuList;
   }

   @JsonProperty("orderSkuList")
   public List<OrderSku> getOrderSkuList() {
      return this.orderSkuList;
   }

   @JsonProperty("complateDate")
   public void setComplateDate(Date complateDate) {
      this.complateDate = complateDate;
   }

   @JsonProperty("complateDate")
   public Date getComplateDate() {
      return this.complateDate;
   }

   @JsonProperty("userPin")
   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   @JsonProperty("userPin")
   public String getUserPin() {
      return this.userPin;
   }

   @JsonProperty("consigneeName")
   public void setConsigneeName(String consigneeName) {
      this.consigneeName = consigneeName;
   }

   @JsonProperty("consigneeName")
   public String getConsigneeName() {
      return this.consigneeName;
   }

   @JsonProperty("purchaseOrderTotalPrice")
   public void setPurchaseOrderTotalPrice(BigDecimal purchaseOrderTotalPrice) {
      this.purchaseOrderTotalPrice = purchaseOrderTotalPrice;
   }

   @JsonProperty("purchaseOrderTotalPrice")
   public BigDecimal getPurchaseOrderTotalPrice() {
      return this.purchaseOrderTotalPrice;
   }

   @JsonProperty("submiteDate")
   public void setSubmiteDate(Date submiteDate) {
      this.submiteDate = submiteDate;
   }

   @JsonProperty("submiteDate")
   public Date getSubmiteDate() {
      return this.submiteDate;
   }

   @JsonProperty("purchaseOrderId")
   public void setPurchaseOrderId(Long purchaseOrderId) {
      this.purchaseOrderId = purchaseOrderId;
   }

   @JsonProperty("purchaseOrderId")
   public Long getPurchaseOrderId() {
      return this.purchaseOrderId;
   }

   @JsonProperty("erpOrderStatus")
   public void setErpOrderStatus(String erpOrderStatus) {
      this.erpOrderStatus = erpOrderStatus;
   }

   @JsonProperty("erpOrderStatus")
   public String getErpOrderStatus() {
      return this.erpOrderStatus;
   }

   @JsonProperty("freightPrice")
   public void setFreightPrice(BigDecimal freightPrice) {
      this.freightPrice = freightPrice;
   }

   @JsonProperty("freightPrice")
   public BigDecimal getFreightPrice() {
      return this.freightPrice;
   }

   @JsonProperty("jdOrderId")
   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   @JsonProperty("jdOrderId")
   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   @JsonProperty("consigneeAddress")
   public void setConsigneeAddress(String consigneeAddress) {
      this.consigneeAddress = consigneeAddress;
   }

   @JsonProperty("consigneeAddress")
   public String getConsigneeAddress() {
      return this.consigneeAddress;
   }
}
