package com.jd.open.api.sdk.domain.supplier.PurchaseOrderJosService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class JosPurchaseOrderLineDTO implements Serializable {
   private String purchaseOrderCode;
   private Integer brandId;
   private Integer cate3Id;
   private String vendorSku;
   private String buyerProductId;
   private String productCode;
   private String upcCode;
   private String productName;
   private Integer encasementRule;
   private Double listPrice;
   private Integer quantity;
   private Double salePrice;
   private Double discountRate;
   private Integer inspectionMode;
   private String backOrderProcessing;
   private String remark;
   private String comments;
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

   @JsonProperty("brandId")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Integer getBrandId() {
      return this.brandId;
   }

   @JsonProperty("cate3Id")
   public void setCate3Id(Integer cate3Id) {
      this.cate3Id = cate3Id;
   }

   @JsonProperty("cate3Id")
   public Integer getCate3Id() {
      return this.cate3Id;
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

   @JsonProperty("productCode")
   public void setProductCode(String productCode) {
      this.productCode = productCode;
   }

   @JsonProperty("productCode")
   public String getProductCode() {
      return this.productCode;
   }

   @JsonProperty("upcCode")
   public void setUpcCode(String upcCode) {
      this.upcCode = upcCode;
   }

   @JsonProperty("upcCode")
   public String getUpcCode() {
      return this.upcCode;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("encasementRule")
   public void setEncasementRule(Integer encasementRule) {
      this.encasementRule = encasementRule;
   }

   @JsonProperty("encasementRule")
   public Integer getEncasementRule() {
      return this.encasementRule;
   }

   @JsonProperty("listPrice")
   public void setListPrice(Double listPrice) {
      this.listPrice = listPrice;
   }

   @JsonProperty("listPrice")
   public Double getListPrice() {
      return this.listPrice;
   }

   @JsonProperty("quantity")
   public void setQuantity(Integer quantity) {
      this.quantity = quantity;
   }

   @JsonProperty("quantity")
   public Integer getQuantity() {
      return this.quantity;
   }

   @JsonProperty("salePrice")
   public void setSalePrice(Double salePrice) {
      this.salePrice = salePrice;
   }

   @JsonProperty("salePrice")
   public Double getSalePrice() {
      return this.salePrice;
   }

   @JsonProperty("discountRate")
   public void setDiscountRate(Double discountRate) {
      this.discountRate = discountRate;
   }

   @JsonProperty("discountRate")
   public Double getDiscountRate() {
      return this.discountRate;
   }

   @JsonProperty("inspectionMode")
   public void setInspectionMode(Integer inspectionMode) {
      this.inspectionMode = inspectionMode;
   }

   @JsonProperty("inspectionMode")
   public Integer getInspectionMode() {
      return this.inspectionMode;
   }

   @JsonProperty("backOrderProcessing")
   public void setBackOrderProcessing(String backOrderProcessing) {
      this.backOrderProcessing = backOrderProcessing;
   }

   @JsonProperty("backOrderProcessing")
   public String getBackOrderProcessing() {
      return this.backOrderProcessing;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
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
