package com.jd.open.api.sdk.domain.youE.OrderQueryJosService.request.queryCallHistory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VirtualNumberCallRecordInfoParam implements Serializable {
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
