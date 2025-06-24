package com.jd.open.api.sdk.domain.order.OutShipJosService.request.judge;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PartialShipmentQuery implements Serializable {
   private List<Long> orderList;

   @JsonProperty("orderList")
   public void setOrderList(List<Long> orderList) {
      this.orderList = orderList;
   }

   @JsonProperty("orderList")
   public List<Long> getOrderList() {
      return this.orderList;
   }
}
