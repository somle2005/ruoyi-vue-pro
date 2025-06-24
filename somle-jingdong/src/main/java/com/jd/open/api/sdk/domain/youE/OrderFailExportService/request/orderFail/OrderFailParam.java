package com.jd.open.api.sdk.domain.youE.OrderFailExportService.request.orderFail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderFailParam implements Serializable {
   private String orderNo;
   private String failReason;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("failReason")
   public void setFailReason(String failReason) {
      this.failReason = failReason;
   }

   @JsonProperty("failReason")
   public String getFailReason() {
      return this.failReason;
   }
}
