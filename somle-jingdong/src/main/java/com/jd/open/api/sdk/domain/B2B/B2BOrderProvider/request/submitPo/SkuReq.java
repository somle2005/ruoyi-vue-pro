package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class SkuReq implements Serializable {
   private Long skuId;
   private int num;
   private BigDecimal jdPrice;
   private BigDecimal price;
   private Integer skuType;
   private PromotionReq promotion;
   private Map<String, String> extParam;
   private List<SkuReq> giftItems;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("num")
   public void setNum(int num) {
      this.num = num;
   }

   @JsonProperty("num")
   public int getNum() {
      return this.num;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("price")
   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   @JsonProperty("price")
   public BigDecimal getPrice() {
      return this.price;
   }

   @JsonProperty("skuType")
   public void setSkuType(Integer skuType) {
      this.skuType = skuType;
   }

   @JsonProperty("skuType")
   public Integer getSkuType() {
      return this.skuType;
   }

   @JsonProperty("promotion")
   public void setPromotion(PromotionReq promotion) {
      this.promotion = promotion;
   }

   @JsonProperty("promotion")
   public PromotionReq getPromotion() {
      return this.promotion;
   }

   @JsonProperty("extParam")
   public void setExtParam(Map<String, String> extParam) {
      this.extParam = extParam;
   }

   @JsonProperty("extParam")
   public Map<String, String> getExtParam() {
      return this.extParam;
   }

   @JsonProperty("giftItems")
   public void setGiftItems(List<SkuReq> giftItems) {
      this.giftItems = giftItems;
   }

   @JsonProperty("giftItems")
   public List<SkuReq> getGiftItems() {
      return this.giftItems;
   }
}
