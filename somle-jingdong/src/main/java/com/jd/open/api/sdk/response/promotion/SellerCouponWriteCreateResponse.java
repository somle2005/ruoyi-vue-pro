package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerCouponWriteCreateResponse extends AbstractResponse {
   private Long couponId;

   @JsonProperty("couponId")
   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   @JsonProperty("couponId")
   public Long getCouponId() {
      return this.couponId;
   }
}
