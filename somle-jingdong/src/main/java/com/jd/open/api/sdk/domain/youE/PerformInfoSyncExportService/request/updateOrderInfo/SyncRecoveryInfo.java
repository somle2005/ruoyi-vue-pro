package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.updateOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SyncRecoveryInfo implements Serializable {
   private SyncRecycleCarInfo recycleCarInfo;

   @JsonProperty("recycleCarInfo")
   public void setRecycleCarInfo(SyncRecycleCarInfo recycleCarInfo) {
      this.recycleCarInfo = recycleCarInfo;
   }

   @JsonProperty("recycleCarInfo")
   public SyncRecycleCarInfo getRecycleCarInfo() {
      return this.recycleCarInfo;
   }
}
