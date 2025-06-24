package com.jd.open.api.sdk.domain.B2B.PurchaseOrderErpService.response.findPurchaseOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PurchaseOrder implements Serializable {
   private BigDecimal purchaseOrderPrice;
   private String consigneeTel;
   private String sellerName;
   private List<OrderSku> orderSkuList;
   private Integer purchaseOrderStatus;
   private Date complateDate;
   private List<ErpOrder> erpOrders;
   private String userPin;
   private String consigneeName;
   private BigDecimal purchaseOrderTotalPrice;
   private Date submiteDate;
   private Long purchaseOrderId;
   private Integer isLock;
   private BigDecimal freightPrice;
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

   @JsonProperty("purchaseOrderStatus")
   public void setPurchaseOrderStatus(Integer purchaseOrderStatus) {
      this.purchaseOrderStatus = purchaseOrderStatus;
   }

   @JsonProperty("purchaseOrderStatus")
   public Integer getPurchaseOrderStatus() {
      return this.purchaseOrderStatus;
   }

   @JsonProperty("complateDate")
   public void setComplateDate(Date complateDate) {
      this.complateDate = complateDate;
   }

   @JsonProperty("complateDate")
   public Date getComplateDate() {
      return this.complateDate;
   }

   @JsonProperty("erpOrders")
   public void setErpOrders(List<ErpOrder> erpOrders) {
      this.erpOrders = erpOrders;
   }

   @JsonProperty("erpOrders")
   public List<ErpOrder> getErpOrders() {
      return this.erpOrders;
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

   @JsonProperty("isLock")
   public void setIsLock(Integer isLock) {
      this.isLock = isLock;
   }

   @JsonProperty("isLock")
   public Integer getIsLock() {
      return this.isLock;
   }

   @JsonProperty("freightPrice")
   public void setFreightPrice(BigDecimal freightPrice) {
      this.freightPrice = freightPrice;
   }

   @JsonProperty("freightPrice")
   public BigDecimal getFreightPrice() {
      return this.freightPrice;
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
