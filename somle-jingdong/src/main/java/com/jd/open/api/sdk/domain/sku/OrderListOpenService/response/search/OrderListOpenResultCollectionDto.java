package com.jd.open.api.sdk.domain.sku.OrderListOpenService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderListOpenResultCollectionDto implements Serializable {
   private List<OrderListOpenResultDto> orderIdList;

   @JsonProperty("orderIdList")
   public void setOrderIdList(List<OrderListOpenResultDto> orderIdList) {
      this.orderIdList = orderIdList;
   }

   @JsonProperty("orderIdList")
   public List<OrderListOpenResultDto> getOrderIdList() {
      return this.orderIdList;
   }
}
