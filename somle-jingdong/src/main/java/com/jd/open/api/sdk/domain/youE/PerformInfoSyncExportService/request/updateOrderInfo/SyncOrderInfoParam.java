package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.updateOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SyncOrderInfoParam implements Serializable {
   private String orderNo;
   private SyncRecoveryInfo recoveryInfo;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("recoveryInfo")
   public void setRecoveryInfo(SyncRecoveryInfo recoveryInfo) {
      this.recoveryInfo = recoveryInfo;
   }

   @JsonProperty("recoveryInfo")
   public SyncRecoveryInfo getRecoveryInfo() {
      return this.recoveryInfo;
   }
}
