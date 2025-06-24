package com.jd.open.api.sdk.domain.hudong.CouponBaseReadOuterService.response.initBaseRuleInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CouponBaseInit implements Serializable {
   private CouponAuth couponAuth;

   @JsonProperty("couponAuth")
   public void setCouponAuth(CouponAuth couponAuth) {
      this.couponAuth = couponAuth;
   }

   @JsonProperty("couponAuth")
   public CouponAuth getCouponAuth() {
      return this.couponAuth;
   }
}
