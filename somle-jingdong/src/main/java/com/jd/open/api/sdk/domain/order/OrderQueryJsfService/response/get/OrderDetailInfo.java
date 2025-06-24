package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderDetailInfo implements Serializable {
   private ApiResult apiResult;
   private OrderInfoFBP orderInfo;

   @JsonProperty("apiResult")
   public void setApiResult(ApiResult apiResult) {
      this.apiResult = apiResult;
   }

   @JsonProperty("apiResult")
   public ApiResult getApiResult() {
      return this.apiResult;
   }

   @JsonProperty("orderInfo")
   public void setOrderInfo(OrderInfoFBP orderInfo) {
      this.orderInfo = orderInfo;
   }

   @JsonProperty("orderInfo")
   public OrderInfoFBP getOrderInfo() {
      return this.orderInfo;
   }
}
