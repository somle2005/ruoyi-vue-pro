package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class ItemInfoDTO implements Serializable {
   private String skuName;
   private Integer itemTotal;
   private Long wareId;
   private String goodCatName;
   private BigDecimal jdPrice;
   private String outerId;
   private Long skuId;

   @JsonProperty("skuName")
   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   @JsonProperty("skuName")
   public String getSkuName() {
      return this.skuName;
   }

   @JsonProperty("itemTotal")
   public void setItemTotal(Integer itemTotal) {
      this.itemTotal = itemTotal;
   }

   @JsonProperty("itemTotal")
   public Integer getItemTotal() {
      return this.itemTotal;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("goodCatName")
   public void setGoodCatName(String goodCatName) {
      this.goodCatName = goodCatName;
   }

   @JsonProperty("goodCatName")
   public String getGoodCatName() {
      return this.goodCatName;
   }

   @JsonProperty("jdPrice")
   public void setJdPrice(BigDecimal jdPrice) {
      this.jdPrice = jdPrice;
   }

   @JsonProperty("jdPrice")
   public BigDecimal getJdPrice() {
      return this.jdPrice;
   }

   @JsonProperty("outerId")
   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   @JsonProperty("outerId")
   public String getOuterId() {
      return this.outerId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }
}
