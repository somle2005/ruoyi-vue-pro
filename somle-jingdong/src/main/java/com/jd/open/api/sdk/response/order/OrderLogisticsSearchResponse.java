package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.OrderDetailInfos;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class OrderLogisticsSearchResponse extends AbstractResponse {
   private List<OrderDetailInfos> orders;
   private int total;

   @JsonProperty("orders")
   public List<OrderDetailInfos> getOrders() {
      return this.orders;
   }

   @JsonProperty("orders")
   public void setOrders(List<OrderDetailInfos> orders) {
      this.orders = orders;
   }

   @JsonProperty("total")
   public int getTotal() {
      return this.total;
   }

   @JsonProperty("total")
   public void setTotal(int total) {
      this.total = total;
   }
}
