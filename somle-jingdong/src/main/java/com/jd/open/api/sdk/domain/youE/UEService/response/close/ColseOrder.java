package com.jd.open.api.sdk.domain.youE.UEService.response.close;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ColseOrder implements Serializable {
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
