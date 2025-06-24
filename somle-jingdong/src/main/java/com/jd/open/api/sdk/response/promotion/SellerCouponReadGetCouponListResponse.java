package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.CouponReadJosService.response.getCouponList.JosCoupon;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class SellerCouponReadGetCouponListResponse extends AbstractResponse {
   private List<JosCoupon> couponList;

   @JsonProperty("couponList")
   public void setCouponList(List<JosCoupon> couponList) {
      this.couponList = couponList;
   }

   @JsonProperty("couponList")
   public List<JosCoupon> getCouponList() {
      return this.couponList;
   }
}
