package com.jd.open.api.sdk.domain.spgl.ProductReadRpcService.response.queryProductInfoByPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ProductInfoDTO implements Serializable {
   private String productId;
   private String productName;
   private String productImageUrl;
   private String sellerSpuCode;
   private Long firstCategoryId;
   private Long secondCategoryId;
   private Long threeCategoryId;
   private Long fourCategoryId;
   private Integer afterSales;
   private Long transportId;
   private Long lastCategoryId;
   private Long brandId;
   private String adword;
   private LocalDateTime addedDate;
   private Integer productStatus;
   private String productStatusName;
   private Integer payWay;
   private String minPrice;
   private String maxPrice;
   private String adWord;
   private Long categoryId;
   private String categoryName;
   private String stock;
   private Long supplierId;
   private List<TargetTag> productTagList;
   private String saleUnit;

   @JsonProperty("productId")
   public void setProductId(String productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public String getProductId() {
      return this.productId;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("productImageUrl")
   public void setProductImageUrl(String productImageUrl) {
      this.productImageUrl = productImageUrl;
   }

   @JsonProperty("productImageUrl")
   public String getProductImageUrl() {
      return this.productImageUrl;
   }

   @JsonProperty("sellerSpuCode")
   public void setSellerSpuCode(String sellerSpuCode) {
      this.sellerSpuCode = sellerSpuCode;
   }

   @JsonProperty("sellerSpuCode")
   public String getSellerSpuCode() {
      return this.sellerSpuCode;
   }

   @JsonProperty("firstCategoryId")
   public void setFirstCategoryId(Long firstCategoryId) {
      this.firstCategoryId = firstCategoryId;
   }

   @JsonProperty("firstCategoryId")
   public Long getFirstCategoryId() {
      return this.firstCategoryId;
   }

   @JsonProperty("secondCategoryId")
   public void setSecondCategoryId(Long secondCategoryId) {
      this.secondCategoryId = secondCategoryId;
   }

   @JsonProperty("secondCategoryId")
   public Long getSecondCategoryId() {
      return this.secondCategoryId;
   }

   @JsonProperty("threeCategoryId")
   public void setThreeCategoryId(Long threeCategoryId) {
      this.threeCategoryId = threeCategoryId;
   }

   @JsonProperty("threeCategoryId")
   public Long getThreeCategoryId() {
      return this.threeCategoryId;
   }

   @JsonProperty("fourCategoryId")
   public void setFourCategoryId(Long fourCategoryId) {
      this.fourCategoryId = fourCategoryId;
   }

   @JsonProperty("fourCategoryId")
   public Long getFourCategoryId() {
      return this.fourCategoryId;
   }

   @JsonProperty("afterSales")
   public void setAfterSales(Integer afterSales) {
      this.afterSales = afterSales;
   }

   @JsonProperty("afterSales")
   public Integer getAfterSales() {
      return this.afterSales;
   }

   @JsonProperty("transportId")
   public void setTransportId(Long transportId) {
      this.transportId = transportId;
   }

   @JsonProperty("transportId")
   public Long getTransportId() {
      return this.transportId;
   }

   @JsonProperty("lastCategoryId")
   public void setLastCategoryId(Long lastCategoryId) {
      this.lastCategoryId = lastCategoryId;
   }

   @JsonProperty("lastCategoryId")
   public Long getLastCategoryId() {
      return this.lastCategoryId;
   }

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("adword")
   public void setAdword(String adword) {
      this.adword = adword;
   }

   @JsonProperty("adword")
   public String getAdword() {
      return this.adword;
   }

   @JsonProperty("addedDate")
   public void setAddedDate(LocalDateTime addedDate) {
      this.addedDate = addedDate;
   }

   @JsonProperty("addedDate")
   public LocalDateTime getAddedDate() {
      return this.addedDate;
   }

   @JsonProperty("productStatus")
   public void setProductStatus(Integer productStatus) {
      this.productStatus = productStatus;
   }

   @JsonProperty("productStatus")
   public Integer getProductStatus() {
      return this.productStatus;
   }

   @JsonProperty("productStatusName")
   public void setProductStatusName(String productStatusName) {
      this.productStatusName = productStatusName;
   }

   @JsonProperty("productStatusName")
   public String getProductStatusName() {
      return this.productStatusName;
   }

   @JsonProperty("payWay")
   public void setPayWay(Integer payWay) {
      this.payWay = payWay;
   }

   @JsonProperty("payWay")
   public Integer getPayWay() {
      return this.payWay;
   }

   @JsonProperty("minPrice")
   public void setMinPrice(String minPrice) {
      this.minPrice = minPrice;
   }

   @JsonProperty("minPrice")
   public String getMinPrice() {
      return this.minPrice;
   }

   @JsonProperty("maxPrice")
   public void setMaxPrice(String maxPrice) {
      this.maxPrice = maxPrice;
   }

   @JsonProperty("maxPrice")
   public String getMaxPrice() {
      return this.maxPrice;
   }

   @JsonProperty("adWord")
   public void setAdWord(String adWord) {
      this.adWord = adWord;
   }

   @JsonProperty("adWord")
   public String getAdWord() {
      return this.adWord;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("categoryName")
   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   @JsonProperty("categoryName")
   public String getCategoryName() {
      return this.categoryName;
   }

   @JsonProperty("stock")
   public void setStock(String stock) {
      this.stock = stock;
   }

   @JsonProperty("stock")
   public String getStock() {
      return this.stock;
   }

   @JsonProperty("supplierId")
   public void setSupplierId(Long supplierId) {
      this.supplierId = supplierId;
   }

   @JsonProperty("supplierId")
   public Long getSupplierId() {
      return this.supplierId;
   }

   @JsonProperty("productTagList")
   public void setProductTagList(List<TargetTag> productTagList) {
      this.productTagList = productTagList;
   }

   @JsonProperty("productTagList")
   public List<TargetTag> getProductTagList() {
      return this.productTagList;
   }

   @JsonProperty("saleUnit")
   public void setSaleUnit(String saleUnit) {
      this.saleUnit = saleUnit;
   }

   @JsonProperty("saleUnit")
   public String getSaleUnit() {
      return this.saleUnit;
   }
}
