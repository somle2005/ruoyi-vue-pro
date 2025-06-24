package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.search.OrderListResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderSearchResponse extends AbstractResponse {
   private OrderListResult searchorderinfoResult;

   @JsonProperty("searchorderinfo_result")
   public void setSearchorderinfoResult(OrderListResult searchorderinfoResult) {
      this.searchorderinfoResult = searchorderinfoResult;
   }

   @JsonProperty("searchorderinfo_result")
   public OrderListResult getSearchorderinfoResult() {
      return this.searchorderinfoResult;
   }
}
