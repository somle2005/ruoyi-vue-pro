package com.jd.open.api.sdk.domain.youE.SparePartExportJosService.response.querySparePart;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class SparePartData implements Serializable {
   private String productModel;
   private Integer secondCatId;
   private String fixObject;
   private String fourthCatName;
   private String secondCatName;
   private BigDecimal goodsRetailPrice;
   private String isBack;
   private Integer thirdCatId;
   private Integer yn;
   private Integer firstCatId;
   private Integer providerId;
   private BigDecimal goodsSellPrice;
   private String goodsName;
   private String providerName;
   private String thirdCatName;
   private String createDate;
   private String modifyBy;
   private String brandName;
   private String modifyDate;
   private String jdGoodsCode;
   private String fixObjectCode;
   private String firstCatName;
   private String createBy;
   private Integer brandId;
   private String goodsCode;
   private Integer fourthCatId;

   @JsonProperty("productModel")
   public void setProductModel(String productModel) {
      this.productModel = productModel;
   }

   @JsonProperty("productModel")
   public String getProductModel() {
      return this.productModel;
   }

   @JsonProperty("secondCatId")
   public void setSecondCatId(Integer secondCatId) {
      this.secondCatId = secondCatId;
   }

   @JsonProperty("secondCatId")
   public Integer getSecondCatId() {
      return this.secondCatId;
   }

   @JsonProperty("fixObject")
   public void setFixObject(String fixObject) {
      this.fixObject = fixObject;
   }

   @JsonProperty("fixObject")
   public String getFixObject() {
      return this.fixObject;
   }

   @JsonProperty("fourthCatName")
   public void setFourthCatName(String fourthCatName) {
      this.fourthCatName = fourthCatName;
   }

   @JsonProperty("fourthCatName")
   public String getFourthCatName() {
      return this.fourthCatName;
   }

   @JsonProperty("secondCatName")
   public void setSecondCatName(String secondCatName) {
      this.secondCatName = secondCatName;
   }

   @JsonProperty("secondCatName")
   public String getSecondCatName() {
      return this.secondCatName;
   }

   @JsonProperty("goodsRetailPrice")
   public void setGoodsRetailPrice(BigDecimal goodsRetailPrice) {
      this.goodsRetailPrice = goodsRetailPrice;
   }

   @JsonProperty("goodsRetailPrice")
   public BigDecimal getGoodsRetailPrice() {
      return this.goodsRetailPrice;
   }

   @JsonProperty("isBack")
   public void setIsBack(String isBack) {
      this.isBack = isBack;
   }

   @JsonProperty("isBack")
   public String getIsBack() {
      return this.isBack;
   }

   @JsonProperty("thirdCatId")
   public void setThirdCatId(Integer thirdCatId) {
      this.thirdCatId = thirdCatId;
   }

   @JsonProperty("thirdCatId")
   public Integer getThirdCatId() {
      return this.thirdCatId;
   }

   @JsonProperty("yn")
   public void setYn(Integer yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Integer getYn() {
      return this.yn;
   }

   @JsonProperty("firstCatId")
   public void setFirstCatId(Integer firstCatId) {
      this.firstCatId = firstCatId;
   }

   @JsonProperty("firstCatId")
   public Integer getFirstCatId() {
      return this.firstCatId;
   }

   @JsonProperty("providerId")
   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   @JsonProperty("providerId")
   public Integer getProviderId() {
      return this.providerId;
   }

   @JsonProperty("goodsSellPrice")
   public void setGoodsSellPrice(BigDecimal goodsSellPrice) {
      this.goodsSellPrice = goodsSellPrice;
   }

   @JsonProperty("goodsSellPrice")
   public BigDecimal getGoodsSellPrice() {
      return this.goodsSellPrice;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("providerName")
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   @JsonProperty("providerName")
   public String getProviderName() {
      return this.providerName;
   }

   @JsonProperty("thirdCatName")
   public void setThirdCatName(String thirdCatName) {
      this.thirdCatName = thirdCatName;
   }

   @JsonProperty("thirdCatName")
   public String getThirdCatName() {
      return this.thirdCatName;
   }

   @JsonProperty("createDate")
   public void setCreateDate(String createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public String getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("modifyBy")
   public void setModifyBy(String modifyBy) {
      this.modifyBy = modifyBy;
   }

   @JsonProperty("modifyBy")
   public String getModifyBy() {
      return this.modifyBy;
   }

   @JsonProperty("brandName")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brandName")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("modifyDate")
   public void setModifyDate(String modifyDate) {
      this.modifyDate = modifyDate;
   }

   @JsonProperty("modifyDate")
   public String getModifyDate() {
      return this.modifyDate;
   }

   @JsonProperty("jdGoodsCode")
   public void setJdGoodsCode(String jdGoodsCode) {
      this.jdGoodsCode = jdGoodsCode;
   }

   @JsonProperty("jdGoodsCode")
   public String getJdGoodsCode() {
      return this.jdGoodsCode;
   }

   @JsonProperty("fixObjectCode")
   public void setFixObjectCode(String fixObjectCode) {
      this.fixObjectCode = fixObjectCode;
   }

   @JsonProperty("fixObjectCode")
   public String getFixObjectCode() {
      return this.fixObjectCode;
   }

   @JsonProperty("firstCatName")
   public void setFirstCatName(String firstCatName) {
      this.firstCatName = firstCatName;
   }

   @JsonProperty("firstCatName")
   public String getFirstCatName() {
      return this.firstCatName;
   }

   @JsonProperty("createBy")
   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   @JsonProperty("createBy")
   public String getCreateBy() {
      return this.createBy;
   }

   @JsonProperty("brandId")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Integer getBrandId() {
      return this.brandId;
   }

   @JsonProperty("goodsCode")
   public void setGoodsCode(String goodsCode) {
      this.goodsCode = goodsCode;
   }

   @JsonProperty("goodsCode")
   public String getGoodsCode() {
      return this.goodsCode;
   }

   @JsonProperty("fourthCatId")
   public void setFourthCatId(Integer fourthCatId) {
      this.fourthCatId = fourthCatId;
   }

   @JsonProperty("fourthCatId")
   public Integer getFourthCatId() {
      return this.fourthCatId;
   }
}
