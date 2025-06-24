package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderListResult implements Serializable {
   private ApiResult apiResult;
   private int orderTotal;
   private List<OrderSearchInfo> orderInfoList;

   @JsonProperty("apiResult")
   public void setApiResult(ApiResult apiResult) {
      this.apiResult = apiResult;
   }

   @JsonProperty("apiResult")
   public ApiResult getApiResult() {
      return this.apiResult;
   }

   @JsonProperty("orderTotal")
   public void setOrderTotal(int orderTotal) {
      this.orderTotal = orderTotal;
   }

   @JsonProperty("orderTotal")
   public int getOrderTotal() {
      return this.orderTotal;
   }

   @JsonProperty("orderInfoList")
   public void setOrderInfoList(List<OrderSearchInfo> orderInfoList) {
      this.orderInfoList = orderInfoList;
   }

   @JsonProperty("orderInfoList")
   public List<OrderSearchInfo> getOrderInfoList() {
      return this.orderInfoList;
   }
}
