package com.jd.open.api.sdk.domain.order.PopOrderBasicService.response.queryCouponDetai;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CouponDetailExternal implements Serializable {
   private Integer rtnCode;
   private CouponDetailVo couponDetailVo;

   @JsonProperty("rtnCode")
   public void setRtnCode(Integer rtnCode) {
      this.rtnCode = rtnCode;
   }

   @JsonProperty("rtnCode")
   public Integer getRtnCode() {
      return this.rtnCode;
   }

   @JsonProperty("couponDetailVo")
   public void setCouponDetailVo(CouponDetailVo couponDetailVo) {
      this.couponDetailVo = couponDetailVo;
   }

   @JsonProperty("couponDetailVo")
   public CouponDetailVo getCouponDetailVo() {
      return this.couponDetailVo;
   }
}
