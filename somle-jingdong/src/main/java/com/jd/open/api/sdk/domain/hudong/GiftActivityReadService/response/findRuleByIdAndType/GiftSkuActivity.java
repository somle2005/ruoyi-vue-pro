package com.jd.open.api.sdk.domain.hudong.GiftActivityReadService.response.findRuleByIdAndType;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GiftSkuActivity implements Serializable {
   private String promoPrice;
   private Long wareId;
   private Integer skuNum;
   private String jdPrice;
   private Long skuId;
   private Integer perMaxNum;

   @JsonProperty("promoPrice")
   public void setPromoPrice(String promoPrice) {
      this.promoPrice = promoPrice;
   }

   @JsonProperty("promoPrice")
   public String getPromoPrice() {
      return this.promoPrice;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("skuNum")
   public void setSkuNum(Integer skuNum) {
      this.skuNum = skuNum;
   }

   @JsonProperty("skuNum")
   public Integer getSkuNum() {
      return this.skuNum;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public String getJdPrice() {
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

   @JsonProperty("perMaxNum")
   public void setPerMaxNum(Integer perMaxNum) {
      this.perMaxNum = perMaxNum;
   }

   @JsonProperty("perMaxNum")
   public Integer getPerMaxNum() {
      return this.perMaxNum;
   }
}
