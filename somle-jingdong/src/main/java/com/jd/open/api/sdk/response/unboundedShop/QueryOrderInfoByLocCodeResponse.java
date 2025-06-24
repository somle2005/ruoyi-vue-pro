package com.jd.open.api.sdk.response.unboundedShop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.unboundedShop.StoreCenterServiceProvider.response.queryOrderInfoByLocCode.ResultBean;
import com.jd.open.api.sdk.response.AbstractResponse;

public class QueryOrderInfoByLocCodeResponse extends AbstractResponse {
   private ResultBean queryorderinfobycouponcodeResult;

   @JsonProperty("queryorderinfobycouponcode_result")
   public void setQueryorderinfobycouponcodeResult(ResultBean queryorderinfobycouponcodeResult) {
      this.queryorderinfobycouponcodeResult = queryorderinfobycouponcodeResult;
   }

   @JsonProperty("queryorderinfobycouponcode_result")
   public ResultBean getQueryorderinfobycouponcodeResult() {
      return this.queryorderinfobycouponcodeResult;
   }
}
