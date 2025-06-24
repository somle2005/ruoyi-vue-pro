package com.jd.open.api.sdk.domain.order.OrderListOpenService.response.merge;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderMergeItemDto implements Serializable {
   private List<String> mergeOrderIds;

   @JsonProperty("mergeOrderIds")
   public void setMergeOrderIds(List<String> mergeOrderIds) {
      this.mergeOrderIds = mergeOrderIds;
   }

   @JsonProperty("mergeOrderIds")
   public List<String> getMergeOrderIds() {
      return this.mergeOrderIds;
   }
}
