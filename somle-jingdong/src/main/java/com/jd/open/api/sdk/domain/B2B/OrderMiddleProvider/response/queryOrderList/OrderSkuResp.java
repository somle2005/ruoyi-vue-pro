package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderSkuResp implements Serializable {
   private Integer brandId;
   private BigDecimal extFreight;
   private Integer firstCategory;
   private Long id;
   private String imgUrl;
   private BigDecimal nakedPrice;
   private String name;
   private Integer num;
   private BigDecimal originalPrice;
   private Long parentSkuId;
   private String pdPin;
   private String promotionCode;
   private Integer promotionType;
   private BigDecimal salesPrice;
   private Integer secondCategory;
   private Long skuId;
   private Integer skuType;
   private Integer stockType;
   private Long suitId;
   private Integer tag;
   private BigDecimal taxPrice;
   private BigDecimal taxRate;
   private Integer thirdCategory;
   private String thirdSkuId;
   private Long parentId;
   private Long venderId;
   private java.util.Map<String, String> extAttr;

   @JsonProperty("brandId")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brandId")
   public Integer getBrandId() {
      return this.brandId;
   }

   @JsonProperty("extFreight")
   public void setExtFreight(BigDecimal extFreight) {
      this.extFreight = extFreight;
   }

   @JsonProperty("extFreight")
   public BigDecimal getExtFreight() {
      return this.extFreight;
   }

   @JsonProperty("firstCategory")
   public void setFirstCategory(Integer firstCategory) {
      this.firstCategory = firstCategory;
   }

   @JsonProperty("firstCategory")
   public Integer getFirstCategory() {
      return this.firstCategory;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("nakedPrice")
   public void setNakedPrice(BigDecimal nakedPrice) {
      this.nakedPrice = nakedPrice;
   }

   @JsonProperty("nakedPrice")
   public BigDecimal getNakedPrice() {
      return this.nakedPrice;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("originalPrice")
   public void setOriginalPrice(BigDecimal originalPrice) {
      this.originalPrice = originalPrice;
   }

   @JsonProperty("originalPrice")
   public BigDecimal getOriginalPrice() {
      return this.originalPrice;
   }

   @JsonProperty("parentSkuId")
   public void setParentSkuId(Long parentSkuId) {
      this.parentSkuId = parentSkuId;
   }

   @JsonProperty("parentSkuId")
   public Long getParentSkuId() {
      return this.parentSkuId;
   }

   @JsonProperty("pdPin")
   public void setPdPin(String pdPin) {
      this.pdPin = pdPin;
   }

   @JsonProperty("pdPin")
   public String getPdPin() {
      return this.pdPin;
   }

   @JsonProperty("promotionCode")
   public void setPromotionCode(String promotionCode) {
      this.promotionCode = promotionCode;
   }

   @JsonProperty("promotionCode")
   public String getPromotionCode() {
      return this.promotionCode;
   }

   @JsonProperty("promotionType")
   public void setPromotionType(Integer promotionType) {
      this.promotionType = promotionType;
   }

   @JsonProperty("promotionType")
   public Integer getPromotionType() {
      return this.promotionType;
   }

   @JsonProperty("salesPrice")
   public void setSalesPrice(BigDecimal salesPrice) {
      this.salesPrice = salesPrice;
   }

   @JsonProperty("salesPrice")
   public BigDecimal getSalesPrice() {
      return this.salesPrice;
   }

   @JsonProperty("secondCategory")
   public void setSecondCategory(Integer secondCategory) {
      this.secondCategory = secondCategory;
   }

   @JsonProperty("secondCategory")
   public Integer getSecondCategory() {
      return this.secondCategory;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("skuType")
   public void setSkuType(Integer skuType) {
      this.skuType = skuType;
   }

   @JsonProperty("skuType")
   public Integer getSkuType() {
      return this.skuType;
   }

   @JsonProperty("stockType")
   public void setStockType(Integer stockType) {
      this.stockType = stockType;
   }

   @JsonProperty("stockType")
   public Integer getStockType() {
      return this.stockType;
   }

   @JsonProperty("suitId")
   public void setSuitId(Long suitId) {
      this.suitId = suitId;
   }

   @JsonProperty("suitId")
   public Long getSuitId() {
      return this.suitId;
   }

   @JsonProperty("tag")
   public void setTag(Integer tag) {
      this.tag = tag;
   }

   @JsonProperty("tag")
   public Integer getTag() {
      return this.tag;
   }

   @JsonProperty("taxPrice")
   public void setTaxPrice(BigDecimal taxPrice) {
      this.taxPrice = taxPrice;
   }

   @JsonProperty("taxPrice")
   public BigDecimal getTaxPrice() {
      return this.taxPrice;
   }

   @JsonProperty("taxRate")
   public void setTaxRate(BigDecimal taxRate) {
      this.taxRate = taxRate;
   }

   @JsonProperty("taxRate")
   public BigDecimal getTaxRate() {
      return this.taxRate;
   }

   @JsonProperty("thirdCategory")
   public void setThirdCategory(Integer thirdCategory) {
      this.thirdCategory = thirdCategory;
   }

   @JsonProperty("thirdCategory")
   public Integer getThirdCategory() {
      return this.thirdCategory;
   }

   @JsonProperty("thirdSkuId")
   public void setThirdSkuId(String thirdSkuId) {
      this.thirdSkuId = thirdSkuId;
   }

   @JsonProperty("thirdSkuId")
   public String getThirdSkuId() {
      return this.thirdSkuId;
   }

   @JsonProperty("parentId")
   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("parentId")
   public Long getParentId() {
      return this.parentId;
   }

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("extAttr")
   public void setExtAttr(java.util.Map<String, String> extAttr) {
      this.extAttr = extAttr;
   }

   @JsonProperty("extAttr")
   public java.util.Map<String, String> getExtAttr() {
      return this.extAttr;
   }
}
