package com.jd.open.api.sdk.domain.etms.PickupTimeRangeApi.response.getPickupIntimeList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PickupTimeRangeDTO implements Serializable {
   private String pickupStartTime;
   private String pickupEndTime;

   @JsonProperty("pickupStartTime")
   public void setPickupStartTime(String pickupStartTime) {
      this.pickupStartTime = pickupStartTime;
   }

   @JsonProperty("pickupStartTime")
   public String getPickupStartTime() {
      return this.pickupStartTime;
   }

   @JsonProperty("pickupEndTime")
   public void setPickupEndTime(String pickupEndTime) {
      this.pickupEndTime = pickupEndTime;
   }

   @JsonProperty("pickupEndTime")
   public String getPickupEndTime() {
      return this.pickupEndTime;
   }
}
