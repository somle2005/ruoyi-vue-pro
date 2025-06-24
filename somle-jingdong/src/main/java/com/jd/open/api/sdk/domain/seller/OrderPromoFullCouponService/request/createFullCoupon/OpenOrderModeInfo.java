package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.request.createFullCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OpenOrderModeInfo implements Serializable {
   private BigDecimal quota;
   private OpenPromoCouponInfo couponInfo;

   @JsonProperty("quota")
   public void setQuota(BigDecimal quota) {
      this.quota = quota;
   }

   @JsonProperty("quota")
   public BigDecimal getQuota() {
      return this.quota;
   }

   @JsonProperty("couponInfo")
   public void setCouponInfo(OpenPromoCouponInfo couponInfo) {
      this.couponInfo = couponInfo;
   }

   @JsonProperty("couponInfo")
   public OpenPromoCouponInfo getCouponInfo() {
      return this.couponInfo;
   }
}
