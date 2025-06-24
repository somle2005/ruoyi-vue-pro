package com.jd.open.api.sdk.domain.hudong.SuitPromoWriteOuterService.request.AddSuitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class Map implements Serializable {
   private Integer isNeedToBuy;
   private Integer num;
   private BigDecimal promoPrice;
   private Long skuId;

   @JsonProperty("isNeedToBuy")
   public void setIsNeedToBuy(Integer isNeedToBuy) {
      this.isNeedToBuy = isNeedToBuy;
   }

   @JsonProperty("isNeedToBuy")
   public Integer getIsNeedToBuy() {
      return this.isNeedToBuy;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("promoPrice")
   public void setPromoPrice(BigDecimal promoPrice) {
      this.promoPrice = promoPrice;
   }

   @JsonProperty("promoPrice")
   public BigDecimal getPromoPrice() {
      return this.promoPrice;
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
