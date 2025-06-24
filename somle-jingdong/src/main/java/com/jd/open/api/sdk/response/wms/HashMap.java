package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class HashMap implements Serializable {
   private List<ResponseOrderStatus> orderList;

   @JsonProperty("order_list")
   public void setOrderList(List<ResponseOrderStatus> orderList) {
      this.orderList = orderList;
   }

   @JsonProperty("order_list")
   public List<ResponseOrderStatus> getOrderList() {
      return this.orderList;
   }
}
