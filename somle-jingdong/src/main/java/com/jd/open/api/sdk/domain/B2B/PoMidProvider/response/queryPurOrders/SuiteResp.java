package com.jd.open.api.sdk.domain.B2B.PoMidProvider.response.queryPurOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class SuiteResp implements Serializable {
   private Long suiteId;
   private Integer suiteType;
   private String suiteName;
   private Integer suiteNum;
   private Long promotionId;
   private Integer promotionType;
   private List<Long> skuItems;
   private List<SkuResp> giftItems;
   private BigDecimal manMoney;

   @JsonProperty("suiteId")
   public void setSuiteId(Long suiteId) {
      this.suiteId = suiteId;
   }

   @JsonProperty("suiteId")
   public Long getSuiteId() {
      return this.suiteId;
   }

   @JsonProperty("suiteType")
   public void setSuiteType(Integer suiteType) {
      this.suiteType = suiteType;
   }

   @JsonProperty("suiteType")
   public Integer getSuiteType() {
      return this.suiteType;
   }

   @JsonProperty("suiteName")
   public void setSuiteName(String suiteName) {
      this.suiteName = suiteName;
   }

   @JsonProperty("suiteName")
   public String getSuiteName() {
      return this.suiteName;
   }

   @JsonProperty("suiteNum")
   public void setSuiteNum(Integer suiteNum) {
      this.suiteNum = suiteNum;
   }

   @JsonProperty("suiteNum")
   public Integer getSuiteNum() {
      return this.suiteNum;
   }

   @JsonProperty("promotionId")
   public void setPromotionId(Long promotionId) {
      this.promotionId = promotionId;
   }

   @JsonProperty("promotionId")
   public Long getPromotionId() {
      return this.promotionId;
   }

   @JsonProperty("promotionType")
   public void setPromotionType(Integer promotionType) {
      this.promotionType = promotionType;
   }

   @JsonProperty("promotionType")
   public Integer getPromotionType() {
      return this.promotionType;
   }

   @JsonProperty("skuItems")
   public void setSkuItems(List<Long> skuItems) {
      this.skuItems = skuItems;
   }

   @JsonProperty("skuItems")
   public List<Long> getSkuItems() {
      return this.skuItems;
   }

   @JsonProperty("giftItems")
   public void setGiftItems(List<SkuResp> giftItems) {
      this.giftItems = giftItems;
   }

   @JsonProperty("giftItems")
   public List<SkuResp> getGiftItems() {
      return this.giftItems;
   }

   @JsonProperty("manMoney")
   public void setManMoney(BigDecimal manMoney) {
      this.manMoney = manMoney;
   }

   @JsonProperty("manMoney")
   public BigDecimal getManMoney() {
      return this.manMoney;
   }
}
