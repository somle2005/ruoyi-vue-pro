package com.jd.open.api.sdk.domain.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderResult implements Serializable {
   private static final long serialVersionUID = 6141959210702528846L;
   private int orderTotal;
   private List<OrderSearchInfo> orderInfoList;

   @JsonProperty("order_total")
   public int getOrderTotal() {
      return this.orderTotal;
   }

   @JsonProperty("order_total")
   public void setOrderTotal(int orderTotal) {
      this.orderTotal = orderTotal;
   }

   @JsonProperty("order_info_list")
   public List<OrderSearchInfo> getOrderInfoList() {
      return this.orderInfoList;
   }

   @JsonProperty("order_info_list")
   public void setOrderInfoList(List<OrderSearchInfo> orderInfoList) {
      this.orderInfoList = orderInfoList;
   }
}
