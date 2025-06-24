package com.jd.open.api.sdk.domain.ware.WareOptimizeService.request.wareInfoCheckOptimize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WareInfoReq implements Serializable {
   private String hrefSlogan;
   private List<StructedAttribute> spuStructAttr;
   private List<SkuReq> skus;
   private String title;
   private Long categoryId1;
   private Long lastCategoryId;
   private Long categoryId2;
   private List<MarketingInfo> marketing;
   private Long categoryId3;
   private String virtualAssembly;
   private Integer colType;
   private String salesReturn;
   private String warranty;
   private List<Attribute> spu;
   private Long spuId;
   private Long tempSpuId;
   private String model;
   private String slogan;
   private String imgUrl;

   @JsonProperty("hrefSlogan")
   public void setHrefSlogan(String hrefSlogan) {
      this.hrefSlogan = hrefSlogan;
   }

   @JsonProperty("hrefSlogan")
   public String getHrefSlogan() {
      return this.hrefSlogan;
   }

   @JsonProperty("spuStructAttr")
   public void setSpuStructAttr(List<StructedAttribute> spuStructAttr) {
      this.spuStructAttr = spuStructAttr;
   }

   @JsonProperty("spuStructAttr")
   public List<StructedAttribute> getSpuStructAttr() {
      return this.spuStructAttr;
   }

   @JsonProperty("skus")
   public void setSkus(List<SkuReq> skus) {
      this.skus = skus;
   }

   @JsonProperty("skus")
   public List<SkuReq> getSkus() {
      return this.skus;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("categoryId1")
   public void setCategoryId1(Long categoryId1) {
      this.categoryId1 = categoryId1;
   }

   @JsonProperty("categoryId1")
   public Long getCategoryId1() {
      return this.categoryId1;
   }

   @JsonProperty("lastCategoryId")
   public void setLastCategoryId(Long lastCategoryId) {
      this.lastCategoryId = lastCategoryId;
   }

   @JsonProperty("lastCategoryId")
   public Long getLastCategoryId() {
      return this.lastCategoryId;
   }

   @JsonProperty("categoryId2")
   public void setCategoryId2(Long categoryId2) {
      this.categoryId2 = categoryId2;
   }

   @JsonProperty("categoryId2")
   public Long getCategoryId2() {
      return this.categoryId2;
   }

   @JsonProperty("marketing")
   public void setMarketing(List<MarketingInfo> marketing) {
      this.marketing = marketing;
   }

   @JsonProperty("marketing")
   public List<MarketingInfo> getMarketing() {
      return this.marketing;
   }

   @JsonProperty("categoryId3")
   public void setCategoryId3(Long categoryId3) {
      this.categoryId3 = categoryId3;
   }

   @JsonProperty("categoryId3")
   public Long getCategoryId3() {
      return this.categoryId3;
   }

   @JsonProperty("virtualAssembly")
   public void setVirtualAssembly(String virtualAssembly) {
      this.virtualAssembly = virtualAssembly;
   }

   @JsonProperty("virtualAssembly")
   public String getVirtualAssembly() {
      return this.virtualAssembly;
   }

   @JsonProperty("colType")
   public void setColType(Integer colType) {
      this.colType = colType;
   }

   @JsonProperty("colType")
   public Integer getColType() {
      return this.colType;
   }

   @JsonProperty("salesReturn")
   public void setSalesReturn(String salesReturn) {
      this.salesReturn = salesReturn;
   }

   @JsonProperty("salesReturn")
   public String getSalesReturn() {
      return this.salesReturn;
   }

   @JsonProperty("warranty")
   public void setWarranty(String warranty) {
      this.warranty = warranty;
   }

   @JsonProperty("warranty")
   public String getWarranty() {
      return this.warranty;
   }

   @JsonProperty("spu")
   public void setSpu(List<Attribute> spu) {
      this.spu = spu;
   }

   @JsonProperty("spu")
   public List<Attribute> getSpu() {
      return this.spu;
   }

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("tempSpuId")
   public void setTempSpuId(Long tempSpuId) {
      this.tempSpuId = tempSpuId;
   }

   @JsonProperty("tempSpuId")
   public Long getTempSpuId() {
      return this.tempSpuId;
   }

   @JsonProperty("model")
   public void setModel(String model) {
      this.model = model;
   }

   @JsonProperty("model")
   public String getModel() {
      return this.model;
   }

   @JsonProperty("slogan")
   public void setSlogan(String slogan) {
      this.slogan = slogan;
   }

   @JsonProperty("slogan")
   public String getSlogan() {
      return this.slogan;
   }

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }
}
