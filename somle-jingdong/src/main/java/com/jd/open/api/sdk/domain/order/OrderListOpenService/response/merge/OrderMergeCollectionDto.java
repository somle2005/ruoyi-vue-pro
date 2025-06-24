package com.jd.open.api.sdk.domain.order.OrderListOpenService.response.merge;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderMergeCollectionDto implements Serializable {
   private List<OrderMergeItemDto> mergeResults;

   @JsonProperty("mergeResults")
   public void setMergeResults(List<OrderMergeItemDto> mergeResults) {
      this.mergeResults = mergeResults;
   }

   @JsonProperty("mergeResults")
   public List<OrderMergeItemDto> getMergeResults() {
      return this.mergeResults;
   }
}
