package com.jd.open.api.sdk.domain.order.fbpsearch.OrderQueryJsfService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderInfoResult implements Serializable {
   private FbpApiResult apiResult;
   private int orderTotal;
   private List<OrderInfo> orderInfoList;

   @JsonProperty("apiResult")
   public void setApiResult(FbpApiResult apiResult) {
      this.apiResult = apiResult;
   }

   @JsonProperty("apiResult")
   public FbpApiResult getApiResult() {
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
   public void setOrderInfoList(List<OrderInfo> orderInfoList) {
      this.orderInfoList = orderInfoList;
   }

   @JsonProperty("orderInfoList")
   public List<OrderInfo> getOrderInfoList() {
      return this.orderInfoList;
   }
}
