package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.fbpsearch.OrderQueryJsfService.response.search.OrderInfoResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderFbpSearchResponse extends AbstractResponse {
   private OrderInfoResult searchfbporderinfoResult;

   @JsonProperty("searchfbporderinfo_result")
   public void setSearchfbporderinfoResult(OrderInfoResult searchfbporderinfoResult) {
      this.searchfbporderinfoResult = searchfbporderinfoResult;
   }

   @JsonProperty("searchfbporderinfo_result")
   public OrderInfoResult getSearchfbporderinfoResult() {
      return this.searchfbporderinfoResult;
   }
}
