package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SuiteReq implements Serializable {
   private Long suiteId;
   private Integer type;
   private String name;
   private int num;
   private PromotionReq promotion;
   private List<Long> skuItems;
   private List<SkuReq> giftItems;

   @JsonProperty("suiteId")
   public void setSuiteId(Long suiteId) {
      this.suiteId = suiteId;
   }

   @JsonProperty("suiteId")
   public Long getSuiteId() {
      return this.suiteId;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
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
   public void setNum(int num) {
      this.num = num;
   }

   @JsonProperty("num")
   public int getNum() {
      return this.num;
   }

   @JsonProperty("promotion")
   public void setPromotion(PromotionReq promotion) {
      this.promotion = promotion;
   }

   @JsonProperty("promotion")
   public PromotionReq getPromotion() {
      return this.promotion;
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
   public void setGiftItems(List<SkuReq> giftItems) {
      this.giftItems = giftItems;
   }

   @JsonProperty("giftItems")
   public List<SkuReq> getGiftItems() {
      return this.giftItems;
   }
}
