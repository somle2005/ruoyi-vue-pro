package com.jd.open.api.sdk.domain.hudong.GiftActivityReadService.response.findAllGiftActivityForPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GiftSkuActivity implements Serializable {
   private String promoPrice;
   private Long wareId;
   private Long venderId;
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

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
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
