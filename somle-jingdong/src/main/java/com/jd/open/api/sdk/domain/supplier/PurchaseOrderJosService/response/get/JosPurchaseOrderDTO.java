package com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class JosPurchaseOrderDTO implements Serializable {
   private String purchaseOrderCode;
   private int categoryNumber;
   private int totalNubmer;
   private BigDecimal totalAmount;
   private BigDecimal actualTotalAmount;
   private Date purchaseDate;
   private Date supposedArrivingDate;
   private String buyerContactId;
   private String buyerContact;
   private String vendorCode;
   private String vendorName;
   private String shippingAddress;
   private String warehouseCode;
   private String warehouse;
   private String orderOwnerCode;
   private String orderOwner;
   private Date closingDate;
   private String station;
   private String payment;
   private String orgCode;
   private String orgName;
   private String ouCode;
   private String comments;
   private boolean backOrder;
   private boolean tcFlag;
   private Date createTime;
   private Date updateTime;

   @JsonProperty("purchaseOrderCode")
   public void setPurchaseOrderCode(String purchaseOrderCode) {
      this.purchaseOrderCode = purchaseOrderCode;
   }

   @JsonProperty("purchaseOrderCode")
   public String getPurchaseOrderCode() {
      return this.purchaseOrderCode;
   }

   @JsonProperty("categoryNumber")
   public void setCategoryNumber(int categoryNumber) {
      this.categoryNumber = categoryNumber;
   }

   @JsonProperty("categoryNumber")
   public int getCategoryNumber() {
      return this.categoryNumber;
   }

   @JsonProperty("totalNubmer")
   public void setTotalNubmer(int totalNubmer) {
      this.totalNubmer = totalNubmer;
   }

   @JsonProperty("totalNubmer")
   public int getTotalNubmer() {
      return this.totalNubmer;
   }

   @JsonProperty("totalAmount")
   public void setTotalAmount(BigDecimal totalAmount) {
      this.totalAmount = totalAmount;
   }

   @JsonProperty("totalAmount")
   public BigDecimal getTotalAmount() {
      return this.totalAmount;
   }

   @JsonProperty("actualTotalAmount")
   public void setActualTotalAmount(BigDecimal actualTotalAmount) {
      this.actualTotalAmount = actualTotalAmount;
   }

   @JsonProperty("actualTotalAmount")
   public BigDecimal getActualTotalAmount() {
      return this.actualTotalAmount;
   }

   @JsonProperty("purchaseDate")
   public void setPurchaseDate(Date purchaseDate) {
      this.purchaseDate = purchaseDate;
   }

   @JsonProperty("purchaseDate")
   public Date getPurchaseDate() {
      return this.purchaseDate;
   }

   @JsonProperty("supposedArrivingDate")
   public void setSupposedArrivingDate(Date supposedArrivingDate) {
      this.supposedArrivingDate = supposedArrivingDate;
   }

   @JsonProperty("supposedArrivingDate")
   public Date getSupposedArrivingDate() {
      return this.supposedArrivingDate;
   }

   @JsonProperty("buyerContactId")
   public void setBuyerContactId(String buyerContactId) {
      this.buyerContactId = buyerContactId;
   }

   @JsonProperty("buyerContactId")
   public String getBuyerContactId() {
      return this.buyerContactId;
   }

   @JsonProperty("buyerContact")
   public void setBuyerContact(String buyerContact) {
      this.buyerContact = buyerContact;
   }

   @JsonProperty("buyerContact")
   public String getBuyerContact() {
      return this.buyerContact;
   }

   @JsonProperty("vendorCode")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("vendorName")
   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   @JsonProperty("vendorName")
   public String getVendorName() {
      return this.vendorName;
   }

   @JsonProperty("shippingAddress")
   public void setShippingAddress(String shippingAddress) {
      this.shippingAddress = shippingAddress;
   }

   @JsonProperty("shippingAddress")
   public String getShippingAddress() {
      return this.shippingAddress;
   }

   @JsonProperty("warehouseCode")
   public void setWarehouseCode(String warehouseCode) {
      this.warehouseCode = warehouseCode;
   }

   @JsonProperty("warehouseCode")
   public String getWarehouseCode() {
      return this.warehouseCode;
   }

   @JsonProperty("warehouse")
   public void setWarehouse(String warehouse) {
      this.warehouse = warehouse;
   }

   @JsonProperty("warehouse")
   public String getWarehouse() {
      return this.warehouse;
   }

   @JsonProperty("orderOwnerCode")
   public void setOrderOwnerCode(String orderOwnerCode) {
      this.orderOwnerCode = orderOwnerCode;
   }

   @JsonProperty("orderOwnerCode")
   public String getOrderOwnerCode() {
      return this.orderOwnerCode;
   }

   @JsonProperty("orderOwner")
   public void setOrderOwner(String orderOwner) {
      this.orderOwner = orderOwner;
   }

   @JsonProperty("orderOwner")
   public String getOrderOwner() {
      return this.orderOwner;
   }

   @JsonProperty("closingDate")
   public void setClosingDate(Date closingDate) {
      this.closingDate = closingDate;
   }

   @JsonProperty("closingDate")
   public Date getClosingDate() {
      return this.closingDate;
   }

   @JsonProperty("station")
   public void setStation(String station) {
      this.station = station;
   }

   @JsonProperty("station")
   public String getStation() {
      return this.station;
   }

   @JsonProperty("payment")
   public void setPayment(String payment) {
      this.payment = payment;
   }

   @JsonProperty("payment")
   public String getPayment() {
      return this.payment;
   }

   @JsonProperty("orgCode")
   public void setOrgCode(String orgCode) {
      this.orgCode = orgCode;
   }

   @JsonProperty("orgCode")
   public String getOrgCode() {
      return this.orgCode;
   }

   @JsonProperty("orgName")
   public void setOrgName(String orgName) {
      this.orgName = orgName;
   }

   @JsonProperty("orgName")
   public String getOrgName() {
      return this.orgName;
   }

   @JsonProperty("ouCode")
   public void setOuCode(String ouCode) {
      this.ouCode = ouCode;
   }

   @JsonProperty("ouCode")
   public String getOuCode() {
      return this.ouCode;
   }

   @JsonProperty("comments")
   public void setComments(String comments) {
      this.comments = comments;
   }

   @JsonProperty("comments")
   public String getComments() {
      return this.comments;
   }

   @JsonProperty("backOrder")
   public void setBackOrder(boolean backOrder) {
      this.backOrder = backOrder;
   }

   @JsonProperty("backOrder")
   public boolean getBackOrder() {
      return this.backOrder;
   }

   @JsonProperty("tcFlag")
   public void setTcFlag(boolean tcFlag) {
      this.tcFlag = tcFlag;
   }

   @JsonProperty("tcFlag")
   public boolean getTcFlag() {
      return this.tcFlag;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(Date updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public Date getUpdateTime() {
      return this.updateTime;
   }
}
