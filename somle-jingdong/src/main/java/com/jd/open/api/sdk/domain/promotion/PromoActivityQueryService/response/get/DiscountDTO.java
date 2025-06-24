package com.jd.open.api.sdk.domain.promotion.PromoActivityQueryService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class DiscountDTO implements Serializable {
   private BigDecimal minusMoney;
   private Integer minusNum;
   private BigDecimal rebate;
   private BigDecimal maxDiscount;
   private Integer maxSkuNum;

   @JsonProperty("minusMoney")
   public void setMinusMoney(BigDecimal minusMoney) {
      this.minusMoney = minusMoney;
   }

   @JsonProperty("minusMoney")
   public BigDecimal getMinusMoney() {
      return this.minusMoney;
   }

   @JsonProperty("minusNum")
   public void setMinusNum(Integer minusNum) {
      this.minusNum = minusNum;
   }

   @JsonProperty("minusNum")
   public Integer getMinusNum() {
      return this.minusNum;
   }

   @JsonProperty("rebate")
   public void setRebate(BigDecimal rebate) {
      this.rebate = rebate;
   }

   @JsonProperty("rebate")
   public BigDecimal getRebate() {
      return this.rebate;
   }

   @JsonProperty("maxDiscount")
   public void setMaxDiscount(BigDecimal maxDiscount) {
      this.maxDiscount = maxDiscount;
   }

   @JsonProperty("maxDiscount")
   public BigDecimal getMaxDiscount() {
      return this.maxDiscount;
   }

   @JsonProperty("maxSkuNum")
   public void setMaxSkuNum(Integer maxSkuNum) {
      this.maxSkuNum = maxSkuNum;
   }

   @JsonProperty("maxSkuNum")
   public Integer getMaxSkuNum() {
      return this.maxSkuNum;
   }
}
