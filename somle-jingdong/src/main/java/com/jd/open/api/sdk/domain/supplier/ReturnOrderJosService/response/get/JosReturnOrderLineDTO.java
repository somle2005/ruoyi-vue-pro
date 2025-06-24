package com.jd.open.api.sdk.domain.supplier.ReturnOrderJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class JosReturnOrderLineDTO implements Serializable {
   private String returnOrderCode;
   private String vendorProductId;
   private String jdSku;
   private String productName;
   private String productCode;
   private Integer quantity;
   private BigDecimal pricing;
   private BigDecimal salesPrice;
   private BigDecimal sparePartReturnPrice;
   private BigDecimal discountRate;
   private String returnBased;
   private Integer receivingQty;
   private Integer damagedQty;
   private String remark;
   private String idPart;
   private String damageReason;
   private Date createTime;
   private Date updateTime;

   @JsonProperty("returnOrderCode")
   public void setReturnOrderCode(String returnOrderCode) {
      this.returnOrderCode = returnOrderCode;
   }

   @JsonProperty("returnOrderCode")
   public String getReturnOrderCode() {
      return this.returnOrderCode;
   }

   @JsonProperty("vendorProductId")
   public void setVendorProductId(String vendorProductId) {
      this.vendorProductId = vendorProductId;
   }

   @JsonProperty("vendorProductId")
   public String getVendorProductId() {
      return this.vendorProductId;
   }

   @JsonProperty("jdSku")
   public void setJdSku(String jdSku) {
      this.jdSku = jdSku;
   }

   @JsonProperty("jdSku")
   public String getJdSku() {
      return this.jdSku;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("productCode")
   public void setProductCode(String productCode) {
      this.productCode = productCode;
   }

   @JsonProperty("productCode")
   public String getProductCode() {
      return this.productCode;
   }

   @JsonProperty("quantity")
   public void setQuantity(Integer quantity) {
      this.quantity = quantity;
   }

   @JsonProperty("quantity")
   public Integer getQuantity() {
      return this.quantity;
   }

   @JsonProperty("pricing")
   public void setPricing(BigDecimal pricing) {
      this.pricing = pricing;
   }

   @JsonProperty("pricing")
   public BigDecimal getPricing() {
      return this.pricing;
   }

   @JsonProperty("salesPrice")
   public void setSalesPrice(BigDecimal salesPrice) {
      this.salesPrice = salesPrice;
   }

   @JsonProperty("salesPrice")
   public BigDecimal getSalesPrice() {
      return this.salesPrice;
   }

   @JsonProperty("sparePartReturnPrice")
   public void setSparePartReturnPrice(BigDecimal sparePartReturnPrice) {
      this.sparePartReturnPrice = sparePartReturnPrice;
   }

   @JsonProperty("sparePartReturnPrice")
   public BigDecimal getSparePartReturnPrice() {
      return this.sparePartReturnPrice;
   }

   @JsonProperty("discountRate")
   public void setDiscountRate(BigDecimal discountRate) {
      this.discountRate = discountRate;
   }

   @JsonProperty("discountRate")
   public BigDecimal getDiscountRate() {
      return this.discountRate;
   }

   @JsonProperty("returnBased")
   public void setReturnBased(String returnBased) {
      this.returnBased = returnBased;
   }

   @JsonProperty("returnBased")
   public String getReturnBased() {
      return this.returnBased;
   }

   @JsonProperty("receivingQty")
   public void setReceivingQty(Integer receivingQty) {
      this.receivingQty = receivingQty;
   }

   @JsonProperty("receivingQty")
   public Integer getReceivingQty() {
      return this.receivingQty;
   }

   @JsonProperty("damagedQty")
   public void setDamagedQty(Integer damagedQty) {
      this.damagedQty = damagedQty;
   }

   @JsonProperty("damagedQty")
   public Integer getDamagedQty() {
      return this.damagedQty;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("idPart")
   public void setIdPart(String idPart) {
      this.idPart = idPart;
   }

   @JsonProperty("idPart")
   public String getIdPart() {
      return this.idPart;
   }

   @JsonProperty("damageReason")
   public void setDamageReason(String damageReason) {
      this.damageReason = damageReason;
   }

   @JsonProperty("damageReason")
   public String getDamageReason() {
      return this.damageReason;
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
