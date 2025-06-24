package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.request.applySparePart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class SparePart implements Serializable {
   private String brandName;
   private String partsCode;
   private Integer partsApplyQty;
   private String partsJdId;
   private Boolean oldPartsReturn;
   private String failureName;
   private Integer categoryId1;
   private String categoryName3;
   private Integer categoryId2;
   private String categoryName4;
   private String categoryName1;
   private Integer categoryId3;
   private String failureId;
   private String categoryName2;
   private Integer categoryId4;
   private String brandId;
   private BigDecimal retailPrice;
   private String productNo;
   private String partsName;

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("partsCode")
   public void setPartsCode(String partsCode) {
      this.partsCode = partsCode;
   }

   @JsonProperty("partsCode")
   public String getPartsCode() {
      return this.partsCode;
   }

   @JsonProperty("partsApplyQty")
   public void setPartsApplyQty(Integer partsApplyQty) {
      this.partsApplyQty = partsApplyQty;
   }

   @JsonProperty("partsApplyQty")
   public Integer getPartsApplyQty() {
      return this.partsApplyQty;
   }

   @JsonProperty("partsJdId")
   public void setPartsJdId(String partsJdId) {
      this.partsJdId = partsJdId;
   }

   @JsonProperty("partsJdId")
   public String getPartsJdId() {
      return this.partsJdId;
   }

   @JsonProperty("oldPartsReturn")
   public void setOldPartsReturn(Boolean oldPartsReturn) {
      this.oldPartsReturn = oldPartsReturn;
   }

   @JsonProperty("oldPartsReturn")
   public Boolean getOldPartsReturn() {
      return this.oldPartsReturn;
   }

   @JsonProperty("failureName")
   public void setFailureName(String failureName) {
      this.failureName = failureName;
   }

   @JsonProperty("failureName")
   public String getFailureName() {
      return this.failureName;
   }

   @JsonProperty("categoryId1")
   public void setCategoryId1(Integer categoryId1) {
      this.categoryId1 = categoryId1;
   }

   @JsonProperty("categoryId1")
   public Integer getCategoryId1() {
      return this.categoryId1;
   }

   @JsonProperty("categoryName3")
   public void setCategoryName3(String categoryName3) {
      this.categoryName3 = categoryName3;
   }

   @JsonProperty("categoryName3")
   public String getCategoryName3() {
      return this.categoryName3;
   }

   @JsonProperty("categoryId2")
   public void setCategoryId2(Integer categoryId2) {
      this.categoryId2 = categoryId2;
   }

   @JsonProperty("categoryId2")
   public Integer getCategoryId2() {
      return this.categoryId2;
   }

   @JsonProperty("categoryName4")
   public void setCategoryName4(String categoryName4) {
      this.categoryName4 = categoryName4;
   }

   @JsonProperty("categoryName4")
   public String getCategoryName4() {
      return this.categoryName4;
   }

   @JsonProperty("categoryName1")
   public void setCategoryName1(String categoryName1) {
      this.categoryName1 = categoryName1;
   }

   @JsonProperty("categoryName1")
   public String getCategoryName1() {
      return this.categoryName1;
   }

   @JsonProperty("categoryId3")
   public void setCategoryId3(Integer categoryId3) {
      this.categoryId3 = categoryId3;
   }

   @JsonProperty("categoryId3")
   public Integer getCategoryId3() {
      return this.categoryId3;
   }

   @JsonProperty("failureId")
   public void setFailureId(String failureId) {
      this.failureId = failureId;
   }

   @JsonProperty("failureId")
   public String getFailureId() {
      return this.failureId;
   }

   @JsonProperty("categoryName2")
   public void setCategoryName2(String categoryName2) {
      this.categoryName2 = categoryName2;
   }

   @JsonProperty("categoryName2")
   public String getCategoryName2() {
      return this.categoryName2;
   }

   @JsonProperty("categoryId4")
   public void setCategoryId4(Integer categoryId4) {
      this.categoryId4 = categoryId4;
   }

   @JsonProperty("categoryId4")
   public Integer getCategoryId4() {
      return this.categoryId4;
   }

   @JsonProperty("brandId")
   public void setBrandId(String brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public String getBrandId() {
      return this.brandId;
   }

   @JsonProperty("retailPrice")
   public void setRetailPrice(BigDecimal retailPrice) {
      this.retailPrice = retailPrice;
   }

   @JsonProperty("retailPrice")
   public BigDecimal getRetailPrice() {
      return this.retailPrice;
   }

   @JsonProperty("productNo")
   public void setProductNo(String productNo) {
      this.productNo = productNo;
   }

   @JsonProperty("productNo")
   public String getProductNo() {
      return this.productNo;
   }

   @JsonProperty("partsName")
   public void setPartsName(String partsName) {
      this.partsName = partsName;
   }

   @JsonProperty("partsName")
   public String getPartsName() {
      return this.partsName;
   }
}
