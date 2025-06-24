package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.PopOrderBasicService.response.queryCouponDetai.CouponDetailExternal;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderQueryCouponDetaiResponse extends AbstractResponse {
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
