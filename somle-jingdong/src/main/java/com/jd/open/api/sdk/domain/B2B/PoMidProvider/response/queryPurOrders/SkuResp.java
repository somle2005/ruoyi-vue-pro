package com.jd.open.api.sdk.domain.B2B.PoMidProvider.response.queryPurOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class SkuResp implements Serializable {
   private String packSpecification;
   private Long venderId;
   private Long purchaseNum;
   private Long purchasePrice;
   private BigDecimal skuPrice;
   private String wareName;
   private Long promotionId;
   private String picUrl;
   private Long industryId;
   private Long skuId;
   private Integer promotionType;
   private Double weight;
   private Long cat2;
   private Long cat3;
   private Long cat1;
   private Long brandId;
   private Integer id;

   @JsonProperty("packSpecification")
   public void setPackSpecification(String packSpecification) {
      this.packSpecification = packSpecification;
   }

   @JsonProperty("packSpecification")
   public String getPackSpecification() {
      return this.packSpecification;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("purchaseNum")
   public void setPurchaseNum(Long purchaseNum) {
      this.purchaseNum = purchaseNum;
   }

   @JsonProperty("purchaseNum")
   public Long getPurchaseNum() {
      return this.purchaseNum;
   }

   @JsonProperty("purchasePrice")
   public void setPurchasePrice(Long purchasePrice) {
      this.purchasePrice = purchasePrice;
   }

   @JsonProperty("purchasePrice")
   public Long getPurchasePrice() {
      return this.purchasePrice;
   }

   @JsonProperty("skuPrice")
   public void setSkuPrice(BigDecimal skuPrice) {
      this.skuPrice = skuPrice;
   }

   @JsonProperty("skuPrice")
   public BigDecimal getSkuPrice() {
      return this.skuPrice;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("promotionId")
   public void setPromotionId(Long promotionId) {
      this.promotionId = promotionId;
   }

   @JsonProperty("promotionId")
   public Long getPromotionId() {
      return this.promotionId;
   }

   @JsonProperty("picUrl")
   public void setPicUrl(String picUrl) {
      this.picUrl = picUrl;
   }

   @JsonProperty("picUrl")
   public String getPicUrl() {
      return this.picUrl;
   }

   @JsonProperty("industryId")
   public void setIndustryId(Long industryId) {
      this.industryId = industryId;
   }

   @JsonProperty("industryId")
   public Long getIndustryId() {
      return this.industryId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("promotionType")
   public void setPromotionType(Integer promotionType) {
      this.promotionType = promotionType;
   }

   @JsonProperty("promotionType")
   public Integer getPromotionType() {
      return this.promotionType;
   }

   @JsonProperty("weight")
   public void setWeight(Double weight) {
      this.weight = weight;
   }

   @JsonProperty("weight")
   public Double getWeight() {
      return this.weight;
   }

   @JsonProperty("cat2")
   public void setCat2(Long cat2) {
      this.cat2 = cat2;
   }

   @JsonProperty("cat2")
   public Long getCat2() {
      return this.cat2;
   }

   @JsonProperty("cat3")
   public void setCat3(Long cat3) {
      this.cat3 = cat3;
   }

   @JsonProperty("cat3")
   public Long getCat3() {
      return this.cat3;
   }

   @JsonProperty("cat1")
   public void setCat1(Long cat1) {
      this.cat1 = cat1;
   }

   @JsonProperty("cat1")
   public Long getCat1() {
      return this.cat1;
   }

   @JsonProperty("brandId")
   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Long getBrandId() {
      return this.brandId;
   }

   @JsonProperty("id")
   public void setId(Integer id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Integer getId() {
      return this.id;
   }
}
