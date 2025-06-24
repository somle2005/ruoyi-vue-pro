package com.jd.open.api.sdk.response.unboundedShop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.unboundedShop.CouponActivityJosService.response.queryActivityPageInfo.CommonResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class BrandCouponQueryActivityPageInfoResponse extends AbstractResponse {
   private CommonResult commonResult;

   @JsonProperty("commonResult")
   public void setCommonResult(CommonResult commonResult) {
      this.commonResult = commonResult;
   }

   @JsonProperty("commonResult")
   public CommonResult getCommonResult() {
      return this.commonResult;
   }
}
