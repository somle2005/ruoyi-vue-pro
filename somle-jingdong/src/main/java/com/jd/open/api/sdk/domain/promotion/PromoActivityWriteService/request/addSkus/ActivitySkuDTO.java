package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.addSkus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class ActivitySkuDTO implements Serializable {
   private Long skuId;
   private String skuName;
   private Integer skuBound;
   private Integer skuBindType;
   private String promoPrice;
   private Integer discountType;
   private String discount;
   private Long spuId;
   private Integer num;
   private String originPrice;
   private Long storeId;
   private Integer buyType;
   private Map<String, String> extMap;
   private Integer seq;

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

   @JsonProperty("skuBound")
   public void setSkuBound(Integer skuBound) {
      this.skuBound = skuBound;
   }

   @JsonProperty("skuBound")
   public Integer getSkuBound() {
      return this.skuBound;
   }

   @JsonProperty("skuBindType")
   public void setSkuBindType(Integer skuBindType) {
      this.skuBindType = skuBindType;
   }

   @JsonProperty("skuBindType")
   public Integer getSkuBindType() {
      return this.skuBindType;
   }

   @JsonProperty("promoPrice")
   public void setPromoPrice(String promoPrice) {
      this.promoPrice = promoPrice;
   }

   @JsonProperty("promoPrice")
   public String getPromoPrice() {
      return this.promoPrice;
   }

   @JsonProperty("discountType")
   public void setDiscountType(Integer discountType) {
      this.discountType = discountType;
   }

   @JsonProperty("discountType")
   public Integer getDiscountType() {
      return this.discountType;
   }

   @JsonProperty("discount")
   public void setDiscount(String discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public String getDiscount() {
      return this.discount;
   }

   @JsonProperty("spuId")
   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   @JsonProperty("spuId")
   public Long getSpuId() {
      return this.spuId;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("originPrice")
   public void setOriginPrice(String originPrice) {
      this.originPrice = originPrice;
   }

   @JsonProperty("originPrice")
   public String getOriginPrice() {
      return this.originPrice;
   }

   @JsonProperty("storeId")
   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public Long getStoreId() {
      return this.storeId;
   }

   @JsonProperty("buyType")
   public void setBuyType(Integer buyType) {
      this.buyType = buyType;
   }

   @JsonProperty("buyType")
   public Integer getBuyType() {
      return this.buyType;
   }

   @JsonProperty("extMap")
   public void setExtMap(Map<String, String> extMap) {
      this.extMap = extMap;
   }

   @JsonProperty("extMap")
   public Map<String, String> getExtMap() {
      return this.extMap;
   }

   @JsonProperty("seq")
   public void setSeq(Integer seq) {
      this.seq = seq;
   }

   @JsonProperty("seq")
   public Integer getSeq() {
      return this.seq;
   }
}
