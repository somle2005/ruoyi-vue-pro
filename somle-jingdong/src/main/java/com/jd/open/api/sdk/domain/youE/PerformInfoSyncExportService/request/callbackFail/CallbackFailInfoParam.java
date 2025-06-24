package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.callbackFail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CallbackFailInfoParam implements Serializable {
   private String reason;
   private String orderNo;
   private Integer orderState;

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

   @JsonProperty("orderState")
   public void setOrderState(Integer orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public Integer getOrderState() {
      return this.orderState;
   }
}
