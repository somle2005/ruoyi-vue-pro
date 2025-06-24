package com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DiscountDTO implements Serializable {
   private String minusMoney;
   private Integer minusNum;
   private String rebate;
   private String maxDiscount;
   private Integer maxSkuNum;

   @JsonProperty("minusMoney")
   public void setMinusMoney(String minusMoney) {
      this.minusMoney = minusMoney;
   }

   @JsonProperty("minusMoney")
   public String getMinusMoney() {
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
   public void setRebate(String rebate) {
      this.rebate = rebate;
   }

   @JsonProperty("rebate")
   public String getRebate() {
      return this.rebate;
   }

   @JsonProperty("maxDiscount")
   public void setMaxDiscount(String maxDiscount) {
      this.maxDiscount = maxDiscount;
   }

   @JsonProperty("maxDiscount")
   public String getMaxDiscount() {
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
