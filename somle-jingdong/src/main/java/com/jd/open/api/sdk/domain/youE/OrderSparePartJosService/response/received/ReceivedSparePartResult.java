package com.jd.open.api.sdk.domain.youE.OrderSparePartJosService.response.received;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ReceivedSparePartResult implements Serializable {
   private String orderNo;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }
}
