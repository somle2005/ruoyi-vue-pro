package com.jd.open.api.sdk.domain.order.PriceAdjustmentService.response.panel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class OrderItemChangePriceDto implements Serializable {
   private BigDecimal shouldPaySkuPrice;
   private Integer skuFlagType;
   private BigDecimal discountNum;
   private String skuUuId;
   private BigDecimal maxChangePrice;
   private String color;
   private int skuNum;
   private List<GiftSkuDto> giftSkuList;
   private String saleAttributes;
   private String skuName;
   private String imgUrl;
   private BigDecimal skuChangePrice;
   private String size;
   private BigDecimal jdPrice;
   private Long skuId;
   private BigDecimal preShouldPaySkuPrice;

   @JsonProperty("shouldPaySkuPrice")
   public void setShouldPaySkuPrice(BigDecimal shouldPaySkuPrice) {
      this.shouldPaySkuPrice = shouldPaySkuPrice;
   }

   @JsonProperty("shouldPaySkuPrice")
   public BigDecimal getShouldPaySkuPrice() {
      return this.shouldPaySkuPrice;
   }

   @JsonProperty("skuFlagType")
   public void setSkuFlagType(Integer skuFlagType) {
      this.skuFlagType = skuFlagType;
   }

   @JsonProperty("skuFlagType")
   public Integer getSkuFlagType() {
      return this.skuFlagType;
   }

   @JsonProperty("discountNum")
   public void setDiscountNum(BigDecimal discountNum) {
      this.discountNum = discountNum;
   }

   @JsonProperty("discountNum")
   public BigDecimal getDiscountNum() {
      return this.discountNum;
   }

   @JsonProperty("skuUuId")
   public void setSkuUuId(String skuUuId) {
      this.skuUuId = skuUuId;
   }

   @JsonProperty("skuUuId")
   public String getSkuUuId() {
      return this.skuUuId;
   }

   @JsonProperty("maxChangePrice")
   public void setMaxChangePrice(BigDecimal maxChangePrice) {
      this.maxChangePrice = maxChangePrice;
   }

   @JsonProperty("maxChangePrice")
   public BigDecimal getMaxChangePrice() {
      return this.maxChangePrice;
   }

   @JsonProperty("color")
   public void setColor(String color) {
      this.color = color;
   }

   @JsonProperty("color")
   public String getColor() {
      return this.color;
   }

   @JsonProperty("skuNum")
   public void setSkuNum(int skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public int getSkuNum() {
      return this.skuNum;
   }

   @JsonProperty("giftSkuList")
   public void setGiftSkuList(List<GiftSkuDto> giftSkuList) {
      this.giftSkuList = giftSkuList;
   }

   @JsonProperty("giftSkuList")
   public List<GiftSkuDto> getGiftSkuList() {
      return this.giftSkuList;
   }

   @JsonProperty("saleAttributes")
   public void setSaleAttributes(String saleAttributes) {
      this.saleAttributes = saleAttributes;
   }

   @JsonProperty("saleAttributes")
   public String getSaleAttributes() {
      return this.saleAttributes;
   }

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("imgUrl")
   public void setImgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
   }

   @JsonProperty("imgUrl")
   public String getImgUrl() {
      return this.imgUrl;
   }

   @JsonProperty("skuChangePrice")
   public void setSkuChangePrice(BigDecimal skuChangePrice) {
      this.skuChangePrice = skuChangePrice;
   }

   @JsonProperty("skuChangePrice")
   public BigDecimal getSkuChangePrice() {
      return this.skuChangePrice;
   }

   @JsonProperty("size")
   public void setSize(String size) {
      this.size = size;
   }

   @JsonProperty("size")
   public String getSize() {
      return this.size;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("preShouldPaySkuPrice")
   public void setPreShouldPaySkuPrice(BigDecimal preShouldPaySkuPrice) {
      this.preShouldPaySkuPrice = preShouldPaySkuPrice;
   }

   @JsonProperty("preShouldPaySkuPrice")
   public BigDecimal getPreShouldPaySkuPrice() {
      return this.preShouldPaySkuPrice;
   }
}
