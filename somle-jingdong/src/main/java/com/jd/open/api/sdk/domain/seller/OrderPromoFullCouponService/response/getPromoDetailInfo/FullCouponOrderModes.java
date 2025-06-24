package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.response.getPromoDetailInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class FullCouponOrderModes implements Serializable {
   private FullCouponInfo couponInfo;
   private BigDecimal quota;

   @JsonProperty("couponInfo")
   public void setCouponInfo(FullCouponInfo couponInfo) {
      this.couponInfo = couponInfo;
   }

   @JsonProperty("couponInfo")
   public FullCouponInfo getCouponInfo() {
      return this.couponInfo;
   }

   @JsonProperty("quota")
   public void setQuota(BigDecimal quota) {
      this.quota = quota;
   }

   @JsonProperty("quota")
   public BigDecimal getQuota() {
      return this.quota;
   }
}
