package com.jd.open.api.sdk.domain.supplier.ReturnOrderJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class JosReturnOrderDTO implements Serializable {
   private String vendorCode;
   private String vendorName;
   private String returnOrderCode;
   private String deliveryNumber;
   private Integer lineNumber;
   private Integer categoryNumber;
   private Integer totalNubmer;
   private BigDecimal totalAmount;
   private BigDecimal actualTotalAmount;
   private Date returnDate;
   private String shippingAddress;
   private String freightNum;
   private Integer pakagesNumber;
   private Integer returnOrderStatus;
   private Integer productType;
   private String remark;
   private String orgCode;
   private String orgName;
   private String warehouseCode;
   private String warehouse;
   private String operatorCode;
   private String operatorName;
   private Integer type;
   private Integer productState;
   private Date createTime;
   private Date updateTime;
   private String infoNote;

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

   @JsonProperty("returnOrderCode")
   public void setReturnOrderCode(String returnOrderCode) {
      this.returnOrderCode = returnOrderCode;
   }

   @JsonProperty("returnOrderCode")
   public String getReturnOrderCode() {
      return this.returnOrderCode;
   }

   @JsonProperty("deliveryNumber")
   public void setDeliveryNumber(String deliveryNumber) {
      this.deliveryNumber = deliveryNumber;
   }

   @JsonProperty("deliveryNumber")
   public String getDeliveryNumber() {
      return this.deliveryNumber;
   }

   @JsonProperty("lineNumber")
   public void setLineNumber(Integer lineNumber) {
      this.lineNumber = lineNumber;
   }

   @JsonProperty("lineNumber")
   public Integer getLineNumber() {
      return this.lineNumber;
   }

   @JsonProperty("categoryNumber")
   public void setCategoryNumber(Integer categoryNumber) {
      this.categoryNumber = categoryNumber;
   }

   @JsonProperty("categoryNumber")
   public Integer getCategoryNumber() {
      return this.categoryNumber;
   }

   @JsonProperty("totalNubmer")
   public void setTotalNubmer(Integer totalNubmer) {
      this.totalNubmer = totalNubmer;
   }

   @JsonProperty("totalNubmer")
   public Integer getTotalNubmer() {
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

   @JsonProperty("returnDate")
   public void setReturnDate(Date returnDate) {
      this.returnDate = returnDate;
   }

   @JsonProperty("returnDate")
   public Date getReturnDate() {
      return this.returnDate;
   }

   @JsonProperty("shippingAddress")
   public void setShippingAddress(String shippingAddress) {
      this.shippingAddress = shippingAddress;
   }

   @JsonProperty("shippingAddress")
   public String getShippingAddress() {
      return this.shippingAddress;
   }

   @JsonProperty("freightNum")
   public void setFreightNum(String freightNum) {
      this.freightNum = freightNum;
   }

   @JsonProperty("freightNum")
   public String getFreightNum() {
      return this.freightNum;
   }

   @JsonProperty("pakagesNumber")
   public void setPakagesNumber(Integer pakagesNumber) {
      this.pakagesNumber = pakagesNumber;
   }

   @JsonProperty("pakagesNumber")
   public Integer getPakagesNumber() {
      return this.pakagesNumber;
   }

   @JsonProperty("returnOrderStatus")
   public void setReturnOrderStatus(Integer returnOrderStatus) {
      this.returnOrderStatus = returnOrderStatus;
   }

   @JsonProperty("returnOrderStatus")
   public Integer getReturnOrderStatus() {
      return this.returnOrderStatus;
   }

   @JsonProperty("productType")
   public void setProductType(Integer productType) {
      this.productType = productType;
   }

   @JsonProperty("productType")
   public Integer getProductType() {
      return this.productType;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
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

   @JsonProperty("operatorCode")
   public void setOperatorCode(String operatorCode) {
      this.operatorCode = operatorCode;
   }

   @JsonProperty("operatorCode")
   public String getOperatorCode() {
      return this.operatorCode;
   }

   @JsonProperty("operatorName")
   public void setOperatorName(String operatorName) {
      this.operatorName = operatorName;
   }

   @JsonProperty("operatorName")
   public String getOperatorName() {
      return this.operatorName;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("productState")
   public void setProductState(Integer productState) {
      this.productState = productState;
   }

   @JsonProperty("productState")
   public Integer getProductState() {
      return this.productState;
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

   @JsonProperty("infoNote")
   public void setInfoNote(String infoNote) {
      this.infoNote = infoNote;
   }

   @JsonProperty("infoNote")
   public String getInfoNote() {
      return this.infoNote;
   }
}
