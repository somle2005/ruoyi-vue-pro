package com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.request.selfUnitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class UnitPromSkuInfo implements Serializable {
   private Integer limitNum;
   private BigDecimal promoPrice;
   private RebateInfo rebate;
   private Long skuId;

   @JsonProperty("limitNum")
   public void setLimitNum(Integer limitNum) {
      this.limitNum = limitNum;
   }

   @JsonProperty("limitNum")
   public Integer getLimitNum() {
      return this.limitNum;
   }

   @JsonProperty("promoPrice")
   public void setPromoPrice(BigDecimal promoPrice) {
      this.promoPrice = promoPrice;
   }

   @JsonProperty("promoPrice")
   public BigDecimal getPromoPrice() {
      return this.promoPrice;
   }

   @JsonProperty("rebate")
   public void setRebate(RebateInfo rebate) {
      this.rebate = rebate;
   }

   @JsonProperty("rebate")
   public RebateInfo getRebate() {
      return this.rebate;
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
