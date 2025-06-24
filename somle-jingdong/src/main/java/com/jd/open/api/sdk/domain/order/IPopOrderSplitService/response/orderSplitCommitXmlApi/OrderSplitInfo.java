package com.jd.open.api.sdk.domain.order.IPopOrderSplitService.response.orderSplitCommitXmlApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderSplitInfo implements Serializable {
   private long orderId;
   private List<ChildOrderInfo> childOrders;

   @JsonProperty("orderId")
   public void setOrderId(long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("childOrders")
   public void setChildOrders(List<ChildOrderInfo> childOrders) {
      this.childOrders = childOrders;
   }

   @JsonProperty("childOrders")
   public List<ChildOrderInfo> getChildOrders() {
      return this.childOrders;
   }
}
