package com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PurchaseAllocationDetailDto implements Serializable {
   private Long wareId;
   private Integer deliverCenterId;
   private String deliverCenterName;
   private String wareName;
   private BigDecimal purchasePrice;
   private BigDecimal totoalPrice;
   private BigDecimal makePrice;
   private BigDecimal currentMakePrice;
   private BigDecimal discount;
   private Integer originalNum;
   private Integer confirmNum;
   private Integer actualNum;
   private String nonDeliveryReason;
   private String remark;
   private String isbn;
   private String brandName;
   private String brandId;
   private PurchaseWarePropertyDto purchaseWareProperty;

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("deliverCenterId")
   public void setDeliverCenterId(Integer deliverCenterId) {
      this.deliverCenterId = deliverCenterId;
   }

   @JsonProperty("deliverCenterId")
   public Integer getDeliverCenterId() {
      return this.deliverCenterId;
   }

   @JsonProperty("deliverCenterName")
   public void setDeliverCenterName(String deliverCenterName) {
      this.deliverCenterName = deliverCenterName;
   }

   @JsonProperty("deliverCenterName")
   public String getDeliverCenterName() {
      return this.deliverCenterName;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("purchasePrice")
   public void setPurchasePrice(BigDecimal purchasePrice) {
      this.purchasePrice = purchasePrice;
   }

   @JsonProperty("purchasePrice")
   public BigDecimal getPurchasePrice() {
      return this.purchasePrice;
   }

   @JsonProperty("totoalPrice")
   public void setTotoalPrice(BigDecimal totoalPrice) {
      this.totoalPrice = totoalPrice;
   }

   @JsonProperty("totoalPrice")
   public BigDecimal getTotoalPrice() {
      return this.totoalPrice;
   }

   @JsonProperty("makePrice")
   public void setMakePrice(BigDecimal makePrice) {
      this.makePrice = makePrice;
   }

   @JsonProperty("makePrice")
   public BigDecimal getMakePrice() {
      return this.makePrice;
   }

   @JsonProperty("currentMakePrice")
   public void setCurrentMakePrice(BigDecimal currentMakePrice) {
      this.currentMakePrice = currentMakePrice;
   }

   @JsonProperty("currentMakePrice")
   public BigDecimal getCurrentMakePrice() {
      return this.currentMakePrice;
   }

   @JsonProperty("discount")
   public void setDiscount(BigDecimal discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public BigDecimal getDiscount() {
      return this.discount;
   }

   @JsonProperty("originalNum")
   public void setOriginalNum(Integer originalNum) {
      this.originalNum = originalNum;
   }

   @JsonProperty("originalNum")
   public Integer getOriginalNum() {
      return this.originalNum;
   }

   @JsonProperty("confirmNum")
   public void setConfirmNum(Integer confirmNum) {
      this.confirmNum = confirmNum;
   }

   @JsonProperty("confirmNum")
   public Integer getConfirmNum() {
      return this.confirmNum;
   }

   @JsonProperty("actualNum")
   public void setActualNum(Integer actualNum) {
      this.actualNum = actualNum;
   }

   @JsonProperty("actualNum")
   public Integer getActualNum() {
      return this.actualNum;
   }

   @JsonProperty("nonDeliveryReason")
   public void setNonDeliveryReason(String nonDeliveryReason) {
      this.nonDeliveryReason = nonDeliveryReason;
   }

   @JsonProperty("nonDeliveryReason")
   public String getNonDeliveryReason() {
      return this.nonDeliveryReason;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("isbn")
   public void setIsbn(String isbn) {
      this.isbn = isbn;
   }

   @JsonProperty("isbn")
   public String getIsbn() {
      return this.isbn;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("brandId")
   public void setBrandId(String brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public String getBrandId() {
      return this.brandId;
   }

   @JsonProperty("purchaseWareProperty")
   public void setPurchaseWareProperty(PurchaseWarePropertyDto purchaseWareProperty) {
      this.purchaseWareProperty = purchaseWareProperty;
   }

   @JsonProperty("purchaseWareProperty")
   public PurchaseWarePropertyDto getPurchaseWareProperty() {
      return this.purchaseWareProperty;
   }
}
