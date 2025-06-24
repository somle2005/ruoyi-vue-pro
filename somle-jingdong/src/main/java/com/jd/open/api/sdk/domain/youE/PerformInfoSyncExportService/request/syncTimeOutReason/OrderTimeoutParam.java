package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.syncTimeOutReason;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderTimeoutParam implements Serializable {
   private String orderNo;
   private Integer confirmType;
   private Integer timeoutReason;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("confirmType")
   public void setConfirmType(Integer confirmType) {
      this.confirmType = confirmType;
   }

   @JsonProperty("confirmType")
   public Integer getConfirmType() {
      return this.confirmType;
   }

   @JsonProperty("timeoutReason")
   public void setTimeoutReason(Integer timeoutReason) {
      this.timeoutReason = timeoutReason;
   }

   @JsonProperty("timeoutReason")
   public Integer getTimeoutReason() {
      return this.timeoutReason;
   }
}
