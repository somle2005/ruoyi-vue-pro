package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderResult implements Serializable {
   private ApiResult apiResult;
   private OrderSearchInfo orderInfo;

   @JsonProperty("apiResult")
   public void setApiResult(ApiResult apiResult) {
      this.apiResult = apiResult;
   }

   @JsonProperty("apiResult")
   public ApiResult getApiResult() {
      return this.apiResult;
   }

   @JsonProperty("orderInfo")
   public void setOrderInfo(OrderSearchInfo orderInfo) {
      this.orderInfo = orderInfo;
   }

   @JsonProperty("orderInfo")
   public OrderSearchInfo getOrderInfo() {
      return this.orderInfo;
   }
}
