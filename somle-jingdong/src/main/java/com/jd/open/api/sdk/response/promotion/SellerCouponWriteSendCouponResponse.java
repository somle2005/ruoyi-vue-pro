package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.CouponWriteJosServiceV2.response.sendCoupon.SendCouponResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class SellerCouponWriteSendCouponResponse extends AbstractResponse {
   private SendCouponResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(SendCouponResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public SendCouponResult getReturnType() {
      return this.returnType;
   }
}
