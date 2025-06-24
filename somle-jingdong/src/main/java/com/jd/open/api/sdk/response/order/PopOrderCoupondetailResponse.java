package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.PopOrderBasicService.response.coupondetail.CouponDetailExternal;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderCoupondetailResponse extends AbstractResponse {
   private CouponDetailExternal couponDetailExternal;

   @JsonProperty("couponDetailExternal")
   public void setCouponDetailExternal(CouponDetailExternal couponDetailExternal) {
      this.couponDetailExternal = couponDetailExternal;
   }

   @JsonProperty("couponDetailExternal")
   public CouponDetailExternal getCouponDetailExternal() {
      return this.couponDetailExternal;
   }
}
