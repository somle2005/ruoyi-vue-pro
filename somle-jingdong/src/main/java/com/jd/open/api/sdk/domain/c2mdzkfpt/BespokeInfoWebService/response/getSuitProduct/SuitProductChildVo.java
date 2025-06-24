package com.jd.open.api.sdk.domain.c2mdzkfpt.BespokeInfoWebService.response.getSuitProduct;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class SuitProductChildVo implements Serializable {
   private Integer suitType;
   private Long skuId;
   private String skuName;
   private Integer skuCount;
   private Integer sort;
   private Integer skuNum;
   private Integer skuNumRule;
   private BigDecimal promotionPrice;
   private Boolean hasInventory;
   private Integer isDefault;
   private String size;
   private String saleValue;

   @JsonProperty("suitType")
   public void setSuitType(Integer suitType) {
      this.suitType = suitType;
   }

   @JsonProperty("suitType")
   public Integer getSuitType() {
      return this.suitType;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
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

   @JsonProperty("skuCount")
   public void setSkuCount(Integer skuCount) {
      this.skuCount = skuCount;
   }

   @JsonProperty("skuCount")
   public Integer getSkuCount() {
      return this.skuCount;
   }

   @JsonProperty("sort")
   public void setSort(Integer sort) {
      this.sort = sort;
   }

   @JsonProperty("sort")
   public Integer getSort() {
      return this.sort;
   }

   @JsonProperty("skuNum")
   public void setSkuNum(Integer skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public Integer getSkuNum() {
      return this.skuNum;
   }

   @JsonProperty("skuNumRule")
   public void setSkuNumRule(Integer skuNumRule) {
      this.skuNumRule = skuNumRule;
   }

   @JsonProperty("skuNumRule")
   public Integer getSkuNumRule() {
      return this.skuNumRule;
   }

   @JsonProperty("promotionPrice")
   public void setPromotionPrice(BigDecimal promotionPrice) {
      this.promotionPrice = promotionPrice;
   }

   @JsonProperty("promotionPrice")
   public BigDecimal getPromotionPrice() {
      return this.promotionPrice;
   }

   @JsonProperty("hasInventory")
   public void setHasInventory(Boolean hasInventory) {
      this.hasInventory = hasInventory;
   }

   @JsonProperty("hasInventory")
   public Boolean getHasInventory() {
      return this.hasInventory;
   }

   @JsonProperty("isDefault")
   public void setIsDefault(Integer isDefault) {
      this.isDefault = isDefault;
   }

   @JsonProperty("isDefault")
   public Integer getIsDefault() {
      return this.isDefault;
   }

   @JsonProperty("size")
   public void setSize(String size) {
      this.size = size;
   }

   @JsonProperty("size")
   public String getSize() {
      return this.size;
   }

   @JsonProperty("saleValue")
   public void setSaleValue(String saleValue) {
      this.saleValue = saleValue;
   }

   @JsonProperty("saleValue")
   public String getSaleValue() {
      return this.saleValue;
   }
}
