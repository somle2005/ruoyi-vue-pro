package com.jd.open.api.sdk.domain.c2mdzkfpt.BespokeInfoWebService.response.getSkuCustomAttrInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class StagePriceLineVo implements Serializable {
   private BigDecimal price;
   private int stageOrder;
   private int startCount;
   private int endCount;
   private int discount;
   private int priceMode;

   @JsonProperty("price")
   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   @JsonProperty("price")
   public BigDecimal getPrice() {
      return this.price;
   }

   @JsonProperty("stageOrder")
   public void setStageOrder(int stageOrder) {
      this.stageOrder = stageOrder;
   }

   @JsonProperty("stageOrder")
   public int getStageOrder() {
      return this.stageOrder;
   }

   @JsonProperty("startCount")
   public void setStartCount(int startCount) {
      this.startCount = startCount;
   }

   @JsonProperty("startCount")
   public int getStartCount() {
      return this.startCount;
   }

   @JsonProperty("endCount")
   public void setEndCount(int endCount) {
      this.endCount = endCount;
   }

   @JsonProperty("endCount")
   public int getEndCount() {
      return this.endCount;
   }

   @JsonProperty("discount")
   public void setDiscount(int discount) {
      this.discount = discount;
   }

   @JsonProperty("discount")
   public int getDiscount() {
      return this.discount;
   }

   @JsonProperty("priceMode")
   public void setPriceMode(int priceMode) {
      this.priceMode = priceMode;
   }

   @JsonProperty("priceMode")
   public int getPriceMode() {
      return this.priceMode;
   }
}
