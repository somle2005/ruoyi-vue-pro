package com.jd.open.api.sdk.response.market;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.market.OrderServiceProvider.response.listwithpage.PageResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopFwOrderListwithpageResponse extends AbstractResponse {
   private PageResult returnType;

   @JsonProperty("returnType")
   public void setReturnType(PageResult returnType) {
      this.returnType = returnType;
   }

   @JsonProperty("returnType")
   public PageResult getReturnType() {
      return this.returnType;
   }
}
