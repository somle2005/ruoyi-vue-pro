package com.jd.open.api.sdk.domain.order.IPopOrderSplitService.response.orderSplitCommitXmlApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ChildOrderInfo implements Serializable {
   private long orderId;
   private int groupId;
   private List<Integer> skus;

   @JsonProperty("orderId")
   public void setOrderId(long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("groupId")
   public void setGroupId(int groupId) {
      this.groupId = groupId;
   }

   @JsonProperty("groupId")
   public int getGroupId() {
      return this.groupId;
   }

   @JsonProperty("skus")
   public void setSkus(List<Integer> skus) {
      this.skus = skus;
   }

   @JsonProperty("skus")
   public List<Integer> getSkus() {
      return this.skus;
   }
}
