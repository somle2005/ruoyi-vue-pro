package com.jd.open.api.sdk.domain.hudong.CouponOuterWriteService.request.createCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CouponSku implements Serializable {
   private Long skuId;

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }
}
