package com.jd.open.api.sdk.domain.youE.BizOrderJsfService.response.getStopOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StopOrderVO implements Serializable {
   private String reason;
   private String orderNo;

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }
}
