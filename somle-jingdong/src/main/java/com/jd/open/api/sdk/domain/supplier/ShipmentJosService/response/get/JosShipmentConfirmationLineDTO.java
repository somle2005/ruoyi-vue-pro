package com.jd.open.api.sdk.domain.supplier.ShipmentJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class JosShipmentConfirmationLineDTO implements Serializable {
   private int currentRecordCount;
   private String vendorSku;
   private String buyerProductId;
   private String productName;
   private int quantity;
   private int receivingQty;
   private BigDecimal salePrice;
   private String packageNum;
   private String packFirmNumber;
   private String firmRoyalty;
   private String diffDescription;
   private Date receivingDate;
   private String comments;
   private Date createTime;
   private Date updateTime;

   @JsonProperty("currentRecordCount")
   public void setCurrentRecordCount(int currentRecordCount) {
      this.currentRecordCount = currentRecordCount;
   }

   @JsonProperty("currentRecordCount")
   public int getCurrentRecordCount() {
      return this.currentRecordCount;
   }

   @JsonProperty("vendorSku")
   public void setVendorSku(String vendorSku) {
      this.vendorSku = vendorSku;
   }

   @JsonProperty("vendorSku")
   public String getVendorSku() {
      return this.vendorSku;
   }

   @JsonProperty("buyerProductId")
   public void setBuyerProductId(String buyerProductId) {
      this.buyerProductId = buyerProductId;
   }

   @JsonProperty("buyerProductId")
   public String getBuyerProductId() {
      return this.buyerProductId;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("quantity")
   public void setQuantity(int quantity) {
      this.quantity = quantity;
   }

   @JsonProperty("quantity")
   public int getQuantity() {
      return this.quantity;
   }

   @JsonProperty("receivingQty")
   public void setReceivingQty(int receivingQty) {
      this.receivingQty = receivingQty;
   }

   @JsonProperty("receivingQty")
   public int getReceivingQty() {
      return this.receivingQty;
   }

   @JsonProperty("salePrice")
   public void setSalePrice(BigDecimal salePrice) {
      this.salePrice = salePrice;
   }

   @JsonProperty("salePrice")
   public BigDecimal getSalePrice() {
      return this.salePrice;
   }

   @JsonProperty("packageNum")
   public void setPackageNum(String packageNum) {
      this.packageNum = packageNum;
   }

   @JsonProperty("packageNum")
   public String getPackageNum() {
      return this.packageNum;
   }

   @JsonProperty("packFirmNumber")
   public void setPackFirmNumber(String packFirmNumber) {
      this.packFirmNumber = packFirmNumber;
   }

   @JsonProperty("packFirmNumber")
   public String getPackFirmNumber() {
      return this.packFirmNumber;
   }

   @JsonProperty("firmRoyalty")
   public void setFirmRoyalty(String firmRoyalty) {
      this.firmRoyalty = firmRoyalty;
   }

   @JsonProperty("firmRoyalty")
   public String getFirmRoyalty() {
      return this.firmRoyalty;
   }

   @JsonProperty("diffDescription")
   public void setDiffDescription(String diffDescription) {
      this.diffDescription = diffDescription;
   }

   @JsonProperty("diffDescription")
   public String getDiffDescription() {
      return this.diffDescription;
   }

   @JsonProperty("receivingDate")
   public void setReceivingDate(Date receivingDate) {
      this.receivingDate = receivingDate;
   }

   @JsonProperty("receivingDate")
   public Date getReceivingDate() {
      return this.receivingDate;
   }

   @JsonProperty("comments")
   public void setComments(String comments) {
      this.comments = comments;
   }

   @JsonProperty("comments")
   public String getComments() {
      return this.comments;
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
