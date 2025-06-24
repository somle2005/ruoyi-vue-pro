package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get.OrderDetailInfo;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderFbpGetResponse extends AbstractResponse {
   private OrderDetailInfo searchfbporderbyidResult;

   @JsonProperty("searchfbporderbyid_result")
   public void setSearchfbporderbyidResult(OrderDetailInfo searchfbporderbyidResult) {
      this.searchfbporderbyidResult = searchfbporderbyidResult;
   }

   @JsonProperty("searchfbporderbyid_result")
   public OrderDetailInfo getSearchfbporderbyidResult() {
      return this.searchfbporderbyidResult;
   }
}
