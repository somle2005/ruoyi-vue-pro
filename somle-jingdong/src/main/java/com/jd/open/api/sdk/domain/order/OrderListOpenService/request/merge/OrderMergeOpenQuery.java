package com.jd.open.api.sdk.domain.order.OrderListOpenService.request.merge;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderMergeOpenQuery implements Serializable {
   private List<OrderMergeDto> mergeList;

   @JsonProperty("mergeList")
   public void setMergeList(List<OrderMergeDto> mergeList) {
      this.mergeList = mergeList;
   }

   @JsonProperty("mergeList")
   public List<OrderMergeDto> getMergeList() {
      return this.mergeList;
   }
}
