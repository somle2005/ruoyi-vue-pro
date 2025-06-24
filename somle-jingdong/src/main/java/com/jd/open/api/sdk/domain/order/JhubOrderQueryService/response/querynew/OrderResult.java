package com.jd.open.api.sdk.domain.order.JhubOrderQueryService.response.querynew;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderResult implements Serializable {
   private List<OrderInfo> orderInfoList;
   private Integer totalCount;

   @JsonProperty("orderInfoList")
   public void setOrderInfoList(List<OrderInfo> orderInfoList) {
      this.orderInfoList = orderInfoList;
   }

   @JsonProperty("orderInfoList")
   public List<OrderInfo> getOrderInfoList() {
      return this.orderInfoList;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(Integer totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public Integer getTotalCount() {
      return this.totalCount;
   }
}
