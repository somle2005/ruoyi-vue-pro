package com.jd.open.api.sdk.response.customsglobalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.customsglobalAPI.ServiceProviderJsfService.response.queryOrderByParam.ServiceProviderOrderListResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class HangzhouCustomsQueryOrderByParamResponse extends AbstractResponse {
   private ServiceProviderOrderListResult orderListResult;

   @JsonProperty("orderListResult")
   public void setOrderListResult(ServiceProviderOrderListResult orderListResult) {
      this.orderListResult = orderListResult;
   }

   @JsonProperty("orderListResult")
   public ServiceProviderOrderListResult getOrderListResult() {
      return this.orderListResult;
   }
}
