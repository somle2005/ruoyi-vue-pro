package com.jd.open.api.sdk.response.wujiemiandan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.wujiemiandan.EclpOpenService.response.queryGoodsByPageAndTime.PageableResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpGoodsQueryGoodsByPageAndTimeResponse extends AbstractResponse {
   private PageableResult result;

   @JsonProperty("result")
   public void setResult(PageableResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public PageableResult getResult() {
      return this.result;
   }
}
