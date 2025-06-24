package com.jd.open.api.sdk.domain.etms.PickupTimeRangeApi.response.getPickupIntimeList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PickupDate implements Serializable {
   private String day;
   private List<PickupTimeRangeDTO> pickupTimeRangeList;

   @JsonProperty("day")
   public void setDay(String day) {
      this.day = day;
   }

   @JsonProperty("day")
   public String getDay() {
      return this.day;
   }

   @JsonProperty("pickupTimeRangeList")
   public void setPickupTimeRangeList(List<PickupTimeRangeDTO> pickupTimeRangeList) {
      this.pickupTimeRangeList = pickupTimeRangeList;
   }

   @JsonProperty("pickupTimeRangeList")
   public List<PickupTimeRangeDTO> getPickupTimeRangeList() {
      return this.pickupTimeRangeList;
   }
}
