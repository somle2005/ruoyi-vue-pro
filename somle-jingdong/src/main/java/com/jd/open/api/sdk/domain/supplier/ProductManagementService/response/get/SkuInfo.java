package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class SkuInfo implements Serializable {
   private String skuId;
   private String skuName;
   private String uuid;
   private String dim1Val;
   private Integer dim1Sort;
   private String dim2Val;
   private Integer dim2Sort;
   private List<SaleAttributeDto> otherSaleAttribute;
   private BigDecimal marketPrice;
   private BigDecimal purchasePrice;
   private BigDecimal memberPrice;
   private BigDecimal weight;
   private Integer length;
   private Integer width;
   private Integer height;
   private String upc;
   private String itemNum;
   private String skuShortTitle;

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("uuid")
   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   @JsonProperty("uuid")
   public String getUuid() {
      return this.uuid;
   }

   @JsonProperty("dim1_val")
   public void setDim1Val(String dim1Val) {
      this.dim1Val = dim1Val;
   }

   @JsonProperty("dim1_val")
   public String getDim1Val() {
      return this.dim1Val;
   }

   @JsonProperty("dim1_sort")
   public void setDim1Sort(Integer dim1Sort) {
      this.dim1Sort = dim1Sort;
   }

   @JsonProperty("dim1_sort")
   public Integer getDim1Sort() {
      return this.dim1Sort;
   }

   @JsonProperty("dim2_val")
   public void setDim2Val(String dim2Val) {
      this.dim2Val = dim2Val;
   }

   @JsonProperty("dim2_val")
   public String getDim2Val() {
      return this.dim2Val;
   }

   @JsonProperty("dim2_sort")
   public void setDim2Sort(Integer dim2Sort) {
      this.dim2Sort = dim2Sort;
   }

   @JsonProperty("dim2_sort")
   public Integer getDim2Sort() {
      return this.dim2Sort;
   }

   @JsonProperty("other_sale_attribute")
   public void setOtherSaleAttribute(List<SaleAttributeDto> otherSaleAttribute) {
      this.otherSaleAttribute = otherSaleAttribute;
   }

   @JsonProperty("other_sale_attribute")
   public List<SaleAttributeDto> getOtherSaleAttribute() {
      return this.otherSaleAttribute;
   }

   @JsonProperty("market_price")
   public void setMarketPrice(BigDecimal marketPrice) {
      this.marketPrice = marketPrice;
   }

   @JsonProperty("market_price")
   public BigDecimal getMarketPrice() {
      return this.marketPrice;
   }

   @JsonProperty("purchase_price")
   public void setPurchasePrice(BigDecimal purchasePrice) {
      this.purchasePrice = purchasePrice;
   }

   @JsonProperty("purchase_price")
   public BigDecimal getPurchasePrice() {
      return this.purchasePrice;
   }

   @JsonProperty("member_price")
   public void setMemberPrice(BigDecimal memberPrice) {
      this.memberPrice = memberPrice;
   }

   @JsonProperty("member_price")
   public BigDecimal getMemberPrice() {
      return this.memberPrice;
   }

   @JsonProperty("weight")
   public void setWeight(BigDecimal weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public BigDecimal getWeight() {
      return this.weight;
   }

   @JsonProperty("length")
   public void setLength(Integer length) {
      this.length = length;
   }

   @JsonProperty("length")
   public Integer getLength() {
      return this.length;
   }

   @JsonProperty("width")
   public void setWidth(Integer width) {
      this.width = width;
   }

   @JsonProperty("width")
   public Integer getWidth() {
      return this.width;
   }

   @JsonProperty("height")
   public void setHeight(Integer height) {
      this.height = height;
   }

   @JsonProperty("height")
   public Integer getHeight() {
      return this.height;
   }

   @JsonProperty("upc")
   public void setUpc(String upc) {
      this.upc = upc;
   }

   @JsonProperty("upc")
   public String getUpc() {
      return this.upc;
   }

   @JsonProperty("itemNum")
   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   @JsonProperty("itemNum")
   public String getItemNum() {
      return this.itemNum;
   }

   @JsonProperty("skuShortTitle")
   public void setSkuShortTitle(String skuShortTitle) {
      this.skuShortTitle = skuShortTitle;
   }

   @JsonProperty("skuShortTitle")
   public String getSkuShortTitle() {
      return this.skuShortTitle;
   }
}
