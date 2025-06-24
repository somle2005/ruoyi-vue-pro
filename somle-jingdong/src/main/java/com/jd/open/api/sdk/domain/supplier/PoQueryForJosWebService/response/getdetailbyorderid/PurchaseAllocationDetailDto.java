package com.jd.open.api.sdk.domain.supplier.PoQueryForJosWebService.response.getdetailbyorderid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class PurchaseAllocationDetailDto implements Serializable {
   private Long orderId;
   private Long wareId;
   private Integer deliverCenterId;
   private String deliverCenterName;
   private String wareName;
   private BigDecimal purchasePrice;
   private Integer originalNum;
   private Integer confirmNum;
   private Integer actualNum;
   private String nonDeliveryReason;
   private Integer backExplanationType;
   private BigDecimal totoalPrice;
   private String remark;
   private String isbn;
   private BigDecimal makePrice;
   private BigDecimal currentMakePrice;
   private BigDecimal discount;
   private Integer storeId;
   private String storeName;
   private PurchaseWarePropertyDto purchaseWareProperty;

   @JsonProperty("order_id")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("order_id")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("ware_id")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("ware_id")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("deliver_center_id")
   public void setDeliverCenterId(Integer deliverCenterId) {
      this.deliverCenterId = deliverCenterId;
   }

   @JsonProperty("deliver_center_id")
   public Integer getDeliverCenterId() {
      return this.deliverCenterId;
   }

   @JsonProperty("deliver_center_name")
   public void setDeliverCenterName(String deliverCenterName) {
      this.deliverCenterName = deliverCenterName;
   }

   @JsonProperty("deliver_center_name")
   public String getDeliverCenterName() {
      return this.deliverCenterName;
   }

   @JsonProperty("ware_name")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("ware_name")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("purchase_price")
   public void setPurchasePrice(BigDecimal purchasePrice) {
      this.purchasePrice = purchasePrice;
   }

   @JsonProperty("purchase_price")
   public BigDecimal getPurchasePrice() {
      return this.purchasePrice;
   }

   @JsonProperty("original_num")
   public void setOriginalNum(Integer originalNum) {
      this.originalNum = originalNum;
   }

   @JsonProperty("original_num")
   public Integer getOriginalNum() {
      return this.originalNum;
   }

   @JsonProperty("confirm_num")
   public void setConfirmNum(Integer confirmNum) {
      this.confirmNum = confirmNum;
   }

   @JsonProperty("confirm_num")
   public Integer getConfirmNum() {
      return this.confirmNum;
   }

   @JsonProperty("actual_num")
   public void setActualNum(Integer actualNum) {
      this.actualNum = actualNum;
   }

   @JsonProperty("actual_num")
   public Integer getActualNum() {
      return this.actualNum;
   }

   @JsonProperty("non_delivery_reason")
   public void setNonDeliveryReason(String nonDeliveryReason) {
      this.nonDeliveryReason = nonDeliveryReason;
   }

   @JsonProperty("non_delivery_reason")
   public String getNonDeliveryReason() {
      return this.nonDeliveryReason;
   }

   @JsonProperty("back_explanation_type")
   public void setBackExplanationType(Integer backExplanationType) {
      this.backExplanationType = backExplanationType;
   }

   @JsonProperty("back_explanation_type")
   public Integer getBackExplanationType() {
      return this.backExplanationType;
   }

   @JsonProperty("totoal_price")
   public void setTotoalPrice(BigDecimal totoalPrice) {
      this.totoalPrice = totoalPrice;
   }

   @JsonProperty("totoal_price")
   public BigDecimal getTotoalPrice() {
      return this.totoalPrice;
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

   @JsonProperty("make_price")
   public void setMakePrice(BigDecimal makePrice) {
      this.makePrice = makePrice;
   }

   @JsonProperty("make_price")
   public BigDecimal getMakePrice() {
      return this.makePrice;
   }

   @JsonProperty("current_make_price")
   public void setCurrentMakePrice(BigDecimal currentMakePrice) {
      this.currentMakePrice = currentMakePrice;
   }

   @JsonProperty("current_make_price")
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

   @JsonProperty("store_id")
   public void setStoreId(Integer storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("store_id")
   public Integer getStoreId() {
      return this.storeId;
   }

   @JsonProperty("store_name")
   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   @JsonProperty("store_name")
   public String getStoreName() {
      return this.storeName;
   }

   @JsonProperty("purchase_ware_property")
   public void setPurchaseWareProperty(PurchaseWarePropertyDto purchaseWareProperty) {
      this.purchaseWareProperty = purchaseWareProperty;
   }

   @JsonProperty("purchase_ware_property")
   public PurchaseWarePropertyDto getPurchaseWareProperty() {
      return this.purchaseWareProperty;
   }
}
