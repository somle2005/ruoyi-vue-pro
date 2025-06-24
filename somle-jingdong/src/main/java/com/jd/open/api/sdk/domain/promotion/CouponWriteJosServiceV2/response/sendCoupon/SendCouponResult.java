package com.jd.open.api.sdk.domain.promotion.CouponWriteJosServiceV2.response.sendCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SendCouponResult implements Serializable {
   private List<CouponInfo> couponInfoList;
   private String ruleId;
   private BaseResult baseResult;

   @JsonProperty("couponInfoList")
   public void setCouponInfoList(List<CouponInfo> couponInfoList) {
      this.couponInfoList = couponInfoList;
   }

   @JsonProperty("couponInfoList")
   public List<CouponInfo> getCouponInfoList() {
      return this.couponInfoList;
   }

   @JsonProperty("ruleId")
   public void setRuleId(String ruleId) {
      this.ruleId = ruleId;
   }

   @JsonProperty("ruleId")
   public String getRuleId() {
      return this.ruleId;
   }

   @JsonProperty("baseResult")
   public void setBaseResult(BaseResult baseResult) {
      this.baseResult = baseResult;
   }

   @JsonProperty("baseResult")
   public BaseResult getBaseResult() {
      return this.baseResult;
   }
}
