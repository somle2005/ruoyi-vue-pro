package com.jd.open.api.sdk.domain.youE.PerformInfoSyncExportService.request.updateOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SyncRecycleCarInfo implements Serializable {
   private String pickUpTime;

   @JsonProperty("pickUpTime")
   public void setPickUpTime(String pickUpTime) {
      this.pickUpTime = pickUpTime;
   }

   @JsonProperty("pickUpTime")
   public String getPickUpTime() {
      return this.pickUpTime;
   }
}
