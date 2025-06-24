package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LogisticsOrderSearchResponse extends AbstractResponse {
   private HashMap orders;

   @JsonProperty("orders")
   public void setOrders(HashMap orders) {
      this.orders = orders;
   }

   @JsonProperty("orders")
   public HashMap getOrders() {
      return this.orders;
   }
}
