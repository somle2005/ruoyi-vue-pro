package com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class JosPurchaseOrderProDTO implements Serializable {
   private Date createTime;
   private String vendorName;
   private String vendorId;
   private String jdGlnCode;
   private String glnCode;
   private String prePurchaseOrderCode;
   private String purchaseOrderCode;
   private int categoryNumber;
   private int totalNubmer;
   private BigDecimal totalAmount;
   private BigDecimal actualTotalAmount;
   private Date purchaseDate;
   private Date supposedArrivingDate;
   private String buyerContact;
   private String departmentCode;
   private String advanceOrder;
   private String orderAttribute;
   private String ouCode;
   private String orgName;
   private String orgCode;
   private String warehouseCode;
   private String warehouse;
   private String warehouseGln;
   private String receiver;
   private String receiverTel;
   private String shippingAddress;
   private String station;
   private boolean isTC;
   private String payment;
   private boolean backOrder;
   private String remark;

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("vendorName")
   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   @JsonProperty("vendorName")
   public String getVendorName() {
      return this.vendorName;
   }

   @JsonProperty("vendorId")
   public void setVendorId(String vendorId) {
      this.vendorId = vendorId;
   }

   @JsonProperty("vendorId")
   public String getVendorId() {
      return this.vendorId;
   }

   @JsonProperty("jdGlnCode")
   public void setJdGlnCode(String jdGlnCode) {
      this.jdGlnCode = jdGlnCode;
   }

   @JsonProperty("jdGlnCode")
   public String getJdGlnCode() {
      return this.jdGlnCode;
   }

   @JsonProperty("glnCode")
   public void setGlnCode(String glnCode) {
      this.glnCode = glnCode;
   }

   @JsonProperty("glnCode")
   public String getGlnCode() {
      return this.glnCode;
   }

   @JsonProperty("prePurchaseOrderCode")
   public void setPrePurchaseOrderCode(String prePurchaseOrderCode) {
      this.prePurchaseOrderCode = prePurchaseOrderCode;
   }

   @JsonProperty("prePurchaseOrderCode")
   public String getPrePurchaseOrderCode() {
      return this.prePurchaseOrderCode;
   }

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

   @JsonProperty("buyerContact")
   public void setBuyerContact(String buyerContact) {
      this.buyerContact = buyerContact;
   }

   @JsonProperty("buyerContact")
   public String getBuyerContact() {
      return this.buyerContact;
   }

   @JsonProperty("departmentCode")
   public void setDepartmentCode(String departmentCode) {
      this.departmentCode = departmentCode;
   }

   @JsonProperty("departmentCode")
   public String getDepartmentCode() {
      return this.departmentCode;
   }

   @JsonProperty("advanceOrder")
   public void setAdvanceOrder(String advanceOrder) {
      this.advanceOrder = advanceOrder;
   }

   @JsonProperty("advanceOrder")
   public String getAdvanceOrder() {
      return this.advanceOrder;
   }

   @JsonProperty("orderAttribute")
   public void setOrderAttribute(String orderAttribute) {
      this.orderAttribute = orderAttribute;
   }

   @JsonProperty("orderAttribute")
   public String getOrderAttribute() {
      return this.orderAttribute;
   }

   @JsonProperty("ouCode")
   public void setOuCode(String ouCode) {
      this.ouCode = ouCode;
   }

   @JsonProperty("ouCode")
   public String getOuCode() {
      return this.ouCode;
   }

   @JsonProperty("orgName")
   public void setOrgName(String orgName) {
      this.orgName = orgName;
   }

   @JsonProperty("orgName")
   public String getOrgName() {
      return this.orgName;
   }

   @JsonProperty("orgCode")
   public void setOrgCode(String orgCode) {
      this.orgCode = orgCode;
   }

   @JsonProperty("orgCode")
   public String getOrgCode() {
      return this.orgCode;
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

   @JsonProperty("warehouseGln")
   public void setWarehouseGln(String warehouseGln) {
      this.warehouseGln = warehouseGln;
   }

   @JsonProperty("warehouseGln")
   public String getWarehouseGln() {
      return this.warehouseGln;
   }

   @JsonProperty("receiver")
   public void setReceiver(String receiver) {
      this.receiver = receiver;
   }

   @JsonProperty("receiver")
   public String getReceiver() {
      return this.receiver;
   }

   @JsonProperty("receiverTel")
   public void setReceiverTel(String receiverTel) {
      this.receiverTel = receiverTel;
   }

   @JsonProperty("receiverTel")
   public String getReceiverTel() {
      return this.receiverTel;
   }

   @JsonProperty("shippingAddress")
   public void setShippingAddress(String shippingAddress) {
      this.shippingAddress = shippingAddress;
   }

   @JsonProperty("shippingAddress")
   public String getShippingAddress() {
      return this.shippingAddress;
   }

   @JsonProperty("station")
   public void setStation(String station) {
      this.station = station;
   }

   @JsonProperty("station")
   public String getStation() {
      return this.station;
   }

   @JsonProperty("isTC")
   public void setIsTC(boolean isTC) {
      this.isTC = isTC;
   }

   @JsonProperty("isTC")
   public boolean getIsTC() {
      return this.isTC;
   }

   @JsonProperty("payment")
   public void setPayment(String payment) {
      this.payment = payment;
   }

   @JsonProperty("payment")
   public String getPayment() {
      return this.payment;
   }

   @JsonProperty("backOrder")
   public void setBackOrder(boolean backOrder) {
      this.backOrder = backOrder;
   }

   @JsonProperty("backOrder")
   public boolean getBackOrder() {
      return this.backOrder;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }
}
